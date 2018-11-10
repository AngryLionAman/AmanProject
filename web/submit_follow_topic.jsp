<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    Statement st1;
    Connection cn;
    ResultSet rs;
    String topic_id = request.getParameter("val_topic");
    String followers_id = request.getParameter("val2_topic");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
        st1 = cn.createStatement();
        String p = "insert into topic_followers_detail(topic_id,user_or_followers_id) values('" + topic_id + "','" + followers_id + "')";
        st1.execute(p);
        st1.close();
        cn.close();
    } catch (Exception e1) {
        out.println("Error:-" + e1);
    }
%>
