<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<html>
	<head>
		<title>Actor List</title>
	</head>
	<body>
		<h1>Actor List</h1>
		
		<c:url var="citySearchUrl" value="/actorlist" />
		
		<form action="${actors}" method="GET">
			<label for="countryCode">Country Code:</label>
			<input type="text" name="countryCode" />
			<input type="submit" value="Search" />
		
		</form>
	</body>

</html>






<%-- <!-- Form goes here -->
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table> --%>
<%@include file="common/footer.jspf"%>