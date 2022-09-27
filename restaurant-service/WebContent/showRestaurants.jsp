<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Restaurant List</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<h1 style="text-align: center;">Restaurant List</h1>
 <table class="table table-striped">
 	<thead>
 		<tr>
 			<th>Code Number</th>
 			<th>Restaurant Name</th>
 			<th>Cuisine</th>
 			<th>Pincode</th>
 		</tr>
 </thead>
 <tbody>
 <c:forEach items="${list}" var="eachItem">
 <tr>
  <td>${eachItem.id}</td>
  <td>${eachItem.restaurantName}</td>
  <td>${eachItem.cuisine}</td>
  <td>${eachItem.pinCode}</td>
 </tr>
 </c:forEach>
 </tbody>
 </table>

</body>
</html>