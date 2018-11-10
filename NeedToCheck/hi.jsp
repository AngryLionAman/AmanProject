<%-- 
    Document   : hi
    Created on : Oct 20, 2017, 1:20:18 PM
    Author     : AngryLion
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String str;
            File file;
             int maxSize = 1024 * 1024 *1024;
        int maxFactSize = 1024 * 1024*1024; 
         String path = "C:/Users/AngryLion/Documents/NetBeansProjects/AAA/web/AQ";
        %>
        <%
        String type = request.getContentType();
        //String type[]=(String[])request.getContentType();
       //out.println("<br>"+type);
       try{
       if(type.indexOf("multipart/form-data")>=0){
           //out.println("<br>"+"its a multipartr data");
           DiskFileItemFactory disFact = new DiskFileItemFactory();
           disFact.setSizeThreshold(maxFactSize);
           disFact.setRepository(new File("c:\\temp"));
           ServletFileUpload upload = new ServletFileUpload(disFact);
           upload.setSizeMax(maxSize);
           List lis = upload.parseRequest(request);
           Iterator itr = lis.iterator();
           while(itr.hasNext()){
                           FileItem item =(FileItem)itr.next();
             //  out.println("<br>"+item.isFormField());
               if(!item.isFormField()){
                   str = item.getName();
                   //str = str + "aaaid"+(str.substring(str.indexOf(".")));
                   out.println("<br>"+str);
       
                   file = new File(path,str);
                   item.write(file);
                  // out.println("<br>"+"file uploaded ");
                  session.setAttribute("n", str);
                  response.sendRedirect("final.jsp");
                           }
           }
      }
   }catch(Exception x){
              out.println(x);
              }
        
        
        %>
       
    </body>
</html>
