package propiedadorizontal;

import javax.swing.JOptionPane;

public class EJECUTOR {

    public static void main(String[] args) {

        clave persona1 = new clave();
        

        int opcion = 0;
        String op = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (opcion != 9) {
            //menu listo y esta entrando en el switch case
            op = JOptionPane.showInputDialog("Seleccione Una Opcion: \n "
                    + "1 ingresar al sistema \n"
                    + "2 salir \n");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    String nombreI = JOptionPane.showInputDialog("ingrese su nombre");

                    persona1.comprobar(nombreI);
                   
                  

                    break;

                case 2:// salir
                    System.exit(0);
                    break;

                default:// cualquier otra  opcion que  no este  en el menu

                    break;

            }

        }
    }
}