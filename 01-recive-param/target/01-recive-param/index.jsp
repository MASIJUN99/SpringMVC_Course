<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/22
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

简单类型添加：<br/>
<form action="student/regInfo" method="post">
    姓名：<input name="name" class="text"/>  <br/>
    邮箱：<input name="email" class="text"/> <br/>
    年龄：<input name="age" class="text"/>   <br/>
    <input type="submit" value="提交"/>
</form>


封装类型添加：<br/>
<form action="student/regInfo2" method="post">
    姓名：<input name="name" class="text"/>  <br/>
    邮箱：<input name="email" class="text"/> <br/>
    年龄：<input name="age" class="text"/>   <br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
