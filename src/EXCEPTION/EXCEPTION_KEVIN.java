

package EXCEPTION;


public class EXCEPTION_KEVIN extends Exception{

    public EXCEPTION_KEVIN(String message) {
        super(message);
        
    }
    public static void validar_longitud(String nombre,int cantidad)throws EXCEPTION_KEVIN{
        if(nombre.length()< cantidad){
            throw new EXCEPTION_KEVIN("La longitud no es valida");
        }
        
    }
    public static void validar_letra(String nombre, String letra)throws EXCEPTION_KEVIN{
        if(!nombre.contains(letra)){
            throw new EXCEPTION_KEVIN("No hay una letra a");
        }
    }
    
    
    
}
