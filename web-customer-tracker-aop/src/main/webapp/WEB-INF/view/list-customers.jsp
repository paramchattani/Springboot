<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
<title>
List Customer 
</title>
</head>
<body>
List Customers
<br><br>
<input type="button" value="Add Customer"
onclick="window.location.href='showFormForAdd';return false;"
/>

<table>
<tr>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
<th>Action</th>
</tr>
<c:forEach var="tempCustomer" items="${customers}">
<c:url var="updateLink" value="/customer/showFormForUpdate">
<c:param name="customerId" value="${tempCustomer.id}"/>
</c:url>
<c:url var="deleteLink" value="/customer/delete">
<c:param name="customerId" value="${tempCustomer.id}"/>
<!-- customerid will be in path and its value will be the clicked like customerid=1 -->
</c:url>
<tr>
<td>${tempCustomer.firstName}</td> <!--  it will call tempCustomer.getFirstname();-->
<td>${tempCustomer.lastName}</td>
<td>${tempCustomer.email}</td>
<td><a href="${updateLink}">Update</a>
|
<a href="${deleteLink}">Delete</a>
</td>
</tr>
</c:forEach>
</table>  
</body>
</html>