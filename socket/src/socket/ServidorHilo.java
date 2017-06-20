package socket;

/**
 *
 * @author Juan
 */
import java.io.*;
import java.net.*;
import java.util.logging.*;

public class ServidorHilo extends Thread {
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private int idSessio;
    public static int resultado;
		  
	

    public ServidorHilo(Socket socket, int id) {
        this.socket = socket;
        this.idSessio = id;
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[][] readData() {
    try {
    InputStream is = socket.getInputStream();
    ObjectInputStream ois = new ObjectInputStream(is);
    return (String[][])ois.readObject();
    } catch(IOException | ClassNotFoundException e) {
        return null;
        }
    }
    @Override
    //Interfas de Administrador
    public void run() {
    try{       
	int resul=0;
	String accion = "";
        accion = dis.readUTF();
	System.out.println("El cliente dice= "+accion);
	System.out.println("Procesando.....................................");
	Servidor.jTextArea1.setText(Servidor.jTextArea1.getText().trim()+"\n Procesando.................................");
        String palabra=accion;
	String totaltxt[]=palabra.split(",");
	//Administrador (contestacion)
        if(totaltxt.length==2){
	int a=Integer.parseInt(totaltxt[0]);
	int b=Integer.parseInt(totaltxt[1]);
	resul=suma(a,b);
		System.out.println("enviando respuesta al cliente...........................................");
		System.out.println("total"+resul);
                Servidor.jTextArea1.setText(Servidor.jTextArea1.getText().trim()+"\n TOTAL: "+resul);
	}//Administrador (Manda resultado y desconecta)
	dos.writeUTF("total: "+resul);
        dos.writeUTF("Has sido desconectado...");
        dos.writeUTF("Gracias por su preferencia ");
	//dos.writeUTF(".....Offline");
        desconnectar();
        }catch(IOException | NumberFormatException e){
	System.out.println(e);
	}
    }
    public int suma (int a,int b){
        resultado=a+b;
	return resultado;
    }
}
