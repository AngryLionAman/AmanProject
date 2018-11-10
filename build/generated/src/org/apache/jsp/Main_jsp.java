package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\"><head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <!-- For IE -->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- For Resposive Device -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <title>InquiryHere.com</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <!-- responsive style sheet -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/responsive.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-page-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Header _________________________________ -->\n");
      out.write("            <header class=\"home-page\">\n");
      out.write("                <div class=\"container clear-fix\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\" style=\"padding-left:0px;\">\n");
      out.write("                        <div class=\"logo float-left\">\n");
      out.write("                            <a href=\"#\" style=\"vertical-align:middle;\">\n");
      out.write("                                <h4>\n");
      out.write("                                    <div class=\"logotext\">\n");
      out.write("                                        Inquiryhere.com\n");
      out.write("                                        <div>\n");
      out.write("                                            <!-- <img src=\"images/logo/logo.png\" style=\"width:150px;\"> -->\n");
      out.write("                                            </h4>\n");
      out.write("                                            </a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12 serachhere\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Search here\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-lg-2 col-md-2 col-sm-12 col-xs-12 float-right textalign-right\">\n");
      out.write("\n");
      out.write("                                        <a  href=\"ProfilePage.html\"><img src=\"images/home/modify.png\" class=\"helpicon\"/></a>\n");
      out.write("                                        <a><img src=\"images/home/HelpIcon.png\" class=\"helpicon\"/></a>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-1 col-md-1 col-sm-12 col-xs-12 float-right textalign-right\">\n");
      out.write("                                        \n");
      out.write("                                         \n");
      out.write("                                        ");

                                            String name = null;
                                            int id_of_user = 0;
                                            int topic_id = 0;
                                            String email = (String) session.getAttribute("email");
                                            if (email == null) {
                                        
      out.write("<select class=\"helpicon w100 username\" onchange=\"location = this.value;\">\n");
      out.write("                                            <option value=\"index.jsp\">LogIn</option>\n");
      out.write("                                            <option value=\"index.jsp\">LogIn</option>\n");
      out.write("                                            <option value=\"AboutUs.html\">About us</option>\n");
      out.write("                                            <option value=\"ContactUs.jsp\">Contact Us</option>\n");
      out.write("                                            <option value=\"disclaimer.jsp\">Disclaimer</option>\n");
      out.write("                                            <option value=\"privacyAndPolicy.jsp\">privacy and policy</option>\n");
      out.write("                                            \n");
      out.write("                                        </select>");

                                        } else {

                                            Statement stmt;
                                            Connection con;
                                            ResultSet rs;
                                            // String name = null;
                                            //int id_of_user = 0;

                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                                                stmt = con.createStatement();
                                                String p = "SELECT * FROM newuser WHERE email = '" + email + "'";
                                                rs = stmt.executeQuery(p);
                                                while (rs.next()) {
                                                    id_of_user = rs.getInt("id");
                                                    name = rs.getString("firstname");
                                                }
                                                stmt.close();
                                                con.close();
                                            } catch (Exception e) {
                                                out.println("Unable to retrieve!!" + e);
                                            }
                                        
      out.write("\n");
      out.write("                                        <select class=\"helpicon w100 username\" onchange=\"location = this.value;\">\n");
      out.write("                                            <option value=\"Main.jsp\">");
      out.print(name);
      out.write("</option>\n");
      out.write("                                            <option value=\"profile.jsp\">Profile</option>\n");
      out.write("                                            <option value=\"Test4\">Setting</option>\n");
      out.write("                                            <option value=\"AboutUs.html\">About us</option>\n");
      out.write("                                            <option value=\"ContactUs.jsp\">Contact Us</option>\n");
      out.write("                                            <option value=\"disclaimer.jsp\">Disclaimer</option>\n");
      out.write("                                            <option value=\"privacyAndPolicy.jsp\">privacy and policy</option>\n");
      out.write("                                            <option value=\"Logout.jsp\">Logout</option>\n");
      out.write("                                        </select>");

                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    </header>\n");
      out.write("                                    <div class=\"clear-fix\"></div>\n");
      out.write("                                    <div class=\"bodydata\">\n");
      out.write("                                        <div class=\"container clear-fix\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                                                    ");

                                                        if (session.getAttribute("email") != null) {
                                                    
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"themeBox\" style=\"height:auto;\">\n");
      out.write("                                                        <div class=\"boxHeading\" >\n");
      out.write("                                                            Followed Topic\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        ");

                                                            Statement stmt_fetch_topic;
                                                            Connection con_fetch_topic;
                                                            ResultSet rs_fetch_topic;
                                                            String topic_name;
                                                            try {

                                                                Class.forName("com.mysql.jdbc.Driver");
                                                                con_fetch_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                                                                stmt_fetch_topic = con_fetch_topic.createStatement();
                                                                String p_fetch_topic = "select t.unique_id,t.topic_name from topic t "
                                                                        + "right join topic_followers_detail de "
                                                                        + "on t.unique_id = de.topic_id "
                                                                        + "where user_or_followers_id= '" + id_of_user + "'";
                                                                rs_fetch_topic = stmt_fetch_topic.executeQuery(p_fetch_topic);
                                                                while (rs_fetch_topic.next()) {
                                                                    topic_name = rs_fetch_topic.getString("topic_name");
                                                                    topic_id = rs_fetch_topic.getInt("unique_id");
      out.write("\n");
      out.write("                                                        <li>[");
      out.print(topic_id);
      out.write("] <a href=\"topic_detail.jsp?topic_id=");
      out.print(topic_id);
      out.write('"');
      out.write('>');
      out.print(topic_name);
      out.write("</a></li>\n");
      out.write("                                                            ");
 }
                                                                    rs_fetch_topic.close();
                                                                    stmt_fetch_topic.close();
                                                                    con_fetch_topic.close();
                                                                } catch (Exception e) {
                                                                    out.println("Unable to retrieve!!" + e);
                                                                }
                                                            
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>  ");
 } 
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("                                                    <div class=\"themeBox\" style=\"height:auto;\">\n");
      out.write("                                                        <div class=\"boxHeading\">\n");
      out.write("                                                            Trending Topic\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div>\n");
      out.write("                                                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TrendingTopic.jsp", out, false);
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                                            <div class=\"themeBox\" style=\"height:200px;\">\n");
      out.write("                                                                <div class=\"boxHeading\">\n");
      out.write("                                                                    Post Something\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div><textarea type=\"text\" class=\"anstext\" placeholder=\"Post something here\"></textarea></div>\n");
      out.write("\n");
      out.write("                                                                <div class=\"float-right margintop20\" style=\"vertical-align:bottom\">\n");
      out.write("                                                                    <button type=\"button\" class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">POST</button>\n");
      out.write("                                                                    <!-- btn-info btn-lg -->\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"clear-fix\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\n");
      out.write("                                                            ");

                                                                if (session.getAttribute("email") != null) {
                                                                    out.println("Related Questions up");

                                                            
      out.write("\n");
      out.write("                                                            ");
  Statement stmt1, stmt2 = null;
                                                                Connection con1;
                                                                ResultSet rs1, rs2;
                                                                String name1 = null;
                                                                String question, fname = null;
                                                                int ide = 0;

                                                                try {

                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                                                                    stmt1 = con1.createStatement();
                                                                    String q = "select DISTINCT q.id,q.q_id,q.question from question q right join question_topic_tag qtt on q.q_id = qtt.question_id where tag_id IN (select t.unique_id from topic t right join topic_followers_detail de on t.unique_id = de.topic_id where user_or_followers_id= '" + id_of_user + "')";
                                                                    rs1 = stmt1.executeQuery(q);
                                                                    while (rs1.next()) {
                                                                        question = rs1.getString("question");
                                                                        ide = rs1.getInt("id");
                                                                        stmt2 = con1.createStatement();
                                                                        String T = "SELECT firstname FROM newuser WHERE id='" + ide + "' ";
                                                                        rs2 = stmt2.executeQuery(T);
                                                                        while (rs2.next()) {
                                                                            fname = rs2.getString("firstname");
                                                                            //out.println(fname);
                                                                        }

                                                            
      out.write("\n");
      out.write("                                                            <div class=\"themeBox\" style=\"height:100px;\">\n");
      out.write("\n");
      out.write("                                                                <div class=\"boxHeading marginbot10\">\n");
      out.write("                                                                    Ques : <a href=\"Answer.jsp?Id=");
      out.print(rs1.getString("question"));
      out.write("\" >");
      out.print(question);
      out.write(" ?</a>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"questionArea\">\n");
      out.write("\n");
      out.write("                                                                    <div class=\"postedBy\">Posted By : ");
      out.print(fname);
      out.write("</div>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            ");
               }
                                                                    stmt1.close();
                                                                    stmt2.close();
                                                                    con1.close();
                                                                } catch (Exception e) {
                                                                    out.println("<br>Error Two :" + e);
                                                                }
                                                            } else {
                                                            
      out.write("\n");
      out.write("                                                            <h4>Trending Question</h4>\n");
      out.write("                                                            ");

                                                                Statement Trending_stmt;
                                                                Connection Trending_con;
                                                                ResultSet Trending_rs;
                                                                String UserName_for_trending_question = null;
                                                                try {
                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    Trending_con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                                                                    Trending_stmt = Trending_con.createStatement();
                                                                    String v_count = "SELECT * FROM question ORDER BY TotalLiked DESC limit 10;";
                                                                    Trending_rs = Trending_stmt.executeQuery(v_count);
                                                                    while (Trending_rs.next()) {
                                                                        String TrendingQuestion = Trending_rs.getString("question");
                                                                        int TotalFollowers = Trending_rs.getInt("TotalLiked");
                                                                        int id_for_user_name = Trending_rs.getInt("id");
                                                                        Statement Trending_stmt_for_name = Trending_con.createStatement();;
                                                                        ResultSet Trending_rs_for_name;
                                                                        String T = "SELECT firstname FROM newuser WHERE id='" + id_for_user_name + "' ";
                                                                        Trending_rs_for_name = Trending_stmt_for_name.executeQuery(T);
                                                                        while (Trending_rs_for_name.next()) {
                                                                            UserName_for_trending_question = Trending_rs_for_name.getString("firstname");
                                                                            //out.println(fname);
                                                                        }
                                                                        Trending_stmt_for_name.close();
                                                                        Trending_rs_for_name.close();

      out.write("\n");
      out.write("                                                            <div class=\"themeBox\" style=\"height:auto;\">\n");
      out.write("\n");
      out.write("                                                                <div class=\"boxHeading marginbot10\">\n");
      out.write("                                                                    Ques : <a href=\"Answer.jsp?Id=");
      out.print(TrendingQuestion);
      out.write("\" >");
      out.print(TrendingQuestion);
      out.write(" ?</a>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"questionArea\">\n");
      out.write("\n");
      out.write("                                                                    <div class=\"postedBy\">Posted By : ");
      out.print(UserName_for_trending_question);
      out.write("</div>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                            </div>");

                                                                    }

                                                                    Trending_stmt.close();
                                                                    Trending_rs.close();
                                                                    Trending_con.close();
                                                                } catch (Exception e) {
                                                                    out.println("Error " + e);
                                                                }
                                                            
      out.write(' ');

                                                                }
      out.write("\n");
      out.write("                                                            <div class=\"clear-fix\"></div>\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                                                    ");

                                                        if (session.getAttribute("email") != null) {
                                                    
      out.write("\n");
      out.write("                                                    <div class=\"themeBox\" style=\"height:330px;\">\n");
      out.write("                                                        <div class=\"boxHeading\">\n");
      out.write("                                                            Complete Your Profile\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompleteUserProfile.jsp", out, false);
      out.write("</div>\n");
      out.write("\n");
      out.write("                                                    </div>");
 }
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("                                                    ");

                                                        if (session.getAttribute("email") != null) {
                                                    
      out.write("\n");
      out.write("                                                    <div class=\"themeBox\" style=\"height:400px;\">\n");
      out.write("                                                        <div class=\"boxHeading\">\n");
      out.write("                                                            Trending Question\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div>\n");
      out.write("                                                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TrendingQuestion.jsp", out, false);
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>");
 }
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"clear-fix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clear-fix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clear-fix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clear-fix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clear-fix\"></div>\n");
      out.write("\n");
      out.write("                                    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                            <!-- Modal content-->\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                                    <h4 class=\"modal-title\">Post Your Question Here</h4>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-body\">\n");
      out.write("                                                    <div>\n");
      out.write("                                                        <div>Your Question Here</div>\n");
      out.write("                                                        <textarea type=\"text\" class=\"anstext\" placeholder=\"Question\"></textarea></div>\n");
      out.write("                                                    <div class=\"margintop20\">\n");
      out.write("                                                        <div>Your Tag Here</div>\n");
      out.write("                                                        <textarea type=\"text\" class=\"anstext\" placeholder=\"Tag\"></textarea></div>\n");
      out.write("                                                    <!-- <p>Some text in the modal.</p> -->\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-footer\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn\">Post</button>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!-- Footer ______________________________ -->\n");
      out.write("                                    <!--<footer>\n");
      out.write("                                            \n");
      out.write("                                                    \n");
      out.write("                                                            <div class=\"container\">\n");
      out.write("                                                                    <div class=\"clear-fix\">\n");
      out.write("                                                                                    \n");
      out.write("                                                                            <div class=\"row \">\n");
      out.write("                                                                            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                                                            <div class=\"float-right reserved\">\n");
      out.write("                                                                            All Rights Reserved\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                    </div> \n");
      out.write("                                                            </div>                \n");
      out.write("                                    </footer>-->\n");
      out.write("                                    <!-- Js File_________________________________ -->\n");
      out.write("                                    <!-- j Query -->\n");
      out.write("                                    <script type=\"text/javascript\" src=\"vendor/jquery-2.1.4.js\"></script>\n");
      out.write("                                    <!-- Bootstrap JS -->\n");
      out.write("                                    <script type=\"text/javascript\" src=\"vendor/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("                                    <!-- Bootstrap Select JS -->\n");
      out.write("                                    <script type=\"text/javascript\" src=\"vendor/bootstrap-select/dist/js/bootstrap-select.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!-- Theme js -->\n");
      out.write("                                    <!-- <script type=\"text/javascript\" src=\"js/theme.js\"></script> -->\n");
      out.write("\n");
      out.write("                                    </div> <!-- /.main-page-wrapper -->\n");
      out.write("\n");
      out.write("                                    </body></html>");
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
