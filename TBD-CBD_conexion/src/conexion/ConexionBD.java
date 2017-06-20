package conexion;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class ConexionBD {

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        } catch (Exception ex) {
        }
    }
    
    public static final String DRIVER_URL = "jdbc:sqlserver://";
    private Connection conexion;
    private DatabaseMetaData metaBD;
    private String servidor;

    public ConexionBD(String servidor) throws SQLException {
        conexion = DriverManager.getConnection(DRIVER_URL + servidor
                + ";integratedSecurity=true");
        metaBD = conexion.getMetaData();
        this.servidor = servidor;
    }

    public ConexionBD(String servidor, String usuario, String contraseña)
            throws SQLException {
        conexion = DriverManager.getConnection(DRIVER_URL + servidor,
                usuario, contraseña);
        metaBD = conexion.getMetaData();
        this.servidor = servidor;
    }

    public void cerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        metaBD = null;
    }

    public void nuevaConexion(String servidor) throws SQLException {
        if (!conexion.isClosed()) {
            try {
                cerrarConexion();
            } catch (SQLException ex) {
                throw ex;
            }
        }
        conexion = DriverManager.getConnection(DRIVER_URL + servidor
                + ";integratedSecurity=true");
        metaBD = conexion.getMetaData();
    }

    public void nuevaConexion(String servidor, String usuario, String contraseña)
            throws SQLException {
        if (!conexion.isClosed()) {
            try {
                cerrarConexion();
            } catch (SQLException ex) {
                throw ex;
            }
        }
        conexion = DriverManager.getConnection(DRIVER_URL + servidor,
                usuario, contraseña);
        metaBD = conexion.getMetaData();
    }

    public ArrayList<String> mostrarBD(boolean system) throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        ArrayList<String> array = new ArrayList<String>();
        if (system) {
            ResultSet r = metaBD.getCatalogs();
            while (r.next()) {
                array.add(r.getString("TABLE_CAT"));
            }
        } else {
            Statement s = conexion.createStatement();
            s.execute("SELECT NAME FROM master.dbo.sysdatabases "
                    + "WHERE NAME NOT IN (\'master\', \'model\', \'msdb\', \'tempdb\')");
            ResultSet r = s.getResultSet();
            while (r.next()) {
                array.add(r.getString(1));
            }
        }
        return array;
    }

    public ArrayList<String> mostrarTablas(String baseDatos) throws SQLException {
        if (baseDatos == null) {
            throw new SQLException("Error: El nombre de la base de datos es null.");
        } else if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        ArrayList<String> array = new ArrayList<String>();
        Statement s = conexion.createStatement();
        s.execute("USE [" + baseDatos + "] SELECT CAST(TABLE_NAME AS VARCHAR) "
                + "FROM INFORMATION_SCHEMA.TABLES "
                + "WHERE TABLE_NAME NOT IN('sysdiagrams')");
        ResultSet r = s.getResultSet();
        while (r.next()) {
            array.add(r.getString(1));
        }
        return array;
    }

    public ArrayList<String[]> mostrarContenidoTabla(String bd, String tabla)
            throws SQLException {
        if (tabla == null || bd == null) {
            throw new SQLException("Error: El nombre de la tabla o base de datos"
                    + " es null.");
        } else if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        ArrayList<String[]> array = new ArrayList<String[]>();
        Statement s = conexion.createStatement();
        ResultSet resultSet = s.executeQuery("USE [" + bd + "] SELECT * FROM " + tabla);
        ResultSetMetaData rmd = resultSet.getMetaData();
        int numeroDeColumnas = rmd.getColumnCount();
        String[] contenido = new String[numeroDeColumnas];
        for (int i = 0; i < contenido.length; i++) {
            contenido[i] = rmd.getColumnName(i + 1);
        }
        array.add(contenido);
        while (resultSet.next()) {
            contenido = new String[numeroDeColumnas];
            for (int i = 0; i < contenido.length; i++) {
                String toString = resultSet.getObject(i + 1) == null ? "NULL"
                        : resultSet.getObject(i + 1).toString();
                contenido[i] = toString;
            }
            array.add(contenido);
        }
        return array;
    }

    public static void main(String[] args) throws SQLException {
        ConexionBD c = new ConexionBD("localhost", "sa", "raul");
        ArrayList<String> bd=  c.mostrarBD(false);
        for (int i = 0; i < bd.size(); i++) {
            System.out.println(bd.get(i));
        }
        ArrayList<String> ct= c.mostrarTablas("PapeleriaInvOp");
        System.out.println(" +tablas de PapeleriaInvOp:");
        for (int i = 0; i < ct.size(); i++) {
            System.out.println("\t"+ct.get(i));
        }
        //if (true) { return; }
        ArrayList<String[]> t = c.mostrarContenidoTabla("PapeleriaInvOp", "Copia_Articulo");
        for (int i = 0; i < t.size(); i++) {
            String[] tc = t.get(i);
            for (int j = 0; j < tc.length; j++) {
                System.out.print("  " + tc[j] + "      ");
            }
            System.out.println("");
        }
    }

    public String getServidor() {
        return servidor;
    }

    public String[] mostrarFila(String baseDato,
            String tabla, String fila, String clave) throws SQLException {
        if (baseDato == null) {
            throw new SQLException("Error: El nombre de la base de datos es null.");
        } else if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        Statement s = conexion.createStatement();
        ResultSet resultSet = s.executeQuery("USE [" + baseDato + "] SELECT * FROM "
                + tabla + " WHERE " + fila + "= '" + clave + "'");
        ResultSetMetaData rmd = resultSet.getMetaData();
        String[] contenido = new String[rmd.getColumnCount()];
        while (resultSet.next()) {
            for (int i = 0; i < contenido.length; i++) {
                String toString = resultSet.getObject(i + 1) == null ? "NULL"
                        : resultSet.getObject(i + 1).toString();
                contenido[i] = toString;
            }
        }
        return contenido;
    }
    
    public String[] getColumnas(String baseDatos, String tabla )
        throws SQLException {
        if (baseDatos == null) {
            throw new SQLException("Error: El nombre de la base de datos es null.");
        } else if(conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexin.");
        }
        ResultSet resultSet= executeQuery("USE ["+baseDatos+"] SELECT TOP 0 * FROM ["+tabla+"]");
        ResultSetMetaData rsmd= resultSet.getMetaData();
        String[] columnas= new String[rsmd.getColumnCount()];
        for (int i = 0; i < columnas.length; i++) {
            columnas[i]= rsmd.getColumnName(i + 1);
        }
        return columnas;
    }

    public ArrayList<String[]> mostrarContenidoTabla(String columnas,
            String baseDatos, String tabla) throws SQLException {
        if (baseDatos == null) {
            throw new SQLException("Error: El nombre de la base de datos es null.");
        } else if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        ArrayList<String[]> array = new ArrayList<String[]>();
        Statement s = conexion.createStatement();
        ResultSet resultSet = s.executeQuery("USE [" + baseDatos + "] SELECT " + columnas + " FROM " + tabla);
        ResultSetMetaData rmd = resultSet.getMetaData();
        int numeroDeColumnas = rmd.getColumnCount();
        String[] contenido = new String[numeroDeColumnas];
        for (int i = 0; i < contenido.length; i++) {
            contenido[i] = rmd.getColumnName(i + 1);
        }
        array.add(contenido);
        while (resultSet.next()) {
            contenido = new String[numeroDeColumnas];
            for (int i = 0; i < contenido.length; i++) {
                String toString = resultSet.getObject(i + 1) == null ? "NULL"
                        : resultSet.getObject(i + 1).toString();
                contenido[i] = toString;
            }
            array.add(contenido);
        }
        return array;
    }
    
    public ResultSet executeQuery(String query) throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        Statement s= conexion.createStatement();
        ResultSet resultSet= s.executeQuery(query);
        return resultSet;
    }
    
    public ArrayList<String[]> extraerTabla(ResultSet resultSet)
            throws SQLException {
        
        if (resultSet == null) {
            throw new SQLException("Error: ResultSetMetadata es null "
                                        + "[metodo extraerTabla()].");
        } else if(conexion == null || conexion.isClosed()) {
            throw new SQLException("Error: No se ha establecido una conexion.");
        }
        ResultSetMetaData rsmd= resultSet.getMetaData();
        int numeroDeColumnas= rsmd.getColumnCount();
        String[] contenido= new String[numeroDeColumnas];
        for (int i = 0; i < contenido.length; i++) {
            contenido[i]= rsmd.getColumnName(i + 1);
        }
        ArrayList<String[]> array= new ArrayList<String[]>();
        array.add(contenido);
        while (resultSet.next()) {
            contenido= new String[numeroDeColumnas];
            for (int i = 0; i < contenido.length; i++) {
                String toString = resultSet.getObject(i + 1) == null ? "NULL"
                        : resultSet.getObject(i + 1).toString();
                contenido[i] = toString;   
            }
            array.add(contenido);
        }
        return array;        
    }
}