package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logins_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"layoutAuthentication\">\n");
      out.write("    <div id=\"layoutAuthentication_content\">\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-5\">\n");
      out.write("                        <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                            <div class=\"card-header\"><h3 class=\"text-center font-weight-light my-4\">Login</h3></div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"validate.jsp\" method=\"post\">\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input class=\"form-control\" id=\"inputEmail\" type=\"text\" name=\"username\" placeholder=\"name@example.com\" />\n");
      out.write("                                        <label for=\"inputEmail\">Email address</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input class=\"form-control\" id=\"inputPassword\" type=\"password\" name=\"password\" placeholder=\"Password\" />\n");
      out.write("                                        <label for=\"inputPassword\">Password</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"d-flex align-items-center justify-content-between mt-4 mb-0\">\n");
      out.write("                                        <button class=\"btn btn-primary\" id=\"login\" onclick=\"login()\" type=\"submit\">Login</button>\n");
      out.write("                                            </div>\n");
      out.write("                                    <script type=\"text/javascript\">\n");
      out.write("                                function login() {\n");
      out.write("                                    window.location = \"");
      out.print( request.getContextPath());
      out.write("/salleJSP.jsp\";\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer text-center py-3\">\n");
      out.write("                                <div class=\"small\"><a onclick=\"Registre()\">Need an account? Sign up!</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                function Registre() {\n");
      out.write("                                    window.location = \"");
      out.print( request.getContextPath());
      out.write("/registre.jsp\";\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"layoutAuthentication_footer\">\n");
      out.write("        <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("            <div class=\"container-fluid px-4\">\n");
      out.write("                <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                    <div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\">Privacy Policy</a>\n");
      out.write("                        &middot;\n");
      out.write("                        <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
