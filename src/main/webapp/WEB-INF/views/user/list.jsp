<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list</title>
</head>
<body>
<spring:url value="/user/register" var="register"/>
	<a href="${register}">Register</a>
	<spring:url value="/user/login" var="login"/>
	<a href="${login}">Login</a>
	<c:if test="${!empty userList }">
		<table>
			<tr>
				<th>ID</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td><c:out value="${user.userId}"/>
					<td><c:out value="${user.username}"/>
					<td><c:out value="${user.password}"/>
				</tr>
			</c:forEach>
		</table>
		</c:if>
</body>
</html>