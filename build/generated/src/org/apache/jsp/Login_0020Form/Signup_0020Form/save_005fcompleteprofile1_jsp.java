package org.apache.jsp.Login_0020Form.Signup_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class save_005fcompleteprofile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("    <center>You have selected: \n");
      out.write("        ");


            Statement st1, stmt;
            //PreparedStatement ps;
            Connection cn;
            ResultSet rs, rs1;

            try {
                String email = (String) session.getAttribute("email");
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                st1 = cn.createStatement();
                stmt = cn.createStatement();

                String v = "select ID from newuser where email='" + email + "'";
                rs1 = stmt.executeQuery(v);

                int user_id = 0;
                while (rs1.next()) {
                    user_id = rs1.getInt("ID");
                    //password1 = rs1.getString("password");

                }

                String[] interests = request.getParameterValues("dropdown_selection");
                String result = new String("");
                for (int i = 0; i < interests.length; i++) {
                    //result +=interests[i]+",";
                    String p = "insert into Interests(Interests_user_id,Interests_of_user) values('" + user_id + "','" + interests[i] + "') ";
                    st1.execute(p);
                }
                out.println(result);

                st1.close();
                stmt.close();
                cn.close();
                out.println("Recored has been successfully updated");
                response.sendRedirect("completeprofilelanguage.jsp");
            } catch (Exception e1) {
                out.print("Error:-" + e1);
            }
        
      out.write("\n");
      out.write("    </center>\n");
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
