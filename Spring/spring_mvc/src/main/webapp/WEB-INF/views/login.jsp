<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body bgcolor="cyan">
		<h1>Please Sign-In Here</h1>
		<form action="doValidateAgain" method="post">
			<pre>
				<h2>Enter User Name: </h2>
				<input type="text" name="uid"/>
				<h2>Enter Password: </h2>
				<input type="password" name="pwd"/>
				
				<input type="submit" value="Sign IN"/>
			</pre>
		</form>
	</body>
</html>