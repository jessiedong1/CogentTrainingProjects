<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ page import="walking.model.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>Your result</h1>
	
	<table border = "1">

  <th>Product ID</th> <th>NAME</th> <th>Price</th> <th>Category</th> 
	 
	 <% List<Product> productList =  
            (List<Product>)request.getAttribute("products"); 
        for(Product p:productList){%> 
            <tr> 
                <td><%=p.getProductID() %></td> 
      			 <td><%=p.getProductName() %></td>  
                <td><%=p.getProductPrice() %></td> 
                <td><%=p.getCategory().getCategoryName() %></td> 
              
            </tr> 
            <%}%> 
	</table>
</body>
</html>