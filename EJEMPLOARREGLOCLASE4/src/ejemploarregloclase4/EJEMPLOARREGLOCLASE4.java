 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarregloclase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chokolate
 */
public class EJEMPLOARREGLOCLASE4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        BufferedReader lee=new BufferedReader(new InputStreamReader(System.in));
        
        
        String nombres[]=new String [5];
        
        
        for (int i=0; i<nombres.length;i++){
        
        System.out.println("ingrese nombre");
        String nombre=lee.readLine();
        nombres[i]=nombre;   
        }
        
        
        
         System.out.println("¿Desea Mostrar nombres? /n 1) Si/n 2) No");
        int opcion= Integer.parseInt(lee.readLine());
        
        switch(opcion){
        
            
            case 1:
              System.out.println("los nombres guardados en el arreglo son: /n");  
         for (int i=0; i<nombres.length;i++){
           System.out.println("/n"+nombres[i]+"/n ");
         }
           break;
           
           
           case 2:
           
           System.out.println("❤");
           
           break;
         
           default:
               System.out.println("opcion invalida");
        
        }
    }
    
}
