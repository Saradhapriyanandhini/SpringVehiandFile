<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>brake</title>
</head>
<body>
		<table>
			<c:forEach items="${brakelist}" var="brake">
				<tr>
				<td><c:out value="${brake.brakeId}"/>
					<td><c:out value="${brake.brakeDetails}"/>
					
				</tr>
			</c:forEach>
		</table>
		${msg }
</body>
</html>