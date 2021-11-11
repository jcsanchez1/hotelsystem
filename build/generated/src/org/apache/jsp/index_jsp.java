package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import hn.ceutec.vanguardia.configuracion.Dba;
import hn.ceutec.vanguardia.entidades.InfoHotel;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
  
      Dba db =new Dba(); //en la clase dba poner el user y pass
      db.Conectar();
        
      try{           
         db.query.execute("select * from OMEJIA.USUARIOS ");
         ResultSet rs=db.query.getResultSet();           
         while(rs.next()){ 
             String campo1,campo2,campo3;
             campo1 = rs.getString(1);
             campo2 = rs.getString(2);
             campo3 = rs.getString(3);
                 }

    } catch(Exception e)
     { e.printStackTrace();      }
      db.desconectar();
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>One Page Wonder - Start Bootstrap Template</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark navbar-custom fixed-top\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#page-top\">Start Bootstrap</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Sign Up</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Log In</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Header-->\n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"img/slide1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5>First slide label</h5>\n");
      out.write("                        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/slide2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5>Second slide label</h5>\n");
      out.write("                        <p>Some representative placeholder content for the second slide.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/slide3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5>Third slide label</h5>\n");
      out.write("                        <p>Some representative placeholder content for the third slide.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-target=\"#carouselExampleCaptions\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-target=\"#carouselExampleCaptions\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </button>\n");
      out.write("        </div>        \n");
      out.write("        <!--<header class=\"masthead text-center text-white\">\n");
      out.write("            <div class=\"masthead-content\">\n");
      out.write("                <div class=\"container px-5\">\n");
      out.write("                    <h1 class=\"masthead-heading mb-0\">One Page Wonder</h1>\n");
      out.write("                    <h2 class=\"masthead-subheading mb-0\">Will Rock Your Socks Off</h2>\n");
      out.write("                    <a class=\"btn btn-primary btn-xl rounded-pill mt-5\" href=\"#scroll\">Learn More</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bg-circle-1 bg-circle\"></div>\n");
      out.write("            <div class=\"bg-circle-2 bg-circle\"></div>\n");
      out.write("            <div class=\"bg-circle-3 bg-circle\"></div>\n");
      out.write("            <div class=\"bg-circle-4 bg-circle\"></div>\n");
      out.write("        </header>-->\n");
      out.write("        <!-- Content section 1-->\n");
      out.write("        <section id=\"scroll\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <div class=\"row gx-5 align-items-center\">\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2\">\n");
      out.write("                        <div class=\"p-5\"><img class=\"img-fluid rounded-circle\" src=\"img/01.jpg\" alt=\"...\" /></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1\">\n");
      out.write("                        <div class=\"p-5\">\n");
      out.write("                            <h2 class=\"display-4\">For those about to rock...</h2>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod aliquid, mollitia odio veniam sit iste esse assumenda amet aperiam exercitationem, ea animi blanditiis recusandae! Ratione voluptatum molestiae adipisci, beatae obcaecati.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Content section 2-->\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <div class=\"row gx-5 align-items-center\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"p-5\"><img class=\"img-fluid rounded-circle\" src=\"img/02.jpg\" alt=\"...\" /></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"p-5\">\n");
      out.write("                            <h2 class=\"display-4\">We salute you!</h2>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod aliquid, mollitia odio veniam sit iste esse assumenda amet aperiam exercitationem, ea animi blanditiis recusandae! Ratione voluptatum molestiae adipisci, beatae obcaecati.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Content section 3-->\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <div class=\"row gx-5 align-items-center\">\n");
      out.write("                    <div class=\"col-lg-6 order-lg-2\">\n");
      out.write("                        <div class=\"p-5\"><img class=\"img-fluid rounded-circle\" src=\"img/03.jpg\" alt=\"...\" /></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 order-lg-1\">\n");
      out.write("                        <div class=\"p-5\">\n");
      out.write("                            <h2 class=\"display-4\">Let there be rock!</h2>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod aliquid, mollitia odio veniam sit iste esse assumenda amet aperiam exercitationem, ea animi blanditiis recusandae! Ratione voluptatum molestiae adipisci, beatae obcaecati.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"py-5 bg-black\">\n");
      out.write("            <div class=\"container px-5\"><p class=\"m-0 text-center text-white small\">Copyright &copy; Your Website 2021</p></div>\n");
      out.write("        </footer>\n");
      out.write("    ");
  
      Dba db =new Dba(); //en la clase dba poner el user y pass
      db.Conectar();
        
      try{           
         db.query.execute("select 1,2,3 from DUAL ");
         ResultSet rs=db.query.getResultSet();           
         while(rs.next()){ 
             String campo1,campo2,campo3;
             campo1 = rs.getString(1);
             campo2 = rs.getString(2);
             campo3 = rs.getString(3);
    
      out.write("\n");
      out.write("\n");
      out.write("    <h1> ");
      out.print(campo1);
      out.write(" </h1>\n");
      out.write("\n");
      out.write("    <h1> ");
      out.print(campo2);
      out.write(" </h1>\n");
      out.write("\n");
      out.write("    <h1> ");
      out.print(campo3);
      out.write(" </h1>\n");
      out.write("    \n");
      out.write("    ");

    }

    } catch(Exception e)
     { e.printStackTrace();      }
      db.desconectar();
    
      out.write("        \n");
      out.write("        <script src=\"js/bootstrap.bundle.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
