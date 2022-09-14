<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/9/5
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>register</title>
    <link href="../css/register.css" rel="stylesheet">
</head>
<body>
<div class="form-div">
    <div class="reg-content">
        <h1>REGISTER</h1>
        <span>已有帐号？</span> <a href="${pageContext.request.contextPath}/jsp/login.jsp">登录</a>
    </div>
<form action="${pageContext.request.contextPath}/hello/verifyRegister" id="reg-form" method="post">
    <p><label for="username">Username:</label><input id="username" name="username" type="text" placeholder="${msg}"></p>

    <p><label for="password">&nbsp;Password:</label><input id="password" name="password" type="password"></p>
    <div class="buttons">
        <input value="Register" type="submit" id="reg_btn">
    </div>
    <br class="clear">
</form>

</div>
</body>
</html>
