/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

 class Infija {
     String Qexpresion;
     int indice;
     //metodo inicializador
     public Infija(String expre){//inizializarla
     this.indice=0;
     Qexpresion=new String();
     Qexpresion=expre;
 }

    Infija() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String retornar(){//Retornar caracter a caracter
        String Aux=Qexpresion.substring(indice, indice+1);
        indice++;
        return(Aux);
    }
    public void entrarCaracterFinal(String car){//concatena un caracter al final
        Qexpresion=Qexpresion.concat(car);
    }
    public int Caracteres (){//Longitud de la cadena
        return(Qexpresion.length());
    }
}
