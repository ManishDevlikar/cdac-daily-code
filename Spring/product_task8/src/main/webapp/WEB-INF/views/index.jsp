<%@page import="product.model.Product"%>
<%@page import="java.util.List"%>
<html>
<body>
	<nav>
		<ul>
			<li><a href="/product_task8/add">add product</a></li>
			<li><a href="/product_task8/search">search product</a></li>
		</ul>
	</nav>
	
	<%-- viewProductsPage.jsp --%>
<h1>Product List</h1>
	 <%
        List<Product > productList = (List<Product>) session.getAttribute("products");
        if (productList != null) {
    %>

    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Price</th>
        </tr>

        <%-- Iterate over the productList --%>
        <%
            for (Product product : productList) {
        %>
            <tr>
                <td><%= product.getId() %></td>
                <td><%= product.getCategory() %></td>
                <td><%= product.getPrice() %></td>
            </tr>
        <%
            }
        %>
    </table>

    <% } else { %>
        <p>No products available.</p>
    <% } %>
	
</body>
</html>
