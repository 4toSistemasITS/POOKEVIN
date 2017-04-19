/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import EXCEPTION.EXCEPTION_KEVIN;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena="";
       
        File archivo = new File("archivo.txt");
        archivo.getName();
        try {
            EXCEPTION_KEVIN.validar_letra(archivo.getName(), "a");
        } catch (EXCEPTION_KEVIN ex) {
            System.out.println(ex);
        }
        
//        try {
//            EXCEPTION_KEVIN.validar_longitud(archivo.getName(),15);
//        } catch (EXCEPTION_KEVIN ex) {
//            System.out.println(ex);
//        }
        try {
          FileReader fr = new FileReader(archivo);
          BufferedReader bf = new BufferedReader(fr);
          while ((cadena=bf.readLine()) != null){
              System.out.println(cadena);
   
          }                 
        
        } catch (IOException ex) {
            Logger.getLogger(ARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }
    
}
