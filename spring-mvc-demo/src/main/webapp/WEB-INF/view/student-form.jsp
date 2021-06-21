<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>
Student registration form
</title>
</head>
<body>
<!-- all the things when form is submitted will go into student object  -->
<form:form action="processForm" modelAttribute="student">
FirstName:<form:input path="firstName"/>
LastName:<form:input path="LastName"/>
<input type="submit" value="submit"/>
<!-- when form will be submitted it will call setter methids according to the path provided in the input that will go to madel attribute and then in student -->
Country
<!-- on submitting this form .setCounry() will be called  -->
<form:select path="country">
<form:options items="${student.countryOptions}"/>

<br><br>
<!-- when we submit this form Spring will call student.setFavouriteLanguage -->
Favourite Lang:
Java<form:radiobutton path="favouriteLanguage" value="Java"/>
C#<form:radiobutton path="favouriteLanguage" value="C#"/>
PHP<form:radiobutton path="favouriteLanguage" value="Php"/>
RUBY<form:radiobutton path="favouriteLanguage" value="Ruby"/>
<br><br>
Select operating system 
Linux<form:checkbox path="operatingSystem" value="linux"/>
Windows<form:checkbox path="operatingSystem" value="windows"/>
Mac os<form:checkbox path="operatingSystem" value="mac os"/>

</form:select>
</form:form>
</body>
</html>