package rfc;
import java.util.Scanner;

/**
 *
 * @author Juan D Candy
 */
public class Rfc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String año;
    String mes;
    String dia;
    String rfc;
    
        System.out.println("Bienvenido \nporfavor ingrese sus datos");
        //System.out.println("Nombre");
        nombre = leer.next();
        //System.out.println("Apellido paterno");
        apellidoPaterno = leer.next();
        //System.out.println("Apellido materno");
        apellidoMaterno = leer.next();
        //System.out.println("Ingrese su fecha de nacimiento todo en numeros aaaa/mm/dd");
        //System.out.println("Año");
        año = leer.next();
        //System.out.println("Mes");
        mes = leer.next();
        //System.out.println("Dia");
        dia = leer.next();
        
    rfc = apellidoPaterno.trim().substring(0, 2);
    rfc = rfc.concat(apellidoMaterno.trim().substring(0, 1));
    rfc = rfc.concat(nombre.trim().substring(0, 1));
    rfc = rfc.concat(año.substring(2, 4));
    rfc = rfc.concat(mes);
    rfc = rfc.concat(dia);
    
        System.out.println("RFC generado;"+rfc.toLowerCase());
    }    
}
