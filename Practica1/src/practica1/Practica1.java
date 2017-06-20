
package practica1;
import java.util.Scanner;
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean booleano;
	char caracter;
	byte numeroMuyPequeño;
	short numeroPequeño;
	int entero;
	long largo;
	float flotante;
	double doble;
        
        // segunda parte: Diferencias entre los tipos de datos primitivos
        entero = 97;
        doble = 97;
        caracter = 97;
        
            System.out.println("El valor 97 como entero es: " + entero);
            System.out.println("El valor 97 como doble es: " + doble);
            System.out.println("El valor 97 como caracter es: " + caracter);
        
        // Tercera parte: Variables de Referencia
        String cadena = new String("Variables de Referencia!");    
        Scanner lector = new Scanner (System.in);

        System.out.println("Los Strings en Java son" + cadena);
        System.out.println("");
        
        //Cuarta parte: Literales
        booleano = true;
        caracter = '7';
            System.out.println(booleano);
            System.out.println(caracter);
            System.out.println("");

        booleano = false;
        caracter = '\u0037';
            System.out.println(booleano);
            System.out.println(caracter);

        caracter = '\n';
            System.out.println("El caracter salto de linea en accion;");
            System.out.println(caracter);

	//flotante = 3.14159265;
        flotante = 3.14159265f;
            System.out.println(flotante);
            
        cadena = "¡Puedes asignar valores a un String con literales!";
            System.out.println(cadena);
            System.out.println(caracter);

        //Quinta aparte: Lectura de datos del usuario
            System.out.println("¿Cómo te llamas?: ");
            String nombre = lector.nextLine();
            
            System.out.println("¿cuanto años tienes?: ");
            int edad = lector.nextInt();
            
            System.out.println("¡Te llamas " + nombre + " y tienes " + edad + "años");
            
            
            
    }
    
}
