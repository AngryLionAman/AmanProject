<%-- 
    Document   : main
    Created on : Oct 19, 2017, 12:10:25 PM
    Author     : AngryLion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> <div><b> Insert image</b>
        <form action="hi.jsp" method="post" enctype="multipart/form-data">
            <input type="file" name="picture[]" multiple>
            <input type="submit" value="save">
        </form>
        </div>
        <br><br><br>
        <div><b> Insert Audio</b>
        <form action="uploadaudio.jsp" method="post" enctype="multipart/form-data">
            <input type="file" name="audio">
            <input type="submit" value="save">
        </form>
        </div>
         <br><br><br>
        <div><b> Insert Video</b>
        <form action="uploadvideo.jsp" method="post" enctype="multipart/form-data">
            <input type="file" name="video">
            <input type="submit" value="save">
        </form>
        </div>
        
        
    </body>
</html>
