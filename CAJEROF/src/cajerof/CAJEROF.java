/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerof;

import javax.swing.JOptionPane;
//import cajerof.ENTRDAS;
/**
 *
 * @author Chokolate
 */
public class CAJEROF {

 double saldo, tasa=0.012; 

         
           
              
           public static void main(String[] args) {
              clave uy= new clave();
               CAJEROF tr = new CAJEROF();
               tr.CAJEROF();
              
           
     
           
           }
        
         
 
    
           
           
           
           
        
        
    public void  CAJEROF() {

             
    
 
  
 
      
               ENTRDAS cp= new ENTRDAS(); 
         
           
        int opcion = 0;
        double valor = 0;
        String op="";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (opcion != 9) {
            //menu listo y esta entrando en el switch case
            op=JOptionPane.showInputDialog("Seleccione Una Opcion: \n "
                                           + "1 consignar \n"
                                           + "2 retirar \n"
                                           + "3 saldo \n"
                                           + "4 salir \n");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    
                    //double saldo=0;
                    valor = cp.consignar(); //metodo consignar 
                   
                    saldo = saldo + valor;//por que  no se  inicializa saldo
                    System.out.println(saldo);
                    
                    MENSAJE pc = new MENSAJE(5, 0);//por que  aqui va 0 en vez de saldo
                   
                    break;
                    
                    case 2:
                    valor = cp.retirar();//se pordria  hacer  un solo metodo para  consignar y retirar  pero tocaria  poner las   condiciones  especiale spara  caa uno en el "CASE" para  asi confirmar que  es logica el retiro o  la  consignacion
                    saldo = saldo - valor;
                    
                    MENSAJE ph = new MENSAJE(5, 0);
                    break;
                    
                    case 3://mostrar  saldo que lo hago en un mensaje directamente,se  muestra el   interes  y el total que  se  tiene  en la  cuenta
                     
                    MENSAJE pd = new MENSAJE(5, 0);
                    break;

                    case 4:// salir
                    System.exit(0);
                    break;
                    
                    
                    
                    default:// cualquier otra  opcion que  no este  en el menu
                    MENSAJE pl = new MENSAJE(9, 0);
                    break;

                
            }
        }
        
   
        
        
        
    }
    
             
     public double SALDO() {
     System.out.println(saldo);
                    
    return saldo; 
    }
    
    public double TASA() {
     
    return this.tasa; 
    }
   
    

}
