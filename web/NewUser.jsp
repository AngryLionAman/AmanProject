
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%@page language="java"%>
        <%@page import="java.sql.*"%>
        <%
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
                    String v_check = "SELECT email FROM newuser WHERE email = '" + Email + "'";
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
        %>
        <p>This Email is already registered with InquiryHere.com</br>If you forgot your password then click <a href="forget_password.jsp">Here</a> to reset your password</p>
        <br><a href="Login.jsp">Click here to visit Login Pgge</a><br><a href="NewUser.html">Click here to visit SignUp form</a>
        <%
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
        %>


    </body>
</html>
