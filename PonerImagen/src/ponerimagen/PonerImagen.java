/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponerimagen;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Vazquez
 */
public class PonerImagen extends JFrame {
    private JTextField cantidad;
    private JButton boton1, boton2;
    public PonerImagen(){
        super("conversor Euros-Pesetas");
        boton1 = new JButton("A Euros");
        boton2 = new JButton("A Pesetas");
        cantidad = new JTextField(10);
        JLabel eti2 = new JLabel(new ImageIcon("C:\\Users\\Juan D Candy\\Documents\\NetBeansProjects\\PonerImagen\\src\\ponerimagen\\r.jpg"));
        add(eti2);
        add(cantidad);
        add(boton1);
        add(boton2);
        setLayout(new FlowLayout());
        boton1.addActionListener(new OyenteBoton());
        boton2.addActionListener(new OyenteBoton());
        setSize(500,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PonerImagen ventana= new PonerImagen();
    }
    class OyenteBoton implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            Float f = new Float(cantidad.getText());
            float valor = f.floatValue();
            String s = (String) ae.getActionCommand();
            if (s.equals("A euros")){
                valor =(float) (valor / 166.321);
            }
            else if(s.equals("A pesetas")){
                valor = (float) (valor * 166.321);
            }
            cantidad.setText(Float.toString(valor));
        }
    }
}
