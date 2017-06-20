package practica7;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseControladora {
    
    public static void main(String[] args){
        PrintWriter  escritor  = null ;
        try {
            escritor = new PrintWriter ("index.txt");
            try {
                WebMaker  generador  =  new  WebMaker();
                escritor = new  PrintWriter("index.txt");
                escritor.println(generador.imprimirEncabezado());
                escritor.println(generador.imprimirTexto("Holaa"));
                escritor.println(generador.insertarImagen("Hakyu.jpg"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClaseControladora.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                escritor.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClaseControladora.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            escritor.close();
        }                                      
    }
}