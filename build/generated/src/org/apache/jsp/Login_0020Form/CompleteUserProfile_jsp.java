package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CompleteUserProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      String email = (String) session.getAttribute("email");
                Statement stmt;
                Connection con;
                ResultSet rs;
                String firstname = null;
                String lastname = null;
                String interests = null;
                String higher_edu = null;
                String languages = null;
                String best_achievement = null;
                String age = null;
                String bio = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                    stmt = con.createStatement();
                    String v = "SELECT FROM newuser WHERE email = '" + email + "'";
                    rs = stmt.executeQuery(v);
                    while (rs.next()) {
                        firstname = rs.getString("firstname");
                        lastname = rs.getString("lastname");
                        interests = rs.getString("interests");
                        higher_edu = rs.getString("higher_edu");
                        languages = rs.getString("languages");
                        best_achievement = rs.getString("best_achievement");
                        age = rs.getString("age");
                        bio = rs.getString("bio");
                    }
                    stmt.close();
                    con.close();
                    out.println(firstname + " " + lastname);
                    out.println(email);
                    out.println(interests);
                    out.println(higher_edu);
                    out.println(languages);
                    out.println(best_achievement);
                    out.println(age);
                    out.println(bio);

                } catch (Exception e) {
                    out.println("Error" + e);
                }
        
      out.write("\n");
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
