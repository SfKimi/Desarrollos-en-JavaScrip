
package edificio;


public class EJECUTOR {
    
    public static void main(String[] args) {
        
        
    CASA C1 = new CASA();
    CASA C2 = new CASA("MARIO");
    
    APARTAMENTO A1 = new APARTAMENTO();
    APARTAMENTO A2 = new APARTAMENTO("PINARESII");
    
    LOCAL L1 = new LOCAL();
    LOCAL L2 = new LOCAL("EXITO");
    
    OFICINA O1 = new OFICINA();
    OFICINA O2 = new OFICINA("ADMID");
    
    EDIFICIO E1 = new EDIFICIO();
    EDIFICIO E2 = new EDIFICIO("contanzas");
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    C1.cambiarmaterialdepiso("sory");
    System.out.println(C1.regresarmaterialdepiso());
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////7777
    C2.cambiarestrato(8);
    System.out.println( C2.regresarestrato());
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
    A1.cambiarprecioderenta(56486345);
    System.out.println( A1.regresarprecioderenta());
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    A2.cambiarnumerohabitaciones(5);
     System.out.println( A2.regresarnumerohabitaciones());
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    L1.cambiarcantidaddeempleados(7);
    System.out.println( L1.regresarcantidaddeempleados());
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    L2.cambiartipodelocal("COSMETICO");
     System.out.println( L2.regresartipodelocal());
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    O1.cambiarnombreempresa("FRUTAS.S.A.");
      System.out.println(O1.regresarnombreeempresa());
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    O2.cambiarpisos(34);
     System.out.println(O2.obtenerpisos());
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    E1.cambiarlargo(83);
    System.out.println(E1.obtenerarea());
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    E2.cambiarancho(2);
    System.out.println(E2.obtenerarea());
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}


/////herencia, polimorfismo, areglos.