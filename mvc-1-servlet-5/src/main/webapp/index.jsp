<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>login</title>
  <link href="css/login.css" rel="stylesheet">
</head>
<body>
<div id="loginDiv" style="height: 350px">
  <form action="${pageContext.request.contextPath}/loginServlet" id="form" method="post">
    <h1 id="loginMsg">LOGIN IN</h1>
    <div id="errorMsg">${requestScope.login_msg} ${requestScope.register_msg}</div>
    <p><label for="username">Username:</label><input id="username" name="username" value="${cookie.username.value}" type="text"></p>

    <p><label for="password">Password:</label><input id="password" name="password" value="${cookie.password.value}" type="password"></p>
    <p><label for="remember">Remember:</label><input id="remember" name="remember" value="1" type="checkbox"></p>
    <div id="subDiv">
      <input type="submit" class="button" value="login up">
      <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
      <a href="register.jsp">没有账号？</a>
    </div>
  </form>
</div>
</body>
</html>