<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<h2>Login</h2>


<c:url var="loginUrl" value="/login"/>
<form:form method="POST" action="${loginUrl }" modelAttribute="login">
		
	<div>
		<label for="email">Email</label>
		<form:input path="email" placeholder="email"/>
		<form:errors path="email" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>
	
	<div>
		<label for="password">Password</label>
		<form:input path="password" placeholder="password" type="password" />
		<form:errors path="password" cssClass="error"/>
		<span style="color: red;" >*</span>
	</div><br>


	<div>
		<input style="color: white; background-color: blue;" type="submit" value="Submit"/>
	</div>
	
</form:form>
</html>