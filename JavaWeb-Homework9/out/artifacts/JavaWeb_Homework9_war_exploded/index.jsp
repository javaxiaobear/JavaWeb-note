<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/4 0004
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <script>
    function reloadValidCode(o) {
      o.src = "${pageContext.request.contextPath }/servlet2?timed=" + new Date().getMilliseconds(); }
  </script>

  <img src="${pageContext.request.contextPath }/servlet2" title="看不清，点击刷新" onclick="reloadValidCode(this)"/>
  </body>
</html>
