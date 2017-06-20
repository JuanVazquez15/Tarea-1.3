/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramacion;

/**
 *
 * @author Juan D Candy
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1, dato2,dato3, resultado;
        dato1 =20;
        dato2 = 10;
        dato3 = 15;
        //Suma
        resultado = dato1 + dato2 + dato3;
        //System.out.println(dato1+"+"+dato2+"=" + resultado);
        System.out.println(dato1+"+"+dato2+"+"+dato3+"="+ resultado);
        //Resta
        resultado = dato2 - dato1;
        System.out.println(dato1+"-"+dato2+"="+ resultado);
        //Multiplicacion
        resultado = dato1 * dato2;
        System.out.println(dato1+"*"+dato2+"="+ resultado);
        //Divicion
        resultado = dato1 / dato2;
        System.out.println(dato1+"/"+dato2+"="+ resultado);
        //Combinado
        resultado =dato1 * dato3 / dato2 + dato3;
        System.out.println(dato1+"*"+dato3+"/"+dato2+"+"+dato3+"="+ resultado);
    }
    
}
