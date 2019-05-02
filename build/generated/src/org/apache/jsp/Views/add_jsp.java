package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Añadir Persona</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"p-3 mb-2 bg-primary text-white\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                <h1>Agregar Persona</h1>\n");
      out.write("                <form action=\"Controlador\">\n");
      out.write("\n");
      out.write("                    Nombre:<br> <input class=\"form-control\" type=\"text\" name=\"txtNombre\"><br>\n");
      out.write("                    Apellidos:<br> <input class=\"form-control\" type=\"text\" name=\"txtApellido\"><br>\n");
      out.write("                    Email:<br> <input class=\"form-control\" type=\"text\" name=\"txtEmail\"><br>\n");
      out.write("                    <label>LP</label><select name=\"cmbxLp\">\n");
      out.write("                        \n");
      out.write("                        <option value=\"Java\">Java</option>\n");
      out.write("                        <option value=\"JavaScript\">JavaScript</option>\n");
      out.write("                        <option value=\"Python\">Python</option>\n");
      out.write("                        <option value=\"Ruby\">Ruby</option>\n");
      out.write("                    </select>\n");
      out.write("                    <p>\n");
      out.write("                        Hobbies: <br>\n");
      out.write("                        <input type=\"checkbox\" name=\"cb-autos\" value=\"gusta\"> Autos<br>\n");
      out.write("                        <input type=\"checkbox\" name=\"cb-deportes\" value=\"gusta\"> Deportes<br>\n");
      out.write("                        <input type=\"checkbox\" name=\"cb-videojuegos\" value=\"gusta\"> Videojuegos<br>\n");
      out.write("                        <input type=\"checkbox\" name=\"cb-videojuegos\" value=\"gusta\"> Instrumentos<br>\n");
      out.write("                    </p>\n");
      out.write("                    \n");
      out.write("                    <input class=\"btn btn-light\" type=\"submit\" name=\"accion\" value=\"Agregar\">\n");
      out.write("                    <a href=\"Controlador?accion=listar\" class=\"btn btn-primary\" >Regresar</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
