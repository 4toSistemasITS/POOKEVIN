/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linke_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class linked_list {
    
    public static void main(String[] args) {
   // para realziar las colas primero en entrar primero en salir
        LinkedList ob_linked= new LinkedList();
        
        ob_linked.add("jose");
        ob_linked.add("juanes");
        ob_linked.add("kevin");
        ob_linked.add("fabian");
        ob_linked.add("katya");
        
        ob_linked.poll();
        for (Iterator iterator = ob_linked.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
        
        
    }
   
}
