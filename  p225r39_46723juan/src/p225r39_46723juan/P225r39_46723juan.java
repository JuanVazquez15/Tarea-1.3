/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p225r39_46723juan;

/**
 *
 * @author Juan D Candy
 */
import java.util.Scanner;
public class P225r39_46723juan {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
    double valor_c;
    double valor_x;
    double Total;
        System.out.println("Dame el valor de c");
        valor_c=leer.nextDouble();
        
        System.out.println("Dame el valor de x");
        valor_x=leer.nextDouble();
        
        Total=valor_c*valor_x*(21-valor_x);
        System.out.println(Total);
    }
    
}
