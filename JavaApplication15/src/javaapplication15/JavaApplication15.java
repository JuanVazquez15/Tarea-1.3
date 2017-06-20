/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author Juan D Candy
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double temperatura;
        double altura;
        System.out.println("inserte temp");
        temperatura =leer.nextDouble();
        
        altura=1000*(100-temperatura)+580*((100-temperatura)*(100-temperatura));
        System.out.println(altura);
    }
    
}
