<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
HOME !!!!
</head>
<form:form action="${pageContext.request.contextPath}/logout" method="post">
<input type="submit" value="Logout"/>

<security:authorize access="hasRole('MANAGER')">
<hr>
<p>
<a href="${pageContext.request.contextPath}/leaders">Leadership meetings</a>
(Only for Manager)

</p>
</hr>
</security:authorize>
User: <security:authentication property="principal.username"/>
Roel:<security:authentication property="principal.authorities"/>
</hr>
</form:form>
</html>