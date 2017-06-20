/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x;

/**
 *
 * @author Juan D Candy
 */
public class Pelota {
    private String color;
    private int size;
    private String deporte;

    public Pelota setColor(String color) {
        this.color = color;
        return this;
    }
    public Pelota setSize(int size) {
        this.size = size;
        return this;
    }
    public Pelota setDeporte(String deporte) {
        this.deporte = deporte;
        return this;
    }
    
    public String toString() {
        return "Soy pelota de"+deporte+ "de tamaño"+size+ "y de color" +color;
    }
}
