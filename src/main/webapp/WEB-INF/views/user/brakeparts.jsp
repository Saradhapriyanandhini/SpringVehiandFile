<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brake_Parts</title>
</head>
<body>
<form:form modelAttributre="brake" action="/VehicleManagementXMLConfig/user/brake" method="GET">
	<p>Please select the parts do you want?</p>
	<input type="checkbox" name="parts" value="Brake shoe" />Brake shoe
	<br />
	<input type="checkbox" name="parts" value="Brake Drum" />Brake Drum
	<br />
	<input type="checkbox" name="parts" value="Brake Disc" />Brake Disc
	<br />
	<input type="checkbox" name="parts" value="Brake Cables" />Brake
	Cables
	<br />
	<input type="checkbox" name="parts" value="Brake Lining" />Brake
	Lining
	<br />
	<input type="checkbox" name="parts" value="Brake Plates" />Brake
	Plates
	<br />
	<input type="checkbox" name="parts" value="Brake Petals" />Brake
	Petals
	<br />
	<input type="checkbox" name="parts" value="Brake Motor" />Brake Motor
	<br />
	<input type="checkbox" name="parts" value="Brake Yoke" />Brake Yoke
	<br />
	<input type="checkbox" name="parts" value="Brake Spider" />Brake
	Spider
	<br />
	<input type="checkbox" name="parts" value="Brake Casters" />Brake
	Casters
	<br />
	<input type="submit"  value="ADD"/>
	</form:form>
</body>
</html>