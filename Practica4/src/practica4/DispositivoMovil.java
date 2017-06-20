package practica4;

public  class DispositivoMovil {

    public float velocidadProcesador;
	public int cargaBateria;
	public int memoria;
	public String sistemaOperativo;
	public String marca;
	public String modelo;
        public int precio;
        public String software;
        public float versionSoftware;
        public int ram;
        public int pilas;
        public int usuarios;
	
	public void encender() {
		System.out.println("Starting up...");		
	}
	
	public void apagar() {
		System.out.println("Shutting down...");
	}
	
	public int verCargaBateria() {
		System.out.println("Queda un " + cargaBateria + "% de bateria.");
		return cargaBateria;
	}
        
        public DispositivoMovil(int x){
            System.out.println("Hare que Laptop deje de funcionaar :D");
        }
    
}
