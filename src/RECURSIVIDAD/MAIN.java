/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RECURSIVIDAD;

/**
 *
 * @author usuario
 */
public class MAIN {
    public int positivo(int numero, int limite){
        int valor = 0;
        if(numero < limite){
            numero=numero+2;
            //aqui llamo al publico recursivo
            System.out.println("AUI RETORNO");
            valor =positivo(numero,limite);
        }else{
            valor = numero;
        }
        return valor; 
    }
}   
