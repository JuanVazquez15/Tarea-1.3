/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author Juan D Candy
 */
public class Hilo extends Thread{
    Tablero panel;
    public Hilo(Tablero panel){
        this.panel=panel;
    }
    @Override
    public void run(){
        while(true){
            panel.repaint();
        }
    }
}
