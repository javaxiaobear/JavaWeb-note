<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/23 0023
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xiaobear.jsp</title>
</head>
<body>
<%--代码脚本 if语句--%>
<%
    int x = 10;
    if (x != 10){
        %>
<h1>xiaobear很棒！！！</h1>
<%}else{
        %>
<h2>xiaobear超棒！！！</h2>
<%}%>
<%--代码脚本 for语句--%>
<%
    for (int i = 0; i <10 ; i++) {
        System.out.println(i);
    }
%>
<%--3. 翻译后java 文件中_jspService 方法内的代码都可以写--%>
<%
    String username = request.getParameter("username");
    System.out.println(username);
%>
<%--1、声明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String,Object> map;
%>
<%--2、声明static 静态代码块--%>
<%!
    static {
        map = new HashMap<String,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
    }
%>
<%--3、声明类方法--%>
<%!
    public int fun(){
        return 0;
    }
%>

<%--表达式脚本练习：--%>
<%--1. 输出整型--%>
<%=12%>
<%--2. 输出浮点型--%>
<%=12.12%>
<%--3. 输出字符串--%>

<%="你是最棒的！"%>
<%--4. 输出对象--%>
<%=request.getParameter("username")%>
<%=map%>
</body>
</html>