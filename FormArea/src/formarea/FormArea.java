/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Juan D Candy
 */
public class FormArea extends JFrame {
    private JTextField textfield1;
    private JScrollPane Scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;
    public FormArea(){
        setLayout(null);
        boton1 = new JButton("Abrir archivo");
        add(boton1);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);
        textarea1 = new JTextArea();
        Scrollpane1= new JScrollPane(textarea1);
        Scrollpane1.setBounds(10, 50, 400, 300);
        add(Scrollpane1);
      //  boton1.addActionListener((ActionListener) new OyenteBoton());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormArea formulario1= new FormArea();
        formulario1.setBounds(0, 0, 540, 400);
        formulario1.setVisible(true);
    }
  //  class OyenteBoton implements ActionListener{
    //    public void actionPerforment(ActionEvent e){
      //  }
    //}
}
