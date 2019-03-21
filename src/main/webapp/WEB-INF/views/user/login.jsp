<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h3>VEHICLE MANAGEMENT SYSTEM</h3>
	<h4>Login Page</h4>
<c:url var="action"  value="/user/view"></c:url>
	<form:form action="${action}" method="post" modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="username" >UserName</form:label></td>
				<td><form:input path="username"/></td>
				<td><form:errors path="username" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="passwordConf" showPassword="true"/></td>
                <td><form:errors path="passwordConf" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"  value="login"/></td>
			</tr>
		</table>
	</form:form>
${message }
</body>
</html>