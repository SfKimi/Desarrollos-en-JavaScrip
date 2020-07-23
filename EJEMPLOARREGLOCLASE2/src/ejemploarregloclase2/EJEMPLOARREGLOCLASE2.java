/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarregloclase2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class EJEMPLOARREGLOCLASE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Random MiAleatorio =new Random () ;
                double tem;

        
         int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese  la cantidad  de  empleados"));
         double[] sueld = new double[valor];
       for(int i=0; i<valor;i++){
        double sueldo = MiAleatorio.nextInt(30);
//Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el sueldo del empleado"+(i+1)));
            sueld [i] = sueldo;
       }
        for(int i=0;i<valor;i++){
        
            System.out.println("el numero"+ (i+1) +" es: "+ sueld[i]);
        
        
        }
        
         for(int i=0; i<sueld.length; i++){
            for(int j=i+1; j<sueld.length; j++){
                // for(int j=0; j<sueld.length; j++) TAMBIEN FUNCIONA
            if(sueld[j]<sueld[i]){
            tem=sueld[i];
            sueld[i]=sueld[j];
            sueld[j]=tem;
            }
            
            }
            //caja[i]=(int)(Math.random()*49)+2;
        }
         
         
         System.out.println("\n 💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕💕");
         for(int i=0; i<valor; i++){
          System.out.println("["+i+"]"+sueld[i]+" \n 💕💕💕💕💕💕💕💕");  
         }
        
    }
    
}
