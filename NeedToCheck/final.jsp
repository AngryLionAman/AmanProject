
      <%
        String name=(String)session.getAttribute("n");
        out.print("<b><u>Welcome "+name+"</i>"+"</u>");
     %>
     <form name="what" action="newjspfinal2.jsp" method="post" >
         <input type="text" name="photoname" value="<%=name%>" readonly>
         <input type="text" name="aboutname" placeholder="photo name">
         <select name="category">
                              <option value="actress" selected>Actress</option>
                              <option value="actor">Actor</option>
                              <option value="animal">Animal</option>
                              <option value="model">Model</option>
         </select>
         <input type="text" placeholder="Enter Tags Ex-name or place" name="tagname" style="width:300px; height: 150px;">
         
         <input type="submit" value="Store in database">
     </form>
     
   