<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP HOME</title>
</head>
<body>
<% String name=(String)request.getAttribute("u_name"); %>
<h1>Hello <%= name %></h1>
</body>
</html>