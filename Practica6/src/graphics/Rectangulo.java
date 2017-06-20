package graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends FiguraGrafica {
 
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;

    public Rectangulo (int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void dibujar(Graphics g){
        g.drawRect(x, y, ancho, alto);
    }
    
    @Override
    public void encojer(Graphics g) {
        ancho -= 5;
        alto -= 5;
        if (alto < 5) alto = 5;
        if (ancho < 5) ancho = 5;
        this.dibujar(g);        
    }
    
    @Override
    public void agrandar(Graphics g) {
        alto += 5;
        ancho += 5;
        if (alto > 200) alto = 200;
        if (ancho > 200) ancho = 200;
        this.dibujar(g);
    }
    
    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }
    
    @Override
    public void mover(Graphics g, String direccion){
        switch(direccion){
            case "arriba"    : y-=5; break;
            case "abajo"     : y+=5; break;
            case "izquierda" : x-=5; break;
            case "derecha"   : x+=5; break;
        }
        this.dibujar(g);
    }    
}

