<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
*{
margin:0px;
padding:0px:
}
body{
background-color:coral;
}
#form{
border:5px dashed purple;
text-align:center;
height:180px;
width:350px;
padding:10px;
position:relative;
top:50px;
left:200px;

}
.flieds{
padding:10px;

}
</style>
</head>
<body>
<% String msg=(String)request.getAttribute("loginmessage"); %> 
<% if(msg!=null){ %>
<h3><%= msg %></h3>
 <%} %>

<form action="login" method="post" id="form" autocomplete="on"> 
<h3>Login By Entering Your Details</h3>
 <input class="flieds" type="text" name="email" placeholder="Enter Your Email"autofocus required><br><br>
   <input class="flieds" type="Password" name="password" placeholder="Enter Your Password"required><br><br>
<input class="flieds" type="submit">
<input class="flieds" type="reset">
</form><br><br>

</body>
</html>