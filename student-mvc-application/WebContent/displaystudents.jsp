<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">

table,tr,td,th{

border: 2px solid blue;

margin-left: auto;
margin-right: auto;
border-collapse: collapse;
}
</style>
<title>Student List</title>
</head>
<body>

<h1 style="text-align: center;">Student List</h1>
 <table>
 	<thead>
 		<tr>
 			<th>Roll Number</th>
 			<th>Student Name</th>
 			<th>Date of Birth</th>
 			<th>Mark Scored</th>
 		</tr>
 </thead>
 <tbody>
 <c:forEach items="${list}" var="eachItem">
 <tr>
  <td>${eachItem.rollNumber}</td>
  <td>${eachItem.firstName}</td>
  <td>${eachItem.dateOfBirth}</td>
  <td>${eachItem.markScored}</td>
 </tr>
 </c:forEach>
 </tbody>
 </table>

</body>
</html>