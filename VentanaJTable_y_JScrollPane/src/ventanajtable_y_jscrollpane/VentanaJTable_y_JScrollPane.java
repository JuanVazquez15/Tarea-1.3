/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanajtable_y_jscrollpane;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Juan D Candy
 */
public class VentanaJTable_y_JScrollPane extends JFrame{
    public VentanaJTable_y_JScrollPane(){
        super("JTable y JScrollPane");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        Object[][] datos = {{"1","MySQL","12-2-2010","5"},
        {"2","MySQL","13-2-2010","5"},{"3","JDBC","14-2-2010","5"},
        {"4","GUI","14-2-2010","5"},{"5","proyecto","15-2-2010","5"},
        {"6","Programacion","17-2-2010","5"}};
        final String[] nombreCol = {"Secion","Tema","Fecha","Aula"/*."Escuela"*/};
        
        JTable tabla = new JTable(datos, nombreCol);
        tabla.setFont(new Font("Arial",Font.BOLD,16));
        tabla.setRowHeight(24);
        JScrollPane jps = new JScrollPane(tabla);
        c.add(jps, BorderLayout.CENTER);
        setSize(490, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new VentanaJTable_y_JScrollPane();
    }
    
}
