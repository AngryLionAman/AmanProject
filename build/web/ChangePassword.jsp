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
                    <form class="login100-form validate-form flex-sb flex-w" name="login" action="ChangePassword.jsp">

                        <div class="p-t-31 p-b-9">
                            <span class="txt1">
                                Enter new password
                            </span>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="Password" required>
                            <span class="focus-input100"></span>
                        </div>
                         <div class="p-t-31 p-b-9">
                            <span class="txt1">
                                Confirm your password
                            </span>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="RePassword" required>
                            <span class="focus-input100"></span>
                        </div>

                        <div class="container-login100-form-btn m-t-17">
                            <button class="login100-form-btn">
                                Change PassWord
                            </button>
                        </div>
                    </form>

                    <%@page language="java"%>
                    <%@page import="java.sql.*"%>
                    <%
                        String UserEmail = (String) session.getAttribute("email");
                        out.println(UserEmail);
                        String RePassword = request.getParameter("RePassword");
                        out.println(RePassword);
                        if (RePassword != null && UserEmail != null) {
                            Connection con;
                            PreparedStatement ps = null;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                                String UpdateQuiry = "update newuser set password = '" + RePassword + "' where email = '" + UserEmail + "'";
                                ps = con.prepareStatement(UpdateQuiry);
                                ps.executeUpdate();
                                con.close();
                                ps.close();
                                out.println("Database has been successfull updated");
                                %><script>window.alert("Your Password has been changed, Just you need to Login again");
                                          window.location="http://localhost:8081/Bharat.com/Login%20Form/Logout.jsp";</script><%
                                //response.sendRedirect("Logout.jsp");
                            } catch (Exception e) {
                                out.println("Error : "+e);
                            }
                        }

                    %>
                </div>
            </div>
        </div>
    </body>
</html>
