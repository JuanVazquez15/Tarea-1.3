/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

/**
 *
 * @author CIC-114
 */
public class Hobbit {
    private String nombre;
    private String apellido;
    private String descripccion;
    private int nivelDePelea;
    private char estatura;
    private char genero;
    
    public Hobbit (String name){
    nombre = name;
    }    
    public Hobbit (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void pelear(){
            if (nivelDePelea <=5){
                System.out.println("corro");}
            else{
                System.out.println("pelear");}
    }
    public void setNivelDePelea(int i){
        nivelDePelea = i;
    }
    public String toString() {
        return "soy" + nombre;
    }
}
