<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<html>
<head>
<title>List</title>

<script>
	function Change() {

		switch (document.getElementById('s1').value) {
		case "brake":
			window.location = "brakeparts";
			break;

		case "mirror":
			window.location = "mirrorparts";
			break;

		case "door":
			window.location = "doorparts";
			break;
		case "steering wheel":
			window.location = "steeringparts";
			break;
		default:
			window.location = "../";
			break;
		}
	}
</script>
</head>
<body>

	<select id="s1" name="section" onChange="Change();">
		<option value="">Select</option>
		<option value="brake">Brake</option>
		<option value="mirror">Mirror</option>
		<option value="door">Door</option>
		<option value="steering wheel">Steering Wheel</option>
	</select>

</body>
</html>




