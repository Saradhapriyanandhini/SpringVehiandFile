<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title> registration and login </title>
</head>

<body>
	<form:form action="/VehicleManagementXMLConfig/user/add"  modelAttribute="user" method="POST">
	
		<input type="submit" value= "Add"/>
	</form:form>
	
	<form:form action="/VehicleManagementXMLConfig/user/view1" modelAttribute="user" method="POST">
		<input type="submit" value= "View"/>
	</form:form>
	
</body>
