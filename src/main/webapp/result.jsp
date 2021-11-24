<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<%
		List<Product> searchResults = (List) session.getAttribute("searchProduct");
		System.out.print("search results...." + searchResults);
		if(!searchResults.isEmpty()){
	%>

	<table class="result">
		<tr>
			<th>S.NO</th>
			<th>Name</th>
			<th>Color</th>
			<th>Gender</th>
			<th>Size</th>
			<th>Price</th>
			<th>Rating</th>
			<th>Availability</th>
		</tr>
		<%
			
			Iterator<Product> it = searchResults.iterator();
			while (it.hasNext()) {
			Product	product = it.next();
		%>
		<tr>
			<td><%=product.getSid()%></td>
			<td><%=product.getSname()%></td>
			<td><%=product.getColor()%></td>
			<td><%=product.getGender()%></td>
			<td><%=product.getSize()%></td>
			<td><%=product.getPrice()%></td>
			<td><%=product.getRating()%></td>
			<td><%=product.getAvailability()%></td>
		</tr>
		<%
			}
		%>
	</table>
    <%} else { %>
    <h2>No products Available</h2>
    <%} %>


</body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th {
	width: 10%;
}

table {
	margin-top: 5%;
}

</style>
</html>