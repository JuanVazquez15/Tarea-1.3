/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

public class Pila {
    String []PilaF;
    int elementos;
    int cima;
    
    public Pila(int cantidad){
        elementos=cantidad;
        PilaF=new String[elementos];
        cima=-1;      
               
    }
    public boolean pilallena(){
        if(cima==elementos-1){
            return(true);
        }
        return(false);
    }
    
    public boolean pilaVacia(){
        if(cima==-1){
            return(true);
        }
        return(false);
    }
    public void push(String elem){
        if(!pilallena()){
            cima++;
            PilaF[cima]=elem;
            elementos++;
            
        }
    }
    
    public String Vercima(){
        return (PilaF[cima]);
        
    }
    public String pop(){
        String aux=";";
                if(!pilaVacia()){
                    aux=PilaF[cima];
                    cima--;
                    elementos--;
    
                }
                return (aux);
    }
    
}
