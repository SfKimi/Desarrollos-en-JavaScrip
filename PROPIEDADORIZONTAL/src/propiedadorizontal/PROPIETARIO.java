package propiedadorizontal;

import javax.swing.JOptionPane;

public class PROPIETARIO extends PERSONA {
    

    protected double consignar;
     protected double deuda;
   protected String queja;
   
    protected int NUMEROCASA;
    protected int NUMEROPARQUIADERO;
    protected int CUOTAADMINISTRACION;
    int CONTRASEÑA;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public PROPIETARIO() {

        this.NUMEROCASA = 000;
        this.NUMEROPARQUIADERO = 000000;
        this.CUOTAADMINISTRACION = 400000;

    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
  
    
      public void PROPIETARIOMENU() {
          
          
      deuda=CUOTAADMINISTRACION;
          int opcion1 = 0;
                    String op1 = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    while (opcion1 != 5) {
                        //menu listo y esta entrando en el switch case
                        op1 = JOptionPane.showInputDialog("BIENVENIDO  "+NOMBRE+ "\n"
                                + "1 consultar cuenta \n"
                                + "2 pagar \n"
                                + "3 reportar queja \n"
                                + "4 Actualizar datos \n"
                                + "5 salir \n");
                        opcion1 = Integer.parseInt(op1);
                        switch (opcion1) {

                            case 1:
                                //if  que  compare parametro de  entrada  del proceso para que  se  garantice  diferencia entre propietarios diferentes
                               JOptionPane.showMessageDialog(null,"NOMBRE \n"+NOMBRE+"\n"+
                                       "SALDO POR PAGAR \n"+deuda+"\n"+
                                        "su queja es: \n"+queja);
                            break;
                            
                             case 2:
                                 consignar=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a  depositar"));
                                 
                                  deuda=deuda-consignar;
                                   JOptionPane.showMessageDialog(null,"SU SALDO  POR PAGAR ES: \n"+deuda);
                            
                                   break;
                                   
                             case 3:
                                 
                                 queja=JOptionPane.showInputDialog("ingrese su queja:" );
                                 JOptionPane.showMessageDialog(null,"SU QUEJA ES: \n"+queja);
                             
                                 
                                 break;
                                 
                             case 4:
                                 
                                 NUMEROPARQUIADERO=Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE  PARQUIADERO:"));
                                 
                                 NUMEROCASA=Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE CASA"));
                                 
                                 break;
                        }

                    }
      
      
      }

      
      
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         
      
      
      
      
      
        public String regresarQUEJA() {

        return queja;
    }
        
        
        public void regresarQUEJA(String QUEJA) { ////esta  mal nombrado

        this.queja=QUEJA;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public int regresarNUMEROCASA() {

        return NUMEROCASA;
    }

    public void cambiarNUMEROCASA(int NUMEROCASA) {

        this.NUMEROCASA = NUMEROCASA;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public int regresarNUMEROPARQUIADERO() {

        return NUMEROPARQUIADERO;
    }

    public void cambiarNUMEROPARQUIADERO(int NUMEROPARQUIADERO) {

        this.NUMEROPARQUIADERO = NUMEROPARQUIADERO;

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public int regresarCUOTAADMINISTRACION() {

        return CUOTAADMINISTRACION;
    }

    public void cambiarCUOTAADMINISTRACION(int CUOTAADMINISTRACION) {

        this.CUOTAADMINISTRACION = CUOTAADMINISTRACION;

    }



}