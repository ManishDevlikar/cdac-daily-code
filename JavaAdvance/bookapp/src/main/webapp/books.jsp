<%@ page import="app.entity.Books , java.util.*" %>

<html>
    <head></head>
    <body>
        <h1>Insert New Book</h1>

        <form action="/books" method="post">
            <div>
                <label for="name">Enter Book Name</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div>
                <label for="author">Enter Author Name</label>
                <input type="text" id="author" name="author" required>
            </div>
            <div>
                <label for="price">Enter Price</label>
                <input type="number" id="price" name="price" required>
            </div>
            <div>
                <input type="submit" value="Insert Book">
            </div>
        </form>


        <h1>All Books</h1>
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
                List<Books> empList = (List<Books>) request.getAttribute("books"); 
                
                for(Books book : empList) {%>
                    <tr>
                        <td><%= book.getId() %></td>
                        <td><%= book.getName() %></td>
                        <td><%= book.getAuthor() %></td>
                        <td><%= book.getPrice() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>

        <form method="post" action="/search">
            <label for="id">Enter Id</label>
            <input type="number" id="id" name="id">
            <input type="submit" value="Search Book">
        </form>
    </body>
</html>