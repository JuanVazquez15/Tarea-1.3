package practica4;

public class Test {
    public static void main(String[] args){
        Tablet tap = new Tablet();
        
        tap.encender();
        tap.ejecutarAplicacion(" Clash of Clans");
        tap.reproducirMusica(" Metallica - Master of Puppets");
        System.out.println("La version de Software es " +tap.versionSoftware);
        tap.verCargaBateria();
        tap.apagar();
        
        Gameboy game = new Gameboy();
        
        game.encender();
        game.iniciarJuego("Metal Slug");
        game.apagar();
    }
    
    
    
}
