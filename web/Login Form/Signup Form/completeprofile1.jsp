
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>jQuery Dropdown Checkbox List</title>
        <link rel="stylesheet" type="text/css" href="css/ui.dropdownchecklist.css" />
        <link rel="stylesheet" type="text/css" href="css/main.css" />
        <script type="text/javascript" src="jquery/jquery.js"></script>
        <script type="text/javascript" src="jquery/ui.core.js"></script>
        <script type="text/javascript" src="jquery/ui.dropdownchecklist.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#s5").dropdownchecklist({firstItemChecksAll: true, maxDropHeight: 100});
            });
        </script>
    </head>
    <body>
        <h1 align="center" >jQuery Dropdown Checkbox List</h1>
    <b1><h1 align="center" >Select Your Interests</h1></b1>
    <form action="save_completeprofile1.jsp" method="get" name="dropdown_selection">
        <table align="center">
            <tr>
                <td>Select Product :</td>
                <td>
                    <select id="s5" multiple="multiple" name="dropdown_selection" >
                        <option>All</option>
                        <option>Technology</option>
                        <option>Science</option>
                        <option>Movies</option>
                        <option>Music</option>
                        <option>Health</option>
                        <option>Food</option>
                        <option>Books</option>
                        <option>Visiting and travel</option>
                        <option>Business</option>
                        <option>Psychology</option>
                        <option>History</option>       
                        <option>Cooking</option>
                        <option>Photography</option>
                        <option>Sports</option>
                        <option>Design</option>
                        <option>Fashion and style</option>
                        <option>Writing</option>
                        <option>Economics</option>
                        <option>Hacking</option>
                        <option>Cyber Security</option>          
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form>
</body>
</html>