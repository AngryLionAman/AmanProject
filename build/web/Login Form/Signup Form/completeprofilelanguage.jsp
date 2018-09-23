
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
     $(document).ready(function(){
    	$("#s5").dropdownchecklist({ firstItemChecksAll: true, maxDropHeight: 100 });
     });
    </script>
 </head>
<body>
 <h1 align="center" >Select Your Language </h1>
 <form action="save_completeprofilelanguage.jsp" method="get" name="dropdown_selection">
  <table align="center">
   <tr>
    <td>Select Product :</td>
    <td>
     <select id="s5" multiple="multiple" name="dropdown_selection_language" >
       <option>All</option>
         <option>Hindi</option>
       <option>English</option>
       <option>Bhojpuri</option>
       <option>Marathi</option>
       <option>Gujrati</option>
       <option>Tamil</option>
       <option>Malayam</option>
       <option>Bihari</option>
       <option>Banarashi</option>
       <option>UpWala</option>      
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