<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Search page</h3>
	
	 <form action="/product_task8/searchProduct" method="get">
        <label for="id">Enter Product ID:</label>
        <input type="number" id="id" name="id" required/>
        <input type="submit" value="Search"/>
    </form>
	
	<a href="/product_task8/">Home</a>
</body>
</html>