<?php

class RepositorioUsuario{
    
    public static function obtener_todos($conexion){
            $usuarios=array();
            
            if(isset($conexion)){
                try{
                    
                include_once 'usuario.inc.php';
                
                $sql="select * from usuarios ";
                $sentencia=$conexion->prepare($sql);
                $sentencia->execute();
                $resultado=$sentencia-> fetchALL();
               
                if(count($resultado)){
                    
                    foreach($resultado as $fila){
                        $usuarios[]=new Usuario(
                                $fila['id'],$fila['nombre'],$fila['email'],$fila['password'],$fila['fecha_registro'],$fila['activo']
                                );
                    }
                } else {
                    
                   print 'no hay usuarios';
                    
                }
                
                        
                } catch (PDOException $ex){
                    print 'ERROR'.$ex->getMessage();
                }  
                
                
            }
            return $usuarios;
    }
    
    public static function obtener_numero_usuarios ($conexion){
        $total_usuarios=null;
        
        
        if(isset($conexion)){
            try{
                $sql="select COUNT(*) as total from usuarios ";
                $sentencia=$conexion->prepare($sql);
                $sentencia->execute();
                $resultado=$sentencia-> fetch();
                
                $total_usuarios=$resultado['total'];
                
                
            }catch(PDOException  $ex){ 
                
                print 'ERROR'. $ex -> getMessage();
                
            }
            
            
        }
    
        return $total_usuarios;
        
        
    }
}
