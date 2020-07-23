/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fionachi;

import java.util.Scanner;

/**
 *
=1 */
public class Fionachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer =new Scanner (System.in);
        System.out.print("ingrese numero: ");
        int numero = leer.nextInt();
        int p=1; 
        int anterior=0;
        int temp;
         
        for(int j= 0; j<=numero;j++){
              
            
                       temp=p;//guarda el  valor  de p anterior, en ptra  palabras  antes  de que  su valo cambie por la  suma de abajo
                       p=p+anterior;// se crea  un valor paralelo de  p que   a final  de  cuentas  el que  se  va  a imprimir
                       anterior=temp;// es  tomar el  valor  de  p( que es igual  a temp) despues  de la operacion de suma ( despues de un ciclo)para ejecutarlo en el siguiente ciclo ya que este dato no se  actualiza  si no hasta  depues  dela operacion de  suma  de p
                       System.out.println(j+2+" el numero de fibonacci es: "+ p);// se imprime el contador   y  la p de  la  sumatoria 
                       
                
        }
        
        
    }
    
}
