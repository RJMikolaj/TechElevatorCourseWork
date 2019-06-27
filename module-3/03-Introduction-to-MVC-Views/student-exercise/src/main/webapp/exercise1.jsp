<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 1 - FizzBuzz</title>
<style>
li {
	list-style-type: none;
}

.fizz {
	color: blue;
}

.buzz {
	color: red;
}

.fizzbuzz {
	color: purple;
	font-size: 150%;
}
</style>
</head>
<body>
	<h1>Exercise 1 - FizzBuzz</h1>
	<ul>
		<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
		<c:forEach begin="1" end="100" var="number">
			<c:set var="cssStyle" value="" />
			<c:set var="fizzBuzzValue" value="${number}" />
			<c:choose>
				<c:when test="${number % 3 == 0}">
					<c:set var="cssStyle" value="fizz" />
					<c:set var = "fizzBuzzValue" value = "Fizz!" />
				</c:when>
				</c:choose>
				<li class="${cssStyle}">${fizzBuzzValue}</li>
		</c:forEach>
		
		
	</ul>
</body>
</html>