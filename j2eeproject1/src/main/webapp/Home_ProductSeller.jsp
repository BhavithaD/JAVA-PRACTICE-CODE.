<%@page import="java.util.Base64"%>
<%@page import="dto.product_dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
*{
margin:0px;
padding:0px:
}
body{
background-color:coral;
text-align:center;
}
a{
border:3px solid red;
border-radius:10px;
text-decoration:none;
color:purple;

}
a:hover{
background-color:red;
}
</style>
</head>
<body>
<h1>Welcome to Home Page </h1> <br><br>
<a href="addProducts_ProductSeller.jsp">Add Product</a>
<br><br>
<% String msg=(String)request.getAttribute("deletemessage"); %>
 
<%if(msg!=null){ %>
<h1><%= msg %></h1>
<%} %>
<table style="color:yellow;">
<tr>
<th>ID</th>
<th>Name</th>
<th>Brand</th>
<th>Price</th>
<th>Discount</th>
<th>Image</th>
<th>Edit </th>
<th>Delete</th>
</tr>
<% List<product_dto> products=(List)request.getAttribute("products"); %>
<% for(product_dto p:products) { %>
<tr>
<td><%=p.getP_id() %></td>
<td><%=p.getP_name() %></td>
<td><%=p.getP_brand() %></td>
<td><%=p.getP_price()  %></td>
<td><%= p.getP_discount() %></td>
<%String base64image =new String(Base64.getEncoder().encode(p.getP_image())); %>
<td><img src="data:image/jpeg;base64, <%=base64image %>" height="100px" width="100px" > </td>
<td><a href="editproduct?id=<%= p.getP_id()%>">Edit</a> </td>
<td><a href="deleteproduct?id=<%= p.getP_id()%>">Delete</a></td>
</tr>
<% } %>
</table>
<a href="Logout">LOGOUT</a>
</body>
</html>