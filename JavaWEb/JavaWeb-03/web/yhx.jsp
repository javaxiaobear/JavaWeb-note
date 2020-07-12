<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/23 0023
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
    public int sb(){
        return 12;
    }
%>
<%--4、声明内部类--%>
<%!
    public static class Yhx{
        private Integer id = 10;
        private String abc = "abc";

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

<%--代码脚本----if 语句--%>
<%
    int i = 18;
    if (i == 10){
        System.out.println("你很帅！！！");
    }else{
        System.out.println("你是真的帅！！！");
    }
%>
<%--2. 代码脚本----for 循环语句--%>
<%
    for (int j = 0; j < 100; j++) {
        System.out.println(j);
    }
%>
<%--3. 翻译后java 文件中_jspService 方法内的代码都可以写--%>
<%
    String username = request.getParameter("username");
    System.out.println(username);
%>
</body>
</html>
