/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Juan D Candy
 */
public class Raqueta {
    private int x, y ;
    private static final int ancho=70, alto =15;
    
    public Raqueta(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x,y,ancho,alto);

    }
    
}
