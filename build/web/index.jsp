<%@page import="java.math.BigDecimal"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="hn.ceutec.vanguardia.configuracion.Dba"%>
<%@page import="hn.ceutec.vanguardia.entidades.InfoHotel"%>
<%
    String nombre = "", mision = "", vision = "", telefono = "", email = "", direccion = "", politicas = "";
    BigDecimal latitud = new BigDecimal(7);
    BigDecimal longitud = new BigDecimal(7);
    InfoHotel info = new InfoHotel();
    Dba db = new Dba(); //en la clase dba poner el user y pass
    db.Conectar();

    try {
        db.query.execute("SELECT * FROM VANGUARDIA.INFO_HOTEL ");
        ResultSet rs = db.query.getResultSet();
        while (rs.next()) {
            nombre = rs.getString(2);
            mision = rs.getString(3);
            vision = rs.getString(4);
            latitud = rs.getBigDecimal(6);
            longitud = rs.getBigDecimal(7);
            telefono = rs.getString(8);
            email = rs.getString(9);
            direccion = rs.getString(10);
            politicas = rs.getString(13);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    db.desconectar();
    info.setNombre(nombre);
    info.setMision(mision);
    info.setVision(vision);
    info.setLatitud(latitud);
    info.setLonjitud(longitud);
    info.setTelefono(telefono);
    info.setEmail(email);
    info.setDireccion(direccion);
    info.setPoliticas(politicas);

%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title><%=info.getNombre()%></title>
        <link rel="icon" type="image/x-icon" href="favicon.ico" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript">
            function mostrar_mapa(centinela) {
                //Ubicación inicial del mapa.
                var ubicacion = new google.maps.LatLng(<%= info.getLatitud()%>,<%= info.getLonjitud()%>); //Latitud y Longitud
                //Parámetros Iniciales
                var opciones = {zoom: 17, //acercamiento
                    center: ubicacion,
                    mapTypeId: google.maps.MapTypeId.ROADMAP //Las posibles opciones son ROADMAP/SATELLITE/HYBRID/TERRA                    
                };

                //Creacion del mapa
                var map = new google.maps.Map(document.getElementById("mapa"), opciones);


                //recuperar ubicacion donde hago click
                var iw = new google.maps.InfoWindow(
                        {content: '<%= info.getNombre()%> <br> <%= info.getDireccion() %>!',
                            position: ubicacion});
                iw.open(map);
                // configurar evento click sobre el mapa
                map.addListener('click', function (mapsMouseEvent) {
                    iw.close();
                    iw = new google.maps.InfoWindow({position: mapsMouseEvent.latLng});
                    iw.setContent(mapsMouseEvent.latLng.toString());
                    iw.open(map);
                });


                if (centinela == 1) {
                    //Colocar una marca sobre el Mapa
                    mi_ubicacion = new google.maps.Marker({
                        position: new google.maps.LatLng(14.104173, -87.186145), //Posición de la marca
                        icon: 'persona.jpg', //Imagen que aparecerá en la marca, debe estar en el server
                        map: map, //Mapa donde estará la marca
                        title: 'Osman Mejía' //Título all hacer un mouseover
                    });

                    //Mostrar Información al hacer click en la marca
                    var infowindow = new google.maps.InfoWindow({
                        content: 'Elaborado Por: Osman Mejía<br/>Clase: DAW<br/>Tipo: Ejemplo'
                    });

                    google.maps.event.addListener(mi_ubicacion, 'click', function () {
                        //Calling the open method of the InfoWindow
                        infowindow.open(map, mi_ubicacion);
                    });
                }
                ;
            }

            function mostrar_triangulo() {
                //Ubicación inicial del mapa
                var ubicacion = new google.maps.LatLng(24.886436490187712, -70.2685546875);
                //Parámetros iniciales
                var opciones = {zoom: 5,
                    center: ubicacion,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                };

                var map = new google.maps.Map(document.getElementById("mapa"), opciones);
                var bermudaTriangle;
                var triangleCoords = [
                    new google.maps.LatLng(25.774252, -80.190262),
                    new google.maps.LatLng(18.466465, -66.118292),
                    new google.maps.LatLng(32.321384, -64.75737),
                    new google.maps.LatLng(25.774252, -80.190262),
                ];

                //Crear Polígono
                bermudaTriangle = new google.maps.Polygon({
                    paths: triangleCoords,
                    strokeColor: "#FF0000",
                    strokeOpacity: 0.8,
                    strokeWeight: 2,
                    fillColor: "FF0000",
                    fillOpacity: 0.35
                });

                bermudaTriangle.setMap(map);


            }


        </script>       
    </head>
    <body id="page-top" onload="mostrar_mapa(0)">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
            <div class="container px-5">
                <a class="navbar-brand" href="#page-top"><%=info.getNombre()%></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><a class="nav-link" href="#!">Sign Up</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">Log In</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Header-->
        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/slide1.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>First slide label</h5>
                        <p>Some representative placeholder content for the first slide.</p>
                    </div>
                </div>
                <!--  <div class="carousel-item">
                      <img src="img/slide2.jpg" class="d-block w-100" alt="...">
                      <div class="carousel-caption d-none d-md-block">
                          <h5>Second slide label</h5>
                          <p>Some representative placeholder content for the second slide.</p>
                      </div>
                  </div>
                  <div class="carousel-item">
                      <img src="img/slide3.jpg" class="d-block w-100" alt="...">
                      <div class="carousel-caption d-none d-md-block">
                          <h5>Third slide label</h5>
                          <p>Some representative placeholder content for the third slide.</p>
                      </div>
                  </div>-->
            </div>
            <button class="carousel-control-prev" type="button" data-target="#carouselExampleCaptions" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-target="#carouselExampleCaptions" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </button>
        </div>        
        <!--<header class="masthead text-center text-white">
            <div class="masthead-content">
                <div class="container px-5">
                    <h1 class="masthead-heading mb-0">One Page Wonder</h1>
                    <h2 class="masthead-subheading mb-0">Will Rock Your Socks Off</h2>
                    <a class="btn btn-primary btn-xl rounded-pill mt-5" href="#scroll">Learn More</a>
                </div>
            </div>
            <div class="bg-circle-1 bg-circle"></div>
            <div class="bg-circle-2 bg-circle"></div>
            <div class="bg-circle-3 bg-circle"></div>
            <div class="bg-circle-4 bg-circle"></div>
        </header>-->
        <!-- Content section 1-->
        <section id="scroll">
            <div class="container px-5">
                <div class="row gx-5 align-items-center">
                    <div class="col-lg-6 order-lg-2">
                        <div class="p-5"><img class="img-fluid rounded-circle" src="img/01.jpg" alt="..." /></div>
                    </div>
                    <div class="col-lg-6 order-lg-1">
                        <div class="p-5">
                            <h2 class="display-4">Mision</h2>
                            <p><%= info.getMision()%></p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Content section 2-->
        <section>
            <div class="container px-5">
                <div class="row gx-5 align-items-center">
                    <div class="col-lg-6">
                        <div class="p-5"><img class="img-fluid rounded-circle" src="img/02.jpg" alt="..." /></div>
                    </div>
                    <div class="col-lg-6">
                        <div class="p-5">
                            <h2 class="display-4">Vision</h2>
                            <p><%= info.getVision()%></p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Content section 3-->
        <section>
            <div class="container px-5">
                <div class="row gx-5 align-items-center">
                    <div class="col-lg-6 order-lg-2">
                        <div class="p-5"><img class="img-fluid rounded-circle" src="img/03.jpg" alt="..." /></div>
                    </div>
                    <div class="col-lg-6 order-lg-1">
                        <div class="p-5">
                            <h2 class="display-4">Politicas</h2>
                            <p><%= info.getPoliticas()%></p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Content section 3-->
        <section>

            <div class="container px-5">
                <div class="row gx-5 align-items-center">
                    <div class="col-2">
                    </div>
                    <div class="col-8">
                        <div id="mapa" style="width: 100%; height: 500px;"></div>
                    </div>
                    <div class="col-2">
                    </div>                    
                </div>
            </div>
        </section>                        
        <!-- Footer-->
        <footer class="py-5 bg-black">
            <div class="row">
                <div class="col-1">

                </div>                    
                <div class="col-4">
                    <p><strong>Telefono:</strong><%= info.getTelefono()%></p>
                    <p><strong>Email:</strong><%= info.getEmail()%></p>
                    <p><strong>Direccion:</strong><%= info.getDireccion()%></p>                    
                </div>
                <div class="col-7">

                </div>    
            </div>
            <div class="container px-5"><p class="m-0 text-center text-white small">Copyright &copy; <%= info.getNombre()%> Your Website 2021</p></div>
        </footer>     
        <script src="js/bootstrap.bundle.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>