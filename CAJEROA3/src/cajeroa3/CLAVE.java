/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroa3;

import javax.swing.JOptionPane;
import cajeroa3.MENSAJE;









public class CLAVE {
    
  

    public CLAVE() {
    
    int claves = 123;

    int claved, veces = 0;
    
    
    //ciclo infinito

    
        while(true){
            
            
        claved = Integer.parseInt(JOptionPane.showInputDialog("Entre Clave"));// se pide  la clave  para  verificarla  con la que se suministro al inicio
        if (claved == claves) {

            MENSAJE pa;
            pa = new MENSAJE(1,0);
            //pa.MENSAJE(1,0);
            //nos  saca  del while  y nos  devuelve  dode   fue llamado
            break;

        } else {
            MENSAJE pc;
            pc = new MENSAJE(2, veces);
            veces++;// contador que lleva  la cantidad  de  intentos  en la que  se ingreso la clave
             //pa.MENSAJE(1,veces);
            //mensaje(2, veces);
            if (veces == 3) {//si los instentos llegan a 3  el sistema  muestra un mensaje  y te saca  del programa
                 MENSAJE pb= new MENSAJE(3, 0);
                 
                //mensaje(3, 0);
                System.exit(0);

            }
        }

    }
    }
    

    
}

