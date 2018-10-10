<%-- 
    Document   : save
    Created on : 10 Oct, 2018, 9:12:57 AM
    Author     : AngryLion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>we are workin on it</h1>
        <%
         String Example = request.getParameter("editor");
         out.println(Example);   
    
          Statement st1,stmt;
          Connection cn;
          ResultSet rs,rs1;
         
try
{
String email=(String)session.getAttribute("email");
Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root",null);
st1=cn.createStatement();

String p="insert into example(textValue) values('"+Example+"') ";
st1.execute(p);
        
st1.close();
cn.close();
out.println("Recored has been successfully updated");
}
catch(Exception e1)
{
    out.print("Error:-"+e1);
}
%>


<%
String email,password;
email    = request.getParameter("email");
password = request.getParameter("password");
//Statement stmt;
Connection con;
//ResultSet rs;
try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/bharat","root",null);
    stmt=con.createStatement();
    String v="select * from Example";
    rs=stmt.executeQuery(v);

    while(rs.next()){
        int UniqueId = rs.getInt("unique_id");
        String StoredText=rs.getString("textValue");
        out.println(UniqueId+">"+StoredText);
                        
                    }

stmt.close();
con.close();
}catch(Exception e){
    out.println(e.getMessage());
   }
%>
</body>
</html>
