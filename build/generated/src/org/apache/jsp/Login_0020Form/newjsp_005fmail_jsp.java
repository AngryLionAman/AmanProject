package org.apache.jsp.Login_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;

public final class newjsp_005fmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("                                                                                                             \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">                                      \n");
      out.write("                                                                                                     \n");
      out.write("                                                                                                       \n");
      out.write("                                                                                                 \n");
      out.write("                                                                                        \n");
      out.write("                                                                                                       \n");
      out.write("                                                                                          \n");
      out.write("                                                                                      \n");
      out.write("                                                                                                     \n");
      out.write("<html>                                                                                                                                      \n");
      out.write("<head>                                                                                                                                      \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">                                                                    \n");
      out.write("<title>Email Test</title>                                                                                                                   \n");
      out.write("</head>                                                                                                                                     \n");
      out.write("<body>                                                                                                                                      \n");
                                                                                                                                          
String smtpServer = null;                                                                                                                   
String smtpPort = null;                                                                                                                     
final String authAddress = request.getParameter("infoabout.amankumar@gmail.com");                                                                                
final String authPassword = request.getParameter("alokankit");                                                                              
String subject = null;                                                                                                                      
String email = null;                                                                                                                        
String message = null;                                                                                                                      
String send = request.getParameter("send");                                                                                                 
String siteName=request.getServerName();                                                                                                    
siteName=siteName.replaceAll("www.","");                                                                                                    

if(send!=null){
        smtpServer = request.getParameter("smtp_server");
        smtpPort = request.getParameter("smtp_port");    
        subject = request.getParameter("subject");       
        email = request.getParameter("email");           
        message = request.getParameter("message");       
        try{                                             
                Properties props = new Properties();     
                props.put("mail.smtp.host", smtpServer);
                props.put("mail.smtp.port", smtpPort);   
            props.put("mail.smtp.auth", "true");         
                                                         
            // create some properties and get the default Session
            Session sessionMail = Session.getInstance(props, new Authenticator() {
                 public PasswordAuthentication getPasswordAuthentication() {     
                         return new PasswordAuthentication(authAddress, authPassword);
                 }                                                                   
                });                                                                  
                                                                                     
            sessionMail.setDebug(true);

            // create a message
            Message msg = new MimeMessage(sessionMail);

            // set the from and to address
            InternetAddress addressFrom = new InternetAddress(authAddress);
            msg.setFrom(addressFrom);

            InternetAddress[] addressTo = new InternetAddress[1];
            addressTo[0] = new InternetAddress(email);
            msg.setRecipients(Message.RecipientType.TO, addressTo);


            // Optional : You can also set your custom headers in the Email if you Want
            msg.addHeader("site", siteName);

            // Setting the Subject and Content Type
            msg.setSubject(subject);
            msg.setContent(message, "text/plain");
            Transport.send(msg);
        }catch(Exception e){
                e.printStackTrace(response.getWriter());
        }
}

      out.write("\n");
      out.write("<form name=\"emailForm\" action=\"email-test.jsp\" method=\"post\">\n");
      out.write("        SMTP Server: <input type=\"text\" name=\"smtp_server\" value=\"mail.");
out.print(siteName);
      out.write("\"><br>\n");
      out.write("        SMTP Port: <input type=\"text\" name=\"smtp_port\" value=\"2525\"><br>\n");
      out.write("        Username: <input type=\"text\" name=\"auth_add\" value=\"change_me@");
out.print(siteName);
      out.write("\"><br>\n");
      out.write("        Password: <input type=\"password\" name=\"auth_pass\"><br>\n");
      out.write("        Subject: <input type=\"text\" name=\"subject\" value=\"Test SMTP Server.\"><br>\n");
      out.write("        Recipient: <input type=\"text\" name=\"email\" value=\"\"><br>\n");
      out.write("        Message Body : <input type=\"text\" name=\"message\" value=\"Test\"><br>\n");
      out.write("        <input type=\"submit\" name=\"send\" value=\"send\">&nbsp;\n");
      out.write("        <input type=\"Reset\" name=\"reset\" value=\"reset\"><br>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html> ");
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
