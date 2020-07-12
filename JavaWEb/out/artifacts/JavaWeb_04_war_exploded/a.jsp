<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/27 0027
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","request");
    session.setAttribute("key","session");
    application.setAttribute("key","application");
    pageContext.setAttribute("key","pageContext");
%>
<%----%>
表达式脚本输出的值是：<%=request.getAttribute("key")%></br>
EL表达式输出的值是：${key}
</body>
</html>
