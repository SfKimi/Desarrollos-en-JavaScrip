/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class ESTUDIANTE {

    private String nombre;
    PREGUNTA pregunta;
    PROFESOR profesor;
    int Puntos;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ESTUDIANTE(String nombre, PROFESOR profesor) {
        this.nombre = nombre;
        this.profesor = profesor;

        //this.pregunta=null;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void examen(String asignatura) {

        int Puntos;

        if (asignatura.equals("MATEMATICAS")) {

            /////////////////////////////////////////////////////////////PREGUNTA1////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM());
            
            
            String tema = JOptionPane.showInputDialog("ingrese respuesta:");
           
            if (tema.equals(profesor.OdtenerPREGUNTAM(tema))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
                 System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
                System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            }
            
            
            /////////////////////////////////////////////////////////////PREGUNTA2////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM2());
            
             String tema1 = JOptionPane.showInputDialog("ingrese respuesta:");
           
            if (tema1.equals(profesor.OdtenerPREGUNTAM2(tema1))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
                 System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
                System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            }
            
            
            
            /////////////////////////////////////////////////////////////PREGUNTA3////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM3());
            
             String tema2 = JOptionPane.showInputDialog("ingrese respuesta:");
           
            if (tema2.equals(profesor.OdtenerPREGUNTAM3(tema2))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
                 System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
                System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            }

        }
        
        
        
        
        if (asignatura.equals("HISTORIA")) {
            
            /////////////////////////////////////////////////////////////PREGUNTA1////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM());
         
            String tema = JOptionPane.showInputDialog("ingrese respuesta:");
            
            if (tema.equals(profesor.OdtenerPREGUNTAM(tema))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
               System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            }

            
            /////////////////////////////////////////////////////////////PREGUNTA2////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM2());
            
            String tema1 = JOptionPane.showInputDialog("ingrese respuesta:");
            
            if (tema1.equals(profesor.OdtenerPREGUNTAM2(tema1))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
               System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            }
            
            
            
             /////////////////////////////////////////////////////////////PREGUNTA3////////////////////////////////////
            System.out.println(profesor.OdtenerPREGUNTAM3());
            
            String tema2 = JOptionPane.showInputDialog("ingrese respuesta:");
            
            if (tema2.equals(profesor.OdtenerPREGUNTAM3(tema2))) {

                Cambiarpuntos();
                System.out.println("correcto" + Odtenerpuntos());
               System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            } else {
                System.out.println("incorrecta" + Odtenerpuntos());
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            }
            
            
            
            
        }

        
        
        
        
        
        
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String Odtenernombre() {
        return nombre;
    }

    public void Cambiarnombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Odtenerpuntos() {
        return Puntos;
    }

    public void Cambiarpuntos() {
        this.Puntos = Puntos + 10;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public PROFESOR OdtenerPROFESOR() {
        return profesor;
    }

    public void Cambiarnombre(PROFESOR profesor) {
        this.profesor = profesor;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public PREGUNTA OdtenerPREGUNTA() {
        return pregunta;
    }

    public void Cambiarnombre(PREGUNTA pregunta) {
        this.pregunta = pregunta;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
