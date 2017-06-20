package ListaEnteros;

public class Lista {
    private Nodo primero;
public Lista(){
primero = null;
}

public Lista insertarCabezaLista(int entrada){
Nodo nuevo ;
 nuevo = new Nodo(entrada);
 nuevo.enlace = primero;
 primero = nuevo;
 return this;
}

public void visualizar(){
 Nodo n;
 int k = 0;
 n = primero;
 while (n != null){
 System.out.print(n.dato + " ");
 n = n.enlace;
 k++;
 System.out.print( (k%15 != 0 ? " " : "\n"));
 }
public Lista insertarUltimo(Nodo ultimo, Elemento entrada){
     ultimo.enlace=new Nodo(entrada);
     ultimo = ultimo.enlace;
     return this; 
    }
     }

    

