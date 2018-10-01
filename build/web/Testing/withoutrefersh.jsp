<html>
<body>
<script type="text/javascript">
    
    function take_value(firstname,lastname){
        //document.getElementById("demo").innerHTML = "Welcome" + firstname+lastname;
               
      var http = new XMLHttpRequest();
      http.open("POST", "http://localhost:8081/Bharat.com/Testing/hello.jsp?val="+firstname+"&val2="+lastname, true);
      http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
      http.send();
        
    http.onload = function() {
        alert(http.responseText);
    }
      
    }
    
    
</script>
<center>
       <button onclick="take_value('aman','kumar')">Click this</button>
    <p id="demo"></p>
    </center>



</body>
</html>