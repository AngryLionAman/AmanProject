<%
out.println(request.getRequestURI());
out.println("<br>");
String str=request.getRequestURL()+"?"+request.getQueryString();
out.println(str);
%>