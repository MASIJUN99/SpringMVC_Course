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


<h3>文件上传</h3>


<form action="user/fileUpload1" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"/><br/>
    <input type="submit" value="上传"/><br/>
</form>

<form action="user/fileUpload2" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"/><br/>
    <input type="submit" value="通过Spring上传"/><br/>
</form>

<form action="user/fileUpload3" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"/><br/>
    <input type="submit" value="跨服务器上传"/><br/>
</form>

</body>
</html>
