package arreglo1dimencionejemplo3;

import javax.swing.JOptionPane;

public class Arreglo1dimencionejemplo3 {

    public static void main(String[] args) {

        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese  la cantidad  de  empleados"));
        double[] sueld = new double[valor];
        double[] bonif = new double[valor];
        double[] dedud = new double[valor];
        double[] total = new double[valor];

        for(int i=0; i<valor;i++){
        double sueldo =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el sueldo del empleado"+(i+1)));
            sueld [i] = sueldo;

        double bonificacion =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la bonificacion del empleado"+(i+1)));
         bonif [i] = bonificacion;
        
        double deducido =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el deducido del  empleado"+(i+1)));
         dedud [i] = deducido;
         
         total[i]=(sueld[i]+bonif[i]-dedud[i]);
        
        }
        
        for(int i=0;i<valor;i++){
        
            System.out.println("el empleado"+ (i+1) +"recibira un sueldo total de: "+ total[i]);
        
        
        }
        
        
        
        
    }

}
