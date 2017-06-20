/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetovazquez;

/**
 *
 * @author Juan D Candy
 */
public class core {

    int[] array;
    double promedio = 0;
    int mayor, menor;

    public core(int tamaño) {
        array = new int[tamaño];

    }

    public void setNumero(int numero, int pos) {
        array[pos] = numero;
    }

    public double getpromedio() {
        for (int i = 0; i < array.length; i++) {
            promedio = promedio + array[i];

        }

        promedio = (promedio / array.length);
        return promedio;
    }

    public int getMayor() {
        mayor=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> mayor) {
                mayor=array[i];
            }

        }
        return mayor;
    }

    public int getMenor() {
        menor=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]< menor) {
                menor=array[i];
            }

        }
        return menor;
    }
}
