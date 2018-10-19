<%@page language="java"%>
<%@page import="java.sql.*"%>
<html>
    <body>
    <center>You have selected: 
        <%

            Statement st1, stmt;
            //PreparedStatement ps;
            Connection cn;
            ResultSet rs, rs1;

            try {
                String email = (String) session.getAttribute("email");
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                st1 = cn.createStatement();
                stmt = cn.createStatement();

                String v = "select ID from newuser where email='" + email + "'";
                rs1 = stmt.executeQuery(v);

                int user_id = 0;
                while (rs1.next()) {
                    user_id = rs1.getInt("ID");
                    //password1 = rs1.getString("password");

                }

                st1 = cn.createStatement();

                String[] language = request.getParameterValues("dropdown_selection_language");
                String result = new String("");
                for (int i = 0; i < language.length; i++) {
                    result += language[i] + ",";
                    String p = "insert into language(language_user_id,language_of_user) values('" + user_id + "','" + language[i] + "') ";
                    // String p="UPDATE newuser SET languages = ('"+result+"') WHERE email = ('"+email+"') ";
                    st1.execute(p);
                }
                out.println(result);

                st1.close();
                stmt.close();
                cn.close();
                out.println("Recored has been successfully updated");
                session.setAttribute("name", null);
                session.setAttribute("email", null);
                response.sendRedirect("../Login.html");
            } catch (Exception e1) {
                out.print("Error:-" + e1);
            }
        %>
    </center>
</body>
</html>