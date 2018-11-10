package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.*;

public final class NewUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            String firstname, lastname, password, email;
            firstname = request.getParameter("firstname");
            lastname = request.getParameter("lastname");
            email = request.getParameter("email");
            password = request.getParameter("password");

            if (firstname == null || lastname == null || email == null || password == null) {
                out.println("you can't access this page direcitly");
            } else {
                Statement stmt_check;
                Connection con_check;
                ResultSet rs_check;
                String Email = request.getParameter("email");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con_check = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                    stmt_check = con_check.createStatement();
                    String v_check = "SELECT email ROM newuser WHERE email = '" + Email + "'";
                    rs_check = stmt_check.executeQuery(v_check);
                    int i = 0;
                    while (rs_check.next()) {
                        String Stored_email = rs_check.getString("email");
                        if (Stored_email.equals(Email)) {
                            i = 1;
                        }
                    }

                    stmt_check.close();
                    con_check.close();
                    if (i == 1) {
        
      out.write("\n");
      out.write("        <p>This Email is already registered with InquiryHere.com</br>If you forgot your password then click <a href=\"forget_password.jsp\">Here</a> to reset your password</p>\n");
      out.write("        <br><a href=\"Login.jsp\">Click here to visit Login Pgge</a><br><a href=\"NewUser.html\">Click here to visit SignUp form</a>\n");
      out.write("        ");

                    } else {
                        Statement st1;
                        Connection cn;
                        ResultSet rs;

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                            st1 = cn.createStatement();
                            String p = "insert into newuser(firstname,lastname,email,password) values('" + firstname + "','" + lastname + "','" + email + "','" + password + "')";
                            st1.execute(p);
                            st1.close();
                            cn.close();
                            session.setAttribute("email", email);
                            response.sendRedirect("completeprofile1.jsp");
                        } catch (Exception e1) {
                            out.print("Error:-" + e1);
                        }
                    }
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            }
        
      out.write("\n");
      out.write("\n");
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
