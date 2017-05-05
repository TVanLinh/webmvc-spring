<%--
  Created by IntelliJ IDEA.
  User: linhtran
  Date: 03/05/2017
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:errors path="customer1.id"/>
    <form action="/form/xlctm5" method="post">
    <table>
        <tr><td >id: </td> <td><input  name="id"></td></tr>
        <tr><td >Name: </td> <td><input type="text" name="name"></td></tr>
        <tr><td>Commenent:</td> <td><textarea  name="comment"></textarea></td></tr>
        <tr>
            <td>Product: </td>
            <td>
                <select name="products" multiple >
                <option value="Mobile">Mobile</option>
                <option value="Labtop">Labtop</option>
                <option value="Desktop">Desktop</option>
                <option value="Mobile">Mobile</option>
                <option value="Labtop">Labtop</option>
                <option value="Desktop">Desktop</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Country</td><td><input type="text" name="address.country"/></td>
            <td>Street</td><td><input type="text" name="address.street"/></td>
        </tr>
        <tr><td></td><td><input type="submit" value="Send"></td></tr>
    </table>
    </form>
</body>
</html>
