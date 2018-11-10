<%@page import="javax.mail.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="javax.mail.BodyPart"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Multipart"%>
<%@page import="javax.mail.Session" %>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.AddressException"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeBodyPart"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.internet.MimeMultipart"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bharat.com</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/bg-01.jpg');">
                <div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
                    <form class="login100-form validate-form flex-sb flex-w" name="login" action="forget_password.jsp">

                        <div class="p-t-31 p-b-9">
                            <span class="txt1">
                                Email Your Mail, A OTP will send to your Mail
                            </span>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Username is required">
                            <input class="input100" type="text" name="email" >
                            <span class="focus-input100"></span>
                        </div>

                        <div class="container-login100-form-btn m-t-17">
                            <button class="login100-form-btn">
                                Send OTP
                            </button>
                        </div>
                    </form>
                    
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    String UserEmail = request.getParameter("email");
    if (UserEmail != null) {

        Statement stmt;
        Connection con;
        ResultSet rs;
        String StoredEmail = null, FirstName = null;
        String UserPassword = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
            stmt = con.createStatement();
            String v = "select email,firstname,password from newuser where email = '" + UserEmail + "'";
            rs = stmt.executeQuery(v);

            int i = 0;
            while (rs.next()) {
                StoredEmail = rs.getString("email");
                FirstName = rs.getString("firstname");
                UserPassword = rs.getString("password");
                if (StoredEmail.equals(UserEmail)) {
                    i = 1;
                }
            }

            stmt.close();
            con.close();
            if (i == 1) {
              //  out.println("Email Found" + StoredEmail + " UserName :" + FirstName);

                String mailid;
                String subject;
                String feedback;
                String froma;
                String password;
                String to;

                mailid = UserEmail;
                subject = "Reset Password of inquiryhere.com";
                feedback = "Your InquryHere password is : " + UserPassword + "<br>Thanks for using our service";
                froma = "cse13302.sbit@gmail.com";
                password = "alok@ankit";

                to = mailid;

                if (mailid == null || password == null || feedback == null) {
                    out.println("ENTER THE ALL FIELDS");
                } else {
                    Properties props = System.getProperties();
                    props.put("mail.smtp.starttls.enable", true);
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.user", froma);
                    props.put("mail.smtp.password", password);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", true);
                    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
                    Session sess = Session.getInstance(props, null);
                    MimeMessage message = new MimeMessage(sess);
                    // out.println("Port: " + sess.getProperty("mail.smtp.port"));
                    try {
                        InternetAddress from = new InternetAddress(froma);
                        message.setSubject(subject);
                        message.setFrom(from);
                        message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                        Multipart multipart = new MimeMultipart("alternative");
                        BodyPart messageBodyPart = new MimeBodyPart();
                        messageBodyPart.setText("some text to send");
                        multipart.addBodyPart(messageBodyPart);
                        messageBodyPart = new MimeBodyPart();
                        String htmlMessage = feedback;

                        messageBodyPart.setContent(htmlMessage, "text/html");

                        //out.println("<br>" + messageBodyPart);
                        multipart.addBodyPart(messageBodyPart);

                        message.setContent(multipart);
                        Transport transport = sess.getTransport("smtp");
                        transport.connect("smtp.gmail.com", froma, password);
                        //out.println("<br>Transport: " + transport.toString());

                        transport.sendMessage(message, message.getAllRecipients());
                        //out.println("Mail has been sent");%>
                        <script>window.alert("Password has been sent to your Mail");
                                window.location="http://localhost:8081/Bharat.com/Login%20Form/Logout.jsp";</script>
                        <% 
                            out.println("<b><a href=Login.html>Click here to visit Login page</a></b>");
                    //response.sendRedirect("Login.html");
                    } catch (Exception e) {
                        out.println("<br>Error:" + e);
                    }
                }

            } else {
                out.println("Email not found");
            }
            //response.sendRedirect("unvalid.html"); 
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }

%>
                </div>
            </div>
        </div>
    </body>
</html>
