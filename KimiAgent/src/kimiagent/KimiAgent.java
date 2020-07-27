
package kimiagent;
import jade.core.Agent;
import javax.swing.JOptionPane;


public class KimiAgent extends Agent {
public void setup (){

    System.out.println("Holi Holi :"+getLocalName());
    

    int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2: "));
    int suma=a+b;
    int resta=a-b;
    int multi=a*b;
    int division=a/b;
    
    System.out.println("la suma es: "+suma);
    System.out.println("la resta es: "+resta);
    System.out.println("la multiplicacion es: "+multi);
    System.out.println("la division es: "+division);
    
    
    
}

public void takeDown (){
    System.out.println("Adios Adios :"+getLocalName()+"---ID----"+ getAID().getName());
    

}

    
}
