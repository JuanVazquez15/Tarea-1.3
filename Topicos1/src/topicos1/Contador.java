/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicos1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Juan Vazquez
 */
public class Contador extends JFrame {
    
    private JPanel panel1 = new JPanel ();
    private JButton Contar = new JButton("Contar");
    private JButton Limpiar = new JButton("Limpiar");
    private JButton Disminuir = new JButton("Restar");
    private JTextField Muestra = new JTextField ();
    private JLabel textConteo = new JLabel ("Contador:");
    
public Contador (){

    Contar.setBounds(30,120,80,28);
    add(Contar);
    
    Limpiar.setBounds(80,160,80,28);
    add(Limpiar);
    
    Disminuir.setBounds(130,120,80,28);
    add(Disminuir);
    
    Muestra.setBounds(30,80,180,25);
    add(Muestra);
    
    textConteo.setBounds(30,60,180,25);
    add(textConteo);
    
    this.setSize(250,250);
    panel1.setSize(250,300);
    add(panel1);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Contador Manual");
    
}
public static void main(String[]args){
    new Contador();
    }
}
