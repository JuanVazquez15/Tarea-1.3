/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasenlazadas;

/**
 *
 * @author Juan Vazquez
 */
public class ListasEnlazadas {
    private Nodo primero;
    private int size;
    public ListasEnlazadas(){
        this.primero = null;
        this.size = 0;
    }
    public void ListaVacia(){
        if(primero==null){
            System.out.println("La lista esta vacio");
        }else{
            System.out.println("La lista tiene datos");
        }
    }
    public void addNodo (int dato){
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = primero;
            primero = nuevo;  
            size++;
    }
    public int Size(){
        return size;
    }
    public void Listar(){
        Nodo actual = primero;
        while(actual!=null){
            System.out.println("["+actual.dato+"]->");
            actual = actual.siguiente;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListasEnlazadas lista = new ListasEnlazadas();
        lista.ListaVacia();
        System.out.println("");
        lista.addNodo(11);
        lista.addNodo(12);
        lista.addNodo(13);
        lista.addNodo(14);
        lista.addNodo(15);
        lista.Listar();
        System.out.println("tamaño "+ lista.Size());
        System.out.println("");
        lista.ListaVacia();
    }
    
}
