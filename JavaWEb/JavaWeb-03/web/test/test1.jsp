<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/26 0026
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出99乘法表</title>
</head>
<body>
<h1 align="center">乘法表</h1>
<table align="center">
    <%
        for (int i = 0; i <= 9; i++) {  %>
          <tr>
          <%  for (int j = 1; j <= i; j++) {
    %>
    <td><%=j + "x" + i + "=" +(i*j) %></td>
    <%
        }
    %>
          </tr>
    <% }
    %>
</table>

</body>
</html>