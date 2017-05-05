<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:errors path="person.*"/>
<form action="/valid-view" method="post">
    <table>
        <tr>
            <td >Name: </td>
            <td>
                <input path="name" name="name"/>
                <form:errors path="person.name"/>
            </td>
        </tr>
        <tr><td >Gmail: </td> <td><input type="text" name="email"></td></tr>
        <tr><td>SoDT:</td> <td><input  type="text" name="phone"/></td></tr>
        <tr><td>BirthDay:</td> <td><input  type="date" name="birthDay"/></td></tr>
        <tr>
            <td>Country</td><td><input type="text" name="address.country"/></td>
            <td>Street</td><td><input type="text" name="address.street"/></td>
        </tr>

        <tr><td></td><td><input type="submit" value="Send"></td></tr>
    </table>
</form>
</body>
</html>
