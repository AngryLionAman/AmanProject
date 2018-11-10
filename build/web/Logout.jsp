<%
    session.setAttribute("name", null);
    session.setAttribute("email", null);
    session.invalidate();
    response.sendRedirect("Login.html");
%>
