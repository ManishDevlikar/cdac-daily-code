<%@ page import="app.entity.Books" %>

<html>
    <head></head>
    <body>
        <h1>Books Details</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Author</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <%
                Books book = (Books) request.getAttribute("book"); 
                
                if(book != null) {%>
                    <tr>
                        <td><%= book.getId() %></td>
                        <td><%= book.getName() %></td>
                        <td><%= book.getAuthor() %></td>
                        <td><%= book.getPrice() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>

        <a href="/books">All Books</a>"
    </body>
</html>