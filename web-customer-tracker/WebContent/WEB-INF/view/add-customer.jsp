<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"></link>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"></link>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Add customer</h2>
		</div>
	</div>

	<div id="container">
	<h3>Save customer</h3>
	
	<form:form action="saveCustomer" modelAttribute="customer" method="POST">
	
	<!-- need to associate this data with customer id -->
	<form:hidden path="id" />
	
		<table>
			<tbody>
				<tr>
					<td><label>First name:</label></td>
					<td><form:input path="firstName"/></td>
				</tr>
				<tr>
					<td><label>Last name:</label></td>
					<td><form:input path="lastName"/></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><form:input path="emailId"/></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save Customer" class="save"/></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	
	<div style="clear; both;"></div>
	
	<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
	
	</div>

</body>
</html>