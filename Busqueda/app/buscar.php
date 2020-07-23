<?php

$mysqli = new mysqli("localhost","root","","PROYECTO");///aqui

$salida="";
$query="SELECT * FROM producto ORDER BY ID_PRODUCTO";

if(isset($_POST['consulta'])){
    $q=$mysqli -> real_escape_string($_POST['consulta']);
    $query = "SELECT ID_PRODUCTO, NOMBRE_PRODUCTO, PRECIO_PRODUCTO FROM producto WHERE NOMBRE_PRODUCTO LIKE '%".$q."%' OR PRECIO_PRODUCTO LIKE '%".$q."%' ";  
    
    
}

$resultado=$mysqli -> query($query);

if($resultado ->num_rows > 0){
  
    $salida="<table class='tabla_datos'>
            <thead>
            <tr>
            <td>ID</td>
            
            <td>NOMBRE_PRODUCTO</td>
            <td>PRECIO_PRODUCTO</td>
            
    </tr>
            </thead>
            <tbody>";
    
    while ($fila=$resultado -> fecth_assoc()){
        
        $salida.="<tr>
                <td>".$fila['ID_PRODUCTO']."</td>
                <td>".$fila['NOMBRE_PRODUCTO']."</td>
                <td>".$fila['PRECIO_PRODUCTO']."</td>
                
        </tr>";
        
    }
    
    $salida.="</tbody></table>";
    
}else{
    
    $salida.="No hay datos :(";
    
    
    
        
}

echo $salida;

$mysqli -> close();

?>
