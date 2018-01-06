<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<title>Customer Relationship Manager - Spring</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
		<h2>Customer Relationship Manager - Spring</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<div class="col-md-2">
			<button type="submit" class="btn btn-primary btn-block" 
			onclick="window.location.href='showFormAdd'; return false;">Add Customer</button>
			</div>
			<br>
			<table class="table table-striped" align="center">
				<thead>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Address</th>
					<th>Update</th>
				</thead>
				<c:forEach var="customer" items="${listCustomer}">
					<c:url var="updateLink" value="customer/showFormForUpdate">
						<c:param name="customerId" value="${customer.id}" />
					</c:url>
				
					<tr>
						<td> ${customer.firstName}</td>
						<td> ${customer.lastName}</td>
						<td> ${customer.email}</td>
						<td> <a href="${updateLink}">Update</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>