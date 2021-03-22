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


<form action="class/addInfo" method="post">
    姓名：<input name="students[0].name" class="text"/>    <br/>
    邮箱：<input name="students[0].email" class="text"/>   <br/>
    年龄：<input name="students[0].age" class="text"/>     <br/>
    成绩：<input name="grades['one']" class="text"/> <br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
