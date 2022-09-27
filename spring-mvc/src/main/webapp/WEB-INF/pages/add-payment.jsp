<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Payment</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<p style="color: #00FF00">${message}</p>

	<form:form method="post" modelAttribute="command" action="payment">
		<div class="form-group">
			<label>Payment Id</label>
			<form:input path="paymentId" id="paymentId" />
		</div>
		<div class="form-group">
			<label>Customer Name</label>
			<form:input path="customerName" id="customerName" />

		</div>
		<div class="form-group">
			<label>Amount</label>
			<form:input path="amount" id="amount" />
		</div>
		<div class="form-group">
			<label>Payment Date</label>
			<form:input path="paymentDate" id="paymentDate" type="date"/>
		</div>
		
		<div class="form-group">
			<input type="submit" value="Add">
		</div>
	</form:form>
</body>
</html>