/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Vazquez
 */
public class Conexion {
    static Connection con = null;
    
    static String Url="jdbc:sqlserver://localhost:1433/Agenda";
    static String User="sa";
    static String Pass="1234";
    
    public static Connection Conexion(){
        try{
            Class.forName("com.sqlserver.jdbc.Driver");
            try{
            con = DriverManager.getConnection(Url,User,Pass);
                JOptionPane.showMessageDialog(null,"¡Conexion exitosa!");
            }catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        }catch   (ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
                
    }
 
}

