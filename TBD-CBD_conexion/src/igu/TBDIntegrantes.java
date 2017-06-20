package igu;

/**
 *
 * @author Raul
 */
public class TBDIntegrantes extends javax.swing.JDialog {

    public TBDIntegrantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaIntegrantes = new javax.swing.JList();
        panelCerrar = new javax.swing.JPanel();
        CERRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Integrantes del equipo");
        setPreferredSize(new java.awt.Dimension(230, 320));

        listaIntegrantes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "<html><h3>Cesar Alberto Uc Moo</h3><html>", "<html><h3>Estefania Medina May</h3><html>", "<html><h3>Raul Cabrera Aguilar</h3><html>", "<html><h3>Carlos Quetz Ku</h3><html>", "<html><h3>Carlos Ivan Jose Pinacho</h3><html>", "<html><h3>Javier Antonio Rivero Chin</h3><html>" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaIntegrantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaIntegrantes.setMaximumSize(new java.awt.Dimension(184, 200));
        listaIntegrantes.setMinimumSize(new java.awt.Dimension(184, 200));
        listaIntegrantes.setPreferredSize(new java.awt.Dimension(184, 200));
        jScrollPane1.setViewportView(listaIntegrantes);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelCerrar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        CERRAR.setText("CERRAR");
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });
        panelCerrar.add(CERRAR);

        getContentPane().add(panelCerrar, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        dispose();
    }//GEN-LAST:event_CERRARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TBDIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TBDIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TBDIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TBDIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                TBDIntegrantes dialog = new TBDIntegrantes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERRAR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaIntegrantes;
    private javax.swing.JPanel panelCerrar;
    // End of variables declaration//GEN-END:variables
}
