/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class TABLA_EJEMPLO extends javax.swing.JFrame {

    /**
     * Creates new form TABLA_EJEMPLO
     */
   static  Connection conexion;
    public TABLA_EJEMPLO() {
        
        initComponents();
        coneccion();
        Consulta("select CategoryID from Categories");
    }
    public static void coneccion(){
    
     String url = "jdbc:sqlserver://localhost;databaseName=Northwind";
      try {
  

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
//setConexion(DriverManager.getConnection(BaseDeDatos));
      //  Connection conexion;                 
            
   } catch (Exception e) {
             e.printStackTrace();
    }
      
      try{
      
       conexion = DriverManager.getConnection(url,"sa","taller");
      System.out.println("se conecto");
      }catch(SQLException e){
      System.out.println(e);
      }
    
    }
    
    
 public void Consulta(String consulta){
 DefaultTableModel modelo = new DefaultTableModel();
 jTable1.setModel(modelo);
modelo.addColumn("CategoryID");
Connection con=conexion;
Statement declara;
try{
declara=con.createStatement();
ResultSet respuesta= declara.executeQuery(consulta);
while(respuesta.next()){
//String a=respuesta.toString();
//System.out.println(respuesta.getString("CategoryID"));
//System.out.println(respuesta.getString("CategoryName"));
//System.out.println(respuesta.getString("Description"));
//System.out.println(respuesta.getString("Picture"));
 Object [] fila = new Object[1]; // Hay tres columnas en la tabla

   // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
   for (int i=0;i<1;i++)
      fila[i] = respuesta.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

   // Se añade al modelo la fila completa.
   modelo.addRow(fila); 
}

}catch(SQLException e){

System.out.println(e);
JOptionPane.showMessageDialog(null,"Error"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);

}

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TABLA_EJEMPLO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABLA_EJEMPLO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABLA_EJEMPLO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABLA_EJEMPLO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLA_EJEMPLO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
