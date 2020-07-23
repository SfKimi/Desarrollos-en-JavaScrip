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
public class ENTRDAS {
    
       CAJEROF lo= new CAJEROF();
    
      public double consignar() {
        //JOptionPane.showMessageDialog(null,"chokolate")   ;
        double deposito=0;//la  variable  que  uso para capturar el  valor  a  consignar
        double dinero = 0;// la variable que voy a  retornar  al case
        
        
        deposito=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a  depositar"));//pido la  cantidada  a depositar y  le  asigno la variable deposito
        //dinero=consignacion;
       //le  agrego a la  variable  dinero  la  cantidad  que  esta  asignada en deposito, y se  acumula por si  hay mas  de un deposito
         
        
       if (deposito>=0) {//si deposito es  mayor  a 0 osea una cantidad positiva
        dinero += deposito;//le  agrego a la  variable  dinero  la  cantidad  que  esta  asignada en deposito, y se  acumula por si  hay mas  de un deposito
         return dinero;//retorno la  variable  dinero a case  de  donde  se llamo el metodo consignar
                }else{//si en valor  de la  variable deposito es  0 o un numero negativo
         MENSAJE pb= new MENSAJE(4, 0);// enviar mensaje  de "error"
        }
        
          return dinero;//retornar la variable dinero
    }
     
      
     public double retirar() {
            CAJEROF lo= new CAJEROF();
        //JOptionPane.showMessageDialog(null,"chokolate");
        double retiro=0;//la  variable  que  uso para capturar el  valor  a  consignar
        double dinero = 0;// la variable que voy a  retornar  al case
        
        
        retiro=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a  retirar"));//pido la  cantidada  a retirar y  le  asigno la variable retiro
        //dinero=consignacion;
        
        
        if (retiro>=0 && retiro<lo.saldo) {//evaluo dos  condiciones  si el retiro  es  mayor  a  0 y si el retiro menor a saldo (dinero en la cuneta)
        //dinero += deposito;
         return retiro;//retorno la variable  retiro al case, si cumple las condiciones  anteriores
                }else{
        MENSAJE pc = new MENSAJE(7, 0);//si no se  cunple las  condiciones manda un mensaje  de error
        }
        
          return dinero;// no se  sabe  para que  sirve
    }
    
    
    
    
    
}
