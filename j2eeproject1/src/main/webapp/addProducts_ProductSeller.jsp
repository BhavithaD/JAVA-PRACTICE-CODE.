<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
margin:0px;
padding:0px:
}
body{
background-color:coral;
}
#form{
border:3px dashed purple;
text-align:center;
height:310px;
width:350px;
padding:10px;
position:relative;
top:10px;
left:200px;
 
}
</style>
</head>
<body>
<form action="addproduct" method="post" enctype="multipart/form-data" id=form>
<h3>Add Products to Sale</h3>
 <input type="text" name="id" placeholder="Enter Product ID" autofocus required><br><br>
 <input type="text" name="name" placeholder="Enter Product Name" required><br><br>
  <input type="text" name="brand" placeholder="Enter Product Brand" required><br><br>
  <input type="text" name="price" placeholder="Enter Product Price" required><br><br>
  <input type="text" name="discount" placeholder="Enter Product Discount" required><br><br>
 Add Product Image :: <input type="file" name="image" placeholder="Enter Product Image" value="image" ><br><br>
<input type="submit">
<input type="reset">

</form>
</body>
</html>