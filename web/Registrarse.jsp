<%@page import="java.math.BigDecimal"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="hn.ceutec.vanguardia.configuracion.Dba"%>
<%@page import="hn.ceutec.vanguardia.entidades.Paises"%>
<%@page import="hn.ceutec.vanguardia.entidades.Tipodocumento"%>
<%@page import="hn.ceutec.vanguardia.entidades.Personas"%>
<%
    int id_d = 0, id_p = 0;
    String nombre_p = "", iso3 = "", codigo = "", tipod = "";
    Paises v_pais = new Paises();
    Tipodocumento v_td = new Tipodocumento();

    Dba db = new Dba(); //en la clase dba poner el user y pass
%>
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
                                <%
                                    db.Conectar();
                                    try {
                                        db.query.execute("SELECT * FROM VANGUARDIA.PAISES ");
                                        ResultSet rs = db.query.getResultSet();
                                %>                                
                                <select id="pais" name="pais" class="custom-select">
                                    <% while (rs.next()) {
                                            out.print("<option value=" + rs.getInt(1) + ">" + rs.getString(2) + "</option>");
                                        } %>
                                </select>
                                <%
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    db.desconectar();
                                %>                                
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2">
                                <label for="tipodocumento" class="col-form-label">Documento</label> 
                            </div>
                            <div class="col-4">
                                <%
                                    db.Conectar();
                                    try {
                                        db.query.execute("SELECT * FROM VANGUARDIA.TIPODOCUMENTO ");
                                        ResultSet rs = db.query.getResultSet();
                                %>
                                <select id="tipodocumento" name="tipodocumento" class="custom-select">
                                    <% while (rs.next()) {
                                            out.print("<option value=" + rs.getInt(1) + ">" + rs.getString(2) + "</option>");
                                        } %>
                                </select>
                                <%
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    db.desconectar();
                                %>
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
                                    <input type="checkbox"  id="agreeTerms" name="terms" value="agree" required="required">
                                    <label for="agreeTerms">
                                        Acepto los <a href="index.jsp#politicas">terminos</a>
                                    </label>
                                </div>
                            </div>                            
                            <div class="col-4">
                                <button type="submit" onclick="generatePasswordRand(8);" class="btn btn-primary btn-block">Registrarse</button>
                            </div><br/>
                        </div> 
                        <a href="login.jsp" class="text-center">Tengo un usuario</a>
                        <input type="hidden" name="generado" id="generado">
                        <input type="hidden" name="md5pass" id="md5pass">
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
<script src="js/encriptar/md5.js" type="text/javascript"></script>
<script>
                                    function generatePasswordRand(length, type) {
                                        switch (type) {
                                            case 'num':
                                                characters = "0123456789";
                                                break;
                                            case 'alf':
                                                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                                                break;
                                            case 'rand':
                                                //FOR ?
                                                break;
                                            default:
                                                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                                                break;
                                        }
                                        var pass = "";
                                        for (i = 0; i < length; i++) {
                                            if (type == 'rand') {
                                                pass += String.fromCharCode((Math.floor((Math.random() * 100)) % 94) + 33);
                                            } else {
                                                pass += characters.charAt(Math.floor(Math.random() * characters.length));
                                            }
                                        }
                                        document.getElementById("generado").value = pass;
                                        document.getElementById("md5pass").value = hex_md5(pass);
                                        console.log(document.getElementById("md5pass").value);
                                        return pass;
                                    }
</script>
</body>
</html>
