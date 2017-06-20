/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JFrame;

/**
 *
 * @author Juan D Candy
 */
public class Ventana extends JFrame {
    private final int ancho =800, alto=500;
    private Tablero Panel;
    private Hilo hilo;
    public Ventana (){
        setTitle("PingPong");
        setSize (ancho, alto);
        setLocationRelativeTo(null); //Centrar ventana
        setResizable(false);
        Panel = new Tablero();
        add(Panel);
        hilo = new Hilo(Panel);
        hilo.start();

    }
    
}
