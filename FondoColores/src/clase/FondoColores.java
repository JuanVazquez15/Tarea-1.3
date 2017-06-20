/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Juan Vazquez
 */
public class FondoColores extends JFrame {
    
    private JButton boton1= new JButton("Verde");
    private JButton boton2=new JButton("Naranja");
    private JPanel panel1=new JPanel();
    public FondoColores(){
        setLayout(null);
        
        boton1.setBounds(10, 20, 110, 30);
        add(boton1);
        boton1.addActionListener(fuente);
        
        boton2.setBounds(10, 60, 110, 30);
        boton2.addActionListener(fuente);
        add(boton2);
        
    this.setSize(500, 300);
        panel1.setSize(500, 300);
        add(panel1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
   
    ActionListener fuente=new ActionListener(){
    public void actionPerformed(ActionEvent e){
         Object fuente = e.getSource();
         if (fuente==boton1) {
         panel1.setBackground(Color.GREEN);
         }
         if (fuente==boton2) {
            panel1.setBackground(Color.orange);
        }
     }
    };
    
    public static void main(String[] args) {
        new FondoColores();
    }
}
