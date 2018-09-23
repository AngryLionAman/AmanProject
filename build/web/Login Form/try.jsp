<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
  
    String email=(String)session.getAttribute("Variable_of");
 
        out.print(email);
            
%>