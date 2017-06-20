/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf1;
import java.util.Scanner;
/**
 *
 * @author Juan Vazquez
 */
public class Tarea1 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {        
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dame Un Numero: ");
        
        //Cuadrado Arriba
        int m = leer.nextInt();
            for(int k=0;k<m;k++){
                System.out.print(" *");
                }
            System.out.println("");
            //Cuadrado medio
        for(int i=0;i<m-2;i++){
            System.out.print(" *");
            for(int k=0; k<m-2;k++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        //Cuadrado Abajo
        for (int k=0;k<m;k++){
            System.out.print(" *");
        }
        System.out.println("");
        System.out.println("");
    //Cuadrado llenado
        for(int i=0;i<m;i++){
            for(int k=0;k<m;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");
        //Triangulo LLeno
        for(int i=0;i<m;i++){
            for(int k=m-i;k>0;k--){
                System.out.print(" ");
                
            }
            for(int k=0;k<i;k++){
                System.out.print(" *");
            }
            System.out.println(" *");
        }
        System.out.println("");
        
        //Triangulo sin relleno
        for(int i=0;i<m;i++){
            if(i== m/2)
            System.out.print(" *");
            else
                System.out.print(" ");
        }
                for(int i=0;i<m/3;i++){
                    for(int k=0;k<m;k++){
                        if (k==(m/2)-1||k==(m/2)+1)
                            System.out.print(" *");
                        else 
                            System.out.println(" ");
                    }
                }
        }
}



