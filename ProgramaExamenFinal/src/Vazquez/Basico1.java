/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vazquez;

import java.util.ArrayList;
import java.util.Scanner;
import static Vazquez.IntroCoches.leerCoches;
import static Vazquez.IntroCoches.mostrarCoches;

public class Basico1 {
    static ArrayList<Coche> coches = new ArrayList<Coche>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        leerCoches();
        System.out.println("\nCoches introducidos:");
        mostrarCoches();          
    }
}