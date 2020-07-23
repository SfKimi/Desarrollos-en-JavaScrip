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
public class ESTUDIANTE extends PERSONA {
    
    PROFESOR pregunta = new PROFESOR ();

    protected double grado;
    protected double nota;
     protected double Puntos;
    protected double notaM;
    protected double notaH;
   
    protected String tema;
     protected String temaM;
    protected String temaH;
    
    
    protected PROFESOR pregunta8;
    protected String correcta;
  
    
    public ESTUDIANTE() {

        this.grado = 0;
        this.nota = 0;
        this.tema = "";

    }

    public void ESTUDIANTEMENU() {
        
       // JOptionPane.showMessageDialog(null,PREGUNTA1);
        

        int opcion1 = 0;
        String op1 = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (opcion1 != 4) {
            //menu listo y esta entrando en el switch case
            op1 = JOptionPane.showInputDialog("BIENVENIDO  " + NOMBRE + "\n"
                    + "1 consultar notas \n"
                    + "2 generar examen \n"
                  
                    + "4 salir \n");
            opcion1 = Integer.parseInt(op1);
            switch (opcion1) {

                case 1:
                    //if  que  compare parametro de  entrada  del proceso para que  se  garantice  diferencia entre propietarios diferentes
                    JOptionPane.showMessageDialog(null, "MATERIA:  \n" + temaM + "\n"
                                                 +"NOTA ES: "+notaM+ "\n"
                                                 +"MATERIA:  \n" + temaH + "\n"
                                                 +"NOTA ES: "+notaH+ "\n");
                    break;

                case 2:
                    tema = JOptionPane.showInputDialog("ingrese materia");
                    int opcion2 = 0;
                    String op2 = "";
                    int opcion3 = 0;
                    String op3 = "";
                    int opcion4 = 0;
                    String op4 = "";
                    
                    int opcion5 = 0;
                    String op5 = "";
                    int opcion6 = 0;
                    String op6 = "";
                    int opcion7 = 0;
                    String op7 = "";
                    if (tema.equalsIgnoreCase("MATEMATICAS")) {
                        temaM="MATEMATICAS";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    

                     //JOptionPane.showMessageDialog(null,PREGUNTA1);
                    //JOptionPane.showMessageDialog(null,pregunta8.regresarPREGUNTA1());
                    // pregunta8 = JOptionPane.showInputDialog(pregunta8.regresarPREGUNTA1());
                   //  correcta = pregunta.regresarrespuesta1();
                     
                     
                      //if (pregunta8.equalsIgnoreCase(correcta)) {
                       //Puntos = Puntos + 10;
                               // JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                      //
                      
                     
                      
                       op2 = JOptionPane.showInputDialog("PREGUNTA 1: \n" + "Como se  define el area de un cuadrdo"
                                + "1) A=L*L"
                                + "2) A=L*L/2"
                                + "3) A= L*2(L)");
                        opcion2 = Integer.parseInt(op2);
                        switch (opcion2) {
                            case 1:
                                Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;
                        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        op3 = JOptionPane.showInputDialog("PREGUNTA 2: \n" + "a que  numero equivale el numero pi"
                                + "1) A=3,14159"
                                + "2) A=3,19159"
                                + "3) A= 3,11159");
                        opcion3 = Integer.parseInt(op3);
                        switch (opcion3) {
                            case 1:
                                Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;
                        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        op4 = JOptionPane.showInputDialog("PREGUNTA 3: \n" + "uno de los siguientes no es un caso de factorizacion, ¿ cual es ?"
                                + "1) Factor Común"
                                + "2) TRINOMIO CUADRADO PERFECTO"
                                + "3) BINIOMIO LINEAL PERFECTO");
                        opcion4 = Integer.parseInt(op4);
                        switch (opcion4) {
                            case 1:
                             JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 3:
                                
                                   Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;
                        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   notaM=Puntos;
                    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                    if (tema.equalsIgnoreCase("HISTORIA")) {
                        temaH="HISTORIA";
                        op5 = JOptionPane.showInputDialog("PREGUNTA 1: \n" + "cuantos contienentes existen actualomente \n"
                                + "1) 5 \n"
                                + "2) 3 \n"
                                + "3) 7 \n");
                        opcion5 = Integer.parseInt(op5);
                        switch (opcion5) {
                            case 1:
                                Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;
                        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        op6 = JOptionPane.showInputDialog("PREGUNTA 2: \n" + "Quien fue Adolf Hitler \n"
                                + "1) militar \n"
                                + "2) escrito \n"
                                + "3) ambas");
                        opcion6 = Integer.parseInt(op6);
                        switch (opcion6) {
                            case 1:
                          JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                break;

                            case 3:
                                
                                Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;
                        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        op7 = JOptionPane.showInputDialog("PREGUNTA 3: \n" + "¿Quien fue Christophorus Columbus? \n"
                                + "1) gobernador general  \n"
                                + "2) almirante \n"
                                + "3) ninguna de las  anteriores");
                        opcion7 = Integer.parseInt(op7);
                        switch (opcion7) {
                            case 1:
                            Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;

                            case 2:
                                   Puntos = Puntos + 10;
                                JOptionPane.showMessageDialog(null, "RESPUESTA COORECTA" + Puntos);
                                break;

                            case 3:
                                  JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA" + Puntos);
                                 
                                break;
                        }
                        
                        
                        
                        
                        notaH=Puntos;
                    }

                break;
                
                
              

            }
        }

    }
}
