
package propiedadorizontal;

import javax.swing.JOptionPane;


public class CONSEJO extends PERSONA {
    
    PROPIETARIO queja =new PROPIETARIO();
    protected String informe;
    private String QUEJA;///private   hay  error
  
    
    public void CONSEJOMENU() {
 PROPIETARIO loi =new PROPIETARIO();
          int opcion2 = 0;
                    String op2 = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    while (opcion2 != 3) {
                        //menu listo y esta entrando en el switch case
                        op2 = JOptionPane.showInputDialog("BIENVENIDO  "+NOMBRE+ "\n"
                                + "1 consultar quejas \n"
                                + "2 reportar informe \n"
                                + "3 salir \n");
                        opcion2 = Integer.parseInt(op2);
                        switch (opcion2) {

                            case 1:
                                //if  que  compare parametro de  entrada  del proceso para que  se  garantice  diferencia entre propietarios diferentes
                               JOptionPane.showMessageDialog(null,"QUEJA: \n"+loi.regresarQUEJA());
                               //METODO QUE  RETORNE QUEJAS DE PROPIETARIO
                            break;
                            
                            
                                   
                             case 2:
                                 
                                 informe=JOptionPane.showInputDialog("ingrese su queja:" );
                                 JOptionPane.showMessageDialog(null,"SU INFORME ES: \n"+informe);
                                 
                                 break;
                        }

                    }
      
      
      }

    
    
   
    
    
}
