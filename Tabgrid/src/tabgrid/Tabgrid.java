/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabgrid;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Juan D Candy
 */
public class Tabgrid {
    private static void createAndShowGUI(){
    final JFrame frame = new JFrame("Ejemplo Tab");
    frame.setSize(500,300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new GridLayout(1,1));
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Tab1", CreaPanel("Area tab 1"));
    tabbedPane.addTab("Tab2", CreaPanel("Area tab 2"));
    frame.getContentPane().add(tabbedPane);
}
    private static JPanel CreaPanel(String text){
        JPanel p = new JPanel ();
        p.add(new Label(text));
        p.setLayout(new GridLayout(1,1));
        return p;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
            });
    }
    
}
