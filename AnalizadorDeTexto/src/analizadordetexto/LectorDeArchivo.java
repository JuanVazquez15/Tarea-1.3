package analizadordetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;

public class LectorDeArchivo {
    public String texto="";
    public LectorDeArchivo(String ruta){
        try {
            String s;
            JFileChooser jfc= new JFileChooser();
           jfc.showOpenDialog(null);
            BufferedReader entrada= new BufferedReader(new FileReader(jfc.getSelectedFile().getPath()));;
            //BufferedReader entrada;
            texto = new String();
            //FileReader fr = new FileReader(ruta);
            //entrada = new BufferedReader(fr);
            while ((s = entrada.readLine()) != null) {
                texto += s + "\n";
            }
            entrada.close();
        } catch (java.io.FileNotFoundException e) {
            texto="Error al acceder al archivo";
        } catch (java.io.IOException ioe) {
            texto="Error mientras se leia el archivo";
        }

    }
}
