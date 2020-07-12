<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/28 0028
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//值为null 值的时候，为空
    request.setAttribute("emptyNull",null);
//值为空串的时候，为空
request.setAttribute("emptyStr","");
// 值是Object 类型数组，长度为零的时候
request.setAttribute("emptyArr",new Object[]{});
//list 集合，元素个数为零
request.setAttribute("emptyList",new ArrayList<>());
//map 集合，元素个数为零
    request.setAttribute("emptyMap",new HashMap<>());
%>
${ empty emptyNull } <br/>
${ empty emptyStr } <br/>
${ empty emptyArr } <br/>
${ empty emptyList } <br/>
${ empty emptyMap } <br/>
${100>120?"鄢汉雄很帅！！":"非常帅！！！"}

<%
    HashMap<String, Object> map = new HashMap<String,Object>();
    map.put("a.b.c","abc");
    map.put("a-b-c","a-b-c");
    request.setAttribute("map",map);
%>

${map['a.b.c']}
${map['a-b-c']}
</body>
</html>
