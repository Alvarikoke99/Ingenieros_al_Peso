/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-01-25 10:52:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class solicitarInforme_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Usuarios/alvar/Documents/GitHub/Ingenieros_al_Peso/IngenierosAlPeso/target/IngenierosAlPeso-1.0-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1611407848172L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>\r\n");
      out.write("            Ingenieros al peso S.A. | RRHH\r\n");
      out.write("        </title> \r\n");
      out.write("        <meta charset=\"utf-8\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"cuerpo\">\r\n");
      out.write("         <!-- CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plantilla.css\" media=\"screen\" /> \r\n");
      out.write("\r\n");
      out.write("        <!--JavaScript-->\r\n");
      out.write("        <script src=\"funciones.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Cabecera -->\r\n");
      out.write("        <div class=\"cabecera\" id=\"cabecera\">\r\n");
      out.write("            <img src=\"img/logoSmall.png\" alt=\"logo\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"topnav\" id=\"topnav\">\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <a class=\"dropbtn\">Ver informacion\r\n");
      out.write("                  <i class=\"down\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"EmpresaController?action=listEmpresas\">Empresa</a>\r\n");
      out.write("                    <a href=\"ProyectoController?action=listProyectos\">Proyectos</a>\r\n");
      out.write("                    <a href=\"TrabajadorController?action=listTrabajadores\">Trabajadores</a>\r\n");
      out.write("                    <a href=\"infoCalendario.jsp\">Calendario</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"enlace\" href=\"SolicitudController?action=listSolicitudes\">Lista peticiones</a>\r\n");
      out.write("            <a class=\"enlace\" id=\"idPag\" href=\"solicitarInforme.jsp\">Solicitar informe</a>\r\n");
      out.write("            <a class=\"enlace\" href=\"annadirUser.jsp\">Añadir/Editar trabajador</a>\r\n");
      out.write("            <a class=\"enlace\" href=\"annadirEmpresa.jsp\">Añadir/Editar empresa</a>\r\n");
      out.write("            <a class=\"enlace\" href=\"annadirProyecto.jsp\">Añadir/Editar proyecto</a>\r\n");
      out.write("            <a class=\"enlace\" href=\"asignarTrabajador.jsp\">Asignar trabajador</a>\r\n");
      out.write("            <a class=\"enlace\" href=\"index.html\">Cerrar sesión</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Contenido --> \r\n");
      out.write("        <div class=\"contentCenter\">\r\n");
      out.write("            <h2>Solicitar informe:</h2>\r\n");
      out.write("            <label>Parámetro de búsqueda:</label><br><br>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"contenido\">Empresa\r\n");
      out.write("                    <input type=\"radio\" name=\"tipo\" id=\"empresa\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                  </label>\r\n");
      out.write("                <label class=\"contenido\">Proyecto\r\n");
      out.write("                    <input type=\"radio\" name=\"tipo\" id=\"proyecto\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label> \r\n");
      out.write("                <label class=\"contenido\">Empleado\r\n");
      out.write("                    <input type=\"radio\" name=\"tipo\" id=\"empleado\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label><br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label>Mostrar formato:</label><br><br>\r\n");
      out.write("                <label class=\"contenido\">Semanal\r\n");
      out.write("                    <input type=\"radio\" name=\"tiempo\" id=\"semanal\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label>\r\n");
      out.write("                <label class=\"contenido\">Mensual\r\n");
      out.write("                    <input type=\"radio\" name=\"tiempo\" id=\"mensual\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label> \r\n");
      out.write("                <label class=\"contenido\">Anual\r\n");
      out.write("                    <input type=\"radio\" name=\"tiempo\" id=\"anual\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label>\r\n");
      out.write("                <label class=\"contenido\">Periodo determinado\r\n");
      out.write("                    <input type=\"radio\" name=\"tiempo\" id=\"periodo\">\r\n");
      out.write("                    <span class=\"checkmark\"></span>\r\n");
      out.write("                </label><br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"informe.html\">\r\n");
      out.write("                <button type=\"submit\" class=\"btnAdd\" onclick=\"solicitarInforme()\">Solicitar informe</button><br><br>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>   \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- Pie de pagina -->\r\n");
      out.write("        <div class=\"footerLargo\">Ingenieros al peso S.A. - Campus Universitario, Ctra. Madrid-Barcelona km, 33, 600, 28805 Alcalá de Henares - Teléfono: 900.000.000\r\n");
      out.write("            <br> Condiciones generales de venta, política de privacidad y utilización web y APP\r\n");
      out.write("            <br> © Ingenieros al peso S.A. 2020\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
