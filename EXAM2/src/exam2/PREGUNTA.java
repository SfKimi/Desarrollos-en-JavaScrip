
package exam2;


public class PREGUNTA {
    
     String encabezado;
    String respuesta;
    
     public PREGUNTA(String encabezado, String respuesta){
    this.encabezado=encabezado;
    this.respuesta= respuesta;
    }
     
     public String Odtenerencabezado(){
    return this.encabezado;
    }
    
     public String Odtenerrespuesta(){
    return this.respuesta;
    }
}
