
package appcorreo;

import javax.swing.JOptionPane;
import appcorreo.correo;

public class App {

    
    
    
    
    
    
     public static void main(String[] args) {
        
        
        
        
        String valor = JOptionPane.showInputDialog("escriba correo");
        boolean status= correo.email_validacion( valor );
        if(status==true){
        
            JOptionPane.showMessageDialog(null,"Correo Valido "+ valor);
            
        }else{
        
         JOptionPane.showMessageDialog(null,"Correo Invalido "+ valor);
        }
        
        
    }
    
}
