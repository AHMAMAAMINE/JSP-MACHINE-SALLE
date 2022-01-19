package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public final class charte_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/include/css.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/sidebar.jsp");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write(" \n");

Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
String dataPoints = null;
 

	Class.forName("com.mysql.jdbc.Driver"); 
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "");
	Statement statement = connection.createStatement();
	String xVal, yVal;
	
	ResultSet resultSet = statement.executeQuery("select salle,Count(*) As number from machine GROUP BY salle");
	
	while(resultSet.next()){
		xVal = resultSet.getString("salle");
		yVal = resultSet.getString("number");
		map = new HashMap<Object,Object>(); map.put("x", Double.parseDouble(xVal)); map.put("y", Double.parseDouble(yVal)); list.add(map);
		dataPoints = gsonObj.toJson(list);
	}
	connection.close();



      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"");
      out.print( request.getContextPath());
      out.write("/css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("window.onload = function() { \n");
      out.write(" \n");
 if(dataPoints != null) { 
      out.write("\n");
      out.write("var chart = new CanvasJS.Chart(\"chartContainer\", {\n");
      out.write("\tanimationEnabled: true,\n");
      out.write("\texportEnabled: true,\n");
      out.write("\ttitle: {\n");
      out.write("\t\ttext: \"Nombre De Machine par salle\"\n");
      out.write("\t},\n");
      out.write("\tdata: [{\n");
      out.write("\t\ttype: \"column\", //change type to bar, line, area, pie, etc\n");
      out.write("\t\tdataPoints: ");
out.print(dataPoints);
      out.write("\n");
      out.write("\t}]\n");
      out.write("});\n");
      out.write("chart.render();\n");
 } 
      out.write(" \n");
      out.write(" \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"sb-nav-fixed\">\n");
      out.write("       ");

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
      out.write("        ");
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
      out.write("<div id=\"chartContainer\" style=\"height: 370px; width: 40; position: relative;left: 500px;top: 100px\"></div>\n");
      out.write("       \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t");
}
		
      out.write(" \n");
      out.write("    \n");
      out.write("<script src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"></script>\n");
      out.write("</body>\n");
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
