<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
String email,password;
email    = request.getParameter("email");
password = request.getParameter("password");
Statement stmt;
Connection con;
ResultSet rs;
String username1,password1,firstname;
try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/bharat","root",null);
    stmt=con.createStatement();
    String v="select email,password,firstname from newuser";
    rs=stmt.executeQuery(v);

    int i=0;
    while(rs.next()){
        username1=rs.getString("email");
        password1 = rs.getString("password");
        if(email.equals(username1) && password.equals(password1))
                             i=1;
                    }

stmt.close();
con.close();
       if(i==1){
        session.setAttribute("email", email);
        response.sendRedirect("Main.jsp");
       }else
          out.println("unvalid user name and password!!!!");
    //response.sendRedirect("unvalid.html"); 
}catch(Exception e){
    out.println(e.getMessage());
   }
%>