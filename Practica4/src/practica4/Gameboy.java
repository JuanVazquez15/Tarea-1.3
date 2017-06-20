package practica4;

public class Gameboy extends DispositivoMovil {
    String juego;
    
    public Gameboy(){
        super (0);
        modelo = "Advance";
        ram = 8;
        pilas = 4;
        usuarios = 4;
    }
    public void encender(){
        System.out.println("Encendiendo Gameboy...");
    }
    public void iniciarJuego(String juego){
            System.out.println("Inciando " + juego);
    }
    public void apagar(){
        System.out.println("Apagando...");
    }
}
