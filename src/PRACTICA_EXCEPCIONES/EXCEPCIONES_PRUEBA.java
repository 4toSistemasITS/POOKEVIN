/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PRACTICA_EXCEPCIONES;

/**
 *
 * @author usuario
 */
public class EXCEPCIONES_PRUEBA extends Exception{

    public EXCEPCIONES_PRUEBA(String message) {
        super(message);
    }
    public static void validar_numero(int numero1,int numero2) throws EXCEPCIONES_PRUEBA{
        if(numero1>0 || numero2>0){
            throw new EXCEPCIONES_PRUEBA("eL NUMERO ES POSITIVO");
            
        }
        
    }
    
    
}
