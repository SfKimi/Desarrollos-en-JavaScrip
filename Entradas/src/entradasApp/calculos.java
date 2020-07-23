
package entradasApp;

import javax.swing.JOptionPane;


public class calculos {
    
    Capturas cap= new Capturas();
    
    public calculos(){
    
    int opc=cap.entrar_entero("digite opcion");
    int cantidad=cap.entrar_entero("digite cantidad");
    double nota=cap.entrar_double("digite nota");
    String Descripcion=cap.entrar_String("Digite Descripcion");
    String Correo=cap.entrar_Correo("Digite Descripcion");
    
    String resultado="opcion es "+opc+
                     "\n"+"cantidad es"+cantidad+
                     "\n"+"nota es"+nota+
                     "\n"+"la descricion es:"+Descripcion;
    
    JOptionPane.showMessageDialog(null, resultado);
    
}
    
}
