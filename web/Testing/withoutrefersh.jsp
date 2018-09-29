<html>
<body>

<h1>Testing of jsp page reloading</h1>

<script type="text/javascript">
    
    function take_value(){
        var n = document.forms["myform"]["name"].value; 
        if (n==null || n==""){
  alert("Please enter user name");
  return false;
}else{
    var http = new XMLHttpRequest();
    http.open("POST", "http://localhost:8081/Bharat.com/Testing/hello.jsp", true);
    http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    var params = "val=" + n; // probably use document.getElementById(...).value
    http.send(params);
    http.onload = function() {
        alert(http.responseText);
    }
}
    }
    
    
</script>
<center>
<form name="myform">
    Name:<input type="text" name="name">
    <br>
    <input type="button" value="submit" onclick="return take_value()">
    
</form>
    </center>



</body>
</html>