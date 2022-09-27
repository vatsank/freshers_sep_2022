<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>
<link rel="icon" href="images/logo.png">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<form action="restaurant" method="post">


<div class="form-group">
	<label for="id">Restaurant Id</label>
	<input type="text" name="id" id="id" class="form-control"/>
</div>


<div class="form-group">
	<label for="restaurantName">Restaurant Name</label>
 	<input type="text" name="restaurantName" id="restaurantName" class="form-control" />
</div>

<div class="form-group">
	<label for="pinCode">Pin Code</label>
	<input type="text"  name="pinCode" id="pinCode" class="form-control"/>
</div>

<div class="form-group">
	<label for="cuisine">Mark Scored</label>
	<select name="cuisine" id="cuisine">
	<option value="VEG">Vegetarian</option>
		<option value="NONVEG">Non-Vegetarian</option>
		<option value="ITAL">Italian</option>
		<option value="MEX">Mexican</option>
			<option value="MULT">Multi-Cuisine</option>
		
	
	</select>
</div>

<div class="form-group">
 <input type="submit" value="Add"  class="btn btn-info"/>
</div>

</form>
</body>
</html>