package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Topic_005fFollow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Bharat.com</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write(".city {display:none}\n");
      out.write(".dropbtn {\n");
      out.write("    background-color: #3498DB;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropbtn:hover, .dropbtn:focus {\n");
      out.write("    background-color: #2980B9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    min-width: 160px;\n");
      out.write("    overflow: auto;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown a:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write(".show {display: block;}\n");
      out.write("body {\n");
      out.write("    font-family: Arial;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example input[type=text] {\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 17px;\n");
      out.write("    border: 1px solid grey;\n");
      out.write("    float: left;\n");
      out.write("    width: 80%;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button {\n");
      out.write("    float: left;\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 10px;\n");
      out.write("    background: #2196F3;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 17px;\n");
      out.write("    border: 1px solid grey;\n");
      out.write("    border-left: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button:hover {\n");
      out.write("    background: #0b7dda;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write(".div1 {\n");
      out.write("    width: 650px;\n");
      out.write("    height: 100px;\n");
      out.write("    border: 1px solid blue;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".div2 {\n");
      out.write("    width: 650px;\n");
      out.write("    height: 100px;    \n");
      out.write("    padding: 50px;\n");
      out.write("    border: 1px solid red;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("ul.a {\n");
      out.write("    list-style-type: circle;\n");
      out.write("}\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write(".header {\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the top navigation bar */\n");
      out.write(".topnav {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the topnav links */\n");
      out.write(".topnav a {\n");
      out.write("    float: left;\n");
      out.write("    display: block;\n");
      out.write("    color: #f2f2f2;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change color on hover */\n");
      out.write(".topnav a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create three unequal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("    float: left;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Left and right column */\n");
      out.write(".column.side {\n");
      out.write("    width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Middle column */\n");
      out.write(".column.middle {\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("    .column.side, .column.middle {\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("th, td {\n");
      out.write("    padding: 5px;\n");
      out.write("    text-align: left;    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("    function take_value(topic_id,id_of_user){\n");
      out.write("        //document.getElementById(\"demo\").innerHTML = \"Welcome\" + topic_id+id_of_user;\n");
      out.write("        \n");
      out.write("         var http = new XMLHttpRequest();\n");
      out.write("      http.open(\"POST\", \"http://localhost:8081/Bharat.com/Login%20Form/submit_follow_topic.jsp?val_topic=\"+topic_id+\"&val2_topic=\"+id_of_user, true);\n");
      out.write("      http.setRequestHeader(\"Content-type\",\"application/x-www-form-urlencoded\");\n");
      out.write("      http.send();\n");
      out.write("        \n");
      out.write("    http.onload = function() {\n");
      out.write("        http.responseText;\n");
      out.write("        http.responseText;\n");
      out.write("        //alert(http.responseText);\n");
      out.write("    }\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("document.getElementsByClassName(\"tablink\")[0].click();\n");
      out.write("\n");
      out.write("function openCity(evt, cityName) {\n");
      out.write("  var i, x, tablinks;\n");
      out.write("  x = document.getElementsByClassName(\"city\");\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    x[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("  tablinks = document.getElementsByClassName(\"tablink\");\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    tablinks[i].classList.remove(\"w3-light-grey\");\n");
      out.write("  }\n");
      out.write("  document.getElementById(cityName).style.display = \"block\";\n");
      out.write("  evt.currentTarget.classList.add(\"w3-light-grey\");\n");
      out.write("}\n");
      out.write("/* When the user clicks on the button, \n");
      out.write("toggle between hiding and showing the dropdown content */\n");
      out.write("function myFunction() {\n");
      out.write("    document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the dropdown if the user clicks outside of it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\n");
      out.write("\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("  <h1>Bharat.com</h1>\n");
      out.write("  <p>As place to share knowladge and batter understand the world.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a href=\"#\">Home</a>\n");
      out.write("  <a href=\"#\">Ansewer</a>\n");
      out.write("  <a href=\"#\">Nodification</a>\n");
      out.write("  \n");
      out.write("  <form class=\"example\" action=\"action_page.jsp\" style=\"margin:auto;max-width:300px\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"search2\">\n");
      out.write("   <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("<button onclick=\"myFunction()\" class=\"dropbtn\">Dropdown</button>\n");
      out.write("  <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("    <a href=\"UserProfile.jsp\">Profile</a>\n");
      out.write("    <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("    <a href=\"#about\">Blog</a>\n");
      out.write("    <a href=\"#contact\">Message</a>\n");
      out.write("\t<a href=\"#contact\">your Content</a>\n");
      out.write("\t<a href=\"#contact\">Stats</a>\n");
      out.write("\t<a href=\"#contact\">Settings</a>\n");
      out.write("\t<a href=\"#contact\">Help</a>\n");
      out.write("\t\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Feeds</h2>\n");
      out.write("    \n");
      out.write("\t<ul class=\"a\">\n");
      out.write("          <a href=\"\"><li>Top Stories</li></a>\n");
      out.write("           <a href=\"\"><li>Bookmarked Answered</li></a>\n");
      out.write("           <a href=\"\"><li>Links</li></a>\n");
      out.write("\t\t    <a href=\"\"><li>Topic You Choosen</li></a>\n");
      out.write("\t\t\t <a href=\"\"><li>Education</li></a>\n");
      out.write("\t\t\t  <a href=\"\"><li>Health</li></a>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column middle\">\n");
      out.write("\n");
      out.write(" \n");

    String email=(String)session.getAttribute("email");
 Statement stmt;
 Connection con;
 ResultSet rs;
 String name=null;
 int id_of_user=0;       

 try {
         
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
            
     stmt = con.createStatement();
         
     String p =  "SELECT * FROM newuser WHERE email = '"+email+"'";
     rs = stmt.executeQuery(p);
             while (rs.next()) {
              id_of_user=rs.getInt("id");
              name = rs.getString("firstname");
             }
 

      out.write("\n");
      out.write("          \n");
      out.write("<h2>Welcome ");
      out.print(name);
      out.write("</h2>\n");
      out.write("\n");

        //session.setAttribute("name", name);
 stmt.close();
            con.close();
              } 
        catch (Exception e) {
            out.println("Unable to retrieve!!"+e);
        } 
     
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("      ");

   
 Statement stmt_topic;
 Connection con_topic;
 ResultSet rs_topic;
 String name_topic;   

 try {
         
     Class.forName("com.mysql.jdbc.Driver");
     con_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
     
     stmt_topic = con_topic.createStatement();
     String p_topic =  "SELECT * FROM topic";
     rs_topic = stmt_topic.executeQuery(p_topic);
     
      
      
     
      out.write("\n");
      out.write("\n");
      out.write("     \n");
 int i = 1;
String Status=null;
             while (rs_topic.next()) {
              int topic_id = rs_topic.getInt("unique_id");
              name_topic=rs_topic.getString("topic_name");
              
              out.println("<br>"+topic_id);
               
      out.write("   \n");
      out.write("             <a href=topic_detail.jsp?");
      out.print(name_topic);
      out.write('>');
      out.print(name_topic);
      out.write("</a>\n");
      out.write("              ");

                  Statement stmt_topic_followers;
                  Connection con_topic_followers;
                  ResultSet rs_topic_followers;
                  stmt_topic_followers = con_topic.createStatement();
                  String topic_followers = "SELECT * FROM topic_followers_detail";
                  rs_topic_followers = stmt_topic_followers.executeQuery(topic_followers);
     
              while (rs_topic_followers.next()){
                  int f_topic_id = rs_topic_followers.getInt("topic_id");
                  int f_followers_id = rs_topic_followers.getInt("user_or_followers_id");
                  
                  if((f_topic_id == topic_id) && (f_followers_id == id_of_user )){
                      Status = "present";
                  }
              }
              
      out.write("\n");
      out.write("              ");

              if(Status == "present")
                        out.println("<td><button>Followed</button></td><br>");
            else{ 
      out.write("\n");
      out.write("                         <td><button onclick=\"take_value('");
      out.print(topic_id);
      out.write("','");
      out.print(id_of_user);
      out.write("')\">Follow</button><p id=\"demo\"></p></td>\n");
      out.write("              ");
 }
            Status=null;
              
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("             \n");
      out.write("             ");
 
             }
             
 stmt_topic.close();
 //stmt_topic_followers.close();
            con_topic.close();
              } 
        catch (Exception e) {
            out.println("Unable to retrieve!!="+e);
        } 
     
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Set up account</h2>\n");
      out.write("    <ul class=\"a\">\n");
      out.write("          <a href=\"\"><li>Visit your feed</li></a>\n");
      out.write("                  <a href=\"\"><li>Find Your friend on bharat.com</li></a>\n");
      out.write("\t\t    <a href=\"\"><li>Ask your first question</li></a>\n");
      out.write("\t\t\t <a href=\"\"><li>Answer a Question</li></a>\n");
      out.write("\t\t\t  <a href=\"\"><li>Update your profile</li></a>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</body>\n");
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
