<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
  
<%
    String photoname = request.getParameter("photoname");
    String category = request.getParameter("category");
    String aboutname = request.getParameter("aboutname");
    String tags = request.getParameter("tagname");
try{
     Connection con;
     Statement stm;
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/image","root",null);
     String quary = "insert into imagepath (ipath,category,name,tags) values('"+photoname+"','"+category+"','"+aboutname+"','"+tags+"')";
     stm = con.createStatement();
     //out.println("<br>"+"it me ");
     stm.executeUpdate(quary);
     out.println("<br>"+"file path stored in database");
       } catch(Exception e){
                  out.println(e.fillInStackTrace());
           
}

%>
 <a href="display.jsp">Display</a>
 <a href="index.jsp">Homepage</a>