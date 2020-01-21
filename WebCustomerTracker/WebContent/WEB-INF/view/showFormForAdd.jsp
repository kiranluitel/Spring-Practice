<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>


<title>Add a customer</title>

<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
		  		  <style>
.error{
color:red
}
</style>

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		
		
			<!--  add our html table here -->
			
			<h3>Give the Customer Information</h3>
		<form:form action ="saveCustomer" modelAttribute = "customer" method="POST" >
		
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First Name</label> </td>
						<td><form:input path="firstName" 
							placeholder="Enter customer's first name here" />
							<form:errors path="firstName" cssClass="error" />
							
					</tr>
					<tr>
						<td><label>Last Name</label> </td>
						<td><form:input path="lastName" 
							placeholder="Enter customer's last name here" />
							<form:errors path="lastName" cssClass="error" />
							
					</tr>
					<tr>
						<td><label>Email</label> </td>
						<td><form:input path="email" 
							placeholder="Enter customer's email here" />
							<form:errors path="email" cssClass="error" />
							
					</tr>
										<tr>
						<td><label></label> </td>
						<td><input type="Submit" value="Save" class="save"/>
					</tr>
				</tbody>
				
			
				
		
				
						
			</table>
			</form:form>
				
		
	
	</div>
		<div style ="clear;both"></div>
				<p>
					<a href="${pageContext.request.contextPath}/customer/list"> Back To List</a>
				</p>

</body>
</html>