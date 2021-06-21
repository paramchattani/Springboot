<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>
Login page
</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">

<c:if test="${param.error!=null}">
<i>
Sorry invald username or password 
</i>
</c:if>
<c:if test="${param.logout!=null}">
<i>
You have been logout
</i>
</c:if>
<p>USERNAME</p>
<p>
<input type="text" name="username"/>
</p>
<br>
<p>PASSWORD</p> 
<p>
<input type="password" name="password"/>
</p>

<input type="submit" value="Login"/>

</form:form>
</body>
</html>