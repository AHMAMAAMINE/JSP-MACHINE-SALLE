package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Salle;
import service.SalleService;

public final class MachineParSalle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/include/css.jsp");
    _jspx_dependants.add("/include/jses.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/sidebar.jsp");
    _jspx_dependants.add("/include/MachineSalle.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"");
      out.print( request.getContextPath());
      out.write("/css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("                ");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/assets/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/assets/demo/chart-bar-demo.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/datatables-simple-demo.js\"></script>\n");
      out.write("         <script src=\"");
      out.print( request.getContextPath());
      out.write("/script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/script/MachineSalle.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"sb-nav-fixed\">\n");
      out.write("           ");

		//HERE WE GETTING THE ATTRIBUTE DECLARED IN VALIDATE.JSP AND CHECKING IF IT IS NULL, THE USER WILL BE REDIRECTED TO LOGIN PAGE
				String uid = (String)session.getAttribute("user");
				if (uid == null)
				{
		
      out.write("<!-- NOT A VALID USER, IF THE USER TRIES TO EXECUTE LOGGED IN PAGE DIRECTLY, ACCESS IS RESTRICTED -->\n");
      out.write("\t\t\t\t\t ");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write("\n");
      out.write("                                         ");
	
				}
				else
				{ 
      out.write("\n");
      out.write("       ");
      out.write(" <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("            <!-- Navbar Brand-->\n");
      out.write("            <a class=\"navbar-brand ps-3\" href=\"#\">Gestion Machine Et voiture</a>\n");
      out.write("            <!-- Sidebar Toggle-->\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("           <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\" style=\"position: relative;left: 1050px\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"/AMINEAHMAMA/include/validates.jsp\" >Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("          \n");
      out.write("               \n");
      out.write("        </nav>");
      out.write("\n");
      out.write("        ");
      out.write("<div id=\"layoutSidenav\">\n");
      out.write("    <div id=\"layoutSidenav_nav\">\n");
      out.write("        <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\n");
      out.write("            <div class=\"sb-sidenav-menu\">\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <div class=\"sb-sidenav-menu-heading\">Pages</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <a class=\"nav-link\" onclick=\"goTo()\">\n");
      out.write("                        <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                        Recherche Multi\n");
      out.write("                    </a>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        function goTo(){\n");
      out.write("                            window.location=\"");
      out.print( request.getContextPath());
      out.write("/MachineParSalle.jsp\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                        <a class=\"nav-link\" onclick=\"goTo2()\">\n");
      out.write("                        <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                       Salle\n");
      out.write("                    </a>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        function goTo2(){\n");
      out.write("                            window.location=\"");
      out.print( request.getContextPath());
      out.write("/salleJSP.jsp\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                    <a class=\"nav-link\" onclick=\"goTo3()\">\n");
      out.write("                        <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                            Machine\n");
      out.write("                    </a>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        function goTo3(){\n");
      out.write("                            window.location=\"");
      out.print( request.getContextPath());
      out.write("/machine.jsp\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                    <a class=\"nav-link\" onclick=\"goTo4()\">\n");
      out.write("                        <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                            Charte\n");
      out.write("                    </a>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        function goTo4(){\n");
      out.write("                            window.location=\"");
      out.print( request.getContextPath());
      out.write("/charte.jsp\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid px-4\"> \n");
      out.write("<div>\n");
      out.write("     <fieldset>\n");
      out.write("               <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                                Information Machine\n");
      out.write("                            </div>\n");
      out.write("               <div id=\"formulaire\">\n");
      out.write("                   <div class=\"form-group row\">\n");
      out.write("                       <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\" style=\"position: relative;left: 20px\">Date Debut</label>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <input id=\"dateDebut\" type=\"date\"  style=\"position: relative;left: -100px;\" class=\"form-control\"  name=\"marque\" value=\"\" required=\"\"  />\n");
      out.write("    </div>   \n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\" style=\"position: relative;left: 20px\">Date FIN</label>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("      <input id=\"dateFin\" type=\"date\" class=\"form-control\" style=\"position: relative;left: -100px;\" name=\"marque\" value=\"\" required=\"\" />\n");
      out.write("    </div>   \n");
      out.write("     <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\" style=\"position: relative;left: 20px\">Salle</label>\n");
      out.write("      <div class=\"col-sm-2\">\n");
      out.write("        <select class=\"form-control\" id=\"inlineFormCustomSelectPref\"  style=\"position: relative;left: -100px;\">\n");
      out.write("    <option selected value=\"0\">Choose...</option>\n");
      out.write("    ");

        SalleService ss=new SalleService();
        for(Salle salle:ss.findAll()){
            
        
      out.write("\n");
      out.write("        <option id=\"salle\" value=\"");
      out.print( salle.getId() );
      out.write('"');
      out.write('>');
      out.print( salle.getId() );
      out.write("</option>\n");
      out.write("   ");
 }
    
      out.write("\n");
      out.write("    </select>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("      <div class=\"col-sm-10\" style=\" margin-top: 20px;padding-left: 500px;position: relative;top: -5px;\">\n");
      out.write("       <input id=\"search\" type=\"submit\" value=\"search\"  class=\"btn btn-primary\"/>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("            </fieldset>\n");
      out.write("</div>\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                                Machine Table\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table id=\"datatablesSimple\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <th>Id</th>\n");
      out.write("                                            <th>Référence <br>\n");
      out.write("                                            <th>Date Achat</th>\n");
      out.write("                                             <th>marque</th>\n");
      out.write("                                             <th>salle</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead><!--\n");
      out.write("-->                                    <tfoot>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <th>Id</th>\n");
      out.write("                                            <th>Référence <br>\n");
      out.write("                                            <th>Date Achat</th>\n");
      out.write("                                             <th>marque</th>\n");
      out.write("                                             <th>salle</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tfoot><!--\n");
      out.write("-->                                     \n");
      out.write("                                    <tbody id=\"content\">\n");
      out.write("                                        <tr></tr>\n");
      out.write("                                      </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                            <div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\n");
      out.write("                                &middot;\n");
      out.write("                                <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("       \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t");
}
		
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
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
