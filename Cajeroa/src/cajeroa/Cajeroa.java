
package cajeroa;

import javax.swing.JOptionPane;

public class Cajeroa {

    int claves = 123;
    double saldo = 0, tasa = 0.012;
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    
    

    public static void main(String[] args) {
        Cajeroa ca = new Cajeroa();
        
    }
    
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
    
    
    
    
    // metodo  constructor NO TIENE   TIPO
    public Cajeroa(){
        clave();
        int opcion = 0;
        double valor = 0;
        String op="";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
///////////////////aqui falta///////////////////////////////////77
        while (opcion != 9) {
            //menu listo y esta  entrando en el switch case
            op=JOptionPane.showInputDialog("Seleccione Una Opcion: \n "
                                           + "1 consignar \n"
                                           + "2 retirar \n"
                                           + "3 saldo \n"
                                           + "4 salir \n");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    
                    //double saldo=0;
                    valor = consignar();//metodo consignar 
                    saldo = saldo + valor;//por que  no se  inicializa saldo
                    
                    mensaje(5,0);//por que  aqui va 0 en vez de saldo
                    
                    break;
                    
                    case 2:
                    valor = retirar();//se pordria  hacer  un solo metodo para  consignar y retirar  pero tocaria  poner las   condiciones  especiale spara  caa uno en el "CASE" para  asi confirmar que  es logica el retiro o  la  consignacion
                    saldo = saldo - valor;
                    
                    mensaje(5,0);
                    break;
                    
                    case 3://mostrar  saldo que lo hago en un mensaje directamente,se  muestra el   interes  y el total que  se  tiene  en la  cuenta
                     
                    mensaje(8,0);
                    break;

                    case 4:// salir
                    System.exit(0);
                    break;
                    
                    
                    
                    default:// cualquier otra  opcion que  no este  en el menu
                    mensaje(9,0);
                    break;

                
            }
        }
    }
        
    
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    
    
    
    
    public void clave() {
        
        int claved, veces=0;
        //ciclo infinito
        while(true){
            
            
        claved=Integer.parseInt(JOptionPane.showInputDialog("Entre Clave"));// se pide  la clave  para  verificarla  con la que se suministro al inicio
        if(claved==claves){
            
            mensaje(1,0);
        //nos  saca  del while  y nos  devuelve  dode   fue llamado
            break;
                
        }else{
        
        veces++;// contador que lleva  la cantidad  de  intentos  en la que  se ingreso la clave
        mensaje(2,veces);
        if(veces==3){//si los instentos llegan a 3  el sistema  muestra un mensaje  y te saca  del programa
        mensaje(3,0);
        System.exit(0);
        
        }
        }
        
        }

    }
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    
    
    
    
    

    public int entra_opcion() {

        int opc = 0;
        return opc;
    }
//metodos
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  


    
    
    
    
    public double consignar() {
        //JOptionPane.showMessageDialog(null,"chokolate")   ;
        double deposito=0;//la  variable  que  uso para capturar el  valor  a  consignar
        double dinero = 0;// la variable que voy a  retornar  al case
        
        
        deposito=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a  depositar"));//pido la  cantidada  a depositar y  le  asigno la variable deposito
        //dinero=consignacion;
        
        
        if (deposito>=0) {//si deposito es  mayor  a 0 osea una cantidad positiva
        dinero += deposito;//le  agrego a la  variable  dinero  la  cantidad  que  esta  asignada en deposito, y se  acumula por si  hay mas  de un deposito
         return dinero;//retorno la  variable  dinero a case  de  donde  se llamo el metodo consignar
                }else{//si en valor  de la  variable deposito es  0 o un numero negativo
        mensaje(4,0);// enviar mensaje  de "error"
        }
        
          return dinero;//retornar la variable dinero
    }
    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

public double retirar() {
        //JOptionPane.showMessageDialog(null,"chokolate");
        double retiro=0;//la  variable  que  uso para capturar el  valor  a  consignar
        double dinero = 0;// la variable que voy a  retornar  al case
        
        
        retiro=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a  retirar"));//pido la  cantidada  a retirar y  le  asigno la variable retiro
        //dinero=consignacion;
        
        
        if (retiro>=0 && retiro<saldo) {//evaluo dos  condiciones  si el retiro  es  mayor  a  0 y si el retiro menor a saldo (dinero en la cuneta)
        //dinero += deposito;
         return retiro;//retorno la variable  retiro al case, si cumple las condiciones  anteriores
                }else{
        mensaje(7,0);//si no se  cunple las  condiciones manda un mensaje  de error
        }
        
          return dinero;// no se  sabe  para que  sirve
    }
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
    
    

    
    
    
    public void mensaje(int num, int veces){ // metodo  donde  almaceno todos los mensaje  usados en el programa 
        
        switch(num){
    
            case 1:
                // si la  clase   concide  nos manda  esta  ventana
                JOptionPane.showMessageDialog(null,"Entrada Segura");
                
                
                break;
                
            case 3:
                // si la  clase   concide  nos manda  esta  ventana
                JOptionPane.showMessageDialog(null,"Targeta  Bloquiada");
                
                
                break;
            case 2:
                // si la  clase   concide  nos manda  esta  evntana
                JOptionPane.showMessageDialog(null,"clave errada - Intento "+veces); //ademas  de  adicionar el mensaje  se  adiciona la variable veces  que va en aumento para mostrar el numero de intentos en el mensaje
                
                break;
                
            case 4:
                
                
                 JOptionPane.showMessageDialog(null,"Por favor realize un deposito positivo ");
                 
                
                break;
                
                case 5:
                
                
                 JOptionPane.showMessageDialog(null,"su nuevo saldo es "+ saldo);//ademas  de  adicionar el mensaje  se  adiciona la variable saldo para mostrar el saldo  actual del usuario
                 
                
                break;
                
                case 6:
                
                
                 //JOptionPane.showMessageDialog(null,"");// repeticion del mensaje de arriba ????????¿¿¿¿¿¿¿¿¿¿¿¿
                 
                
                break;
                
                case 7:
                
                
                 JOptionPane.showMessageDialog(null,"no posee saldo para este retiro ");// muestra cuando retira mas   de lo que posee en la cuenta
                 
                
                break;
                
                case 8:
                
                
                 JOptionPane.showMessageDialog(null,"\n su nuevo saldo es \n "+ saldo + "\n interes \n "+ saldo*tasa +"\n total \n"+ (saldo+(saldo*tasa)));//muestra el interes y el salto total
                 
                
                break;
           
                
                case 9:
                
                
                 JOptionPane.showMessageDialog(null,"opcion invalida ");// cuando ingresa una opcion invalida  en el menu
                 
                
                break;
                
        }
    }
}


// viernes de 1-2 pm  tutorias 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  










/*

   public int entra_opcion() {

        int opc = 0;
String menu="1.consignar \n 2.retirar \n 3.saldo \n  9.salir \n entre opcion \n "
opc=Integer.parseInt(JOptionPane.showInputDialog("menu"));
        return opc;
    }
////////////////////////////////////////////////////////////////////////////opcion=entra_opcion();
////////////////////////////////////////////////////////////////////////////switch(opcion){
////////////////////////////////////////////////////////////////////////////casi 1:
////////////////////////////////////////////////////////////////////////////break;
////////////////////////////////////////////////////////////////////////////}



    public double consignar() {
       
        
        double dinero = 0;
        
        dinero=Integer.parseInt(JOptionPane.showInputDialog("entre valor  de  consignacion"));
        
       
         return dinero;
    }



   public double retirar() {
       
        
        double dinero = 0;
        
        dinero=Integer.parseInt(JOptionPane.showInputDialog("entre valor retiro"));
        
       
         return dinero;
    }


////////////////////////////////////////case 2:
                    valor = retirar();
                    if(saldo<valor)
                      mensaje(#,0);
                    else

                    saldo = saldo - valor;
                    //codigo de mensaje
                    mensaje(6,0);
                    break;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  


case 3:
                      consultar();
                    mensaje(8,0);
                    break;



  public void consultar() {
       
        DecimalFormat df= new DecimalFormat(""#,###;)
        double interes=saldo*tasa;
        

String salida="su saldo es: "+df.format(saldo)+"/n"+
              "interes: "+df.format(interes)+"\n"+
               "total: "+df.format((saldo+interes));
JOptionPane.showMessageDialog(null,salida);
     
    }





*/