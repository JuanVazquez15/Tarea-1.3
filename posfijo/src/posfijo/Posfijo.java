/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

import java.util.Scanner;

public class Posfijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String operadores="+-*/+^"; //Operadoes
        String Posfija=new String(); //Posfija
        Pila Mipila=new Pila(100); //Capacidad de la pila
            
      System.out.println("escribe una expresion algebraica: "); //Exprecion infija
      Scanner leer=new Scanner(System.in);
      String expresion1 = leer.nextLine();
        Infija expresion=new Infija(expresion1);
        Mipila.push("(");
        expresion.entrarCaracterFinal(")");
        for(int i=0; i<expresion.Caracteres(); i++){ //Se recorre de derecha a izquierda la exprecion
            String cadena=expresion.retornar();//Se retorna el caracter
            System.out.println(cadena);//Se imprime
            
        
        if (cadena.equals("(")){//se pregunta 
            Mipila.push(cadena);
            
        }else if (operadores.indexOf(cadena)<0 && !cadena.endsWith(")")){ //si es diferente de un parentesis
            Posfija=Posfija.concat(cadena);//Si es un numero se va a la posfija 
        }
        
        if (operadores.indexOf(cadena)>=0){
            if (cadena.equals("^")){ //Se pregunta si es diferente de potencia ^
                
            }
            else {
                String Aux=Mipila.Vercima();
                int precedenciaQ=operadores.indexOf(cadena);
                 int precedenciaP=operadores.indexOf(Aux);
                 while(precedenciaP>=precedenciaQ && !Aux.equals("(")) //Comparo la precedencia del operador
                 { Posfija=Posfija.concat(Mipila.pop());
                 Aux=Mipila.Vercima();
                 precedenciaP=operadores.indexOf(Aux);
                 }
            }
            Mipila.push(cadena);
                 }
        if(cadena.equals(")")){
            String Aux=Mipila.Vercima();
            while(!Aux.equals("("))
            {
                Posfija=Posfija.concat(Mipila.pop());
                Aux=Mipila.Vercima();
            }
            Mipila.pop();
            }
        
        
        }
        System.out.println("Posfijo->"+Posfija);
    }
    
}
