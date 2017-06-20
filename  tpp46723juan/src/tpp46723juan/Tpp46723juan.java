/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpp46723juan;

import static javax.management.Query.lt;

/**
 *
 * @author Juan D Candy
 */
public class Tpp46723juan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int contador=0;
    int respuesta=0;
    int respuesta2=0;
    int a, b, c;
    
    for( a=1; a<=250;a++)
    for(b=1; b<=250;b++)
    for( c=1; c<=250;c++)
            {
                respuesta=(a*a)+(b*b);
                respuesta2= c*c;
                if(respuesta==respuesta2)
                {
                    contador++;
                    System.out.println(""+a+"^2 + "+b+"^2 ="+c+"^2");
      
        System.out.println("El numero de triples pitagoricas fue:"+contador);
                }
            }
    }
}