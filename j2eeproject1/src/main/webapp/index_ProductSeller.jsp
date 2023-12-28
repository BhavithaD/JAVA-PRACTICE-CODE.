<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Seller</title>
<style type="text/css">
#navigation{
background-color:coral; 
height:30px;
width:100%;
text-weight:600;
word-spacing:20px;
display:flex;
justify-content:center; 
 
}
a{
border:2px solid yellow;
border-radius:10px;
text-decoration:none;
color:purple;
}
#button1:hover,#button2:hover{
background-color:red;
}
</style>
</head>
<body>
<% String msg=(String)request.getAttribute("message"); %>
 
<%if(msg!=null){ %>
<h1><%= msg %></h1>
<%} %>


 <nav id="navigation">
 <a id="button1" class="buttons" href="Login_ProductSeller.jsp">LOGIN</a><br> <br>
 <a id="button2" class="buttons" href="SignUp_ProductSeller.jsp">SIGNUP</a>
 </nav>
 
</body>
</html>