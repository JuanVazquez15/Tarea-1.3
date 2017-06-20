package Motor;


import Motor.Motor;

/**
* Automovil.java
*
* @author Héctor Quej Cosgaya
* @author José Aguilar Canepa
*
* @created 05/11/12 10:50 PM
*
* Esta clase modela exclusivamente automoviles de la marca "Ford".
*/

public class AutomovilFord {
	
	int velocidad;						// La velocidad a la que se desplaza el auto
	String color;						// El color del auto
	public String modelo;					// El modelo del auto
	Motor motor;						// El motor del auto
	public static final String marca = "Ford";	// La marca del auto
		
	/**
	* Inicializa un nuevo objeto Automovil.
	* 
	* @param modelo: El modelo del auto.
	* @param color: El color del auto
	*/
	public AutomovilFord(String modelo, String color){
		this.modelo = modelo;
		this.color = color;
		velocidad = 0;
		motor = new Motor();
	}
	
	/**
	* Inicializa un nuevo objeto Automovil.
	*/
	public AutomovilFord(){
		this("EcoSport", "Azul");
	}
	
	/**
	* Enciende el motor del automovil.
	*/
	public void encenderMotor() {
		motor.encendido = true;
		System.out.println("Motor encendido");
	}
	
	/**
	* Apaga el motor del automovil.
	*/
	public void apagarMotor() {
		motor.encendido = false;
		System.out.println("Motor apagado");
	}
	
	/**
	* Incrementa la velocidad del automovil en la cantidad de kilómetros/hora especificada.
	*
	* @param cantidad: El número de km/h en que aumentará la velocidad del auto.
	*/
	

        public void acelerar() {
		if (motor.encendido) {
			

                        motor.revolucionar();			
			velocidad = (motor.revoluciones / 100);
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor está apagado!");
		}
	}
	
	/**
	* Reduce a cero la velocidad del auto.
	*/
	

        public void frenar(int cantidad) {
		cantidad=motor.setrevoluciones();
		if(velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " kph");	
		motor.getrevoluciones();
        }
	
	
	/**
	* Nos muestra la velocidad a la que se está desplazando el auto.
	* 
	* @return la velocidad del auto.
	*/
	public int getVelocidad() {
		return velocidad;
	}    
}

