<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUCT DETAILS</title>
</head>
<body>
<%= session.getAttribute("name") %> HAS BEEN REGISTERED TO PRODUCT ID : <%= session.getAttribute("id") %> BRAND: <%= session.getAttribute("brand") %>

</body>
</html>