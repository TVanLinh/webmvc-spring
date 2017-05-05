<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span{
            margin: 0px 20px;
        }
    </style>
</head>
<body>
    <c:forEach var="item" items="${requestScope.listUser}">
        <p>userName:${item.getUserName()}<span></span>passWord:${item.getPassWord()}</p>
    </c:forEach>
</body>
</html>
