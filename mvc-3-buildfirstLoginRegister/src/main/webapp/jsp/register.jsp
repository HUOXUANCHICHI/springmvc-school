<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/9/5
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/RegisterServlet" id="form" method="post">
    <p><label for="username">账户:</label><input id="username" name="username" type="text"></p>

    <p><label for="password">密码:</label><input id="password" name="password" type="password"></p>
    <input type="submit" class="button" value="注册">
    <input type="reset" class="button" value="取消">&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/jsp/login.jsp">去登录</a>
</form>
</body>
</html>
