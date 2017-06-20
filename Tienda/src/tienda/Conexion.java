/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN
 */
public class Conexion {
   private static Connection con;
   private Statement statement;
    
    public static Connection crearConexion(){
        
                try{
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=Abarrotes_P; user=sa;password=1234;");
                    
                }
                catch (ClassNotFoundException e){
                    e.printStackTrace();
    }
    catch (SQLException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                        System.out.println("Te doy la conexion");

                return con;
    }
}
