/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package historial;
import java.util.Stack;
public class Historial {
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("www.google.com");
        pila.push("www.facebook.com");
        pila.push("www.twitter.com");
        
        System.out.println("El ultimo elemento en la pila es: " +pila.peek());
        while(pila.empty()==false){
            System.out.println(pila.pop());
        }
    }
}
