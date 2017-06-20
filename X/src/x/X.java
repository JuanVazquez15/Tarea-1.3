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
public class X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelota pelota =new Pelota();
        pelota.setColor("azul").setSize(20).setDeporte("Basquet");
        System.out.println(pelota);
        
    }
    
}
