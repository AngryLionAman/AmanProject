<html>
<body>
<center>You have selected: 
 <%
   String[] interests = request.getParameterValues("dropdown_selection");
       String result = new String("");
            for(int i=0;i<interests.length;i++)
            {
                result +=interests[i]+",";
            }
        out.println(result);
  
%>
  <%@page language="java"%>
        <%@page import="java.sql.*"%>
        <%
          Statement st1;
          //PreparedStatement ps;
          Connection cn;
          ResultSet rs;
         
try
{
    String email=(String)session.getAttribute("email");
Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root",null);
st1=cn.createStatement();
String p="UPDATE newuser SET interests = ('"+result+"') WHERE email = ('"+email+"') ";
st1.execute(p);
st1.close();
cn.close();
out.println("Recored has been successfully updated");
response.sendRedirect("completeprofilelanguage.jsp");
}
catch(Exception e1)
{
    out.print("Error:-"+e1);
}
%>
</center>
</body>
</html>