<%@ page import="app.data.Counter " />

<html>
    <head>

    </head>
    <body>
        <h1>Welcome Visitor!</h1>
        <% int count = (int) request.getAttribute("count") %>
        <p>Your visit number is: <%= count%></p>
    </body>
</html>