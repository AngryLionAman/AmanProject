<!DOCTYPE html>
<html lang="en">
<head>
<title>Bharat.com</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    table, th, td {
    border: 1px solid black;
}
.city {display:none}
.dropbtn {
    background-color: #3498DB;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
    background-color: #2980B9;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f1f1f1;
    min-width: 160px;
    overflow: auto;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown a:hover {background-color: #ddd;}

.show {display: block;}
body {
    font-family: Arial;
	margin: 0;
}

* {
    box-sizing: border-box;
}

form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 1px solid grey;
    float: left;
    width: 80%;
    background: #f1f1f1;
}

form.example button {
    float: left;
    width: 20%;
    padding: 10px;
    background: #2196F3;
    color: white;
    font-size: 17px;
    border: 1px solid grey;
    border-left: none;
    cursor: pointer;
}

form.example button:hover {
    background: #0b7dda;
}

form.example::after {
    content: "";
    clear: both;
    display: table;
}
.div1 {
    width: 650px;
    height: 100px;
    border: 1px solid blue;
    box-sizing: border-box;
}
.div2 {
    width: 650px;
    height: 100px;    
    padding: 50px;
    border: 1px solid red;
    box-sizing: border-box;
}
ul.a {
    list-style-type: circle;
}
* {
    box-sizing: border-box;
}



/* Style the header */
.header {
    background-color: #f1f1f1;
    padding: 20px;
    text-align: center;
}

/* Style the top navigation bar */
.topnav {
    overflow: hidden;
    background-color: #333;
}

/* Style the topnav links */
.topnav a {
    float: left;
    display: block;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
    background-color: #ddd;
    color: black;
}

/* Create three unequal columns that floats next to each other */
.column {
    float: left;
    padding: 10px;
}

/* Left and right column */
.column.side {
    width: 25%;
}

/* Middle column */
.column.middle {
    width: 50%;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .column.side, .column.middle {
        width: 100%;
    }
}
</style>
<script>
document.getElementsByClassName("tablink")[0].click();

function openCity(evt, cityName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
    tablinks[i].classList.remove("w3-light-grey");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.classList.add("w3-light-grey");
}
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>
</head>
<body>

<div class="header">
  <h1>Bharat.com</h1>
  <p>As place to share knowladge and batter understand the world.</p>
</div>

<div class="topnav">
  <a href="#">Home</a>
  <a href="#">Ansewer</a>
  <a href="#">Nodification</a>
  
  <form class="example" action="action_page.jsp" style="margin:auto;max-width:300px">
  <input type="text" placeholder="Search.." name="search2">
   <button type="submit"><i class="fa fa-search"></i></button>
</form>
</div>
<div class="dropdown">
<button onclick="myFunction()" class="dropbtn">Dropdown</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="UserProfile.jsp">Profile</a>
    <a href="Logout.jsp">Logout</a>
    <a href="#about">Blog</a>
    <a href="#contact">Message</a>
	<a href="#contact">your Content</a>
	<a href="#contact">Stats</a>
	<a href="#contact">Settings</a>
	<a href="#contact">Help</a>
	
  </div>
</div>

<div class="row">
  <div class="column side">
    <h2>Feeds</h2>
    
	<ul class="a">
           <a href="UserProfile.jsp?Q_value=Question"><li>Question</li></a>
           <a href="UserProfile.jsp?Q_value=Answer"><li>Answer</li></a>
           <a href=""><li>Activity</li></a>
           <a href=""><li>Posts</li></a>
	   <a href=""><li>Blogs</li></a>
	   <a href=""><li>Followers</li></a>
           <a href=""><li>Following</li></a>
           <a href=""><li>Topic</li></a>
	   <a href=""><li>Edits</li></a>
    </ul>
  </div>
  <div class="column middle">
      <%@page language="java" %>
<%@page import="java.sql.*" %> 
<% //Printing User name
 String email=(String)session.getAttribute("email");
 Statement stmt;
 Connection con;
 ResultSet rs;
 String name=null;
 int id=0;       

 try {
         
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
            
     stmt = con.createStatement();
         
     String p =  "SELECT * FROM newuser WHERE email = '"+email+"'";
     rs = stmt.executeQuery(p);
             while (rs.next()) {
              id=rs.getInt("id");
              name = rs.getString("firstname");
             }
 
%>
          
<h2>Welcome <%=name%></h2>

<%
        //session.setAttribute("name", name);
 stmt.close();
            con.close();
              } 
        catch (Exception e) {
            System.out.println("Unable to retrieve!!");
        } 
  //End printing user name  
%>
  
  

  <% if(request.getParameter("Q_value")==null){
      out.print("<h3>User account List, You might like to follow other... </h3>");
  
 Statement stmt_un;
 Connection con_un;
 ResultSet rs_un;
 String firstname,lastname,interest;
 int Id_of_user;       

 try {
         
     Class.forName("com.mysql.jdbc.Driver");
     con_un = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);     
     stmt_un = con_un.createStatement();
     String p_un =  "SELECT * FROM newuser";
     rs_un = stmt_un.executeQuery(p_un);
     out.print("<table>");
     out.print("<tr>");
     out.print("<th>Name</th>");
     out.print("<th>Interent</th>");
     out.print("<tr>");
             while (rs_un.next()) {
                          Id_of_user = rs_un.getInt("ID");
                          firstname = rs_un.getString("firstname");
                          lastname = rs_un.getString("lastname");
                          interest = rs_un.getString("interests");
                          out.print("<tr>");
                          %>
                          <td><a href=CreateSessionOtherUserProfile.jsp?Id_of_user=<%=Id_of_user%>><%=firstname%><%=lastname%></a></td>
                          <%
                          out.print("<td>"+interest+"</td>");
                          out.print("<tr>");
                          
             }
     out.print("</table>");

 stmt_un.close();
 con_un.close();
              } 
        catch (Exception e) {
            out.print(e);
        } 
  }
  //End printing All user name   
  %>
  

<%
 if(request.getParameter("Q_value")!=null){
 try
       {
    //String parameter_value = request.getParameter("Q_value");
    //out.print(parameter_value);
if(request.getParameter("Q_value").equals("Question"))
            {
        out.print("<b>--------------------Question----------------------------</b>");
    
        Statement stmt_q=null;
        Connection con_q;
        ResultSet rs_q;
        String Question_asked_by_user;

Class.forName("com.mysql.jdbc.Driver");
con_q=DriverManager.getConnection("jdbc:mysql://localhost/bharat","root",null);
stmt_q=con_q.createStatement();
String Q="SELECT * FROM question WHERE id = '"+id+"'";
rs_q=stmt_q.executeQuery(Q);
int count=1;
while(rs_q.next())
{
    Question_asked_by_user=rs_q.getString("question");
    out.print("<br><br>"+ count++ +"<b>&nbsp;&nbsp;"+Question_asked_by_user+"</b>");
    
}

stmt_q.close();
con_q.close();
}

//Staring answer programming....................................................

if(request.getParameter("Q_value").equals("Answer"))
            {
        out.print("<b>--------------------Answer----------------------------</b><br>");
    
        Statement stmt_a=null,stmt_a2=null;
        Connection con_a;
        ResultSet rs_a,rs_a2;
        String Answer_given_by_user;
        int Question_id =0;

Class.forName("com.mysql.jdbc.Driver");
con_a=DriverManager.getConnection("jdbc:mysql://localhost/bharat","root",null);
stmt_a=con_a.createStatement();
stmt_a2=con_a.createStatement();
String Q_a="SELECT * FROM answer WHERE Answer_by_id = '"+id+"'";
rs_a=stmt_a.executeQuery(Q_a);
int count=1;
while(rs_a.next())
{
    Answer_given_by_user=rs_a.getString("answer");
    Question_id = rs_a.getInt("q_id");
    //out.print(Question_id);
    //out.print("<br><br>"+ count++ +"Q_id="+Question_id+"<b>&nbsp;&nbsp;"+Answer_given_by_user+"</b>");
                        String T_a =  "SELECT * FROM question WHERE q_id = '"+Question_id+"'";
                             rs_a2 = stmt_a2.executeQuery(T_a);
                              while (rs_a2.next()) { 
                                   String Question_by_user = rs_a2.getString("question");
                                   //out.print(Question_by_user);
                                   out.print("<br><br>"+"<b>Q"+ count++ +"-->"+Question_by_user+"<br>Ans.</b>&nbsp;&nbsp;&nbsp;&nbsp;"+Answer_given_by_user);
                              }
    
}

stmt_a2.close();
stmt_a.close();
con_a.close();
}





}
catch(Exception e)
{
out.print(e);
}
 }//IF statement closed here
%>
      
	<br>
       
  </div>
  <div class="column side">
    <h2>Set up account</h2>
    <ul class="a">
          <a href=""><li><b>Credentials & highlights</b></li></a>
          <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
           <a href=""><li><b>Know About</b></li></a>
           <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
          <a href=""><li>-----</li></a>
                      
    </ul>
  </div>
</div>
  
</body>
</html>
