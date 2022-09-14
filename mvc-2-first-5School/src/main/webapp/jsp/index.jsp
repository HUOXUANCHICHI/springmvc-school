<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>沈工书城系统index</title>
</head>
<body>
<h1>欢迎来到沈工书城系统</h1>
<br/>
已注册:<a href="${pageContext.request.contextPath}/hello/verifyLogin">登录</a>
未注册:<a href="${pageContext.request.contextPath}/hello/verifyRegister">注册</a>
<br>
<h1>${msg}</h1>
</body>
</html>