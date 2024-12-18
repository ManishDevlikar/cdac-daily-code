<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%-- Fetching the attribute: loggedInUser from SESSION scope --%>
	<%
			Object currentLoggedInUser = 
			session.getAttribute("loggedInUser");
		%>
	<h2 style="color:green">
		Hey 	<%= currentLoggedInUser%>, 
		Aha !! Congratulations, you are IN
	</h2>
</body>
</html>