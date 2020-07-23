<?php
include_once 'app/Conexion.inc.php';
include_once 'app/RepositorioUsuario.inc.php';

$titulo = 'Registro';

include_once 'plantillas/documento-declaracion.inc.php';

include_once 'plantillas/navbar.inc.php';
?>

<div class="container">

    <div class="jumbotron">

        <h1 class="text-center">Formulario de Registro</h1>


    </div>


</div>

<div class="container">

    <div class="row">


        <div class="col-md-6 text-center">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        Instrucciones
                    </h3>
                </div>
                <div class="panel-body">
                    <br>
                    <p class="text-justify">
                        Para crear tu usuario en la base  de  datos, proporciona  un nombre
                        de usuario, una contraseña y un correo.     
                    </p>
                    <br>
                    <a href="#">¿ya tienes cuenta?</a>
                    
                    <br>
                    <br>
                    <a href="#">¿olvidaste tu contraseña?</a>
                    <br>
                    <br>    
                </div>
            </div>

        </div>
        
        
        <div class="col-md-6 text-center">
            
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title" >
                        Introduce tus datos
                    </h3>
                </div>
                <div class="panel-body">
                    <form role="form" method="post" action="registro_accion.php">
                        <div class="form-group">
                            <label>Nombre de usuario</label>
                            <input type="text" class="form-control" name="nombre" placeholder="paula">    
                            
                        </div>
                        <div class="form-group">
                            <label>Correo Electronico</label>
                            <input type="email" class="form-control" name="email" placeholder="usuario@mail.com">    
                            
                        </div>
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="password" class="form-control" name="clave1" placeholder="*******">    
                            
                        </div>
                        
                        <div class="form-group">
                            <label>Repite contraseña</label>
                            <input type="password" class="form-control" name="clave2">    
                            
                        </div>
                        <br>
                        <button type="reset" class="btn btn-default btn-primary">
                            limpiar campos
                        </button>
                        <button type="submit" class="btn btn-default btn-primary" name="enviar">
                            Enviar Datos
                        </button>
                        
                        
                    </form>
                </div>
            </div>
            
            

        </div>


    </div>


</div>







<?php
include_once 'plantillas/documento-cierre.inc.php';
?>
