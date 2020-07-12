<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28 0028
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c.jsp</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("path", "path");
    cookie.setPath(request.getContextPath()+"/xiaobear");
    response.addCookie(cookie);
    response.getWriter().write("创建了一个带有path的Cookie");
%>
</body>
</html>
