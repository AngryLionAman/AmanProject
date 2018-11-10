<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    Statement Trending_stmt;
    Connection Trending_con;
    ResultSet Trending_rs;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Trending_con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        Trending_stmt = Trending_con.createStatement();
        String v_count = "SELECT * FROM question ORDER BY TotalLiked DESC limit 10;";
        Trending_rs = Trending_stmt.executeQuery(v_count);
        while (Trending_rs.next()) {
            String TrendingQuestion = Trending_rs.getString("question");
            int TotalFollowers = Trending_rs.getInt("TotalLiked");
            out.println(TrendingQuestion+" ("+TotalFollowers+")</br>");
               }

        Trending_stmt.close();
        Trending_rs.close();
        Trending_con.close();
    } catch (Exception e) {
        out.println("Error " + e);
    }
%>