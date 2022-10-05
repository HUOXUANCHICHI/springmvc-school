<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>沈工书城系统index</title>
</head>
<body>
<h1>欢迎来到沈工书城系统</h1>
<br/>
<a href="${pageContext.request.contextPath}/hello/verifyLogin">登录</a><br>
<a href="${pageContext.request.contextPath}/hello/verifyRegister">注册</a><br>
<a href="${pageContext.request.contextPath}/hello/login">REST取路径地址</a><br>
<a href="${pageContext.request.contextPath}/hello/login2/zhangsan">REST取路径地址</a><br>
<a href="${pageContext.request.contextPath}/book/updateBook">修改图书</a>
<br>
<h1>${msg}</h1>
</body>
</html>