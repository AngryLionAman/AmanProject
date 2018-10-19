<%@page language="java" %>
<%@page import="java.sql.*" %> 
<%
    String email = (String) session.getAttribute("email");
    Statement stmt;
    Connection con;
    ResultSet rs;
    String name = null;
    int id_of_user = 0;

    try {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);

        stmt = con.createStatement();

        String p = "SELECT * FROM newuser WHERE email = '" + email + "'";
        rs = stmt.executeQuery(p);
        while (rs.next()) {
            id_of_user = rs.getInt("id");
            name = rs.getString("firstname");
        }

%>

<h2>Welcome <%=name%></h2>

<%
        //session.setAttribute("name", name);
        stmt.close();
        con.close();
    } catch (Exception e) {
        out.println("Unable to retrieve!!");
    }
%>



<%
    Statement stmt_topic;
    Connection con_topic;
    ResultSet rs_topic;
    String name_topic;

    try {

        Class.forName("com.mysql.jdbc.Driver");
        con_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);

        stmt_topic = con_topic.createStatement();
        String p_topic = "SELECT * FROM topic";
        rs_topic = stmt_topic.executeQuery(p_topic);


%>

<% int i = 1;
    String Status = null;
    while (rs_topic.next()) {
        int topic_id = rs_topic.getInt("unique_id");
        name_topic = rs_topic.getString("topic_name");

        out.println("<br>" + topic_id);
        out.println(name_topic); %>   

<%
    Statement stmt_topic_followers;
    Connection con_topic_followers;
    ResultSet rs_topic_followers;
    stmt_topic_followers = con_topic.createStatement();
    String topic_followers = "SELECT * FROM topic_followers_detail";
    rs_topic_followers = stmt_topic_followers.executeQuery(topic_followers);

    while (rs_topic_followers.next()) {
        int f_topic_id = rs_topic_followers.getInt("topic_id");
        int f_followers_id = rs_topic_followers.getInt("user_or_followers_id");

        if ((f_topic_id == topic_id) && (f_followers_id == id_of_user)) {
            Status = "present";
        }

        //out.println("["+ i++ +"]"+"("+f_topic_id+","+topic_id+")_("+f_followers_id+","+id_of_user+")<br>");
    }
%>
<%
    if (Status == "present") {
        out.println("<button>Followed</button>");
    } else {
        out.println("<button>Follow</button>");
    }
    Status = null;
%>




<%
        }

        stmt_topic.close();
        //stmt_topic_followers.close();
        con_topic.close();
    } catch (Exception e) {
        out.println("Unable to retrieve!!=" + e);
    }
%>
