<%@page import="java.util.Base64"%>
<%@page import="dto.product_dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!product_dto dto; %>
<%  dto=(product_dto)request.getAttribute("editpro"); %>
 
<form action="updateedit" method="post" enctype="multipart/form-data">
 <h3>Edit Products to Sale</h3>
 <input type="number" name="id" placeholder="Enter Product ID"  readonly value="<%=dto.getP_id()%>" ><br><br>
 <input type="text" name="name" placeholder="Enter Product Name" value="<%=dto.getP_name()%>" required><br><br>
  <input type="text" name="brand" placeholder="Enter Product Brand" value="<%=dto.getP_brand() %>"required><br><br>
  <input type="text" name="price" placeholder="Enter Product Price" value="<%=dto.getP_price() %>" required><br><br>
  <input type="text" name="discount" placeholder="Enter Product Discount" value="<%=dto.getP_discount() %>" required><br><br>
  <%String base64image =new String(Base64.getEncoder().encode(dto.getP_image())); %>
  <img src="data:image/jpeg;base64, <%=base64image %>" height="100px" width="100px" >
  <input type="file" name="image" placeholder="Enter Product Image" value="image" value="<%=dto.getP_image() %>" ><br><br>
<input type="submit">
<input type="reset">

</form>
</body>
</html>