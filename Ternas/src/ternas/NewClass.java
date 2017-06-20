/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternas;

/**
 *
 * @author Juan D Candy
 */
public class NewClass {
 public class Ternas{
public int Tamaño= 500;
public void Pitagoras(){
    System.out.println("\neste programa prueba e imprime toda las ternas");
    System.out.printf("pitagoricas para numeros no mayores que %d",Tamaño);
    System.out.print("mediante la fuerza bruta.\n");
    
    for (int c= 1; c <=Tamaño; c++)
        for (int a=1; a<=Tamaño; a++)
            for (int b=1; b<=Tamaño; b++){
                if(c*c==a*a+b*b)
                    System.out.printf("%3d\t%3d\t%3d\n", c, a, b);
            }
}
}   
}
