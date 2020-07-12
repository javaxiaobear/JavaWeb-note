<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29 0029
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>succ1.jsp</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    Object sname = session1.getAttribute("sname");
    if (sname == null) {
        request.setAttribute("msg","你还没有登录！");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return;
    }
%>

欢迎<%=sname%>

<a href="succ2.jsp">跳转至succ2.jsp</a>
</body>
</html>
