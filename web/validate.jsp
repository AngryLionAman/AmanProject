<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    String email, password;
    email = request.getParameter("email");
    password = request.getParameter("password");
    if (email == null || password == null) {
        out.println("You can't this page directly");
        response.sendRedirect("Login.html");
    } else {
        Statement stmt;
        Connection con;
        ResultSet rs;
        String username1, password1, firstname;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
            stmt = con.createStatement();
            String v = "SELECT email,password FROM newuser WHERE email = '" + email + "'";
            rs = stmt.executeQuery(v);

            int i = 0;
            while (rs.next()) {
                username1 = rs.getString("email");
                password1 = rs.getString("password");
                if (password.equals(password1)) {
                    i = 1;
                }
            }

            stmt.close();
            con.close();
            if (i == 1) {
                session.setAttribute("email", email);
                response.sendRedirect("Main.jsp");
            } else {
                response.sendRedirect("Login.jsp?Error=NotFound");
            }
            //response.sendRedirect("unvalid.html"); 
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }
%>