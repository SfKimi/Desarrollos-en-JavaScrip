/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datagramas;
public class cliente {
public static void main(String[] args)      {
int puerto =1111;
 RecibePaquete(puerto) ;
}

public static void RecibePaquete(int puerto)
{
byte[] b = new byte[100];
DatagramPacket paquete = new DatagramPacket(b, b.length); 
DatagramSocket socket = null; 
try
{
 socket = new DatagramSocket(puerto);
 
}
catch (SocketException e)  {

     System.out.println("Socket Invalido"+e);
    System.exit( 1);
}
 System. out.println( "Escuchando en el puerto : "+puerto) ;
System. out.println( "Puerto Local "+ socket . getLocalPort ( ) ) ;	
}

String mensaje;
try{
    socket.receive( paquete );
}
catch (lOException e)
{
 	System. out.println( "Error al recibir "+e);
.System, exit(1) ; 
}
mensaje = new String(b, 0, 0, paquete.getLength()); 
System.out.println("Recibio desde "+ paquete.getAddress()+", 
puerto="+paquete.getPort( ));
System.out.println(mensaje);	
try {
  System.out.println("Oprima enter");
  System.in.read( );
} catch (lOException e)
{  }
}



}
