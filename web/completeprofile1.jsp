
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Interests | InquiryHere.com</title>
        <link rel="stylesheet" type="text/css" href="css/ui.dropdownchecklist.css" />
        <link rel="stylesheet" type="text/css" href="css/main.css" />
        <script type="text/javascript" src="jquery/jquery.js"></script>
        <script type="text/javascript" src="jquery/ui.core.js"></script>
        <script type="text/javascript" src="jquery/ui.dropdownchecklist.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#s5").dropdownchecklist({firstItemChecksAll: true, maxDropHeight: 200});
            });
        </script>
    </head>
    <body>
        <h1 align="center" >Welcome To InquiryHere.com</h1>
    <b1><h1 align="center" >Select Your Interests</h1></b1>
    <center><form action="save_completeprofile1.jsp" method="get" name="dropdown_selection">
            <table align="center">
                <tr>
                    <td>
                        <select id="s5" multiple="multiple" name="dropdown_selection" >
                            <%@page language="java"%>
                            <%@page import="java.sql.*"%>
                            <%
                                Statement stmt;
                                Connection con;
                                ResultSet rs;
                                String TopicName;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/bharat", "root", null);
                                    stmt = con.createStatement();
                                    String v = "SELECT * FROM topic";
                                    rs = stmt.executeQuery(v);
                                    while (rs.next()) {
                                        TopicName = rs.getString("topic_name");
                                        out.println("<option>" + TopicName + "</option>");
                                    }
                                    stmt.close();
                                    con.close();

                                } catch (Exception e) {
                                    out.println(e.getMessage());
                                }
                            %>


                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form><p><b>Note</b> If you are using desktop browser then press CTRL and select Interests</p></center>
</body>
</html>