<%@page import="java.awt.dnd.DropTargetAdapter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h1>
			  <%
					String data = (String)request.getAttribute("msg");
					out.println(data+"<br><br>");
			  %>
		
				<a href="product.html">Add Products</a><br><br>
	   			<a href="view">View Products</a><br><br>
		</h1>
</body>
</html>