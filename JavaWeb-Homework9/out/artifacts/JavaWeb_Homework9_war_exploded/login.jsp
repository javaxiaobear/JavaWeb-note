<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/5 0005
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login.jsp</title>
</head>
<body>

<script>
    function changeImage(){
        document.getElementById("imc").src='http://localhost:8080/JavaWeb_Homework9_war_exploded/getKey';
    }
</script>
<%=request.getSession().getAttribute("randomString")%>
<form action="" method="get">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    验证码：<input type="text" name="checkkey">
    <img src="http://localhost:8080/JavaWeb_Homework9_war_exploded/getKey"
id="imc">
    <a href="http://localhost:8080/JavaWeb_Homework9_war_exploded/login.jsp?onclick=changeImage()" id="ch">看不清,换一张</a><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
