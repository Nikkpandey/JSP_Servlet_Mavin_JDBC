<%@page import="com.employee.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<%

     Employee e1=(Employee)request.getAttribute("employee");
     out.println(e1);

%>

</body>
</html>