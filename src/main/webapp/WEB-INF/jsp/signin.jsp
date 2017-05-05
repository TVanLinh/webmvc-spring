<%--
  Created by IntelliJ IDEA.
  User: linhtran
  Date: 03/05/2017
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .username
        {
            color: red;
        }
    </style>
</head>
<body>
    <form:form method="post" commandName="user" action="/form/xulydangki" >
        userName: <form:input path="userName" cssClass="username"/>
        PassWord: <form:input path="passWord"/>

        <input type="submit" value="Signin"/>
    </form:form>
</body>
</html>
