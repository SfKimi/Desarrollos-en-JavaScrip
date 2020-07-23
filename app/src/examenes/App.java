/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        
         int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese  la cantidad  de  personas"));
        datos CHOKO[] = new datos[valor];
        
        
        
        String nombre= "";
        String piel= "";
        int edad =0;
        double estatura=0;
        
        for(int i=0; i<valor;i++){
        nombre=JOptionPane.showInputDialog("Ingrese  Nombre");  
        piel=JOptionPane.showInputDialog("Ingrese color  de  piel"); 
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese  Edad"));
        estatura =Double.parseDouble(JOptionPane.showInputDialog( "Ingrese Estatitura"));
         
         CHOKO[i] = new datos(nombre,piel,edad,estatura);
       }
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////4
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        

        datos u;
         u = new datos();

    int claved, veces = 0;
    
    
    //ciclo infinito

    
    while(true){
            
        for(int i=0;i<CHOKO.length;i++){    
        claved = Integer.parseInt(JOptionPane.showInputDialog("Entre Clave"));// se pide  la clave  para  verificarla  con la que se suministro al inicio
        if (claved == u.odteneredad() ) {

            MENSAJE pa;
            pa = new MENSAJE(1,0);
            //pa.MENSAJE(1,0);
            //nos  saca  del while  y nos  devuelve  dode   fue llamado
            break;

        }
        
        else 
           {
            MENSAJE pc;
            pc = new MENSAJE(2, veces);
            veces++;// contador que lleva  la cantidad  de  intentos  en la que  se ingreso la clave
             //pa.MENSAJE(1,veces);
            //mensaje(2, veces);
            if (veces == 3) 
                {//si los instentos llegan a 3  el sistema  muestra un mensaje  y te saca  del programa
                 MENSAJE pb= new MENSAJE(3, 0);
                 
                 //mensaje(3, 0);
                 System.exit(0);

                }
           }
         break;
        }
    }
        
        
    }
    
}
