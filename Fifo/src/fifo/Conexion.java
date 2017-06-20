/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;
import java.net.*;
import java.io.*;
/**
 *
 * @author Juan D Candy
 */
public class Conexion {
    final int  PUERTO= 5000;
    //String ip ="172.16.1.1";
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    String mensajeRecibido;
    
public void initServer()
    {
    BufferedReader entrada;
    try
    {
        sc=new ServerSocket(PUERTO);
        so = new Socket ();
        System.out.println("Esperando conexion....");
        so = sc.accept();
        System.out.println("Conexión establecida");
        
        //canales de E/S
        entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
        salida = new DataOutputStream(so.getOutputStream());
        System.out.println("Confirmando Conexion");
        salida.writeUTF("Conexion exitosa...\n envia un mensaje :P");
        
        //Recepcion de mensaje
        mensajeRecibido = entrada.readLine();
        System.out.println(mensajeRecibido);
        
        salida.writeUTF("Se recibio tu mensaje.\n Terminando conexion...");
        salida.writeUTF("Gracias por conectarte,Eres el rival mas devil, TE VAS..");
        System.out.println("Termino de conexion");
        
        sc.close();//despacha al cliente cierre de conexion
    }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
}
    }
}