<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>
CUSTOMER REGISTRATION
</title>
<style>
.error {
color:red
}
</style>
</head>
<body>
Fill out the form * means it si required
<form:form action="processForm" modelAttribute="customer">
First name<form:input path="firstName"/>
Last name(*)<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>
Free Passes:<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
<input type="submit" value="submit"/>
<br><br>
PostalCode :<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br>
CourseCode :<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>
</form:form>
</body>
</html>