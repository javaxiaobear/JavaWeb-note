<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29 0029
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b.jsp</title>
</head>
<body>
<%
    request.getSession().setAttribute("key","xiaobear");
    response.getWriter().write("已经在Session保存了数据！！！");
%>
</body>
</html>
