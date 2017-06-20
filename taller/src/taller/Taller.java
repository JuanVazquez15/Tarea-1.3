/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Elvis
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Taller {
    
      public void ejecutarConsulta(Connection conect1,String nombre_alumno,String ap_pat,String ap_mat,String fech_nac,String edo_civil,String Genero,String grad_est) {
try {
   
    
   String SQL = "insert into Usuarios Values("+"'"+nombre_alumno+"',"+"'"+ap_pat+"',"+"'"+ap_mat+"',"+"'"+fech_nac+"',"+"'"+edo_civil+"',"+"'"+grad_est+"',"+"'"+Genero+"'"+");";
  //Statement stmt = conect1.createStatement().executeQuery(SQL);
       //ResultSet rs = stmt.executeQuery(SQL);
      conect1.createStatement().executeUpdate(SQL);
         System.out.println("se agrego exitosamente");
        JOptionPane.showMessageDialog(null,"se guardo corectamente");
        //rs.close();
   
}
catch (Exception e) {
  //e.printStackTrace();
   System.out.println("no agrego exitosamente");
   JOptionPane.showMessageDialog(null,"Error al guardar los DATOS");
}
}

   public void conectar(String nombre_alumno,String ap_pat,String ap_mat,String fech_nac,String edo_civil,String Genero,String grad_est){
    try {
	  // Connection conect;
	  String connectionUrl ="jdbc:sqlserver://localhost:1433;databaseName=UAC;integratedSecurity=true";
	    Connection conect = DriverManager.getConnection(connectionUrl);
  System.out.println("Conectado."+connectionUrl);
 ejecutarConsulta(conect,nombre_alumno,ap_pat,ap_mat,fech_nac,edo_civil,Genero,grad_est);

} 
catch (SQLException ex) 
{
  System.out.println(ex);
}
    }
 

    public static void main(String[] args) {
       Taller t=new Taller();
      t.conectar("aldne","poet","dul","12 dic","soltero","lic","hombre");
       //t.ejecutarConsulta();
    }
    
}
