<html lang="en"><head>
        <meta charset="UTF-8">
        <!-- For IE -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- For Resposive Device -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>InquiryHere.com</title>

        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- responsive style sheet -->
        <link rel="stylesheet" type="text/css" href="css/responsive.css">

    </head>

    <body>
        <div class="main-page-wrapper">


            <!-- Header _________________________________ -->
            <header class="home-page">
                <div class="container clear-fix">
                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12" style="padding-left:0px;">
                        <div class="logo float-left">
                            <a href="#" style="vertical-align:middle;">
                                <h4>
                                    <div class="logotext">
                                        Inquiryhere.com
                                        <div>
                                            <!-- <img src="images/logo/logo.png" style="width:150px;"> -->
                                            </h4>
                                            </a></div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 serachhere">
                                        <input type="text" placeholder="Search here">
                                    </div>

                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12 float-right textalign-right">

                                        <a  href="ProfilePage.html"><img src="images/home/modify.png" class="helpicon"/></a>
                                        <a><img src="images/home/HelpIcon.png" class="helpicon"/></a>

                                    </div>
                                    <div class="col-lg-1 col-md-1 col-sm-12 col-xs-12 float-right textalign-right">
                                        <%@page language="java" %>
                                        <%@page import="java.sql.*" %> 
                                        <%
                                            String name = null;
                                            int id_of_user = 0;
                                            int topic_id = 0;
                                            String email = (String) session.getAttribute("email");
                                            if (email == null) {
                                        %><select class="helpicon w100 username" onchange="location = this.value;">
                                            <option value="index.jsp">LogIn</option>
                                            <option value="index.jsp">LogIn</option>
                                            <option value="AboutUs.html">About us</option>
                                            <option value="ContactUs.jsp">Contact Us</option>
                                            <option value="disclaimer.jsp">Disclaimer</option>
                                            <option value="privacyAndPolicy.jsp">privacy and policy</option>
                                            
                                        </select><%
                                        } else {

                                            Statement stmt;
                                            Connection con;
                                            ResultSet rs;
                                            // String name = null;
                                            //int id_of_user = 0;

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
                                                out.println("Unable to retrieve!!" + e);
                                            }
                                        %>
                                        <select class="helpicon w100 username" onchange="location = this.value;">
                                            <option value="Main.jsp"><%=name%></option>
                                            <option value="profile.jsp">Profile</option>
                                            <option value="Test4">Setting</option>
                                            <option value="AboutUs.html">About us</option>
                                            <option value="ContactUs.jsp">Contact Us</option>
                                            <option value="disclaimer.jsp">Disclaimer</option>
                                            <option value="privacyAndPolicy.jsp">privacy and policy</option>
                                            <option value="Logout.jsp">Logout</option>
                                        </select><%
                                            }
                                        %>

                                    </div>


                                    </div>

                                    </header>
                                    <div class="clear-fix"></div>
                                    <div class="bodydata">
                                        <div class="container clear-fix">
                                            <div class="row">
                                                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                    <%
                                                        if (session.getAttribute("email") != null) {
                                                    %>

                                                    <div class="themeBox" style="height:auto;">
                                                        <div class="boxHeading" >
                                                            Followed Topic
                                                        </div>

                                                        <%
                                                            Statement stmt_fetch_topic;
                                                            Connection con_fetch_topic;
                                                            ResultSet rs_fetch_topic;
                                                            String topic_name;
                                                            try {

                                                                Class.forName("com.mysql.jdbc.Driver");
                                                                con_fetch_topic = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                                                                stmt_fetch_topic = con_fetch_topic.createStatement();
                                                                String p_fetch_topic = "select t.unique_id,t.topic_name from topic t "
                                                                        + "right join topic_followers_detail de "
                                                                        + "on t.unique_id = de.topic_id "
                                                                        + "where user_or_followers_id= '" + id_of_user + "'";
                                                                rs_fetch_topic = stmt_fetch_topic.executeQuery(p_fetch_topic);
                                                                while (rs_fetch_topic.next()) {
                                                                    topic_name = rs_fetch_topic.getString("topic_name");
                                                                    topic_id = rs_fetch_topic.getInt("unique_id");%>
                                                        <li>[<%=topic_id%>] <a href="topic_detail.jsp?topic_id=<%=topic_id%>"><%=topic_name%></a></li>
                                                            <% }
                                                                    rs_fetch_topic.close();
                                                                    stmt_fetch_topic.close();
                                                                    con_fetch_topic.close();
                                                                } catch (Exception e) {
                                                                    out.println("Unable to retrieve!!" + e);
                                                                }
                                                            %>

                                                    </div>  <% } %>
                                                    <div class="clear-fix"></div>
                                                    <div class="themeBox" style="height:auto;">
                                                        <div class="boxHeading">
                                                            Trending Topic
                                                        </div>
                                                        <div>
                                                            <jsp:include page="TrendingTopic.jsp" />
                                                        </div>


                                                    </div>

                                                    <div class="clear-fix"></div>

                                                    <div class="clear-fix"></div>
                                                </div>
                                                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                            <div class="themeBox" style="height:200px;">
                                                                <div class="boxHeading">
                                                                    Post Something
                                                                </div>
                                                                <div><textarea type="text" class="anstext" placeholder="Post something here"></textarea></div>

                                                                <div class="float-right margintop20" style="vertical-align:bottom">
                                                                    <button type="button" class="btn" data-toggle="modal" data-target="#myModal">POST</button>
                                                                    <!-- btn-info btn-lg -->
                                                                </div>
                                                                <div class="clear-fix"></div>
                                                            </div>
                                                        </div>

                                                    </div>


                                                    <div class="row">

                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">

                                                            <%
                                                                if (session.getAttribute("email") != null) {
                                                                    out.println("Related Questions up");

                                                            %>
                                                            <%  Statement stmt1, stmt2 = null;
                                                                Connection con1;
                                                                ResultSet rs1, rs2;
                                                                String name1 = null;
                                                                String question, fname = null;
                                                                int ide = 0;

                                                                try {

                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat", "root", null);
                                                                    stmt1 = con1.createStatement();
                                                                    String q = "select DISTINCT q.id,q.q_id,q.question from question q right join question_topic_tag qtt on q.q_id = qtt.question_id where tag_id IN (select t.unique_id from topic t right join topic_followers_detail de on t.unique_id = de.topic_id where user_or_followers_id= '" + id_of_user + "')";
                                                                    rs1 = stmt1.executeQuery(q);
                                                                    while (rs1.next()) {
                                                                        question = rs1.getString("question");
                                                                        ide = rs1.getInt("id");
                                                                        stmt2 = con1.createStatement();
                                                                        String T = "SELECT firstname FROM newuser WHERE id='" + ide + "' ";
                                                                        rs2 = stmt2.executeQuery(T);
                                                                        while (rs2.next()) {
                                                                            fname = rs2.getString("firstname");
                                                                            //out.println(fname);
                                                                        }

                                                            %>
                                                            <div class="themeBox" style="height:100px;">

                                                                <div class="boxHeading marginbot10">
                                                                    Ques : <a href="Answer.jsp?Id=<%=rs1.getString("question")%>" ><%=question%> ?</a>
                                                                </div>
                                                                <div class="questionArea">

                                                                    <div class="postedBy">Posted By : <%=fname%></div>

                                                                </div>

                                                            </div>


                                                            <%               }
                                                                    stmt1.close();
                                                                    stmt2.close();
                                                                    con1.close();
                                                                } catch (Exception e) {
                                                                    out.println("<br>Error Two :" + e);
                                                                }
                                                            } else {
                                                            %>
                                                            <h4>Trending Question</h4>
                                                            <%
                                                                Statement Trending_stmt;
                                                                Connection Trending_con;
                                                                ResultSet Trending_rs;
                                                                String UserName_for_trending_question = null;
                                                                try {
                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    Trending_con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                                                                    Trending_stmt = Trending_con.createStatement();
                                                                    String v_count = "SELECT * FROM question ORDER BY TotalLiked DESC limit 10;";
                                                                    Trending_rs = Trending_stmt.executeQuery(v_count);
                                                                    while (Trending_rs.next()) {
                                                                        String TrendingQuestion = Trending_rs.getString("question");
                                                                        int TotalFollowers = Trending_rs.getInt("TotalLiked");
                                                                        int id_for_user_name = Trending_rs.getInt("id");
                                                                        Statement Trending_stmt_for_name = Trending_con.createStatement();;
                                                                        ResultSet Trending_rs_for_name;
                                                                        String T = "SELECT firstname FROM newuser WHERE id='" + id_for_user_name + "' ";
                                                                        Trending_rs_for_name = Trending_stmt_for_name.executeQuery(T);
                                                                        while (Trending_rs_for_name.next()) {
                                                                            UserName_for_trending_question = Trending_rs_for_name.getString("firstname");
                                                                            //out.println(fname);
                                                                        }
                                                                        Trending_stmt_for_name.close();
                                                                        Trending_rs_for_name.close();
%>
                                                            <div class="themeBox" style="height:auto;">

                                                                <div class="boxHeading marginbot10">
                                                                    Ques : <a href="Answer.jsp?Id=<%=TrendingQuestion%>" ><%=TrendingQuestion%> ?</a>
                                                                </div>
                                                                <div class="questionArea">

                                                                    <div class="postedBy">Posted By : <%=UserName_for_trending_question%></div>

                                                                </div>

                                                            </div><%
                                                                    }

                                                                    Trending_stmt.close();
                                                                    Trending_rs.close();
                                                                    Trending_con.close();
                                                                } catch (Exception e) {
                                                                    out.println("Error " + e);
                                                                }
                                                            %> <%
                                                                }%>
                                                            <div class="clear-fix"></div>

                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                    <%
                                                        if (session.getAttribute("email") != null) {
                                                    %>
                                                    <div class="themeBox" style="height:330px;">
                                                        <div class="boxHeading">
                                                            Complete Your Profile
                                                        </div>
                                                        <div><jsp:include page="CompleteUserProfile.jsp" /></div>

                                                    </div><% }%>
                                                    <div class="clear-fix"></div>
                                                    <%
                                                        if (session.getAttribute("email") != null) {
                                                    %>
                                                    <div class="themeBox" style="height:400px;">
                                                        <div class="boxHeading">
                                                            Trending Question
                                                        </div>
                                                        <div>
                                                            <jsp:include page="TrendingQuestion.jsp" />
                                                        </div>
                                                    </div><% }%>
                                                    <div class="clear-fix"></div>

                                                    <div class="clear-fix"></div>
                                                </div>
                                                <div class="clear-fix"></div>
                                            </div>
                                            <div class="clear-fix"></div>
                                        </div>
                                        <div class="clear-fix"></div>
                                    </div>
                                    <div class="clear-fix"></div>

                                    <div class="modal fade" id="myModal" role="dialog">
                                        <div class="modal-dialog">

                                            <!-- Modal content-->
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">Post Your Question Here</h4>
                                                </div>
                                                <div class="modal-body">
                                                    <div>
                                                        <div>Your Question Here</div>
                                                        <textarea type="text" class="anstext" placeholder="Question"></textarea></div>
                                                    <div class="margintop20">
                                                        <div>Your Tag Here</div>
                                                        <textarea type="text" class="anstext" placeholder="Tag"></textarea></div>
                                                    <!-- <p>Some text in the modal.</p> -->
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn">Post</button>
                                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>

                                        </div>
                                    </div>


                                    <!-- Footer ______________________________ -->
                                    <!--<footer>
                                            
                                                    
                                                            <div class="container">
                                                                    <div class="clear-fix">
                                                                                    
                                                                            <div class="row ">
                                                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                                            <div class="float-right reserved">
                                                                            All Rights Reserved
                                                                            </div>
                                                                            </div>
                                                                            </div>
                                                                    </div> 
                                                            </div>                
                                    </footer>-->
                                    <!-- Js File_________________________________ -->
                                    <!-- j Query -->
                                    <script type="text/javascript" src="vendor/jquery-2.1.4.js"></script>
                                    <!-- Bootstrap JS -->
                                    <script type="text/javascript" src="vendor/bootstrap/bootstrap.min.js"></script>
                                    <!-- Bootstrap Select JS -->
                                    <script type="text/javascript" src="vendor/bootstrap-select/dist/js/bootstrap-select.js"></script>


                                    <!-- Theme js -->
                                    <!-- <script type="text/javascript" src="js/theme.js"></script> -->

                                    </div> <!-- /.main-page-wrapper -->

                                    </body></html>