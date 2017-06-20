/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package historial;

import java.util.Stack;

/**
 *
 * @author Juan D Candy
 */
public class Pila {
    Stack<String> pila = new Stack<String>();
    public void meter (String txt){
        pila.push(txt);
    }
    public String gethistorial (){
        String getresultado="";
        if (!pila.isEmpty())
        {
            getresultado=pila.pop();
        }
        return getresultado;
    }
     public String casa (){
        String getresultado="";
        if (!pila.isEmpty())
        {
            getresultado=pila.peek();
        }
        return getresultado;
    }
    
}
