package TareaPeriodica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejecutor e = new Ejecutor("calc", 1);
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un commando para ejecutar");
        e.comando = leer.next();
        if(e.necesitaEjecucion()) {
            e.ejecutarTarea();
        }
        
        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("calc", 0)).start();
    }
}
