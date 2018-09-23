package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
 //Printing All User name
    //String email=(String)session.getAttribute("email");
 Statement stmt_un;
 Connection con_un;
 ResultSet rs_un;
 String firstname,lastname,interest;
 //int id=0;       

 try {
         
     Class.forName("com.mysql.jdbc.Driver");
     con_un = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
            
     stmt_un = con_un.createStatement();
         
     String p_un =  "SELECT * FROM newuser";
     rs_un = stmt_un.executeQuery(p_un);
     out.print("<table>");
     out.print("<tr>");
     out.print("<td>Name</td>");
     out.print("<td>Interent</td>");
     out.print("<tr>");
             while (rs_un.next()) {
                          firstname = rs_un.getString("firstname");
                          lastname = rs_un.getString("lastname");
                          interest = rs_un.getString("interest");
                          out.print("<tr>");
                          out.print("<td>"+firstname+""+lastname+"</td>");
                          out.print("<td>"+interest+"</td>");
                          out.print("<tr>");
                          
             }
     out.print("</table>");

 stmt_un.close();
 con_un.close();
              } 
        catch (Exception e) {
            System.out.println("Unable to retrieve!!");
        } 
  //End printing All user name   
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
