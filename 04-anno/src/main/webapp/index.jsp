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


<form action="student/testRequestParam" method="post">
    姓名：<input name="name" class="text"/>（必须）<br/>
    年龄：<input name="age" class="text"/>   <br/>
    邮箱：<input name="email" class="text"/>   <br/>
    <input type="submit" value="testRequestParam"/><br/>
</form>

<form action="student/testRequestBody" method="post">
    姓名：<input name="name" class="text"/><br/>
    年龄：<input name="age" class="text"/>   <br/>
    邮箱：<input name="email" class="text"/>   <br/>
    <input type="submit" value="testRequestBody"/><br/>
</form>

<form action="student/testPathVariable/10" method="post">
    <input type="submit" value="testPathVariable"/><br/>
</form>

<form action="student/testRequestHeader" method="post">
    <input type="submit" value="testRequestHeader"/><br/>
</form>

<form action="student/testCookieValue" method="post">
    <input type="submit" value="testCookieValue"/><br/>
</form>

<form action="student/testSessionAttribute" method="post">
    <input type="submit" value="testSessionAttribute"/><br/>
</form>

<form action="scope/testRequestScope" method="post">
    <input type="submit" value="查看request域requestScope"/><br/>
</form>

<form action="scope/testSessionScope" method="post">
    <input type="submit" value="查看session域sessionScope"/><br/>
</form>

<form action="student/getSessionAttribute" method="post">
    <input type="submit" value="getSessionAttribute"/><br/>
</form>

<form action="student/delSessionAttribute" method="post">
    <input type="submit" value="delSessionAttribute"/><br/>
</form>


</body>
</html>
