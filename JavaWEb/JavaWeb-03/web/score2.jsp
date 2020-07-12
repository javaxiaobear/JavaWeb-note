<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/23 0023
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>score.jsp页面</h2>
pageContext域是否有值：<%=pageContext.getAttribute("key") %><br>
request域是否有值：<%=request.getAttribute("key") %><br>
session域是否有值：<%=session.getAttribute("key") %><br>
application域是否有值：<%=application.getAttribute("key") %><br>
<%
    request.getRequestDispatcher("/score2.jsp").forward(request,response);
%>
</body>
</html>
