<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>
Save customer 
</title>
<body>
<form:form action="saveCustomer" modelAttribute="customer" method="POST">
<form:hidden path="id"/>
<table>
<tr>
<td><label>First name</label></td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td><label>Last name</label></td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td><label>EMAIL</label></td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><input type="submit" value="save"/></td>
</tr>
</table>
</form:form>
<p>
<a href="${pageConetext.request.conetextPath}/web-customer-tracker/customer/list">Back to list</a>
</p>
</body>
</html>