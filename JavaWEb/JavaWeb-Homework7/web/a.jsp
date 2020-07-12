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
    <title>a.jap</title>
</head>
<body>
<%--存放cookie--%>
<%
    Cookie cookie = new Cookie("key","value");
    response.addCookie(cookie);
    response.getWriter().write("创建成功！！！");
    Cookie cookie1 = new Cookie("default","default");
    cookie1.setMaxAge(-1);
    //cookie1.setMaxAge(-1); 浏览器一关就删除

    //cookie.setMaxAge(60 * 60); // 设置Cookie 一小时之后被删除。无效
    response.addCookie(cookie1);
%>
</body>
</html>
