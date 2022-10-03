<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>沈工书城系统主页面</title>
</head>
<body>
<h1>${msg}</h1>
已注册:<a href="${pageContext.request.contextPath}/jsp/login.jsp">登录</a>
未注册:<a href="${pageContext.request.contextPath}/jsp/register.jsp">注册</a>
</body>
</html>