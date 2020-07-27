import java.rmi.*;
public interface InterfCal extends Remote {
// interface donde se establecen los metodos vacios
public long suma (long a, long b) throws java.rmi.RemoteException;
public long resta (long a, long b) throws java.rmi.RemoteException;
public long multiplicar (long a, long b) throws java.rmi.RemoteException;
public long dividir (long a, long b) throws java.rmi.RemoteException;
public String mensaje () throws java.rmi.RemoteException;
}
