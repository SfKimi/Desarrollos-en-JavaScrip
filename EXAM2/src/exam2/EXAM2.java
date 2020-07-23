/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

/**
 *año fue 
 * @author Chokolate
 */
public class EXAM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /////////////////////////preguntas ///////////////////////////////////////////////////////////////////////////////////////
       //(1 del profesor 1)
        PREGUNTA preguntaM = new PREGUNTA("¿cual es el resultado de la operacion 2x2?","4");
        PREGUNTA preguntaM2 = new PREGUNTA("¿se puede  realizar una  raiz negativa?","no");
        PREGUNTA preguntaM3 = new PREGUNTA("¿cual es el  inverso  de la operacion logaritmo natural?","euler");
        //(1 del profesor 2)
        PREGUNTA preguntaH= new PREGUNTA("¿cual es el inverso de la resta?","suma");
        PREGUNTA preguntaH2= new PREGUNTA ("¿cuanto vale pi?","3,1416");
        PREGUNTA preguntaH3= new PREGUNTA("¿cual es el  inverso de la raiz?","potenciacion");
        //(1 del profesor 3)
        PREGUNTA preguntaA = new PREGUNTA ("¿ en que año murio pablo escobar ? ","1993");
        PREGUNTA preguntaA2 = new PREGUNTA ("¿en que fue la masacre de las  bananeras?  ","1928");
        PREGUNTA preguntaA3 = new PREGUNTA ("¿en que año fue  la  guerra civil?","1854");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //////////////////////////////////////////////////profesores///////////////////////////////////////////////////////////////////////////
        PROFESOR profesor3 = new PROFESOR("anguie","HISTORIA");
        PROFESOR profesor2 = new PROFESOR("daniel","MATEMATICAS");
        PROFESOR profesor1 = new PROFESOR("alfonso","MATEMATICAS");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////ASIGNACION DE PREGUNTAS/////////////////////////////////////////////////////////////////////////
        profesor1.generarpregunta(preguntaM);
        profesor1.generarpregunta2(preguntaM2);
        profesor1.generarpregunta3(preguntaM3);
        
        profesor2.generarpregunta(preguntaH);
        profesor2.generarpregunta2(preguntaH2);
        profesor2.generarpregunta3(preguntaH3);
        
        profesor3.generarpregunta(preguntaA);
        profesor3.generarpregunta2(preguntaA2);
        profesor3.generarpregunta3(preguntaA3);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////////creacion de estudiantes//////////////////////////////////////////////////////////////////////////////////////////////////////
        ESTUDIANTE estudiante1 = new ESTUDIANTE("PEDRO",profesor1);
        ESTUDIANTE  estudiante2 = new ESTUDIANTE ("JUAN",profesor2);
        ESTUDIANTE  estudiante3 = new ESTUDIANTE ("ANA",profesor3);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //////////////////////////////////////////////////creacion de  exAmenes////////////////////////////////////////////////////////////////////////////////////////////////////
        estudiante1.examen("MATEMATICAS");
        estudiante2.examen("MATEMATICAS");
        estudiante3.examen("HISTORIA");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
       // System.out.println(estudiante1.examen("MATEMATICAS"));
        
        
        
        
    }
    
}
