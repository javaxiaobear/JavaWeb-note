<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28 0028
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b.jsp</title>
</head>
<body>
<%--获取cookie--%>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        response.getWriter().write("<br>");
        response.getWriter().write("Cookie[ "+cookie.getName()+" = "+cookie.getValue()+" ] ");
        response.getWriter().write("<br>");
    }
%>
</body>
</html>
