<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/2 0002
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%----%>
<form action="http://localhost:8080/JavaWeb_06_war_exploded/loginServlet" method="get">
    用户名：<input type="text" name="username" ><br>
    密码：<input type="password" name="password" ><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
