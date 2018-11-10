package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class topic_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bharat.com</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            .city {display:none}\n");
      out.write("            .dropbtn {\n");
      out.write("                background-color: #3498DB;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropbtn:hover, .dropbtn:focus {\n");
      out.write("                background-color: #2980B9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                min-width: 160px;\n");
      out.write("                overflow: auto;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown a:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            .show {display: block;}\n");
      out.write("            body {\n");
      out.write("                font-family: Arial;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form.example input[type=text] {\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                border: 1px solid grey;\n");
      out.write("                float: left;\n");
      out.write("                width: 80%;\n");
      out.write("                background: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form.example button {\n");
      out.write("                float: left;\n");
      out.write("                width: 20%;\n");
      out.write("                padding: 10px;\n");
      out.write("                background: #2196F3;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 17px;\n");
      out.write("                border: 1px solid grey;\n");
      out.write("                border-left: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form.example button:hover {\n");
      out.write("                background: #0b7dda;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form.example::after {\n");
      out.write("                content: \"\";\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("            .div1 {\n");
      out.write("                width: 650px;\n");
      out.write("                height: 100px;\n");
      out.write("                border: 1px solid blue;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .div2 {\n");
      out.write("                width: 650px;\n");
      out.write("                height: 100px;    \n");
      out.write("                padding: 50px;\n");
      out.write("                border: 1px solid red;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            ul.a {\n");
      out.write("                list-style-type: circle;\n");
      out.write("            }\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Style the header */\n");
      out.write("            .header {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the top navigation bar */\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the topnav links */\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change color on hover */\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create three unequal columns that floats next to each other */\n");
      out.write("            .column {\n");
      out.write("                float: left;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Left and right column */\n");
      out.write("            .column.side {\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Middle column */\n");
      out.write("            .column.middle {\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Clear floats after the columns */\n");
      out.write("            .row:after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Responsive layout - makes the three columns stack on top of each other instead of next to each other */\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .column.side, .column.middle {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 5px;\n");
      out.write("                text-align: left;    \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function take_value(question_id, id_of_user) {\n");
      out.write("                //document.getElementById(\"demo\").innerHTML = \"Welcome\" + firstname+lastname;\n");
      out.write("\n");
      out.write("                var http = new XMLHttpRequest();\n");
      out.write("                http.open(\"POST\", \"http://localhost:8081/Bharat.com/Login%20Form/like_count.jsp?val=\" + question_id + \"&val2=\" + id_of_user, true);\n");
      out.write("                http.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                http.send();\n");
      out.write("\n");
      out.write("                http.onload = function () {\n");
      out.write("                    http.responseText;\n");
      out.write("                    //alert(http.responseText);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            document.getElementsByClassName(\"tablink\")[0].click();\n");
      out.write("\n");
      out.write("            function openCity(evt, cityName) {\n");
      out.write("                var i, x, tablinks;\n");
      out.write("                x = document.getElementsByClassName(\"city\");\n");
      out.write("                for (i = 0; i < x.length; i++) {\n");
      out.write("                    x[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                tablinks = document.getElementsByClassName(\"tablink\");\n");
      out.write("                for (i = 0; i < x.length; i++) {\n");
      out.write("                    tablinks[i].classList.remove(\"w3-light-grey\");\n");
      out.write("                }\n");
      out.write("                document.getElementById(cityName).style.display = \"block\";\n");
      out.write("                evt.currentTarget.classList.add(\"w3-light-grey\");\n");
      out.write("            }\n");
      out.write("            /* When the user clicks on the button, \n");
      out.write("             toggle between hiding and showing the dropdown content */\n");
      out.write("            function myFunction() {\n");
      out.write("                document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Close the dropdown if the user clicks outside of it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (!event.target.matches('.dropbtn')) {\n");
      out.write("\n");
      out.write("                    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("                    var i;\n");
      out.write("                    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("                        var openDropdown = dropdowns[i];\n");
      out.write("                        if (openDropdown.classList.contains('show')) {\n");
      out.write("                            openDropdown.classList.remove('show');\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Bharat.com</h1>\n");
      out.write("            <p>As place to share knowladge and batter understand the world.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a href=\"Main.jsp\">Home</a>\n");
      out.write("            <a href=\"#\">Ansewer</a>\n");
      out.write("            <a href=\"#\">Nodification</a>\n");
      out.write("\n");
      out.write("            <form class=\"example\" action=\"action_page.jsp\" style=\"margin:auto;max-width:300px\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search..\" name=\"search2\">\n");
      out.write("                <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("            <button onclick=\"myFunction()\" class=\"dropbtn\">Dropdown</button>\n");
      out.write("            <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("                <a href=\"UserProfile.jsp\">Profile</a>\n");
      out.write("                <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("                <a href=\"#about\">Blog</a>\n");
      out.write("                <a href=\"#contact\">Message</a>\n");
      out.write("                <a href=\"#contact\">your Content</a>\n");
      out.write("                <a href=\"#contact\">Stats</a>\n");
      out.write("                <a href=\"#contact\">Settings</a>\n");
      out.write("                <a href=\"#contact\">Help</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"column side\">\n");
      out.write("                <h2>Followed Topic</h2>\n");
      out.write("\n");
      out.write("                <ul class=\"a\">\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    ");

                        String email = (String) session.getAttribute("email");
                        Statement stmt;
                        Connection con;
                        ResultSet rs;
                        String name = null;
                        int id_of_user = 0;

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
                            out.println("Unable to retrieve!!");
                        }
                    
      out.write("\n");
      out.write("                    ");

                        Statement stmt_fetch_topic;
                        Connection con_fetch_topic;
                        ResultSet rs_fetch_topic;
                        String topic_name;
                        int topic_id = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            con_fetch_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                            stmt_fetch_topic = con_fetch_topic.createStatement();
                            String p_fetch_topic = "select t.unique_id,t.topic_name from "
                                    + "topic t right join topic_followers_detail de "
                                    + "on t.unique_id = de.topic_id where user_or_followers_id= '" + id_of_user + "'";
                            rs_fetch_topic = stmt_fetch_topic.executeQuery(p_fetch_topic);
                            while (rs_fetch_topic.next()) {
                                topic_name = rs_fetch_topic.getString("topic_name");
                                topic_id = rs_fetch_topic.getInt("unique_id");
                    
      out.write("\n");
      out.write("                    <li>");
      out.print(topic_id);
      out.write("<a href=\"topic_detail.jsp?topic_id=");
      out.print(topic_id);
      out.write('"');
      out.write('>');
      out.print(topic_name);
      out.write("</a></li>\n");
      out.write("                        ");

                                }
                                stmt_fetch_topic.close();
                                con_fetch_topic.close();
                            } catch (Exception e) {
                                out.println("Unable to retrieve!!" + e);
                            }
                        
      out.write("\n");
      out.write("                    <a href=\"\"><li>This is for Example</li></a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column middle\">        \n");
      out.write("                <h2>Welcome ");
      out.print(name);
      out.write("</h2>\n");
      out.write("\n");
      out.write("                <b>-------------Question----------------</b>\n");
      out.write("                ");

                    String topic_id_fetch = request.getParameter("topic_id");
                    out.println(topic_id_fetch);
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
                        String q = "select q.id,q.question,q.q_id from question q right join question_topic_tag qtt on qtt.question_id=q.q_id where tag_id='" + topic_id_fetch + "'";
                        rs1 = stmt1.executeQuery(q);
                        while (rs1.next()) {
                            question = rs1.getString("question");
                            ide = rs1.getInt("id");
                            int question_id = rs1.getInt("q_id");
                            stmt2 = con1.createStatement();
                            String T = "SELECT firstname FROM newuser WHERE id='" + ide + "' ";
                            rs2 = stmt2.executeQuery(T);
                            while (rs2.next()) {
                                fname = rs2.getString("firstname");
                                out.println("<div class=div1>");
                                out.println(question);
                                out.println("&nbsp;");
                                out.println("BY");
                                out.println("&nbsp;");
                                out.println(fname);
                                out.println("<br>");
                                out.println("<br>");
                                out.println("<br>");
                                out.println("&nbsp;");
                
      out.write("\n");
      out.write("                <b><a href=\"Answer.jsp?Id=");
      out.print(rs1.getString("question"));
      out.write("\" >Answer</a></b>\n");
      out.write("                ");

                    out.println("&nbsp;&nbsp;");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    Statement stmt_count;
                    Connection con_count;
                    ResultSet rs_count;
                    int count_var = 0;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con_count = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                        stmt_count = con_count.createStatement();
                        String v_count = "select count(*) from like_count where Ans_id='" + question_id + "'";
                        rs_count = stmt_count.executeQuery(v_count);
                        while (rs_count.next()) {
                            count_var = rs_count.getInt("count(*)");
                        }

                        stmt_count.close();
                        con_count.close();
                    } catch (Exception e) {
                        out.println("Error One : " + e);
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <button onclick=\"take_value('");
      out.print(question_id);
      out.write("', '");
      out.print(id_of_user);
      out.write("')\">UpVote[");
      out.print(count_var);
      out.write("]</button><p id=\"demo\"></p>\n");
      out.write("                ");
 out.println("&nbsp;&nbsp;");
                                out.println("</div>");

                            }
                        }

                        stmt1.close();
                        stmt2.close();
                        con1.close();
                    } catch (Exception e) {
                        out.println("<br><b>Question Not Found...</b>" + e);
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column side\">\n");
      out.write("                <h2>Related Topic</h2>\n");
      out.write("                ");

                    Statement stmt_related_topic;
                    Connection con_related_topic;
                    ResultSet rs_related_topic;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con_related_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                        stmt_related_topic = con_related_topic.createStatement();
                        String p_related_topic = "select DISTINCT "
                                + "t.unique_id,t.topic_name from topic t "
                                + "right join question_topic_tag qtt "
                                + "on t.unique_id=qtt.tag_id where question_id "
                                + "IN (select question_id from question_topic_tag where tag_id='" + topic_id_fetch + "')";
                        rs_related_topic = stmt_related_topic.executeQuery(p_related_topic);
                
      out.write("<ul class=\"a\">");

                    while (rs_related_topic.next()) {
                         int unique_id = rs_related_topic.getInt("unique_id");
                         String topic_nameA = rs_related_topic.getString("topic_name");
                    
      out.write("<a href=\"\"><li>");
      out.print(topic_nameA);
      out.write("</li></a>");

                                
                            }
                            out.println("</ul>");
                            stmt_related_topic.close();
                            con_related_topic.close();
                        } catch (Exception e) {
                            out.println("Unable to retrieve!!" + e);
                        }
                            
      out.write("    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
