/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmvc;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Juan D Candy
 */
public class ViewPot extends JFrame {
    JTextField num;
    JLabel lab;
    public JButton bot;

ViewPot(){    
    setLayout (null);
    num=new JTextField();
    num.setBounds(10, 20, 50, 30);
    num.setFont(new Font("Tahoma", Font.BOLD,16));
    add(num);
    bot=new JButton();
    bot.setBounds(40, 80, 70, 30);
    bot.setBackground(java.awt.Color.WHITE);
    bot.setIcon(new ImageIcon(getClass().getResource("x2.jpg")));
    add(bot);
    lab = new JLabel ("Resp:");
    lab.setBounds(70, 20, 100, 30);
    lab.setFont(new Font("Tahoma", Font.BOLD,16));
    add(lab);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(170,170);
}
public int getnum(){
    return Integer.parseInt(num.getText());
}
public void setCalcSolution(int sol){
    lab.setText("R:"+Integer.toString(sol));
}
void addCallListener(ActionListener listen){
    bot.addActionListener(listen);
}
}
