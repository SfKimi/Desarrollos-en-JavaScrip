/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class PROFESOR extends PERSONA {
     protected String tema;
            String PREGUNTA1;
           protected String respuesta1;
           
           protected String PREGUNTA3;
           protected String respuesta3;
           
          protected String PREGUNTA2;
       protected String respuesta2;
       
        protected String PREGUNTA4;
       protected String respuesta4;
       
     public void PROFESORMENU() {
     
             
      
          int opcion1 = 0;
                    String op1 = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    while (opcion1 != 3) {
                        //menu listo y esta entrando en el switch case
                        op1 = JOptionPane.showInputDialog("BIENVENIDO  "+NOMBRE+ "\n"
                                + "1 consultar pregunta\n"
                                + "2 generar pregunta \n"
                                + "3 salir \n");
                        opcion1 = Integer.parseInt(op1);
                        switch (opcion1) {

                            case 1:
                                //if  que  compare parametro de  entrada  del proceso para que  se  garantice  diferencia entre propietarios diferentes
                                 JOptionPane.showMessageDialog(null, "pregunta1:  \n" + PREGUNTA1 + "\n"
                                                 +"solucion: "+respuesta1+ "\n"
                                                 +"pregunta2:  \n" + PREGUNTA3 + "\n"
                                                 +"solucion: "+respuesta3+ "\n");
                                
                            break;
                            
                             case 2:
                                 
                                 tema = JOptionPane.showInputDialog("ingrese materia");
                                if (tema.equalsIgnoreCase("MATEMATICAS")) {
                                    PREGUNTA1 = JOptionPane.showInputDialog("ingrese pregunta");
                                    cambiarPREGUNTA1(PREGUNTA1);
                                    respuesta1=JOptionPane.showInputDialog("ingrese respuesta");
                                    PREGUNTA3 = JOptionPane.showInputDialog("ingrese pregunta");
                                    respuesta3=JOptionPane.showInputDialog("ingrese respuesta");
                            }
                                if (tema.equalsIgnoreCase("HISTORIA")) {
                                    PREGUNTA2 = JOptionPane.showInputDialog("ingrese pregunta");
                                    respuesta2=JOptionPane.showInputDialog("ingrese respuesta");
                                    PREGUNTA4 = JOptionPane.showInputDialog("ingrese pregunta");
                                    respuesta4=JOptionPane.showInputDialog("ingrese respuesta");
                            }
                                   
                             
                        }

                    }
     
     
     
     }
    
     public String regresarPREGUNTA1 (){
    
        
        
    return this.PREGUNTA1 ;
    } 
    
     public void cambiarPREGUNTA1(String PREGUNTA1){
    
        this.PREGUNTA1=PREGUNTA1;
        
    }
    
     public String regresarrespuesta1 (){
    
        
        
    return respuesta1 ;
    } 
    
    
}
