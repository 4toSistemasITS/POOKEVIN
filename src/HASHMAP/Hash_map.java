/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Hash_map {
    public static void main(String[] args) {
        
        // hash maps con enteros
         HashMap<Integer,Integer > ob_login2= new HashMap<Integer,Integer>();
         // login echo con un hashmap perro con enteros 
        
        ob_login2.put(10, 11);
        ob_login2.put(20, 22);
        
        for (Map.Entry<Integer, Integer> ob_entrada2 : ob_login2.entrySet()) {
            Integer key = ob_entrada2.getKey();
            Integer value = ob_entrada2.getValue();
            
             System.out.println("clave:"+key+"valor"+value);
            
        }
        Scanner scEntrar= new Scanner(System.in);
                   
        System.out.println("Ingrese nombre de usuairo:\n ");
        
        int  respuesta=scEntrar.nextInt();
        
         Scanner scEntrar_pasw= new Scanner(System.in);
                   
        System.out.println("ingrese la contraseña:\n ");
        
        int  respuesta2=scEntrar.nextInt();
        
        
   
        
         if(respuesta==1 && respuesta2==2){
             
             System.out.println("Binevenido");
            
        }
         else{
             System.out.println("Intentelo Nuevamente");
         }
     
        
    }
    
}
