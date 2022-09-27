<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link rel="icon" href="images/logo.png">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<form action="addStudent" method="post">


<div class="form-group">
	<label for="rollNumber">Roll Number</label>
	<input type="text" name="rollNumber" id="rollNumber" class="form-control"/>
</div>


<div class="form-group">
	<label for="firstName">Student Name</label>
 	<input type="text" name="firstName" id="firstName" class="form-control" />
</div>

<div class="form-group">
	<label for="dateOfBirth">Date of Birth</label>
	<input type="date"  name="dateOfBirth" id="dateOfBirth" class="form-control"/>
</div>

<div class="form-group">
	<label for="markScored">Mark Scored</label>
	<input type="text" name="markScored" id="markScored" class="form-control"/>
</div>

<div class="form-group">
 <input type="submit" value="Add"  class="btn btn-info"/>
</div>

</form>
</body>
</html>