/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglosclase;

import javax.swing.JOptionPane;
public class EjemploarreglosCLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese  la cantidad  de  empleados"));
        double[] sueld = new double[valor];
       for(int i=0; i<valor;i++){
        double sueldo =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el sueldo del empleado"+(i+1)));
            sueld [i] = sueldo;
       }
        for(int i=0;i<valor;i++){
        
            System.out.println("el empleado"+ (i+1) +"recibira un sueldo total de: "+ sueld[i]);
        
        
        }
        
    }
    
}
