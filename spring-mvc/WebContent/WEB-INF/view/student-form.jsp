
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error{
color:red
}
</style>

<title>Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute= "student">
	First Name(*): <form:input path="firstname" />
	<form:errors path="firstname" cssClass="error" />
	<br><br>
	Required Number(*): <form:input path="requiredNumber" />
	<form:errors path="requiredNumber" cssClass="error" />
	<br><br>
	Last Name: <form:input path="lastname" />
	<form:errors path="lastname" cssClass="error" />
	<br><br>
	<form:select path="country" >
	<form:option value="Brazil" label="Brazil"/>
	<form:option value="India" label="India"/>
	<form:option value="USA" label="USA"/>
	<form:option value="Russia" label="Russia"/>
	</form:select>
	<%-- <br><br>
	
	<form:select path="sex" >
	<form:options items = "${student.sexOption }"/>
	
	</form:select> --%>
	<br><br>
	
	<form:radiobuttons path="sex" items="${student.sexOption}" />
	
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>
	
</body>
</html>