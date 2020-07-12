<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/30 0030
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<form action="http://localhost:8080/JavaWeb_04_war_exploded/upload" method="post" enctype="multipart/form-data">
    用户名:<input type="text" name="username"><br>
    头像:<input type="file" name="photo"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
