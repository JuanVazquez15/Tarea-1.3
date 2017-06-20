
package ecuacionescuadraticas;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan D Candy
 */
public class EcuacionesCuadraticas {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
    String primero;
    String segundo; 
    String tercero;
    double a=0;
    double b=0;
    double c=0;
    double x1=0;
    double x2=0;
    
    primero=JOptionPane.showInputDialog("ingrese el valor del primer termino(a)");
    segundo=JOptionPane.showInputDialog("ingrese el valor del segundo termino(b)");
    tercero=JOptionPane.showInputDialog("ingrese el valor del tercer termino(c)");
    a=Double.parseDouble(primero);
    b=Double.parseDouble(segundo);
    c=Double.parseDouble(tercero);
    
    x1 =((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
    x2 =((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
    
    JOptionPane.showMessageDialog(null,"El valor de x1 es igual a"+ x1);
    JOptionPane.showMessageDialog(null,"El valor de x2 es igual a"+ x2);
}

}

