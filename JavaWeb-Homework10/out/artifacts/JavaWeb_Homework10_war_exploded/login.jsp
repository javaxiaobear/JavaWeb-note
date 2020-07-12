<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/5 0005
  Time: 16:38
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
        document.getElementById("imc").src='http://localhost:8080/JavaWeb_Homework10_war_exploded/imageOut';
    }
</script>

<%
    Object msg = request.getAttribute("msg");
    if (msg == null) {
        response.getWriter().write("");
    }else {
        response.getWriter().print(msg);
    }
%>
<%
    Object msg1 = request.getAttribute("msg1");
    if (msg1 == null) {
        response.getWriter().write("");
    }else {
        response.getWriter().print(msg1);
    }
%>
<form action="http://localhost:8080/JavaWeb_Homework10_war_exploded/loginServlet" method="get">
    用户名：<input type="text" name="username"><br>
    密码 ： <input type="text" name="password"><br>
    验证码：<input type="text" name="checkKey">
    <img src="http://localhost:8080/JavaWeb_Homework10_war_exploded/imageOut"
         id="imc">
    <a href="http://localhost:8080/JavaWeb_Homework10_war_exploded/login.jsp?onclick=changeImage()" id="ch">看不清,换一张</a><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
