<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Add new Customer</title>
</head>
<body>

<div id="wrapper">
			<div id="header">
			<h2>Customer Relationship Manager - Spring - Add new Customer</h2>
			</div>
</div>
<br>
	<div class="container">
		
		<div class="col-md-4">
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" cssClass="form-control"/></td>
					</tr>
					
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" cssClass="form-control"/></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" cssClass="form-control"/></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><button type="submit" class="btn btn-success btn-block">Save</button></td>
					</tr>
				</tbody>
			</table>
		
		</form:form>
		
		<br>
		<p>
		<a href="${pageContext.request.contextPath}/customer/list">Back to the list</a>
		</p>
		</div>
	</div>
</body>
</html>