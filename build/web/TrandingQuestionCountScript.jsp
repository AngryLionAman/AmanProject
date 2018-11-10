<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    Statement stmt_count, stmt_count_s;
    Connection con = null, con_count;
    ResultSet rs_count, rs_count_s;
    int count_var = 0;
    int TotalCountOfTopic = 0;
    int TopicId = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con_count = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        stmt_count = con_count.createStatement();
        String v_count = "select * from question";
        rs_count = stmt_count.executeQuery(v_count);
        while (rs_count.next()) {
            TopicId = rs_count.getInt("q_id");
            out.println("</br> Topic Id." + TopicId);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
            stmt_count_s = con.createStatement();
            String v_count_s = "select count(*) liker_id from like_count where Ans_id='" + TopicId + "'";
            rs_count_s = stmt_count_s.executeQuery(v_count_s);
            while (rs_count_s.next()) {
                TotalCountOfTopic = rs_count_s.getInt("liker_id");
                out.println("<br>Total Followers---->" + TotalCountOfTopic);
            }

            try {
                //  Connection con;
                PreparedStatement ps = null;
                String UpdateQuiry = "update question set TotalLiked = '" + TotalCountOfTopic + "' where q_id = '" + TopicId + "'";
                ps = con.prepareStatement(UpdateQuiry);
                ps.executeUpdate();
                ps.close();
            } catch (Exception e) {
                out.println("Error" + e);
            }
            stmt_count_s.close();
            con.close();
        }

        stmt_count.close();
        con_count.close();
    } catch (Exception e) {
        out.println("Error " + e);
    }
%>