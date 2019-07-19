<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>

<section>
<c:forEach var="actor" items="${actors}">
	<c:url var="dlink" value="/detail"













</c:forEach>
</section>






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