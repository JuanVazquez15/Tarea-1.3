package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public abstract class FiguraGrafica {
    
    protected String figura;
    
    public FiguraGrafica(){
        this("cuadrado");
        
    }
    
    public FiguraGrafica(String figura){
        this.figura = figura;
    }

    public abstract void dibujar(Graphics g); //{
     /*   if(figura.equals("cuadrado")){
            g.drawRect(15, 15, 50, 50);
        } else if (figura.equals("rectangulo")){
            g.drawRect(15, 15, 50, 100);            
        } else if (figura.equals("triangulo")) {
            g.drawPolygon(new int[]{50, 15, 85}, new int[]{15, 65, 65}, 3);
        }
    }*/
    
    public abstract void encojer(Graphics g); /*{
        if(figura.equals("cuadrado")){
            g.drawRect(15, 15, 20, 20);
        } else if (figura.equals("rectangulo")){
            g.drawRect(15, 15, 20, 70);            
        } else if (figura.equals("triangulo")) {
            g.drawPolygon(new int[]{20, 15, 55}, new int[]{15, 35, 35}, 3);
        }
    } */
    
    public abstract void agrandar(Graphics g); /*{
        if(figura.equals("cuadrado")){
            g.drawRect(15, 15, 20, 20);
        } else if (figura.equals("rectangulo")){
            g.drawRect(15, 15, 20, 70);            
        } else if (figura.equals("triangulo")) {
            g.drawPolygon(new int[]{20, 15, 55}, new int[]{15, 35, 35}, 3);
        }
    } */
    
    public abstract void cambiarColor(Graphics g, Color c); /*{
        g.setColor(c);
        this.dibujar(g);
    } */
    
    public abstract void mover(Graphics g, String direccion); //{
        // WTF?
        // Como muevo a un triangulo!!!???
        // Esto no estaba en mi contrato!!!
   // } 
}
