<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>${product1.getId()} ${product1.getName()}
	${product1.getBrand()} ${product1.getQuality()} ${product1.getPrice()}
	${product1.getWarranty()} ${product1.getDateofmanufacture()}
	${product1.getRating()}
</body>
</html>