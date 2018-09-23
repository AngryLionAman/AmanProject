<%@page language="java"%>
<%@page import="java.sql.*"%>
        <%
          Statement st1;
          
          Connection cn;
          ResultSet rs;
         
          String firstname,lastname,password,email;
          
          int Q_id = (Integer)session.getAttribute("q_id");
          int id_of_user = (Integer)session.getAttribute("id_of_user");
            //out.print("<b>Q.</b>"+Q_id+"<br>");
            String answer = request.getParameter("answer");
            //out.print(answer);
try
{
Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root",null);

st1=cn.createStatement();
String p="insert into answer(q_id,answer,Answer_by_id) values('"+Q_id+"','"+answer+"','"+id_of_user+"')";
st1.execute(p);
st1.close();
cn.close();
out.println("Data has been inserted");
//session.setAttribute("email", email);
response.sendRedirect("Main.jsp");
}
catch(Exception e1)
{
    out.print("Error:-"+e1);
}
%>
