<!doctype html>
<html lang="en">
<%@page isELIgnored="false"%>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body{
 background-image: url("https://t4.ftcdn.net/jpg/04/23/35/19/360_F_423351962_SgDFnFAbvDpuBQrGiIwhJVIBS4hIiDw0.jpg");
}
</style>
<script>
	window.onload = function() {
		var checkboxes = document.getElementsByName("warranty");
		var currentCheckbox = null;
		function uncheckCheckbox() {
			for (var i = 0; i < checkboxes.length; i++) {
				checkboxes[i].checked = false;
			}
		}
		function checkCheckbox() {
			currentCheckbox.checked = true;
		}
		for (var i = 0; i < checkboxes.length; i++) {
			checkboxes[i].addEventListener("click", function() {
				currentCheckbox = this;
				uncheckCheckbox();
				checkCheckbox();
			});
		}
	};
</script>
<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center">Product Form</h1>
		<form action="${pageContext.request.contextPath}/addProduct" method="post">
		<div class="form-group">
				<label for="exampleInputId"><b>Id</b></label> <input
					type="text" id="exampleInputId" class="form-control"
					placeholder="Enter id" name="id" value="${product.id}">
			</div>
			<div class="form-group">
				<label for="exampleInputName"><b>ProductName</b></label> <input
					type="text" id="exampleInputName" class="form-control"
					placeholder="Enter product name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputBrand"><b>Brand</b></label> <input
					type="text" id="exampleInputBrand" class="form-control"
					placeholder="Enter brand name" name="brand">
			</div>
			<div class="form-group">
				<label for="Quality"><b>Quality</b></label><br> <br> <label
					for="Quality">Good</label> <input type="radio" id="Quality"
					name="quality" value="good"> <label for="Quality">Average
				</label> <input type="radio" id="Quality" name="quality" value="Average">
				<label for="Quality">Bad</label> <input type="radio" id="Quality"
					name="quality" value="Bad">
			</div>

			<div class="form-group">
				<label for="exampleInputPrice"><b>Price</b></label> <input
					type="text" id="exampleInputPrice" class="form-control"
					placeholder="Enter price" name="price">
			</div>
			 
			<div class="form-group">
				<label for="Warranty"><b>Warranty</b></label><br> <br> <label
					for="Warranty">Yes</label> <input type="checkbox" id="Warranty"
					name="warranty" value="yes"><br>
				<br> <label for="Warranty">No</label> <input type="checkbox"
					id="Warranty" name="warranty" value="no">  
			</div>
			 
			<div class="form-group">
				<label for="Date"><b>DateOfManufacture</b></label> <input
					type="date" id="Date" name="dateofmanufacture">
			</div>
			<div class="form-group">
				<label for="Rating"><b>Rating Out of 5</b></label> <select
					class="form-control" id="Rating" name="rating">
					<option class="form-control" id="Rating" name="rating"
						value="select">select</option>
					<option class="form-control" id="Rating" name="rating" value="1">1</option>
					<option class="form-control" id="Rating" name="rating" value="2">2</option>
					<option class="form-control" id="Rating" name="rating" value="3">3</option>
					<option class="form-control" id="Rating" name="rating" value="4">4</option>
					<option class="form-control" id="Rating" name="rating" value="5">5</option>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Update</button>
			<a href="/ProductManagementSystem">AddProduct</a>
		</form>
	</div>
</body>
</html>
