<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="survey">
<form:form action="${surveyHref}" method="POST" modelAttribute="reviews">
<div class="username">
		
		<label for="username"> user name </label>
		<form:input path="username" />
		<form:errors path="username" cssClass="error" />
	</div>

	<div class="rating">
		Your Squirrel Cigar Parties for Dummies Rating
		<form:select path="rating">
			<option value="rating">One Star</option>
			<option value="rating">Two Stars</option>
			<option value="rating">Three Stars</option>
			<option value="rating">Four Stars</option>
			<option value="rating">Five Stars</option>
	</form:select>
	</div>
	
	<div class="review_title">
		<label for="review_title">Enter Review Title Here</label>
		<form:input path="review_title" />
		<form:errors path="review_title" cssClass="error" />
	</div>
	
		<div class="review_text">
		<label for="review_text">Enter Review Here</label>
		<form:input path="review_text" />
		<form:errors path="review_text" cssClass="error" />
	
	</div>
		</form:form>
	
	
	
	
	
</html>