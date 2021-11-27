<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><% out.print(session.getAttribute("s_nombre_hotel").toString()); %> | Registro usuarios</title>
        <jsp:include page="cabecera.jsp"/>
    </head>
    <body class="hold-transition register-page">
        <div class="register-box">
            <div class="card card-outline card-primary">
                <div class="card-header text-center">
                    <a href="index.jsp" class="h1"><b><% out.print(session.getAttribute("s_nombre_hotel").toString()); %></b></a>
                </div>
                <div class="card-body">
                    <p class="login-box-msg">Apertura de caja | <%
                        Date dNow = new Date();
                        SimpleDateFormat ft
                                = new SimpleDateFormat("E dd-MM-yyyy");
                        out.print(ft.format(dNow));
                        %></p>

                    <form action="aperturacaja.jsp" method="POST">
                        <div class="form-group row">
                            <div class="col-2">
                                <label for="tipodocumento" class="col-form-label">Movimiento</label> 
                            </div>
                            <div class="col-10">
                                <select id="tipodocumento" name="tipodocumento" class="custom-select">
                                    <option value="1">Apertura de caja</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row ">
                            <div class="col-2">
                                <label for="fecha" class="col-form-label">Fecha</label> 
                            </div>
                            <div class="col-4">
                                <input id="fecha" name="fecha" type="date" class="form-control" required="required" value="<%
                                    Date dNow2 = new Date();
                                    SimpleDateFormat ft2
                                            = new SimpleDateFormat("dd-MM-yyyy");
                                    out.print(ft.format(dNow));
                                       %></p>">
                            </div>
                            <div class="col-2">
                                <label for="concepto" class=" col-form-label">Usuario</label>   
                            </div>
                            <div class="col-4">
                                <input id="concepto" name="concepto" type="text" class="form-control" required="required">
                            </div>                            
                        </div>                        
                        <div class="form-group row ">
                            <div class="col-2">
                                <label for="monto" class="col-form-label">monto</label> 
                            </div>
                            <div class="col-10">
                                <input id="monto" name="monto"  type="number" class="form-control" required="required">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4">
                                <div class="icheck-primary">
                                    <input type="checkbox" id="agreeTerms" name="terms" value="agree" required="required">
                                    <label for="agreeTerms">
                                        Certifico el conteo de efectivo
                                    </label>
                                </div>
                            </div>                            
                            <div class="col-4">
                                <button type="submit" class="btn btn-primary btn-block">Registrar</button>
                            </div><br/>
                        </div> 
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
