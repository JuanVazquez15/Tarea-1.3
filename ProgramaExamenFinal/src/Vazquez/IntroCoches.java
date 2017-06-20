package Vazquez;

import static Vazquez.Basico1.coches;
import static Vazquez.Basico1.sc;

public class IntroCoches {
    public static void leerCoches(){
        String matricula;
        String marca;
        String modelo;
        
        Coche aux;
        int i, N;
        do {
            System.out.print("Número de coches");
 
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); 
        
        for (i = 1; i <= N; i++) {
            System.out.println("Coche " + i);
            System.out.print("Matrícula: ");
            matricula = sc.nextLine();          
            System.out.print("Marca: ");
            marca = sc.nextLine();
            System.out.print("Modelo: ");
            modelo = sc.nextLine();
            System.out.print("color: ");
            marca = sc.nextLine();
            sc.nextLine(); 
            aux = new Coche();
            aux.setMatricula(matricula);
            aux.setMarca(marca);
            aux.setModelo(modelo);
                                  
        
            coches.add(aux);
        }
    }
    public static void mostrarCoches(){      
        for(int i = 0; i< coches.size(); i++)
            System.out.println(coches.get(i));
    }
    
}
