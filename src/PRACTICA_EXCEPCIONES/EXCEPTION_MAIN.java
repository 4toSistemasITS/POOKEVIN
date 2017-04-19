/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PRACTICA_EXCEPCIONES;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class EXCEPTION_MAIN {
    public static void main(String[] args) {
        int ingresar;
        int ingresar1;
        int suma;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Ingrese un valor: ");
        ingresar=sc.nextInt();
        
        Scanner sc1=new Scanner(System.in);
        System.out.printf("Ingrese un valor: ");
        ingresar1=sc1.nextInt();
        
        try {
            EXCEPCIONES_PRUEBA.validar_numero(ingresar,ingresar1);
            if(ingresar<0 && ingresar1<0){
               suma = ingresar+ingresar1;
                System.out.println(suma);
            }
        } catch (EXCEPCIONES_PRUEBA ex) {
            System.out.println("Los numeros son mnegaitos");
        }
    }
  
}
