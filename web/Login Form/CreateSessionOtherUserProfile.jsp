<%
String Variable = request.getParameter("Id_of_user");
//out.print(Variable);
session.setAttribute("Variable", Variable);
response.sendRedirect("OtherUserProfile.jsp");


%>