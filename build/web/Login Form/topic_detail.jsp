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

            function take_value(question_id, id_of_user) {
                //document.getElementById("demo").innerHTML = "Welcome" + firstname+lastname;

                var http = new XMLHttpRequest();
                http.open("POST", "http://localhost:8081/Bharat.com/Login%20Form/like_count.jsp?val=" + question_id + "&val2=" + id_of_user, true);
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
            <a href="Main.jsp">Home</a>
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
                <h2>Followed Topic</h2>

                <ul class="a">
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
                            stmt.close();
                            con.close();
                        } catch (Exception e) {
                            out.println("Unable to retrieve!!");
                        }
                    %>
                    <%
                        Statement stmt_fetch_topic;
                        Connection con_fetch_topic;
                        ResultSet rs_fetch_topic;
                        String topic_name;
                        int topic_id = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            con_fetch_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                            stmt_fetch_topic = con_fetch_topic.createStatement();
                            String p_fetch_topic = "select t.unique_id,t.topic_name from "
                                    + "topic t right join topic_followers_detail de "
                                    + "on t.unique_id = de.topic_id where user_or_followers_id= '" + id_of_user + "'";
                            rs_fetch_topic = stmt_fetch_topic.executeQuery(p_fetch_topic);
                            while (rs_fetch_topic.next()) {
                                topic_name = rs_fetch_topic.getString("topic_name");
                                topic_id = rs_fetch_topic.getInt("unique_id");
                    %>
                    <li><%=topic_id%><a href="topic_detail.jsp?topic_id=<%=topic_id%>"><%=topic_name%></a></li>
                        <%
                                }
                                stmt_fetch_topic.close();
                                con_fetch_topic.close();
                            } catch (Exception e) {
                                out.println("Unable to retrieve!!" + e);
                            }
                        %>
                    <a href=""><li>This is for Example</li></a>
                </ul>
            </div>
            <div class="column middle">        
                <h2>Welcome <%=name%></h2>

                <b>-------------Question----------------</b>
                <%
                    String topic_id_fetch = request.getParameter("topic_id");
                    out.println(topic_id_fetch);
                    Statement stmt1, stmt2 = null;
                    Connection con1;
                    ResultSet rs1, rs2;
                    String name1 = null;
                    String question, fname = null;
                    int ide = 0;

                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                        stmt1 = con1.createStatement();
                        String q = "select q.id,q.question,q.q_id from question q right join question_topic_tag qtt on qtt.question_id=q.q_id where tag_id='" + topic_id_fetch + "'";
                        rs1 = stmt1.executeQuery(q);
                        while (rs1.next()) {
                            question = rs1.getString("question");
                            ide = rs1.getInt("id");
                            int question_id = rs1.getInt("q_id");
                            stmt2 = con1.createStatement();
                            String T = "SELECT firstname FROM newuser WHERE id='" + ide + "' ";
                            rs2 = stmt2.executeQuery(T);
                            while (rs2.next()) {
                                fname = rs2.getString("firstname");
                                out.println("<div class=div1>");
                                out.println(question);
                                out.println("&nbsp;");
                                out.println("BY");
                                out.println("&nbsp;");
                                out.println(fname);
                                out.println("<br>");
                                out.println("<br>");
                                out.println("<br>");
                                out.println("&nbsp;");
                %>
                <b><a href="Answer.jsp?Id=<%=rs1.getString("question")%>" >Answer</a></b>
                <%
                    out.println("&nbsp;&nbsp;");%>

                <%
                    Statement stmt_count;
                    Connection con_count;
                    ResultSet rs_count;
                    int count_var = 0;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con_count = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                        stmt_count = con_count.createStatement();
                        String v_count = "select count(*) from like_count where Ans_id='" + question_id + "'";
                        rs_count = stmt_count.executeQuery(v_count);
                        while (rs_count.next()) {
                            count_var = rs_count.getInt("count(*)");
                        }

                        stmt_count.close();
                        con_count.close();
                    } catch (Exception e) {
                        out.println("Error One : " + e);
                    }
                %>

                <button onclick="take_value('<%=question_id%>', '<%=id_of_user%>')">UpVote[<%=count_var%>]</button><p id="demo"></p>
                <% out.println("&nbsp;&nbsp;");
                                out.println("</div>");

                            }
                        }

                        stmt1.close();
                        stmt2.close();
                        con1.close();
                    } catch (Exception e) {
                        out.println("<br><b>Question Not Found...</b>" + e);
                    }
                %>


                <br>
            </div>
            <div class="column side">
                <h2>Related Topic</h2>
                <%
                    Statement stmt_related_topic;
                    Connection con_related_topic;
                    ResultSet rs_related_topic;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con_related_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                        stmt_related_topic = con_related_topic.createStatement();
                        String p_related_topic = "select question_id from question_topic_tag where tag_id='" + topic_id_fetch + "'";
                        rs_related_topic = stmt_related_topic.executeQuery(p_related_topic);
                %><ul class="a"><%
                    while (rs_related_topic.next()) {
                        int QuestionId = rs_related_topic.getInt("question_id");
                        Statement stmt_related_;
                        ResultSet rs_related_;
                        stmt_related_ = con_related_topic.createStatement();
                        String p_related_ = "select t.unique_id,t.topic_name from topic t right join question_topic_tag qtt on t.unique_id=qtt.tag_id where question_id='" + QuestionId + "'";
                        rs_related_ = stmt_related_.executeQuery(p_related_);
                        while (rs_related_.next()) {
                            int unique_id = rs_related_.getInt("unique_id");
                            String topic_nameA = rs_related_.getString("topic_name");
                    %><a href=""><li><%=topic_nameA%></li></a><%
                                }
                                stmt_related_.close();
                                rs_related_.close();
                            }
                            out.println("</ul>");
                            stmt_related_topic.close();
                            con_related_topic.close();
                        } catch (Exception e) {
                            out.println("Unable to retrieve!!" + e);
                        }
                            %>    
            </div>
        </div>

    </body>
</html>
