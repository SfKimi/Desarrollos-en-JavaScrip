
package entradasApp;

import javax.swing.JOptionPane;


public class Capturas {
    
    public int entrar_entero(String texto){
    
    int valor = Integer.parseInt(JOptionPane.showInputDialog(texto));
    return valor;
    
    
    }
    
    
    
     public double entrar_double(String texto){
    
    int valor = Integer.parseInt(JOptionPane.showInputDialog(texto));
    return valor;
    
    
    }
    
      public String entrar_String(String texto){
    
    String valor = JOptionPane.showInputDialog(texto);
    return valor;
    
    
    }
     
      
       public String entrar_Correo(String texto){
    
           
           
    String correo = JOptionPane.showInputDialog(texto);
    return correo;
    
    
    }
     
}
