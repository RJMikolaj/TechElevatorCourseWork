<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>"

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name ="pageTitle" value="Planet Details" />
</c:import>

<c:forEach var="planet" items="${planets}" >
<c:import url="/WEB-INF/jsp/singlePlanet.jsp" />
</c:forEach>



<c:import url="/WEB-INF/jsp/footer.jsp"/>