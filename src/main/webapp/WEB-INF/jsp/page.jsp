<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<html>
<head>

</head>
<body>
    <ol>
          <c:forEach items = "${paramValues}" var = "par">
             <li> ${par.key} : ${fn:join(par.value, ', ')} </li>
          </c:forEach>
    </ol>

    <p>Statistic:
    <br>
        <p> Counter for do Get: ${countDoGet}
        <p> Counter for do Post: ${countDoPost}
</body>

</html>