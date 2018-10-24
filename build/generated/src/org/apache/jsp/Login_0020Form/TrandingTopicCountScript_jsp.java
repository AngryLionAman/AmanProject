package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class TrandingTopicCountScript_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Statement stmt_count, stmt_count_s;
    Connection con = null, con_count;
    ResultSet rs_count, rs_count_s;
    int count_var = 0;
    int TotalCountOfTopic = 0;
    int TopicId = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con_count = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        stmt_count = con_count.createStatement();
        String v_count = "select * from topic";
        rs_count = stmt_count.executeQuery(v_count);
        while (rs_count.next()) {
            TopicId = rs_count.getInt("unique_id");
            out.println("</br>" + TopicId);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
            stmt_count_s = con.createStatement();
            String v_count_s = "select count(*) user_or_followers_id from topic_followers_detail where topic_id='" + TopicId + "'";
            rs_count_s = stmt_count_s.executeQuery(v_count_s);
            while (rs_count_s.next()) {
                TotalCountOfTopic = rs_count_s.getInt("user_or_followers_id");
                out.println("<br>" + TotalCountOfTopic);
            }
            stmt_count_s.close();
            con.close();
        }

        stmt_count.close();
        con_count.close();
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
