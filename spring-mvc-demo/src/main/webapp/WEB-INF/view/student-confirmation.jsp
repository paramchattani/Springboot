<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>
Student confirmation
</title>
</head>
<body>
the student is confirmed ;${student.firstName} 
the student is from ${student.country}
the student codes in ${student.favouriteLanguage} 
Operating systems
<ul>
<c:forEach var="temp" items="${student.operatingSystem}">
<li> ${temp} </li>
</c:forEach>
</ul> 
</body>
</html>
