<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/6 0006
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object user = session.getAttribute("user");
    if (user == null) {
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return;
    }
%>
<p>我是a.jsp</p>
</body>
</html>
