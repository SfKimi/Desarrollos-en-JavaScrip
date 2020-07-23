/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.numero.naturales.sucesivos;

import java.util.Scanner;

/**
 *
 * @author Chokolate
 */
public class SumaDeNumeroNaturalesSucesivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner leer =new Scanner (System.in);
        System.out.print("ingrese numero: ");
        int numero = leer.nextInt();
         int p=0;
        for(int j= 0; j<=numero;j++){
              
                       p=p+j;
                System.out.print(" "+ p );
                
        }
        
        
    }
    
}
