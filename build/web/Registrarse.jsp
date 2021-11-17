<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><% out.print(session.getAttribute("s_nombre_hotel").toString()); %> | Registro usuarios</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link href="plugins/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css"/>
        <!-- icheck bootstrap -->
        <link href="plugins/icheck-bootstrap/icheck-bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Theme style -->
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="hold-transition register-page">
        <div class="register-box">
            <div class="card card-outline card-primary">
                <div class="card-header text-center">
                    <a href="index.jsp" class="h1"><b><% out.print(session.getAttribute("s_nombre_hotel").toString()); %></b></a>
                </div>
                <div class="card-body">
                    <p class="login-box-msg">Registrar nuevo cliente</p>

                    <form action="Registrarse.jsp" method="POST">
                        <div class="form-group row">
                            <div class="col-2">
                                <label for="nombre" class="col-form-label">Nombre</label> 
                            </div>
                            <div class="col-4">
                                <input id="nombre" name="nombre" placeholder="Nombre" type="text" class="form-control" required="required">
                            </div>
                            <div class="col-2">
                                <label for="apellido" class="col-form-label">Apellido</label> 
                            </div>
                            <div class="col-4">
                                <input id="apellido" name="apellido" placeholder="Apellido" type="text" class="form-control" required="required">
                            </div>                                
                        </div>
                        <div class="form-group row ">
                            <div class="col-2">
                                <label for="email" class="col-form-label">Email</label> 
                            </div>
                            <div class="col-4">
                                <input id="email" name="email" placeholder="Correo Electronico" type="email" class="form-control" required="required">
                            </div>
                            <div class="col-2">
                                <label for="telefono" class="col-form-label">Telefono</label> 
                            </div>
                            <div class="col-4">
                                <input id="telefono" name="telefono" type="tel" class="form-control" required="required" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}">
                                <small>Formato: 504-2222-0000</small>
                            </div>
                        </div>
                        <div class="form-group row ">
                            <div class="col-2">
                                <label for="fechanacimiento" class="col-form-label">Cumpleaños</label> 
                            </div>
                            <div class="col-4">
                                <input id="fechanacimiento" name="fechanacimiento" type="date" class="form-control" required="required">
                            </div>
                            <div class="col-2">
                                <label for="pais" class="col-form-label">Pais</label> 
                            </div>
                            <div class="col-4">
                                <select id="pais" name="pais" class="custom-select">
                                    <option value="1">Honduras</option>
                                    <option value="2">El salvador</option>
                                    <option value="3">Guatemala</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2">
                                <label for="tipodocumento" class="col-form-label">Documento</label> 
                            </div>
                            <div class="col-4">
                                <select id="tipodocumento" name="tipodocumento" class="custom-select">
                                    <option value="1">DNI</option>
                                    <option value="2">Pasaporte</option>
                                    <option value=""></option>
                                </select>
                            </div>
                            <div class="col-2">
                                <label for="identificacion" class=" col-form-label"># Identificacion</label>   
                            </div>
                            <div class="col-4">
                                <input id="identificacion" name="identificacion" type="text" class="form-control" required="required">
                            </div>                            
                        </div>
                        <div class="form-group row">
                            <div class="col-4">
                                <div class="icheck-primary">
                                    <input type="checkbox" id="agreeTerms" name="terms" value="agree" required="required">
                                    <label for="agreeTerms">
                                        Acepto los <a href="index.jsp#politicas">terminos</a>
                                    </label>
                                </div>
                            </div>                            
                            <div class="col-4">
                                <button type="submit" class="btn btn-primary btn-block">Registrarse</button>
                            </div><br/>
                        </div> 
                        <a href="login.jsp" class="text-center">Tengo un usuario</a>
                    </form>
                </div>
            </div>
        </div>
        <!-- /.form-box -->
    </div><!-- /.card -->
</div>
<!-- /.register-box -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<!-- AdminLTE App -->
<script src="js/adminlte.min.js" type="text/javascript"></script>
</body>
</html>
