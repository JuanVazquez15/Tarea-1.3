package objetovazquez;
/**
 *
 * @author Juan D Candy
 */
public class ObjetoVazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int tamaño = 10;
        core data = new core(tamaño);

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            data.setNumero(new java.util.Scanner(System.in).nextInt(), i);
        }

        System.out.println("El numero mayor es: " + data.getMayor());
        System.out.println("El numero menor es: " + data.getMenor());
        System.out.println("El promedio de numeros es " + data.getpromedio());
    }
}
