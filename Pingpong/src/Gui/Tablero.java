/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Juan D Candy
 */
public class Tablero extends JPanel {
    Pelota pelota = new Pelota (0,0);
    Raqueta r1 = new Raqueta(380,450);
    public Tablero(){
        setBackground(Color.red);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        dibujar(g2);
        actualizar();
        
    }
    public void dibujar (Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
    }
    public void actualizar (){
        pelota.mover(getBounds());
    }
    
}
