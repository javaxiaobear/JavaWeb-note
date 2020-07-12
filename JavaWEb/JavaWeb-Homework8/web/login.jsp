<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29 0029
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login.jsp</title>
</head>
<body>
<%--获取错误信息--%>
<%
    Object msg = request.getAttribute("msg");
    if (msg == null) {
        response.getWriter().write("请登录！");
    }else {
        response.getWriter().println(msg);
    }
%>

<form action="http://localhost:8080/JavaWeb_Homework8_war_exploded/loginServlet" method="post">
    用户名:<input type="text" name="username" value="${cookie.username.value}"><br>
    密 码:  <input type="text" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
