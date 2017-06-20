/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoObjeto {
    public static void main(String[] args) throws IOException{
        ObjectInputStream  lector  =  new  ObjectInputStream
        (new  FileInputStream("web.obj"));
        PrintWriter  escritor  =  new  PrintWriter("main.html");
        WebMaker  pagina = null;
        try {
            pagina = (WebMaker)(lector.readObject());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArchivoObjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritor.print(pagina.printPage());
        lector.close();
        escritor.close();
    }
}
