<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
  Statement st1;
  Connection cn;
  ResultSet rs;
  String answer_id,liked_by_id;
  answer_id   = request.getParameter("val");
  liked_by_id = request.getParameter("val2");
       
  try{
      Class.forName("com.mysql.jdbc.Driver");
      cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat","root",null);
      st1=cn.createStatement();
      String p="insert into like_count(Ans_id,liker_id) values('"+answer_id+"','"+liked_by_id+"')";
      st1.execute(p);
      st1.close();
      cn.close();
     }catch(Exception e1){
                  out.print("Error:-"+e1);
                         }
%>
