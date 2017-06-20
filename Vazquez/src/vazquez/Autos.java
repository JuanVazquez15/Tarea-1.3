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

public class Autos{
    private final String Marca, Color;
    private final int Modelo;
    static ArrayList <Listado> L;
public Autos (String MA, String CA,int AA){
        Marca=MA;
        Color=CA;
        Modelo=AA;
    }
void add (Listado c){
        Listado.add(c);
    }
}
