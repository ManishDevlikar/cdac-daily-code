<%@page import="product.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Page</title>
</head>
<body>
	 <%
        Product product = (Product) request.getAttribute("product");
        if (product != null) {
    %>
     <p><strong>Product ID:</strong> <%= product.getId() %></p>
        <p><strong>Product Name:</strong> <%= product.getCategory() %></p>
        <p><strong>Price:</strong> <%= product.getPrice() %></p>
    <% } else { %>
        <p><%= request.getAttribute("message") %></p>
    <% } %>

    <a href="/product_task8/search">Search Again</a>
    <a href="/product_task8/">Home</a>
</body>
</html>