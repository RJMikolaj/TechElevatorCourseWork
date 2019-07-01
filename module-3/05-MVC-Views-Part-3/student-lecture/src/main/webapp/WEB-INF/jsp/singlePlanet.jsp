<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>"

<div>
	<h2><c:out value="{planet.name}" /></h2>
	
	<c:url var="planetImgUrl" value="/img${planet.imageName} }" />
	<img src="${planetImgUrl}" style="width:200px;" />
	
	<p>
		<b>AU from the Sun:</b><c:out value="${planet.auFromSun}" />
		<br />
		<b>Number of Moons:</b><c:out value="${planet.numberOfMoons}" />
	</p>
	
	
	</div>