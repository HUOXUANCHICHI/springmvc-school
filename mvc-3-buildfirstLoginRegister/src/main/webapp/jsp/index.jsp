<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
已注册:<a href="${pageContext.request.contextPath}/login">登录</a>
未注册:<a href="${pageContext.request.contextPath}/register">注册</a>
</body>
</html>