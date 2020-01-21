<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>This is my Home</h3>
	
	<p>
		User : <security:authentication property="principal.username" />
		
	</p>
	<p>
		Role(s) : <security:authentication property="principal.authorities" />
	</p>
	<security:authorize access="hasRole('MANAGER')">
	
	
		<p>
			<a href="${pageContext.request.contextPath }/leaders">Go to Leaders Page</a>
		</p>
		
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath }/systems">Go to System Page</a>
		</p>
	</security:authorize>
		
	<form:form action="${pageContext.request.contextPath }/logout" 
	method="POST" >
	
		<input type="submit" value="Logout" />
	</form:form>

</body>
</html>