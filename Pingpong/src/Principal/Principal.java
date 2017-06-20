/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Gui.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Juan D Candy
 */
public class Principal {
    public static void main(String[] args) {
        Ventana ventana = new Ventana ();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
