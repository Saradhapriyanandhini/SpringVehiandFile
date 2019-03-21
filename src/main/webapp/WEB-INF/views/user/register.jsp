<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h3 style="centre">VEHICLE MANAGEMENT SYSTEM</h3>
	<h4 style="centre">Register Page</h4>
	<form:form  action="/VehicleManagementXMLConfig/user/valid" method="post" modelAttribute="user" style="centre">
		<table >
			<tr>	
				<td>Enter UserName:</td>
				<td><form:input path="username"/></td>
				<td><form:errors path="username" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				
				<td>Enter a password:</td>
                <td><form:password path="password"  showPassword="true"/></td>
                <td><form:errors path="password" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
                <td>Confirm your password:</td>
                <td><form:password path="passwordConf" showPassword="true"/></td>
                <td><form:errors path="passwordConf" cssStyle="color: #ff0000;"/></td>
            </tr>
			<tr>
				
				<td><input type="submit" name="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>