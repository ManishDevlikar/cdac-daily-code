<jsp:useBean id="count" class="app.data.Counter" scope="session"/>

<html>
	<head>
		<title>simple-web-app</title>
	</head>
	<body>
		<h1>Number Of Greetings${count.counter}</h1>
	</body>
</html>

