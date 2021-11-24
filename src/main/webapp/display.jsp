<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="com.nagarro.dto.Product"%>
<%@ page import="com.nagarro.service.ProductSearchService"%>
<%@ page import="com.nagarro.daoImp.ProductDaoImp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="border-bottom: solid 1px black">
		<h1>Product Management Tool</h1>
	</div>
	<br>
	<div id="content">
		<p>
			<b>Enter Product details to search product</b>
		</p>
		<form method="get" action="search">
			Color : <input type="text" name="color" id="color" required><br>
			Size : <input type="text" name="size" id="size" required><br>
			Gender : <select name="gender" id="gender">
				<option value="M">Male</option>
				<option value="F">Female</option>
			</select><br> Output <br> Preference : <select name="preferance"
				id="preference" required>
				<option value="1">Price</option>
				<option value="2">Rating</option>
				<option value="3">Price and Rating</option>
			</select> <input type="submit" style="margin-right: 5px">
		</form>

	</div>
	
</body>
<style>
@charset "ISO-8859-1";

body {
	display: inline;
	margin: 0px;
}


h1 {
	margin-left: 30%;
}

#content {
	margin-left: 3%;
}

#color {
	margin-left: 2.5%;
}

#gender {
	margin-left: 1.8%;
}

#size {
	margin-left: 3.3%;
}

#image {
	margin-left: 2.3%;
}

input {
	margin-bottom: 0.5%;
}
</style>
</html>
