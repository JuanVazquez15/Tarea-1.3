/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN
 */
public class Empleados extends javax.swing.JFrame {

    //private Connection cnx;
    public String url="jdbc:sqlserver://localhost;databaseName=Abarrotes_P";
    String user="sa";
    String contraseña="1234";
    Connection conn;
    String driver="sun.jdbc.obdc.java";
    
    Conexion Conect;
    ResultSet Datos;
    Statement Sentencias;
    ResultSet rs;
    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
       
           if( Loggin.Consultor.isSelected()==true){
                Nuevo.setEnabled(false);
                Codigo.setEnabled(false);
                Apellidos.setEnabled(false);
           Nombres.setEnabled(false);
           Direccion.setEnabled(false);
           Email.setEnabled(false);
           Telefono.setEnabled(false);
           Guardar.setEnabled(false);
           Modificar.setEnabled(false);
           Eliminar.setEnabled(false);
           Grabar.setEnabled(false);
           Cancelar.setEnabled(false);
          
           }
           if(Loggin.User.isSelected()==true){
               Nuevo.setEnabled(true);
                Codigo.setEnabled(false);
                Apellidos.setEnabled(false);
                 Nombres.setEnabled(false);
                 Direccion.setEnabled(false);
                Email.setEnabled(false);
                Telefono.setEnabled(false);
                Guardar.setEnabled(false);
                Modificar.setEnabled(false);
                Eliminar.setEnabled(false);
                Grabar.setEnabled(false);
                Cancelar.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        M = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        M2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Consulta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Nombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Grabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DEL PERSONAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Buscar");

        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        M.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Codigo");

        M2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                M2KeyPressed(evt);
            }
        });

        Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Apellidos", "Nombres", "Direccion", "Email", "Telefono"
            }
        ));
        Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Consulta);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombres");

        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Direccion");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telefono");

        Modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Nuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Grabar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Grabar.setText("Grabar");
        Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Codigo)
                            .addComponent(Apellidos)
                            .addComponent(Nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Direccion)
                            .addComponent(Email)
                            .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cancelar)
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nuevo)
                        .addComponent(Modificar)
                        .addComponent(Guardar))
                    .addComponent(Grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Eliminar)
                    .addComponent(Salir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
         Codigo.setEnabled(false);
        Apellidos.setEnabled(true);
        Nombres.setEnabled(true);
        Direccion.setEnabled(true);
        Email.setEnabled(true);
        Telefono.setEnabled(true);
        Eliminar.setEnabled(false);
        Modificar.setEnabled(false);
        Grabar.setEnabled(true);
        Guardar.setEnabled(false);
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void MKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MKeyPressed
        String m= M.getText();
       
       DefaultTableModel modelo = new DefaultTableModel();
        Consulta.setModel(modelo);
       String SQL=("Execute BuscarEmpleado"+"'"+m+"'");
       
        try{
           conn = Conexion.crearConexion();
           rs=conn.createStatement().executeQuery(SQL);
           ResultSetMetaData rsm = rs.getMetaData();
           int cantidadColumnas = rsm.getColumnCount();
           
           for(int i=1; i<=cantidadColumnas;i++){
               modelo.addColumn(rsm.getColumnLabel(i));
           }
           while(rs.next()){
               Object[] fila = new Object[cantidadColumnas];
               for(int i=0; i< cantidadColumnas; i++){
                   fila[i]=rs.getObject(i+1);
               }
               modelo.addRow(fila);
           }
           rs.close();
       }catch(Exception e){
           System.out.println("Error"+e);
       }
    }//GEN-LAST:event_MKeyPressed

    private void M2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_M2KeyPressed
      String m= M2.getText();
       
       DefaultTableModel modelo = new DefaultTableModel();
        Consulta.setModel(modelo);
       String SQL=("Execute BuscarCodigo"+"'"+m+"'");
       
        try{
           conn = Conexion.crearConexion();
           rs=conn.createStatement().executeQuery(SQL);
           ResultSetMetaData rsm = rs.getMetaData();
           int cantidadColumnas = rsm.getColumnCount();
           
           for(int i=1; i<=cantidadColumnas;i++){
               modelo.addColumn(rsm.getColumnLabel(i));
           }
           while(rs.next()){
               Object[] fila = new Object[cantidadColumnas];
               for(int i=0; i< cantidadColumnas; i++){
                   fila[i]=rs.getObject(i+1);
               }
               modelo.addRow(fila);
           }
           rs.close();
       }catch(Exception e){
           System.out.println("Error"+e);
       }
    }//GEN-LAST:event_M2KeyPressed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        
           Codigo.setText("");
           Apellidos.setText("");
           Nombres.setText("");
           Direccion.setText("");
           Email.setText("");
           Telefono.setText("");
           Codigo.setEnabled(true);
           Apellidos.setEnabled(true);
           Nombres.setEnabled(true);
           Direccion.setEnabled(true);
           Email.setEnabled(true);
           Telefono.setEnabled(true);
           Guardar.setEnabled(true);
           Modificar.setEnabled(false);
           Eliminar.setEnabled(false);
           Grabar.setEnabled(false);
           
        
       
    }//GEN-LAST:event_NuevoActionPerformed

    private void ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaMouseClicked
      if( Loggin.Administrador.isSelected()==true){
        try{
          String m= M2.getText();
          int row = Consulta.getSelectedRow();
          String Table_click=(Consulta.getModel().getValueAt(row, 0).toString());
          String SQL=("Execute BuscarCodigo"+"'"+Table_click+"'");
          conn = Conexion.crearConexion();
          rs=conn.createStatement().executeQuery(SQL);
           
           if(rs.next()){
               String add1=rs.getString("Codigo");
               Codigo.setText(add1);
                String add2=rs.getString("Apellidos");
               Apellidos.setText(add2);
                String add3=rs.getString("Nombres");
               Nombres.setText(add3);
                String add4=rs.getString("Direccion");
               Direccion.setText(add4);
                String add5=rs.getString("Email");
               Email.setText(add5);
                String add6=rs.getString("Telefono");
               Telefono.setText(add6);
            }
         
           Guardar.setEnabled(true);
           Eliminar.setEnabled(true);
           Modificar.setEnabled(true);
           Nuevo.setEnabled(false);
            Codigo.setEnabled(false);
           Apellidos.setEnabled(false);
           Nombres.setEnabled(false);
           Direccion.setEnabled(false);
           Email.setEnabled(false);
           Telefono.setEnabled(false);
           Grabar.setEnabled(false);
           
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
            }
        }
      
      if(Loggin.Consultor.isSelected()==true){
          try{
          String m= M2.getText();
          int row = Consulta.getSelectedRow();
          String Table_click=(Consulta.getModel().getValueAt(row, 0).toString());
          String SQL=("Execute BuscarCodigo"+"'"+Table_click+"'");
          conn = Conexion.crearConexion();
           rs=conn.createStatement().executeQuery(SQL);
           
           if(rs.next()){
               String add1=rs.getString("Codigo");
               Codigo.setText(add1);
                String add2=rs.getString("Apellidos");
               Apellidos.setText(add2);
                String add3=rs.getString("Nombres");
               Nombres.setText(add3);
                String add4=rs.getString("Direccion");
               Direccion.setText(add4);
                String add5=rs.getString("Email");
               Email.setText(add5);
                String add6=rs.getString("Telefono");
               Telefono.setText(add6);
           }
           
          Nuevo.setEnabled(false);
          Codigo.setEnabled(false);
          Apellidos.setEnabled(false);
          Nombres.setEnabled(false);
          Direccion.setEnabled(false);
          Email.setEnabled(false);
          Telefono.setEnabled(false);
          Guardar.setEnabled(false);
          Modificar.setEnabled(false);
          Eliminar.setEnabled(false);
          Grabar.setEnabled(false);
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
            }
        }
      
       if(Loggin.User.isSelected()==true){
          try{
          String m= M2.getText();
          int row = Consulta.getSelectedRow();
          String Table_click=(Consulta.getModel().getValueAt(row, 0).toString());
          String SQL=("Execute BuscarCodigo"+"'"+Table_click+"'");
          conn = Conexion.crearConexion();
          rs=conn.createStatement().executeQuery(SQL);
           
           if(rs.next()){
               String add1=rs.getString("Codigo");
               Codigo.setText(add1);
                String add2=rs.getString("Apellidos");
               Apellidos.setText(add2);
                String add3=rs.getString("Nombres");
               Nombres.setText(add3);
                String add4=rs.getString("Direccion");
               Direccion.setText(add4);
                String add5=rs.getString("Email");
               Email.setText(add5);
                String add6=rs.getString("Telefono");
               Telefono.setText(add6);
           }
           
           Nuevo.setEnabled(false);
           Codigo.setEnabled(false);
           Apellidos.setEnabled(false);
           Nombres.setEnabled(false);
           Direccion.setEnabled(false);
           Email.setEnabled(false);
           Telefono.setEnabled(false);
           Guardar.setEnabled(false);
           Modificar.setEnabled(false);
           Eliminar.setEnabled(false);
           Grabar.setEnabled(false);
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
              }
        }
    }//GEN-LAST:event_ConsultaMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String sentenciaInsert="EXECUTE BorrarEmpleado "+"'"+this.Codigo.getText().trim()+"'";
        if(Codigo.getText().length()==0 || Apellidos.getText().length()==0 ||  Nombres.getText().length()==0 || Direccion.getText().length()==0 || Email.getText().length()==0 || Telefono.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
       try{
           conn=DriverManager.getConnection(url,user,contraseña);
           Statement sentencia= conn.createStatement();
           int numFilas = sentencia.executeUpdate(sentenciaInsert);
           JOptionPane.showMessageDialog(null, numFilas+ " Registro Eliminado");
           Codigo.setText("");
           Apellidos.setText("");
           Nombres.setText("");
           Direccion.setText("");
           Email.setText("");
           Telefono.setText("");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
               }
        } 
         Actualizar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
           Codigo.setText("");
           Apellidos.setText("");
           Nombres.setText("");
           Direccion.setText("");
           Email.setText("");
           Telefono.setText("");
           
           Guardar.setEnabled(false);
           Eliminar.setEnabled(false);
           Modificar.setEnabled(false);
           Nuevo.setEnabled(true);
           Codigo.setEnabled(false);
           Apellidos.setEnabled(false);
           Nombres.setEnabled(false);
           Direccion.setEnabled(false);
           Email.setEnabled(false);
           Telefono.setEnabled(false);
           Grabar.setEnabled(false);
           Cancelar.setEnabled(false);
    }//GEN-LAST:event_CancelarActionPerformed

    public void Guardar(){
     String sentenciaInsert="EXECUTE InsertarEmpleado "+"'"+this.Codigo.getText().trim()+"','"+this.Apellidos.getText().trim()+"','"+this.Nombres.getText().trim()+"','"+this.Direccion.getText().trim()+"','"+this.Email.getText().trim()+"','"+this.Telefono.getText().trim()+"'";
        if(Codigo.getText().length()==0 || Apellidos.getText().length()==0 ||  Nombres.getText().length()==0 || Direccion.getText().length()==0 || Email.getText().length()==0 || Telefono.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
       try{
           conn=DriverManager.getConnection(url,user,contraseña);
           Statement sentencia= conn.createStatement();
           int numFilas = sentencia.executeUpdate(sentenciaInsert);
           JOptionPane.showMessageDialog(null, numFilas+ " nuevo registro");
           Codigo.setText("");
           Apellidos.setText("");
           Nombres.setText("");
           Direccion.setText("");
           Email.setText("");
           Telefono.setText("");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
        }   
    }
    
    public void Actualizar(){
        String m= M2.getText();
       
       DefaultTableModel modelo = new DefaultTableModel();
        Consulta.setModel(modelo);
       String SQL=("Execute MostrarEmpleado");
       
        try{
           conn = Conexion.crearConexion();
           rs=conn.createStatement().executeQuery(SQL);
           ResultSetMetaData rsm = rs.getMetaData();
           int cantidadColumnas = rsm.getColumnCount();
           
           for(int i=1; i<=cantidadColumnas;i++){
               modelo.addColumn(rsm.getColumnLabel(i));
           }
           while(rs.next()){
               Object[] fila = new Object[cantidadColumnas];
               for(int i=0; i< cantidadColumnas; i++){
                   fila[i]=rs.getObject(i+1);
               }
               modelo.addRow(fila);
           }
           rs.close();
       }catch(Exception e){
           System.out.println("Error"+e);
       }
    }
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Guardar();
        Actualizar();
    }//GEN-LAST:event_GuardarActionPerformed

    public void modificarBoton(boolean abilitado){
        Nuevo.setEnabled(abilitado);
    }
    
    private void GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrabarActionPerformed
         String sentenciaInsert="EXECUTE ModificarEmpleado "+"'"+this.Codigo.getText().trim()+"','"+this.Apellidos.getText().trim()+"','"+this.Nombres.getText().trim()+"','"+this.Direccion.getText().trim()+"','"+this.Email.getText().trim()+"','"+this.Telefono.getText().trim()+"'";
        if(Codigo.getText().length()==0 || Apellidos.getText().length()==0 ||  Nombres.getText().length()==0 || Direccion.getText().length()==0 || Email.getText().length()==0 || Telefono.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
       try{
           conn=DriverManager.getConnection(url,user,contraseña);
           Statement sentencia= conn.createStatement();
           int numFilas = sentencia.executeUpdate(sentenciaInsert);
           JOptionPane.showMessageDialog(null, numFilas+ " Registro Modificado");
           Codigo.setText("");
           Apellidos.setText("");
           Nombres.setText("");
           Direccion.setText("");
           Email.setText("");
           Telefono.setText("");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
         Actualizar();
    }//GEN-LAST:event_GrabarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         this.dispose();
         Principal p1=new Principal();
                 p1.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTable Consulta;
    private javax.swing.JTextField Direccion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Grabar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField M;
    private javax.swing.JTextField M2;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombres;
    public static javax.swing.JButton Nuevo;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
