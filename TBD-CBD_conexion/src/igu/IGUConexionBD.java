package igu;
import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 * @author [Equipo Taller Base de Datos]
 */
public class IGUConexionBD extends JFrame {

    private ISDialog iniciarSesion;
    private JToggleButton conectarDesconectar;
    private JMenuBar menu;
    private JTree listaConexion;
    private JPanel panelInf;
    private static DefaultMutableTreeNode sinConexion =
            new DefaultMutableTreeNode("No hay conexion al servidor");
    private JMenu acercaDe, archivo;
    private JMenuItem integrantes, conectar, salir;
    private TBDIntegrantes equipo;
    private ToolbarBusqueda toolBar;

    public IGUConexionBD() {
        super("Conexion-BD");
        setLayout(new BorderLayout());
        equipo = new TBDIntegrantes(this, true);
        menu = new JMenuBar();
        MenuListener ml = new MenuListener();
        acercaDe = new JMenu("Acerca de...");
        integrantes = new JMenuItem("Integrantes");
        integrantes.addActionListener(ml);
        acercaDe.add(integrantes);
        archivo = new JMenu("Archivo");
        conectar = new JMenuItem("Conectar");
        conectar.addActionListener(ml);
        salir = new JMenuItem("Salir");
        salir.addActionListener(ml);
        archivo.add(conectar);
        archivo.add(salir);
        menu.add(archivo);
        menu.add(acercaDe);
        setJMenuBar(menu);
        iniciarSesion = new ISDialog(this);
        JPanel explorador = new JPanel();
        TitledBorder b = BorderFactory.createTitledBorder("Explorador de conexion");
        explorador.setBorder(b);
        explorador.setLayout(new BorderLayout());
        conectarDesconectar = new JToggleButton("Conectar");
        conectarDesconectar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conectarDesconectar();
            }
        });
        JPanel panelCD = new JPanel();
        panelCD.add(conectarDesconectar);
        explorador.add(panelCD, BorderLayout.NORTH);
        listaConexion = new JTree();
        listaConexion.setModel(new DefaultTreeModel(sinConexion));
        listaConexion.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                if (iniciarSesion.getConexion() != null) {
                    if (isDataBase(listaConexion.getSelectionPath())) {
                        System.out.println("isDatabase");
                        Object[] inf = listaConexion.getSelectionPath().getPath();
                        JTable t = crearTabla(inf[1].toString(), inf[2].toString());
                        System.out.println("tabla "+inf[2].toString());
                        try {
                            String[] columnas = iniciarSesion.getConexion().getColumnas(inf[1].toString(), inf[2].toString());
                            toolBar.addColumnas(columnas);
                            toolBar.setBaseDatos(inf[1].toString());
                            toolBar.setTabla(inf[2].toString());
                        } catch (SQLException ex) {
                            ErrorDialog.dialog(null, ex.getMessage());
                        }
                        panelInf.setVisible(false);
                        panelInf.removeAll();
                        panelInf.add(new JScrollPane(t), BorderLayout.CENTER);
                        panelInf.setVisible(true);
                    }
                }
            }
        });
        explorador.add(new JScrollPane(listaConexion));
        panelInf = new JPanel();
        panelInf.setLayout(new BorderLayout());
        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                true, explorador, panelInf);
        add(jsp, BorderLayout.CENTER);
        // toolbar busqueda
        toolBar = new ToolbarBusqueda();
        toolBar.setPreferredSize(new Dimension(400, 90));
        add(toolBar, BorderLayout.NORTH);
        toolBar.getBotonBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = "";
                if (toolBar.isAvanzada()) {
                    query = toolBar.getTextFieldBusqueda();
                } else {
                    query = createBasicQuery();
                }
                try {
                    ResultSet rs = iniciarSesion.getConexion().executeQuery(query);
                    JTable tabla = crearTabla(iniciarSesion.getConexion().extraerTabla(rs));
                    panelInf.setVisible(false);
                    panelInf.removeAll();
                    panelInf.add(new JScrollPane(tabla), BorderLayout.CENTER);
                    panelInf.setVisible(true);

                } catch (SQLException ex) {
                    ErrorDialog.dialog(null, ex.getMessage());
                }
            }

            private String createBasicQuery() {
                String columna = toolBar.getColumna();
                String columnaOrden= toolBar.ordenarPor();
                String baseDato = toolBar.getBaseDatos();
                String tabla = toolBar.getTabla();
                String condicion = toolBar.getTextFieldBusqueda();
                String tipoOrdenacion= toolBar.getOrden();
                String query = "USE [" + baseDato + "] SELECT * "
                        + "FROM [" + tabla + "] WHERE [" + columna + "] LIKE '" + condicion + "' "
                        + "ORDER BY ["+columnaOrden+"] "+tipoOrdenacion;
                return query;
            }
        });
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem m = (JMenuItem) e.getSource();
                if (m == conectar) {
                    conectarDesconectar();
                } else if (m == salir) {
                    if (iniciarSesion.getConexion() == null) {
                        cerrarVentana();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hay conexiones abiertas",
                                "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    equipo.setVisible(true);
                }
            }
        }
    }

    private void cerrarVentana() {
        super.dispose();
    }

    private JTable crearTabla(ArrayList<String[]> ct) {
        JTable tablaBD = null;
        tablaBD = new JTable();

        tablaBD.setModel(new DefaultTableModel(
                new String[ct.size() - 1][ct.get(0).length],
                ct.get(0)) {
            public Class getColumnClass(int columnIndex) {
                return java.lang.String.class;
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        for (int i = 1; i <= tablaBD.getRowCount(); i++) {
            String[] col = ct.get(i);
            for (int j = 0; j < col.length; j++) {
                tablaBD.setValueAt(col[j], i - 1, j);
            }
        }
        return tablaBD;
    }

    private JTable crearTabla(String bd, String t) {
        JTable tablaBD = null;
        try {
            ConexionBD c = iniciarSesion.getConexion();
            final ArrayList<String[]> ct = c.mostrarContenidoTabla(bd, t);
            tablaBD = new JTable();
            tablaBD.setModel(new DefaultTableModel(
                    // numero de filas y columnas de la tabla
                    new String[ct.size() - 1][ct.get(0).length],
                    ct.get(0)) {
                public Class getColumnClass(int columnIndex) {
                    return java.lang.String.class;
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            });
            for (int i = 1; i <= tablaBD.getRowCount(); i++) {
                String[] col = ct.get(i);
                for (int j = 0; j < col.length; j++) {
                    tablaBD.setValueAt(col[j], i - 1, j);
                }
            }
        } catch (SQLException ex) {
            ErrorDialog.dialog(this, ex.getMessage());
        }
        return tablaBD;
    }

    private void conectarDesconectar() {
        if (iniciarSesion.getConexion() == null) {
            iniciarSesion.setVisible(true);
            if (iniciarSesion.getConexion() == null) {
                conectarDesconectar.setSelected(false);
                return;
            }
            mostrarContenidoServidor();
            conectarDesconectar.setText("Desconectar");
            conectarDesconectar.setSelected(true);
            conectar.setText("Desconectar");
        } else {
            listaConexion.setModel(new DefaultTreeModel(sinConexion));
            conectarDesconectar.setSelected(false);
            iniciarSesion.cerrarConexion();
            conectarDesconectar.setText("Conectar");
            conectar.setText("Conectar");
            panelInf.setVisible(false);
            panelInf.removeAll();
            panelInf.setVisible(true);
        }
    }

    private void mostrarContenidoServidor() {
        System.out.print("conexion: ");
        ConexionBD c = iniciarSesion.getConexion();
        System.out.println("establecida :)");
        ArrayList<String> baseDeDatos;
        ArrayList<String>[] tablas;
        try {
            baseDeDatos = c.mostrarBD(false);
            tablas = new ArrayList[baseDeDatos.size()];
            System.out.println("cargando tablas: ");
            for (int i = 0; i < baseDeDatos.size(); i++) {
                System.out.print("  base de datos: " + baseDeDatos.get(i));
                tablas[i] = c.mostrarTablas(baseDeDatos.get(i));
                System.out.println(", cantidad de tablas: " + tablas[i].size());
            }
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(c.getServidor());
            for (int i = 0; i < baseDeDatos.size(); i++) {
                DefaultMutableTreeNode padre = new DefaultMutableTreeNode(baseDeDatos.get(i));
                ArrayList<String> tablasBD = tablas[i];
                for (int j = 0; j < tablasBD.size(); j++) {
                    padre.add(new DefaultMutableTreeNode(tablasBD.get(j)));
                }
                raiz.add(padre);
            }
            listaConexion.setModel(new DefaultTreeModel(raiz));
        } catch (SQLException ex) {
            ErrorDialog.dialog(this, ex.getMessage());
        }
    }

    private boolean isDataBase(TreePath treePath) {
        if (treePath == null) {
            return false;
        }
        Object[] path = (Object[]) treePath.getPath();
        if (path.length == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        IGUConexionBD c = new IGUConexionBD();
    }
}
