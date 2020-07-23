<?php
include_once 'app/Conexion.inc.php';
include_once 'app/RepositorioUsuario.inc.php';

$titulo = 'Base de datos';

include_once 'plantillas/documento-declaracion.inc.php';

include_once 'plantillas/navbar.inc.php';
?>






<div class="container">
    <div class='jumbotron'>
        <h1>Base de Datos</h1>
        <p>
            quiero un 5
        </p>     
    </div>        
</div>



<div class="container">
    <div class="row">
        <div class="col-md-4">
            <div class="row">

                <div class="col-md-12">

                    <div class="panel panel-default">

                        <div class="panel-heading">

                            <span class="glyphicon glyphicon-search" aria-hidden="true"></span> Busqueda 

                        </div>

                        <div class="panel-body">

                            <div class="form-group">

                                <input type="search" class="form-control" placeholder="¿Que buscas?">

                            </div>

                            <button class="form-control">
                                ❈ Buscar
                            </button>



                        </div>


                    </div>

                </div>

            </div>

            <div class="row">

                <div class="col-md-12">

                    <div class="panel panel-default">

                        <div class="panel-heading">

                            FILTRO

                        </div>
                        <div class="panel-body">



                        </div>

                    </div>
                </div>
            </div>
            <div class="row">

                <div class="col-md-12">

                    <div class="panel panel-default">

                        <div class="panel-heading">

                            ARCHIVO

                        </div>
                        <div class="panel-body">



                        </div>

                    </div>
                </div>
            </div>

        </div>

        <div class='col-md-8'>

            <div class="panel panel-default">

                <div class="panel-heading">

                    <h3 class="panel-title"> ultimas entradas </h3> 

                </div>

                <div class="panel-body">


                    <p>Todavia  no hay entradas</p>



                </div>


            </div>    
        </div>





    </div>   
</div>


<?php
include_once 'plantillas/documento-cierre.inc.php';
?>










