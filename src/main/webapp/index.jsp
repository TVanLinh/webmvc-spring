<html>
<body>
<h2>Hello World!</h2>
<a href="/form/signin"> dangki</a>
${sessionScope.name}
Cookie:<%
   // request.getCookies();
    for (Cookie cookie: request.getCookies()) {
        System.out.println(cookie.getName()+" : "+ cookie.getValue());
    }
%>

</body>
</html>
