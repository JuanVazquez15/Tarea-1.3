package holamundo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author Juan D Candy
 */
public class HolaMundo extends JFrame {
    private JLabel label = new JLabel("Hola Mundo");
    private JLabel label2 = new JLabel("SALUDOS!!");
    HolaMundo ()
    { label.setForeground(Color.orange);
      label.setFont(new Font("Sereif",Font.BOLD,48));
      this.getContentPane().add(label);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setSize(400,100);
      this.setLocationRelativeTo(null);
      this.setVisible(true);
        
      label2.setForeground(Color.black);
      label2.setFont(new Font("Sereif",Font.BOLD,48));
      this.getContentPane().add(label2);
      //this.setSize(300,400);
    }
    public static void main(String[] args) {
        new HolaMundo();
    }   
}
