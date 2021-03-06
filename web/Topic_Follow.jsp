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

            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;    
            }
        </style>
        <script type="text/javascript">

            function take_value(topic_id, id_of_user) {
                //document.getElementById("demo").innerHTML = "Welcome" + topic_id+id_of_user;

                var http = new XMLHttpRequest();
                http.open("POST", "http://localhost:8081/Bharat.com/Login%20Form/submit_follow_topic.jsp?val_topic=" + topic_id + "&val2_topic=" + id_of_user, true);
                http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                http.send();

                http.onload = function () {
                    http.responseText;
                    //alert(http.responseText);
                }
            }
        </script>

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
            window.onclick = function (event) {
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
                    <a href=""><li>Top Stories</li></a>
                    <a href=""><li>Bookmarked Answered</li></a>
                    <a href=""><li>Links</li></a>
                    <a href=""><li>Topic You Choosen</li></a>
                    <a href=""><li>Education</li></a>
                    <a href=""><li>Health</li></a>
                </ul>
            </div>
            <div class="column middle">
                <%@page language="java" %>
                <%@page import="java.sql.*" %> 
                <%
                    String email = (String) session.getAttribute("email");
                    Statement stmt;
                    Connection con;
                    ResultSet rs;
                    String name = null;
                    int id_of_user = 0;

                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                        stmt = con.createStatement();
                        String p = "SELECT * FROM newuser WHERE email = '" + email + "'";
                        rs = stmt.executeQuery(p);
                        while (rs.next()) {
                            id_of_user = rs.getInt("id");
                            name = rs.getString("firstname");
                        }
                %>

                <h2>Welcome <%=name%></h2>

                <%
                        stmt.close();
                        con.close();
                    } catch (Exception e) {
                        out.println("Unable to retrieve!!" + e);
                    }
                %>

                <%
                    Statement stmt_topic;
                    Connection con_topic;
                    ResultSet rs_topic;
                    String name_topic;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                        stmt_topic = con_topic.createStatement();
                        String p_topic = "SELECT * FROM topic";
                        rs_topic = stmt_topic.executeQuery(p_topic);
                %>


                <%
                    int i = 1;
                    String Status = null;
                    while (rs_topic.next()) {
                        int topic_id = rs_topic.getInt("unique_id");
                        name_topic = rs_topic.getString("topic_name");

                        out.println("<br>" + topic_id);
                %>   
                <a href=topic_detail.jsp?topic_id=<%=topic_id%>><%=name_topic%></a>
                <%
                    Statement stmt_topic_followers;
                    Connection con_topic_followers;
                    ResultSet rs_topic_followers;
                    stmt_topic_followers = con_topic.createStatement();
                    String topic_followers = "SELECT * FROM topic_followers_detail";
                    rs_topic_followers = stmt_topic_followers.executeQuery(topic_followers);

                    while (rs_topic_followers.next()) {
                        int f_topic_id = rs_topic_followers.getInt("topic_id");
                        int f_followers_id = rs_topic_followers.getInt("user_or_followers_id");

                        if ((f_topic_id == topic_id) && (f_followers_id == id_of_user)) {
                            Status = "present";
                        }
                    }
                %>
                <%
                    if (Status == "present")
                        out.println("<td><button>Followed</button></td><br>");
                  else {%>
                <td><button onclick="take_value('<%=topic_id%>', '<%=id_of_user%>')">Follow</button><p id="demo"></p></td>
                    <% }
                                Status = null;
                            }

                            stmt_topic.close();
                            //stmt_topic_followers.close();
                            con_topic.close();
                        } catch (Exception e) {
                            out.println("Unable to retrieve!!=" + e);
                        }
                    %>


                <br>
            </div>
            <div class="column side">
                <h2>Set up account</h2>
                <ul class="a">
                    <a href=""><li>Visit your feed</li></a>
                    <a href=""><li>Find Your friend on bharat.com</li></a>
                    <a href=""><li>Ask your first question</li></a>
                    <a href=""><li>Answer a Question</li></a>
                    <a href=""><li>Update your profile</li></a>
                </ul>
            </div>
        </div>

    </body>
</html>
