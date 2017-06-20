/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author Juan Vazquez
 */
public class SumaMouse extends JFrame  {
 private JLabel lb1=new JLabel("Num 1");
 private JLabel lb2=new JLabel ("Num 2");
 private JTextField txt1 =new JTextField(20);
 private JTextField txt2 = new JTextField(20);
 private JButton bot1=new JButton("calcular");
 private JLabel lb3=new JLabel("resultado");
 private JButton bot2=new JButton("restar");
 private JLabel lb4=new JLabel("resultado resta");
 
 public SumaMouse(){
    super("SumaMouse");
    
    setLayout(null);
    lb1.setBounds(10, 20, 300, 30);
    add(lb1);
    lb2.setBounds(10, 60, 100, 30);
    add(lb2);
    lb3.setBounds(125, 100, 110, 30);
    lb3.setForeground(Color.BLUE);
    lb3.setFont(new Font("Arial",Font.ITALIC,20));
    add(lb3);
    txt1.setBounds(80, 20, 100, 30);
    add(txt1);
    txt2.setBounds(80, 60, 100, 30);
    add(txt2);
    bot1.setBounds(10, 100, 110, 30);
    bot1.addActionListener(accion);
    add(bot1);
    
    bot2.setBounds(10, 150, 110, 30);
    bot2.addActionListener(accion);
    add(bot2);
    
    lb4.setBounds(125, 150, 140, 30);
    lb4.setForeground(Color.BLUE);
    lb4.setFont(new Font("Arial",Font.ITALIC,20));
    add(lb4);
    
    
    
    this.setLocationRelativeTo(null);
    this.setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
}
 ActionListener accion=new ActionListener(){
     public void actionPerformed(ActionEvent e){
         Object fuente = e.getSource();
         if (fuente==bot1) {
             int tot=Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText());
             lb3.setText(Integer.toString(tot));
         }
         
         if (fuente==bot2) {
          int tot=Integer.parseInt(txt1.getText())-Integer.parseInt(txt2.getText());
             lb4.setText(Integer.toString(tot));   
             
         }
     }
        
 };
    public static void main(String[] args) {
        new SumaMouse();
    }
 
         }
