/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Juan D Candy
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner leer = new Scanner (System.in);
        System.out.println("Cual es tu edad");
        edad = leer.nextInt();
        if (edad <=2)
            System.out.println("eres un bebe");
        if (edad <10)
            System.out.println("eres un niño");
        if (edad > 10 && edad < 18)
            System.out.println("Eres un adolecente");
        if (edad >=18 && edad < 55)
            System.out.println("Eres mayor de edad");
        if (edad >=55 && edad < 65)
            System.out.println("Eres un adulto mayor");
                
    }
    
}
