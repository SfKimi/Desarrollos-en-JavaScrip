
package ejemploarregloclase3;

import javax.swing.JOptionPane;

public class EJEMPLOARREGLOCLASE3 {

  
    public static void main(String[] args) {
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese  la cantidad  de  personas"));
        PERSONA CHOKO[] = new PERSONA[valor];
        
        
        
        String nombre= "";
        String piel= "";
        int edad =0;
        double estatura=0;
        
        for(int i=0; i<valor;i++){
        nombre=JOptionPane.showInputDialog("Ingrese  Nombre");  
        piel=JOptionPane.showInputDialog("Ingrese color  de  piel"); 
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese  Edad"));
        estatura =Double.parseDouble(JOptionPane.showInputDialog( "Ingrese Estatitura"));
         
         CHOKO[i] = new PERSONA(nombre,piel,edad,estatura);
       }
        
         for(int i=0; i<CHOKO.length;i++){
         
             JOptionPane.showMessageDialog( null,"Nombre \n"+ CHOKO[i].odtenernombre()
                                           +"\n"+"Color  de  piel \n"+CHOKO[i].odtenerpiel()
                                           +"\n"+ "Edad \n"+CHOKO[i].odteneredad()
                                           +"\n"+ "Estatura \n"+CHOKO[i].odtenerestatura());
             System.out.println(CHOKO[i].odtenernombre()+" "+CHOKO[i].odtenerpiel()+" "+CHOKO[i].odteneredad()+" "+CHOKO[i].odtenerestatura() );
         
         }
        
    }
    
}
