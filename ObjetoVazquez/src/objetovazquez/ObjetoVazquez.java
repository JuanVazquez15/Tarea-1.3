package objetovazquez;
import java.util.Scanner;
/**
 *
 * @author Juan D Candy
 */
public class ObjetoVazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int tamaño=10;
         core dato=new core(tamaño);
         Scanner leer=new Scanner(System.in);
        
       //double x,numero=0,a,b=1000,promedio=0,total;
       int x,numero=0,a,b=1000;
       double promedio=0,total;
         
       for(x=1;x<=10;x++)
       {
           System.out.println("Dame un numero");
           a=leer.nextInt();
           if(a>numero)
           {
               numero=a;
               promedio=promedio+a;
           }
            if(b>a)
           {
               b=a;
           }
       }
       total=promedio/10;
       
       System.out.println("El numero mayor es"+numero);
       System.out.println("El numero menor es "+b);
       System.out.println("El promedio de numeros es "+total);
    }
}