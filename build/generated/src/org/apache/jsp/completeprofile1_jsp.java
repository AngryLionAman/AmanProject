package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class completeprofile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Interests | InquiryHere.com</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ui.dropdownchecklist.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery/ui.core.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery/ui.dropdownchecklist.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#s5\").dropdownchecklist({firstItemChecksAll: true, maxDropHeight: 200});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\" >Welcome To InquiryHere.com</h1>\n");
      out.write("    <b1><h1 align=\"center\" >Select Your Interests</h1></b1>\n");
      out.write("    <center><form action=\"save_completeprofile1.jsp\" method=\"get\" name=\"dropdown_selection\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <select id=\"s5\" multiple=\"multiple\" name=\"dropdown_selection\" >\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            ");

                                Statement stmt;
                                Connection con;
                                ResultSet rs;
                                String TopicName;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                                    stmt = con.createStatement();
                                    String v = "SELECT * FROM topic";
                                    rs = stmt.executeQuery(v);
                                    while (rs.next()) {
                                        TopicName = rs.getString("topic_name");
                                        out.println("<option>" + TopicName + "</option>");
                                    }
                                    stmt.close();
                                    con.close();

                                } catch (Exception e) {
                                    out.println(e.getMessage());
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form><p><b>Note</b> If you are using desktop browser then press CTRL and select Interests</p></center>\n");
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
