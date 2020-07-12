<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/30 0030
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
保存之前：${requestScope.abc}
<c:set scope="session" var="abc" value="abcValue"></c:set>
保存之后：${sessionScope.abc}
<%--
ii.<c:if />
if 标签用来做if 判断。
test 属性表示判断的条件（使用EL 表达式输出）
--%>
<c:if test="${ 12 == 12 }">
    <h1>12 等于12</h1>
</c:if>
<c:if test="${ 12 != 12 }">
    <h1>12 不等于12</h1>
</c:if>
<%--<c:choose> <c:when> <c:otherwise>标签--%>
<%
    request.setAttribute("height",175);
%>
<c:choose>
    <c:when test="${requestScope.height} > 180">
        <h2>是巨人</h2>
    </c:when>
    <c:when test="${requestScope.height} < 170">
        <h2>还可以</h2>
    </c:when>
    <c:when test="${requestScope.height} > 185">
        <h2>超巨人</h2>
    </c:when><c:when test="${requestScope.height} > 180">
    <h2>可以</h2>
</c:when>
<c:otherwise>
    qita
</c:otherwise>
</c:choose>
</body>
</html>
