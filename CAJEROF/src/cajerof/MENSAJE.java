/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerof;

import javax.swing.JOptionPane;
import cajerof.CAJEROF;
/**
 *
 * @author Chokolate
 */
public class MENSAJE {
       CAJEROF lp= new CAJEROF();
    
    public  MENSAJE(int num, int veces){ // metodo  donde  almaceno todos los mensaje  usados en el programa 
        
       
        
        CAJEROF lp= new CAJEROF();
        switch(num){
    
            case 1:
                // si la  clase   concide  nos manda  esta  ventana
                JOptionPane.showMessageDialog(null,"Entrada Segura");
                
                
                break;
                
            case 3:
                // si la  clase   concide  nos manda  esta  ventana
                JOptionPane.showMessageDialog(null,"Targeta  Bloquiada");
                
                
                break;
            case 2:
                // si la  clase   concide  nos manda  esta  evntana
                JOptionPane.showMessageDialog(null,"clave errada - Intento "+veces); //ademas  de  adicionar el mensaje  se  adiciona la variable veces  que va en aumento para mostrar el numero de intentos en el mensaje
                
                break;
                
            case 4:
                
                
                 JOptionPane.showMessageDialog(null,"Por favor realize un deposito positivo ");
                 
                
                break;
                
                case 5:
                
           
                 JOptionPane.showMessageDialog(null,"su nuevo saldo es "+ lp.SALDO());//ademas  de  adicionar el mensaje  se  adiciona la variable saldo para mostrar el saldo  actual del usuario
                 
                
                break;
                
                case 6:
                
                
                 //JOptionPane.showMessageDialog(null,"");// repeticion del mensaje de arriba ????????¿¿¿¿¿¿¿¿¿¿¿¿
                 
                
                break;
                
                case 7:
                
                
                 JOptionPane.showMessageDialog(null,"no posee saldo para este retiro ");// muestra cuando retira mas   de lo que posee en la cuenta
                 
                
                break;
                
                case 8:
                
                
                 JOptionPane.showMessageDialog(null,"\n su nuevo saldo es \n "+ lp.SALDO()  + "\n interes \n "+ ((lp.SALDO())*(lp.tasa)) +"\n total \n"+ (lp.SALDO()+((lp.SALDO())*lp.tasa)));//muestra el interes y el salto total
                 
                
                break;
           
                
                case 9:
                
                
                 JOptionPane.showMessageDialog(null,"opcion invalida ");// cuando ingresa una opcion invalida  en el menu
                 
                
                break;
                
        }
    }

    
}


