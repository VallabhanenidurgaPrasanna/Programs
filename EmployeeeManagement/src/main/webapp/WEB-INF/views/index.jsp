<html>
<body>
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

<script>
	window.onload = function() {
		var checkboxes = document.getElementsByName("insurance");
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
<style>
body {
	background-image:
		url('https://images.blocksurvey.io/cdn-cgi/imagedelivery/G6cPOuGZ4Z_bEV13gBxixw/templates/concert-registration-form.svg/l');
}
a:active{
background-color:yellow;
}
a:hover{
color:green
}
a{
color:red;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center">Employee Registration Form</h1>
		<form action="addEmploye" method="post">
			<div class="form-group">
				<label for="exampleInputUsername"><b>EmployeeName</b></label> <input
					type="text" class="form-control" placeholder="Enter employee name"
					name="ename">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1"><b>Email</b></label> <input type="email"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="exampleInputSalary"><b>Salary</b></label> <input type="text"
					class="form-control" id="exampleInputSalary" placeholder="salary"
					name="salary">
			</div>
			<div class="form-group">
				<label for="exampleInputPhnno"><b>PhoneNumber</b></label> <input
					type="text" class="form-control" id="exampleInputPhnno"
					placeholder="phonenumber" name="phnno">
			</div>
			<div class="form-group">
				<label for="Gender"><b>Gender</b></label><br> <br> <label
					for="Gender">Male</label> <input type="radio" id="Gender"
					name="gender" value="male"><br><br> <label for="Gender">Female </label>
				<input type="radio" id="Gender" name="gender" value="female"><br><br>
				<label for="Gender">Others</label> <input type="radio" id="Gender"
					name="gender" value="Others">
			</div>
			 
			<div class="form-group">
				<label for="Insurance"><b>Insurance</b></label><br> <br> <label
					for="Insurance">Yes</label> <input type="checkbox" id="Insurance"
					name="insurance" value="yes"><br><br> <label for="Insurance">No</label>
				<input type="checkbox" id="Insurance" name="insurance" value="no">
				 
			</div>
			<div class="form-group">
				<label for="Department"><b>Department</b></label> <select
					class="form-control" id="Department" name="dept">
					<option class="form-control" id="Department" name="dept"
						value="select">select</option>
					<option class="form-control" id="Department" name="dept"
						value="Administration">Administration</option>
					<option class="form-control" id="Department" name="dept"
						value="Testing">Testing</option>
					<option class="form-control" id="Department" name="dept"
						value="Developer">Developer</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/EmployeeeManagement/getAll">GetAllEmployees</a>
		</form>
	</div>
</body>
</html>