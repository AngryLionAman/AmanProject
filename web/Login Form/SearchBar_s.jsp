<%
    String SearchVariable = request.getParameter("search");
    session.setAttribute("SearchVariable", SearchVariable);
    response.sendRedirect("SearchBar.jsp");
%>