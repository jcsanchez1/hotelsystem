<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><% out.print(session.getAttribute("s_nombre_hotel").toString());%> | Ingresar</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link href="plugins/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css"/>
        <!-- icheck bootstrap -->
        <link href="plugins/icheck-bootstrap/icheck-bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Theme style -->
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <!-- /.login-logo -->
            <div class="card card-outline card-primary">
                <div class="card-header text-center">
                    <a href="index.jsp" class="h1"><b><% out.print(session.getAttribute("s_nombre_hotel").toString()); %></b></a>
                </div>
                <div class="card-body">
                    <p class="login-box-msg">Ingrese su datos para ver su cuenta</p>

                    <form action="../../index3.html" method="post">
                        <div class="input-group mb-3">
                            <input type="email" class="form-control" placeholder="Email">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-envelope"></span>
                                </div>
                            </div>
                        </div>
                        <div class="input-group mb-3">
                            <input type="password" class="form-control" placeholder="Password">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-lock"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-8">
                                <div class="icheck-primary">
                                    <input type="checkbox" id="remember">
                                    <label for="remember">
                                        Recordarme
                                    </label>
                                </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-4">
                                <button type="submit" class="btn btn-primary btn-block">Ingresar</button>
                            </div>
                            <!-- /.col -->
                            <p><a href="aperturacaja.jsp">administrador </a></p>
                            <p><a href="client/index.jsp"> cliente</a></p>
                        </div>
                    </form>

                    <p class="mb-1">
                        <a href="forgot-password.html">Olvide mi contraseña</a>
                    </p>
                    <p class="mb-0">
                        <a href="Registrarse.jsp" class="text-center">Registrar nuevo cliente</a>
                    </p>
                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>
        <!-- /.login-box -->

        <!-- jQuery -->
        <script src="plugins/jquery/jquery.min.js" type="text/javascript"></script>
        <!-- Bootstrap 4 -->
        <script src="plugins/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="js/adminlte.min.js" type="text/javascript"></script>
    </body>
</html>