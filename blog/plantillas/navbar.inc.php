<?php
Conexion:: abrir_conexion();
$total_usuarios = RepositorioUsuario:: obtener_numero_usuarios(Conexion::obtener_conexion());

Conexion:: cerrar_conexion();
?>






<nav class="navbar navbar-default navbar-static-top" >


    <div class="container" >
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="flase" area-controls="navbar">
                <span class="sr-only"> te.amo.tonta  </span>
                <span class="icon-bar"> </span>
                <span class="icon-bar">  </span>
                <span class="icon-bar">   </span>

            </button>
            <a class="navbar-brand" href="#"> S.oka </a>   
        </div>

        <div id="navbar" class="navbar-collapse collapse">

            <ul class="nav navbar-nav">

                <li><a href="#">Entradas  </a> </li>
                <li><a href="#">Favoritos </a> </li>
                <li><a href="#">Autores</a> </li>
                

            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#">
                        usuarios registrados:
                        <?php
                        echo $total_usuarios;
                        ?>
                    </a> 
                </li>
                <li><a href="#">iniciar secion </a> </li>
                <li><a href="registro.php">Registrate</a> </li> 

            </ul>

        </div>

    </div>

</nav>
