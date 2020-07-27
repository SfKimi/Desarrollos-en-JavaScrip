/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datagramas;

/**
 *
 * @author OSCAR
 */
public class Servidor {

public static void main(String[ ] args)
{
    int longitud;
    InetAddress   host	= null;
    int puerto = 7000;
    try
     {      
         host = InetAddress.getByName( null );
      }
     catch  (UnknownHostException e)	I
      {	
               System.out.println( "Host desconocido"+host) ;
               System. exit(1);
      }
      String mensaje = "Este es el mensaje”;
      longitud = mensaje.length( ); 
      byte[] m = new byte [ longitud] ;
      mensaje.getBytes(0, longitud, m, 0);
      EnviarPaquete(host, puerto, m);
}




public static void EnviarPaquete(InetAddress host,int puerto, byte[] m)  
{
DatagramPacket paquete = new DatagramPacket(m, m.length,host, puerto);
DatagramSocket socket = null; 
try {
socket = new DatagramSocket ();
   }
catch (SocketException e)
{
 System.out.println("Error en creación Socket"+e);
  System.exit(1);
}
try
{
    socket.send(paquete);
} catch (lOException e){ 
 System.out.println(" Error en envio"+e); 
 System.exit(1);
 }
}




}
