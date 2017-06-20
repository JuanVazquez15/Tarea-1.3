package analizadordetexto;

public class AnalizadorDeTexto {
    public String texto="";
                        
   
    public static int LETRA_MAYUSCULA=0;
    public static int LETRA_MINUSCULA=1;
    public static int DIGITO_DECIMAL=2;
    public static int SIMBOLO_DE_PUNTUACION=3;
    public static int SEPARADOR=4;
    public static int SALTO_DE_LINEA=5;
    public static int DESCONOCIDO=6;
    public static int INDICE_INVALIDO=7;
    
    public int obtenerTipoDelCaracter(int posicion){
       if(texto.length()>=posicion){
           char c=texto.charAt(posicion);
           int codigoAscii=(int)c;
           if(codigoAscii>=65 && codigoAscii<=90){
               return AnalizadorDeTexto.LETRA_MAYUSCULA;
           }
           if(codigoAscii>=97 && codigoAscii<=122){
               return AnalizadorDeTexto.LETRA_MINUSCULA;
           }
           if(codigoAscii>=48 && codigoAscii<=57){
               return AnalizadorDeTexto.DIGITO_DECIMAL;
           }
           if (codigoAscii==46|| codigoAscii ==44|| codigoAscii ==59
                || codigoAscii ==58|| codigoAscii ==45||codigoAscii ==40 
                || codigoAscii ==41|| codigoAscii == 91 || codigoAscii ==93 
                || codigoAscii ==168 || codigoAscii ==173 || codigoAscii ==63 
                || codigoAscii ==33 ){
               
               return AnalizadorDeTexto.SIMBOLO_DE_PUNTUACION;
           }
          
           if(codigoAscii == 32 || codigoAscii == 9){
               return AnalizadorDeTexto.SEPARADOR;
           }
           
           
           if(codigoAscii==10){
               return AnalizadorDeTexto.SALTO_DE_LINEA;
           }
           return AnalizadorDeTexto.DESCONOCIDO;        
       }
       else{
           return AnalizadorDeTexto.INDICE_INVALIDO;
       }
    }   
}
