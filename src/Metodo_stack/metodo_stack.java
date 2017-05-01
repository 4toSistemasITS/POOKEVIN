/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo_stack;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class metodo_stack {
    public static void main(String[] args) {
        //metod stack sencillo push pone pop saca
        Stack ob_stac= new Stack();
        ob_stac.push("hola1");
        ob_stac.push("hola2");
        // el pop quita un lugar del hola 1
        ob_stac.pop();
        for (Iterator iterator = ob_stac.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
            
        }
        
        
    }
    
}
