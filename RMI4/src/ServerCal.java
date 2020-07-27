import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIServerSocketFactory;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;
import sun.rmi.registry.RegistryImpl;
public class ServerCal implements RMIServerSocketFactory, Serializable {
    public ServerCal (){
    try{
    RegistryImpl impl = new RegistryImpl(1099); // Crea un registro con el puerto 1099 y se comienza a cargar server
        System.out.println("servidor cargando");
    }catch(RemoteException ex){
        System.out.println("Error en carga de server");
    }
    try{
        // se crea un objeto  que tenga tango la deficion de los metodos como como estan definidos con el puerto 1099
    InterfCal c = new ImplemenCal(1099);
    // se establece una direccion  y un nombre que en este caso en calculadora con el objeto anteriormente creado
    Naming.rebind("rmi://localhost:1099/calculadora", c);
        System.out.println("metodos remotos cargando");
        System.out.println("Esperando llamadas de metodos");
    }catch(Exception e){
        System.out.println("problemas al cargar metodos");
    }
    }
    public static void main (String args[]){
    new ServerCal(); // se inicilaiza la llamda al servidor
    }
    public ServerSocket createServerSocket (int port) throws IOException{
    ServerSocketFactory factory = SSLServerSocketFactory.getDefault(); // se le agrega la seguridada ssl al socket
    ServerSocket socket = factory.createServerSocket(port);
    return socket;
    }
}
































