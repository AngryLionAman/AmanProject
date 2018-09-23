<html>
<body>
<center>You have selected: 
 <%
   String[] language = request.getParameterValues("dropdown_selection_language");
       String result = new String("");
            for(int i=0;i<language.length;i++)
            {
                result +=language[i]+",";
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
String p="UPDATE newuser SET languages = ('"+result+"') WHERE email = ('"+email+"') ";
st1.execute(p);
st1.close();
cn.close();
out.println("Recored has been successfully updated");
session.setAttribute("name", null);
session.setAttribute("email", null);
response.sendRedirect("../Login.html");
}
catch(Exception e1)
{
    out.print("Error:-"+e1);
}
%>
</center>
</body>
</html>