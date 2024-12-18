<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Add page</h3>
	
	<form action="/product_task8/addProduct" method="post">
		<input type="number" name="id" placeholder="enter id">
		<input type="number" name="price" placeholder="enter price">
		<input type="text" name="Category" placeholder="enter category">
		<input type="text" name="Description" placeholder="enter description">
		
		<input type="submit">
	</form>
	
	<a href="/product_task8/">Home</a>
</body>
</html>