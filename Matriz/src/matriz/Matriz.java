package matriz;
import java.util.Scanner;

public class Matriz {
    private Scanner teclado;
    private int [] [] recepcionar;
   int filas=5;
    int columnas=5;
private void ingresar(){
    teclado =new Scanner( System.in);
    recepcionar= new int [filas] [columnas];
    int c=0;
    for (int i=0; i<5; i++){
        for (int j=0;j<5; j++){
            ++c;
            System.out.print("ingrese valor numerico "+c+":");
            recepcionar [i] [j]=teclado.nextInt();
            
            
        }
    }
}
   
public void imprimir (){
     for (int i=0; i<5; i++){
        for (int j=0;j<5; j++){
            System.out.print( recepcionar [i] [j]+"-");
            
        }
    }
}

public void densa(){
    int densa=0;
    int nodensa=0;
    double porcentaje;
     for (int i=0; i<5; i++){
        for (int j=0;j<5; j++){
           if (recepcionar [i][j]==0){
              ++densa;
           }
           else {
            ++nodensa;
        }
    }
}
     if (densa>nodensa){
         porcentaje=densa/25.0*100;
          System.out.println( " la matriz tiene un %"+porcentaje+"de ceros asi que es :");
          System.out.println( " matriz es poco densa");
            }
     else {
         porcentaje=nodensa/25.0*100;
          System.out.println( " la matriz tiene un %"+porcentaje+" de numeros que no son ceros por lo tanto esta matriz es :");
    System.out.println( "matriz densa");
    }
}
    public static void main(String[] args) {
  Matriz matriz1=new Matriz();
  matriz1.ingresar();
  matriz1.imprimir();
  matriz1.densa();
 
    
    }
}