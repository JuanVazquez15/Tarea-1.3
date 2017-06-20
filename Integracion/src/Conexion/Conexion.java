/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Juan D Candy
 */
public class Conexion {
    private static Connection con;
    private Statement statement;
    public static Connection crearConexion(){
        
                try{
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con = DriverManager.getConnection("jdbc:sqlserver://JUAN:1433;user=sa;password=1234;");
                    
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
