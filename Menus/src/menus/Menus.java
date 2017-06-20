/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Juan D Candy
 */
public class Menus {
Menus(){
    JFrame f = new JFrame("MenuT    ");
    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Elija");
    JMenu menu2 = new JMenu("Salir");
    JMenuItem item1;
    JMenuItem item2;
    item1 = new JMenuItem("Data 1");
    item2 = new JMenuItem("Data 2");
    
    menu.add(item1);
    menu.add(item2);
    mb.add(menu);
    mb.add(menu2);
    f.setJMenuBar(mb);
    f.setBounds(100,400,100,150);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Menus();
    }
    
}
