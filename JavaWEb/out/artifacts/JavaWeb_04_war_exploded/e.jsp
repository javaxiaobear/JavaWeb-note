<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/28 0028
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key1","value1");
    pageContext.setAttribute("key2","value2");
    request.setAttribute("key2","value2");
    session.setAttribute("key2", "value2");
    application.setAttribute("key2","value2");
%>
${applicationScope.key2}

<%
    request.setAttribute("req",request);
%>
<%=request.getScheme() %> <br>
1.协议： ${ req.scheme }<br>
2.服务器ip：${ pageContext.request.serverName }<br>
3.服务器端口：${ pageContext.request.serverPort }<br>
4.获取工程路径：${ pageContext.request.contextPath }<br>
5.获取请求方法：${ pageContext.request.method }<br>
6.获取客户端ip 地址：${ pageContext.request.remoteHost }<br>
7.获取会话的id 编号：${ pageContext.session.id }<br>
</body>
</html>
