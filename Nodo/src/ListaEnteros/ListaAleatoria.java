/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnteros;

import java.util.*;
import ListaEnteros.*;

/**
 *
 * @author Juan D Candy
 */
public class ListaAleatoria {        
    /**
     *
     * @param args
     */
public static void main(String[] args) {
        // TODO code application logic here
    Random r;
 int d;
 Lista lista;
 int k;
 r = new Random();
 lista = new Lista(); // crea lista vacía
 k = Math.abs(r.nextInt()% 55); // número de nodos
 // se insertan elementos en la lista
 for (; k > 0; k-- )
 {
 d = r.nextInt() % 99 ;
 lista.insertarCabezaLista(d);
    } 
  }
}  

