
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
            Statement st1;

            Connection cn;
            ResultSet rs;

            String firstname, lastname, password, email;

            firstname = request.getParameter("firstname");
            lastname = request.getParameter("lastname");
            email = request.getParameter("email");
            password = request.getParameter("password");
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
        %>

    </body>
</html>
