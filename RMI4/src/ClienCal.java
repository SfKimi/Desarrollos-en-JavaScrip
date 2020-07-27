import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.rmi.*;
import java.rmi.server.RMIClientSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class ClienCal implements RMIClientSocketFactory, Serializable {
    public static void main(String args[]){
    try{
        //Se crea el objeto de la interface donde esta solo la estructura de las funciones y se llama a la misma direccion que se establecio en el server
        InterfCal c =(InterfCal) Naming.lookup("rmi://localhost:1099/calculadora");
        //se ejecutan las funciones
        System.out.println("resta 56-37 = "+ c.resta(56, 37));
        System.out.println("suma 16+45 = "+ c.suma(16, 45));
        System.out.println("multiplicacion 6*9 = "+ c.multiplicar(6, 9));
        System.out.println("divicion 16/2 = "+ c.dividir(16, 2));
        System.out.println("Metodo agregado dice = "+ c.mensaje());
    }catch (Exception e){
        System.out.println(e);
    }
    }
    // se llama al socker  cpn el correspondiente host y puerto
    public Socket createSocket(String host, int port) throws IOException {
    SocketFactory factory = SSLSocketFactory.getDefault();
    Socket socket = factory.createSocket(host, port);
    return socket;
    }
}
