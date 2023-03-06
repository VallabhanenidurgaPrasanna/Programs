<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<center><h1>Get All Products</h1></center>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid black;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

a:active{
background-color:pink;
}
a:hover{
color:black;
}

body{
 background-image: url("https://t4.ftcdn.net/jpg/04/23/35/19/360_F_423351962_SgDFnFAbvDpuBQrGiIwhJVIBS4hIiDw0.jpg");
}
</style>
</head>
<body>
<body>

	<div class="container mt=5">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">id</th>
					<th scope="col">ProductName</th>
					<th scope="col">Brand</th>
					<th scope="col">Quality</th>
					<th scope="col">Price</th>
					<th scope="col">Warranty</th>
					<th scope="col">DateOfManufacture</th>
					<th scope="col">Rating Out of 5</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="pro">
					<tr>
						<th scope="row">${pro.id}</th>
						<td>${pro.name}</td>
						<td>${pro.brand}</td>
						<td>${pro.quality}</td>
						<td>${pro.price}</td>
						<td>${pro.warranty}</td>
						<td>${pro.dateofmanufacture}</td>
						<td>${pro.rating}</td>
						<td><a href="delete/${pro.id}" class="btn btn-danger">delete</a>
							<a href="update/${pro.id}" class="btn btn-primary">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br><br>
	<a href="/ProductManagementSystem">AddProduct</a>
</body>

</html>