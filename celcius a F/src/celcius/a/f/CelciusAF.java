/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celcius.a.f;


 import java.util.Scanner;

public class CelciusAF {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
            
            double gradoCELCIUS ;
            double gradoFAHRENHEIT;
            
             System.out.print("escriba la temperatura en grados  celcius: ");
            gradoCELCIUS = entrada.nextInt();
            
            //System.out.print("escriba su segundo numero: ");
            //amor = entrada.nextInt();
            gradoFAHRENHEIT=gradoCELCIUS*9/5+32;
            
                        System.out.printf("la temperatura en grados FAHRENHEIT es :  "+gradoFAHRENHEIT );

            
    }
    
}
