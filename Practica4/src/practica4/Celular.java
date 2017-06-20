package practica4;

public class Celular extends DispositivoMovil {
    
    private String numero;
    
    public Celular(String numero){
        super(0);
        this.numero = numero;     
    }
    public void llamar(String numero){
        System.out.println("Llamando..." + numero);
    }
    
    public void encender(){
        super.encender();
        System.out.println("No quiero apagarme! :D");
    }
}
