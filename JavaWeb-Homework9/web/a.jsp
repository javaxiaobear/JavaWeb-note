<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/4 0004
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
%>
<a href="/JavaWeb_Homework9_war_exploded/servlet;JESSIOONID=<%=session1.getId()%>">点击1</a>
<a href="/JavaWeb_Homework9_war_exploded/servlet;JESSIOONID=<%=session1.getId()%>">点击2</a>
<a href="/JavaWeb_Homework9_war_exploded/servlet;JESSIOONID=<%=session1.getId()%>">点击3</a>
<%=response.encodeURL("/JavaWeb_Homework9_war_exploded/servlet")%>
</body>
</html>
