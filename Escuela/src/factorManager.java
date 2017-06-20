
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class factorManager {    
public  String leerGrafico(){

File f;

javax.swing.JFileChooser j= new javax.swing.JFileChooser();

j.showOpenDialog(j);

try{

String path= j.getSelectedFile().getAbsolutePath();

String lectura="";

f = new File(path);

try{

FileReader fr = new FileReader(f);

BufferedReader br = new BufferedReader(fr);

String aux;

while((aux = br.readLine())!=null)

lectura = lectura+aux+"n";
 System.out.println(lectura);

}
catch(IOException e){

return lectura;

    }
}
catch(NullPointerException e){

javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");

System.exit(0);

     }return null;
    }
}   

    
    
