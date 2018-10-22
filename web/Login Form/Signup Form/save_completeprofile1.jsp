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
            String email = (String) session.getAttribute("email");
            if (email == null) {
                out.println("you can't access this page direcitly");
            } else {

                try {

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

                    String[] interests = request.getParameterValues("dropdown_selection");
                    String result = new String("");
                    for (int i = 0; i < interests.length; i++) {
                        //result +=interests[i]+",";
                        String p = "insert into Interests(Interests_user_id,Interests_of_user) values('" + user_id + "','" + interests[i] + "') ";
                        st1.execute(p);
                    }
                    out.println(result);

                    st1.close();
                    stmt.close();
                    cn.close();
                    out.println("Recored has been successfully updated");
                    response.sendRedirect("completeprofilelanguage.jsp");
                } catch (Exception e1) {
                    out.print("Error:-" + e1);
                }
            }
        %>
    </center>
</body>
</html>