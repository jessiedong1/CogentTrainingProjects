<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="com.example.entities.Employee" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>
</head>
<body>
<h1>All information</h1>

	<p> The details about all employees: </p>
	<table border = "1">
	<th>EMP ID</th> <th>NAME</th> <th>SALARY</th> <th>DEPT ID</th> <th>DEPT NAME</th> 
	 
	 <% List<Employee> empList =  
            (List<Employee>)request.getAttribute("employees"); 
        for(Employee e:empList){%> 
            <tr> 
                <td><%=e.getId() %></td> 
      			 <td><%=e.getName() %></td>  
                <td><%=e.getSalary() %></td> 
                <td><%=e.getDept().getDeptId() %></td> 
                <td><%=e.getDept().getDeptName() %></td> 
            </tr> 
            <%}%> 
	</table>
	<a href="index.jsp"> Return to Registration</a>
</body>
</html>