package Vazquez;

import static Vazquez.IntroCoches.leerCoches;
import static Vazquez.IntroCoches.mostrarCoches;

public class ProgramaExamenFinal {
    private static String i;

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        leerCoches();
        System.out.println("\nCoches introducidos:");
        mostrarCoches();
        System.out.println("\nNumerodeCoches"+ i);
}
}
