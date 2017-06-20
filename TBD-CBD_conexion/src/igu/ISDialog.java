package igu;

import conexion.ConexionBD;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class ISDialog extends JDialog {

    private JTextField servidor, usuario;
    private JPasswordField contraseña;
    private JComboBox tipoConexion;
    private JButton conectar;
    private JProgressBar barraProgreso;
    private ConexionBD conexion;
    private final int AUT_WINDOWS = 0, AUT_SQL = 1;

    public ISDialog(JFrame parent) {
        super(parent, "Inicio de sesion", true);
        iniciarComponentes();
        desactivarCampos(usuario, contraseña);
        tipoConexion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = tipoConexion.getSelectedIndex();
                if (i == AUT_WINDOWS) {
                    desactivarCampos(usuario, contraseña);
                } else if (i == AUT_SQL) {
                    activarCampos(usuario, contraseña);
                }
            }
        });
        conectar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                final String serv = servidor.getText();
                if (serv.isEmpty()) {
                    return;
                }
                barraProgreso.setIndeterminate(true);
                final int seleccionado = tipoConexion.getSelectedIndex();
                desactivarCampos(usuario, servidor, contraseña, conectar, tipoConexion);
                Thread hiloConexion = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        switch (seleccionado) {
                            case AUT_WINDOWS:
                                try {
                                    conexion = new ConexionBD(serv);
                                    cerrarVentana();
                                } catch (SQLException ex) {
                                    ErrorDialog.dialog(null, ex.getMessage());
                                }
                                activarCampos(servidor, conectar, tipoConexion);
                                break;
                            case AUT_SQL:
                                String us= usuario.getText();
                                String pass= new String(contraseña.getPassword());
                                try {
                                    conexion= new ConexionBD(serv, us, pass);
                                    cerrarVentana();
                                } catch(SQLException ex) {
                                    ErrorDialog.dialog(null, ex.getMessage());
                                }
                                activarCampos(usuario, servidor, contraseña, conectar, tipoConexion);
                                break;
                        }
                        barraProgreso.setIndeterminate(false);
                    }
                });
                hiloConexion.start();
            }
        });
        super.setSize(408, 170);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    private void iniciarComponentes() {
        servidor = new JTextField(15);
        usuario = new JTextField(15);
        contraseña = new JPasswordField(15);
        tipoConexion = new JComboBox(new String[]{
                    "Autenticacion de windows",
                    "Autenticacion SQL Server"
                });
        conectar = new JButton("Conectar");
        JPanel panelPrincipal = new JPanel();
        //panelPrincipal.setBackground(new Color(250,250,250));
        GridLayout gridLayout = new GridLayout(4, 2);
        gridLayout.setVgap(5);
        gridLayout.setHgap(3);
        panelPrincipal.setLayout(gridLayout);
        JLabel servidorLabel = new JLabel("Nombre del servidor:");
        servidorLabel.setHorizontalAlignment(JLabel.RIGHT);
        panelPrincipal.add(servidorLabel);
        panelPrincipal.add(servidor);
        JPanel panelRelleno = new JPanel();
        //panelRelleno.setBackground(new Color(250,250,250));
        panelPrincipal.add(panelRelleno);
        panelPrincipal.add(tipoConexion);
        JLabel usuarioLabel = new JLabel("Nombre de usuario:");
        usuarioLabel.setHorizontalAlignment(JLabel.RIGHT);
        panelPrincipal.add(usuarioLabel);
        panelPrincipal.add(usuario);
        JLabel passwordLabel = new JLabel("Contraseña de usuario:");
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);
        panelPrincipal.add(passwordLabel);
        panelPrincipal.add(contraseña);
        add(panelPrincipal, BorderLayout.CENTER);
        JPanel panelConectar = new JPanel();
        //panelConectar.setBackground(new Color(238,238,238));
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        barraProgreso = new JProgressBar();
        barraProgreso.setPreferredSize(new Dimension(300, 22));
        panelConectar.add(barraProgreso);
        panelConectar.setLayout(flowLayout);
        panelConectar.add(conectar);
        add(panelConectar, BorderLayout.SOUTH);
    }

    private void desactivarCampos(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(false);
        }
    }

    private void cerrarVentana( ) {
        dispose();
    }
    
    private void activarCampos(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(true);
        }
    }
    
    public ConexionBD getConexion() {
        return conexion;
    }
    
    public void cerrarConexion() {
        try {
            conexion.cerrarConexion();
            conexion= null;
        } catch (SQLException ex) {
            ErrorDialog.dialog(null, ex.getMessage());
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

        ISDialog g= new ISDialog(null);
        g.setVisible(true);
    }
}
