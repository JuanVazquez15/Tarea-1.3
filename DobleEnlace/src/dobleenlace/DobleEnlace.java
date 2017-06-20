/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleenlace;

/**
 *
 * @author Alumno
 */
public class DobleEnlace {

    /**
     * @param args the command line arguments
     */
    
    public class Nodo {
      int dato;
        Nodo adelante;
        Nodo atras;
   public Nodo(int entrada){
       dato = entrada;
       adelante = atras = null;
   }
     
    }
   
    public class ListaDoble {
        Nodo cabeza;
        Nodo anterior;
        Nodo despues;
        Nodo ultimo;
        public ListaDoble(){
            cabeza=anterior=despues=ultimo=null;
            
        }
        public ListaDoble insertarCabezalista(int entrada)
        {
            Nodo nuevo;
            nuevo = new Nodo(entrada);
            nuevo.adelante = cabeza;
            if (cabeza != null)
                cabeza.atras = nuevo;
            cabeza = nuevo;
            return this;
        
                    
        }
        public ListaDoble insertarDespues(Nodo anterior, int entrada)
        {
            Nodo nuevo;
            nuevo = new Nodo(entrada);
            nuevo.adelante = anterior.adelante;
            if (anterior.adelante != null)
                anterior.adelante.atras = nuevo;
            anterior.adelante = nuevo;
            nuevo.atras = anterior;
            return this;
        }
        
        
        public void eliminar (int entrada)
        {
            Nodo actual;
            boolean encontrado = false;
            actual = cabeza;
            while ((actual != null)&& (!encontrado))
            {
                encontrado = (actual.dato == entrada);
                if (!encontrado)
                    actual = actual.adelante;
            }
            if (actual != null)
                
            {
                if (actual == cabeza)
                {                       
               cabeza = actual.adelante;
               if (actual.adelante != null)
                   actual.adelante.atras = null;
                }
                else if (actual.adelante != null)
                {
                   actual.atras.adelante = actual.adelante;
                   actual.adelante.atras = actual.atras;
                }
                else 
                    actual.atras.adelante = null;
                actual = null;        
        
            
        
       
              }
           }

    }
    public static void main(String[] args) {
        
    }
}