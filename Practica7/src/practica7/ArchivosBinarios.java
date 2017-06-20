/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosBinarios {
    public static void main(String[] args) throws FileNotFoundException{
       
        try {
            DataOutputStream escritor = new DataOutputStream(new FileOutputStream("hola.bin"));
            
            escritor.writeInt(33465);
            escritor.writeChar('a');
            escritor.writeChar('z');
            escritor.writeChar(10);
            
            escritor.close();
            
            DataInputStream lector = new DataInputStream(new FileInputStream("hola.bin"));
            System.out.println(lector.readInt());
            System.out.println(lector.readChar());
            System.out.println(lector.readChar());
            System.out.println(lector.readShort());
            
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
