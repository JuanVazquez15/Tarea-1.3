package practica4;

public class Tablet extends DispositivoMovil {
   
    private String aplicacion;
    private String cancion;
    
    public Tablet(){
        
        super(0);
        modelo = "Samsung";
        memoria = 2;
        precio = 4000;
        cargaBateria = 80;
        software = "Android";
        versionSoftware = 4.1f;
        
    }
    
    
    public void encender(){
        System.out.println("Encendiendo Tablet");
    }
    public void ejecutarAplicacion(String aplicacion){
        System.out.println("Ejecutando" + aplicacion);
    }
    public void reproducirMusica(String cancion){
        System.out.println("Reproduciendo" + cancion);
    }
    public void apagar(){
        System.out.println("Apagando tablet..");
    }
    
}
