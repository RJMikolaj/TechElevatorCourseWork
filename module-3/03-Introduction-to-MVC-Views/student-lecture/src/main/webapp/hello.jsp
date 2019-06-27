<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 1 - Example: Hello, Internet!</title>
		<style>
		.red {
			color: red;
			}
		.blue {
			color: blue;}
		</style>
	</head>
	<body>
		<c:choose>
			<%-- We can reference the values of request parameters
			(e.g. from the query string) by using the "param" map.
			
			Here we are testing to see whether a query string 
			parameter called "name" was provided, and if it wasn't
			(i.e. it's empty) we're defaulting the name to "Internet" --%>
			<c:when test="${empty param.name}">
				<c:set var="name" value="Internet" />
			</c:when>
			<c:otherwise>
				<c:set var="name" value="${param.name}" />
			</c:otherwise>
		</c:choose>
		
		<h1>Hello, ${name}!</h1>
		
		<c:if test="${name != 'Internet'}">
			<h2>You provided a Name!</h2>
			</c:if>
			
			<c:choose>
			<c:when test = "${empty param.lastname}">
				<h2>You didn't tell us your last name</h2>
				</c:when>
				<c:when test="${name == 'John' && param.lastname == 'Fulton'}">
				<h2>It's THE John Fulton</h2>
				</c:when>
				
	
		
	</body>
</html>