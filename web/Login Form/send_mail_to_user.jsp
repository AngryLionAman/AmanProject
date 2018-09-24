<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
try
{
 String email = "cse13302.sbit@gmail.com";
  //session.setAttribute("n1",id);
  session.setAttribute("n2", email);
    response.sendRedirect("../SendMail");
    out.print("Mail Is sent to your Mail successfully!!!!!!!");
    //response.sendRedirect("../crt/invalid.jsp");
    //out.print("Username Not Found !!");
}
catch(Exception e)
{
  out.print(e);
}
 %>
 
 
