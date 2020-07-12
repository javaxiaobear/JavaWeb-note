<%@ page import="java.util.List" %>
<%@ page import="com.xiaobear.pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/26 0026
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 1px blue solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px blue solid;
        }
    </style>
</head>
<body>
<%--jsp 输出一个表格，里面有10 个学生信息。--%>
<%
    List<Student> studentList = new ArrayList<Student>();
    for (int i = 0; i < 10; i++) {
        int t = i + 1;
        studentList.add(new Student("name"+t,t,18+t,"phone"+t));
    }
%>
<% for (Student student : studentList) { %>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
<tr>
    <td><%=student.getId()%></td>
    <td><%=student.getName()%></td>
    <td><%=student.getAge()%></td>
    <td><%=student.getPhone()%></td>
    <td>删除、修改</td>
</tr>
   <% } %>
</table>
</body>
</html>
