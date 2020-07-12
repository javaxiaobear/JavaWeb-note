<%@ page import="com.xiaobear.pojo.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/27 0027
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setId(12);
    person.setPhone(new String[]{"18391242239","1234523121"});
    ArrayList<String> objects = new ArrayList<>();
    objects.add("湖南");
    objects.add("长沙");
    objects.add("上海");
    person.setCity(objects);
    Map<String, Object> map = new HashMap<>();
    map.put("Key1","value1");
    map.put("Key2","value2");
    map.put("Key3","value3");
    person.setMap(map);
    pageContext.setAttribute("p", person);
%>

输出person:${p}</br>
输出person id的属性：${p.id}
输出Person 的pnone 数组属性值：${p.phone[2]} <br>
输出Person 的city 集合中的元素值：${p.city} <br>
输出Person 的List 集合中个别元素值：${p.city[2]} <br>
输出Person 的Map 集合: ${p.map} <br>
输出Person 的Map 集合中某个key 的值: ${p.map.key3} <br>
</body>
</html>
