<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
    String email    = (String)session.getAttribute("email");
    String Question = (String)request.getParameter("question");
 
    try{
        Connection con;
        Statement stmt;
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root",null);
        int id=0;
        stmt=con.createStatement();
        String p =  "SELECT * FROM newuser WHERE email = '"+email+"'";
        rs = stmt.executeQuery(p);
             while (rs.next()) {
                        id=rs.getInt("id");
                               }
        String q="insert into question(id,question) values('"+id+"','"+Question+"')";
        stmt.execute(q);
        stmt.close();
        con.close();
        response.sendRedirect("Main.jsp");
       }catch(Exception e1){
                   out.print("Error:-"+e1);
                           }
%>
