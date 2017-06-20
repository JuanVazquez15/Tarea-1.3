package isc;

import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList <Cancion> canciones;
    
public Playlist (String n)
    {
        nombre=n;
    }
    
void add (Cancion c){
        canciones.add(c);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}