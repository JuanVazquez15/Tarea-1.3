/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vazquez;

import java.util.ArrayList;

/**
 *
 * @author Juan D Candy
 */

public class Camiones {
private final String Marca,Color;
private final int Modelo;
static ArrayList <Listado> L;
public Camiones (String MC, String CC,int AC){
        Marca=MC;
        Color=CC;
        Modelo=AC;
}
void add (Listado c){
        Listado.add(c);
    }
}
