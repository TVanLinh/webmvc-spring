<%--
  Created by IntelliJ IDEA.
  User: linhtran
  Date: 03/05/2017
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>name: ${customer1.getName()}</p>
    <p>name: ${customer1.getComment()}</p>
    <c:forEach var="item" items="${customer1.getProducts()}" >
        <p><c:out value="${item}"/> </p>
    </c:forEach>
    <p>Address:${customer1.getAddress()}</p>
</body>
</html>
