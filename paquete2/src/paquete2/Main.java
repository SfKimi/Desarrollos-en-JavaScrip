package paquete2;
import paquete2.Pelota;
import paquete2.Carro;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //OPCION  1  DE  DECLARAR UNODJETO//
        //Pelota p;
        
        //p= new Pelota();
        
        //OPCION 2  DE DECLARAR UN OBJETO//
        Pelota p= new Pelota();
        Pelota pa= new Pelota(300,300);
        Pelota pb= new Pelota(500,500);
        
        
        Carro c = new Carro();
        
        
        c.estado();
        c.encender();
        c.estado();
        
        
        
        
        
        
        //p.patearPelota();
        
        
        //float var = p.obtenerPeso();
        //System.out.println("la pelota pesa: "+var);

        
        
        
        //System.out.println("la pelota pesa: "+p.obtenerPeso());

        
        
        
        //float var1 = pa.obtenerPeso();
        //System.out.println("la pelota pesa: "+var1);
        
              //float var2 = pb.obtenerPeso();
        //System.out.println("la pelota pesa: "+var2);
        

    }
    
}
