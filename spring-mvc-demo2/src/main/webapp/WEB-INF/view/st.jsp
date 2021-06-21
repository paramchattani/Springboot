<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>
hello world -input form
</title>
</head>
<body>
<form action="processform" method="GET">
<span>Name please:</span><input name="name" value="name" type="text" placeholder="type name"/>
<span>Age please:</span><input name="age" value="age" type="text" placeholder="type age"/>
<input type="submit"/>
</form>
</body>
</html>