<html>
<title>Login</title>
<link rel=stylesheet href="login.css">
</head>
<body>

	<div id="header">
		<h4>Login</h4>
	</div>
	<form action="Login" method="post" id="form">
		<div id="input">
			Enter username : <input type="text" name="userName" id="name"
				required><br> <br> Enter password : <input
				type="password" name="password" id="password" required><br>
			<p>Forgotton your password?</p>
		</div>
		<div id="submit">
			<input type="submit" value="login" id="button">
		</div>
	</form>




</body>
<style>
@charset "ISO-8859-1";

#header {
	background-color: PowderBlue;
	width: 50%;
	margin-left: 25%;
	margin-top: 10%;
	padding-bottom: 1%;
	padding-top: 0%;
	padding-left: 1%;
	color: black;
}

#form {
	width: 50%;
	margin-left: 25%;
	background-color: AliceBlue;
	margin-top: -1%;
	padding-left: 1%;
}

#input {
	margin-top: -5%;
	padding-top: 3%;
	padding-left: 1%;
}

#name {
	margin-left: 5%;
	width: 40%;
}

#password {
	margin-left: 5%;
	width: 40%;
}

p {
	font-size: 85%;
	color: blue;
	padding-left: 25%;
}

#submit {
	background-color: PowderBlue;
	width: 102%;
	margin-left: -2%;
}

#button {
	margin-left: 90%;
}
</style>
</html>


