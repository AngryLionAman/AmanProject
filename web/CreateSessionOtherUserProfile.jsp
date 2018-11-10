<%
    String Variable = request.getParameter("Id_of_user");
    session.setAttribute("Variable", Variable);
    response.sendRedirect("OtherUserProfile.jsp");
%>