<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.ProductBean"%>
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
		<h3>
			
			 <%
			
			 	ArrayList<ProductBean> al = (ArrayList<ProductBean>) request.getAttribute("list");

			 	if (al == null || al.isEmpty()) 
			 	{
			     	out.println("Product Records NOT Found !!!!");
			 	} 
			 	else 
			 	{
			     	Iterator<ProductBean> i = al.iterator();
			     
			     	while(i.hasNext())
			     	{
			     		ProductBean pb = i.next();
			     		out.println( pb.getProduct_id() + " " + pb.getProduct_name() + " " + pb.getProduct_company() + " " + pb.getProduct_price() + " " + pb.getProduct_quantity() + "<br><br>");
			     	}
			 	}
							
		     %>
			
		</h3>
		
	    <%@ include file="index.html" %>
	    
</body>
</html>