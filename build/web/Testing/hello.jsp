<%@page language="java"%>
<%@page import="java.sql.*"%>
<%

    Statement stmt_count;
    Connection con_count;
    ResultSet rs_count;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con_count = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        stmt_count = con_count.createStatement();
        String v_count = "select count(*) from like_count where  Ans_id=5";
        rs_count = stmt_count.executeQuery(v_count);

        int count_var = 0;
        while (rs_count.next()) {
            //count_var =rs.getInt("count(*)");
            out.println(rs_count.getInt("count(*)"));

        }

        stmt_count.close();
        con_count.close();
    } catch (Exception e) {
        out.println(e.getMessage());
    }
%>