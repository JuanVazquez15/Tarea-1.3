package analizadordetexto;


/**
 *
 * @author Juan Vazquez 
 *
 * 
 *  
 *  
 * 
 *
 */
public class Aplicacion {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LectorDeArchivo lector=new LectorDeArchivo(args[0]);
        AnalizadorDeTexto analizador=new AnalizadorDeTexto();
        analizador.texto=lector.texto;
        int contadorAlfabeto=0;
        int contadorDigito=0;
        int contadorSignoDePuntuacion=0;
        int contadorLineas=0;
        int contadorDePalabras=0;
        for (int i = 0; i < analizador.texto.length(); i++) {
            int tipo=analizador.obtenerTipoDelCaracter(i);
            if(tipo==AnalizadorDeTexto.LETRA_MAYUSCULA || 
               tipo==AnalizadorDeTexto.LETRA_MINUSCULA){
                contadorAlfabeto++;
            }
            if(tipo==AnalizadorDeTexto.DIGITO_DECIMAL){
                contadorDigito++;
            }
            if(tipo==AnalizadorDeTexto.SIMBOLO_DE_PUNTUACION){
                contadorSignoDePuntuacion++;
            }
            if(tipo==AnalizadorDeTexto.SALTO_DE_LINEA){
                contadorLineas++;
            }
            if(i>0){
                if((tipo==AnalizadorDeTexto.SEPARADOR || tipo==AnalizadorDeTexto.SALTO_DE_LINEA) 
                && (int)analizador.texto.charAt(i-1)>32){
                    contadorDePalabras++;
                }
            }
        }
        System.out.println("El texto tiene "
                +contadorAlfabeto+" caracteres del alfabeto inglés");
        System.out.println("El texto tiene "
                +contadorDigito+" digitos decimales");
        System.out.println("El texto tiene "
                +contadorSignoDePuntuacion+" símbolos de puntuación");
        System.out.println("El texto tiene "
                +contadorDePalabras+" palabras");
        System.out.println("El texto tiene "
                +contadorLineas+" lineas de textoo");
    }
    
}
