import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// clase para definir procesos establecidos en la interface
class ImplemenCal extends UnicastRemoteObject implements InterfCal {
    public ImplemenCal(int x) throws RemoteException{
    super (x);
    }
    public long suma (long a, long b) throws java.rmi.RemoteException{
    return a+b;
    } 
    public long resta (long a, long b) throws java.rmi.RemoteException{
    return a-b;
    }
public long multiplicar (long a, long b) throws java.rmi.RemoteException{
    return a*b;
    }
public long dividir (long a, long b) throws java.rmi.RemoteException{
    return a/b;
    }
    @Override
    public String  mensaje () throws java.rmi.RemoteException{
    String mensaje="Mensaje para agregar metodos";
return mensaje;
}
// este simplemente verifica conexion
public void connect(String s){
    System.out.println(s+"conectado al servidor");
}
}
