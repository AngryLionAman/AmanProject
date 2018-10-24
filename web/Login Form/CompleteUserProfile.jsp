<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%  String email = (String) session.getAttribute("email");
    Statement stmt;
    Connection con;
    ResultSet rs;
    String firstname = null;
    String lastname = null;
    String interests = null;
    String higher_edu = null;
    String languages = null;
    String best_achievement = null;
    String age = null;
    String bio = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
        stmt = con.createStatement();
        String v = "SELECT * FROM newuser WHERE email = '" + email + "'";
        rs = stmt.executeQuery(v);
        while (rs.next()) {
            firstname = rs.getString("firstname");
            lastname = rs.getString("lastname");
            interests = rs.getString("interests");
            higher_edu = rs.getString("higher_edu");
            languages = rs.getString("languages");
            best_achievement = rs.getString("best_achievement");
            age = rs.getString("age");
            bio = rs.getString("bio");
        }
        stmt.close();
        con.close();
        out.println("<br>");
        if (interests == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>sInsert your interests</a>");
        }
        if (higher_edu == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>Insert your higher_edu</a>");
        }
        if (languages == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>Insert your languages</a>");
        }
        if (interests == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>Insert your interests</a>");
        }
        if (best_achievement == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>Insert your best_achievement</a>");
        }
        if (age == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>sInsert your age</a>");
        }
        if (bio == null) {
            out.println("<br><a href=UpdateUserProfile.jsp>Insert your bio</a>");
        }

    } catch (Exception e) {
        out.println("Error" + e);
    }
%>
