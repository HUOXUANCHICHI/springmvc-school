<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/9/5
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="../css/login.css" rel="stylesheet">
</head>
<body>
<div id="loginDiv" style="height: 350px">
    <form action="${pageContext.request.contextPath}/hello/verifyLogin" id="form" method="get">
        <h1 id="loginMsg">LOGIN IN</h1>
        <p><label for="username">Username:</label><input id="username" name="username" value="${username}" type="text" placeholder="${msg}"></p>

        <p><label for="password">&nbsp;Password:</label><input id="password" name="password" value="${password}" type="password"></p>
        <p><label for="remember">Remember:</label><input id="remember" name="remember" value="1" type="checkbox"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up"/>
            <input type="reset" class="button" value="reset"/>&nbsp;&nbsp;&nbsp;
        </div>
        <a href="${pageContext.request.contextPath}/jsp/register.jsp">没有账号？</a>
    </form>
</div>
</body>
</html>
