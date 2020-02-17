<%--
  Created by IntelliJ IDEA.
  User: mozuh
  Date: 17-02-2020
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Velkommen</title>
</head>

<body>

<h1>Velkommen, du er nu logget ind.</h1>

Du er logget på med navnet: ${requestScope.Navn}
<br>
<br>
<br>
Her kommer en liste af tilfældige folk:
<br>
<br>
<br>

<c:forEach var="element" items="${requestScope.liste}">

    ${element}
    <br>

</c:forEach>

<br>
<br>
<br>
Hvis du kunne tænke dig at vide hvor gamle de er, så kan du se det her:
<br>
<br>
<br>

<c:forEach var="element" items="${requestScope.map}">

    ${element.key} er ${element.value} år gammel.
    <br>

</c:forEach>

<br>
<br>
<br>
Her kommer der et set med deres navne:
<br>
<br>
<br>

<c:forEach var="element" items="${requestScope.set}">

    ${element}
    <br>

</c:forEach>

<br>
<br>

Et set holder kun på unikke værdier, så selvom der er 3 gange Anne i listen, vises navnet kun én gang.

</body>

</html>
