<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<style>
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
height:280px;
width:350px;
padding:10px;
position:relative;
top:30px;
left:100px;

}
</style>
</head>

<body>
<form action="signup" method="post" id="form">
<h3>SignUp By Entering Your Datails</h3>
 <input type="text" name="id" placeholder="Enter Your ID" autofocus required><br><br>
 <input type="text" name="name" placeholder="Enter Your Name" required><br><br>
  <input type="text" name="email" placeholder="Enter Your Email" required><br><br>
  <input type="text" name="contact" placeholder="Enter Your Phone Number" required><br><br>
  <input type="text" name="password" placeholder="Enter Your Password" required><br><br>
<input type="submit">
</form>
</body>
</html>