package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class TrendingQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    Statement Trending_stmt;
    Connection Trending_con;
    ResultSet Trending_rs;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Trending_con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        Trending_stmt = Trending_con.createStatement();
        String v_count = "SELECT * FROM question ORDER BY TotalLiked DESC limit 10;";
        Trending_rs = Trending_stmt.executeQuery(v_count);
        while (Trending_rs.next()) {
            String TrendingQuestion = Trending_rs.getString("question");
            int TotalFollowers = Trending_rs.getInt("TotalLiked");
            out.println(TrendingQuestion+" ("+TotalFollowers+")</br>");
               }

        Trending_stmt.close();
        Trending_rs.close();
        Trending_con.close();
    } catch (Exception e) {
        out.println("Error " + e);
    }

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
