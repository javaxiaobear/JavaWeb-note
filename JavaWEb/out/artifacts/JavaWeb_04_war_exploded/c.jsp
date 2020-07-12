<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/27 0027
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--关系运算--%>
${1001 == 1001} or ${1001 eq 1001}<br>
${1001 != 1001} or ${1001 ne 1001}<br>
${1001 < 1004} or ${1001 lt 1001}<br>
${1001 > 1004} or ${1001 gt 1001}<br>
${1001 <= 1004} or ${1001 le 1001}<br>
${1001 >= 1004} or ${1001 ge 1001}<br>
<%--逻辑运算--%>
${14 == 10 && 10 < 14} or ${14 == 10 and 10 < 14}<br>
${14 == 10 || 10 < 14} or ${14 == 10 or 10 < 14}<br>
${!false} or ${not true}<br>
<%--算术运算--%>
${10 + 14}<br>
${520 - 250}<br>
${25 * 25}<br>
${99 / 3} or ${99 div 3}<br>
${100 % 3} or ${100 mod 3}<br>
</body>
</body>
</html>
