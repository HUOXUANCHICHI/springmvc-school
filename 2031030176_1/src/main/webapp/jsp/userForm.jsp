<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/10/19
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单</title>
    <link href="../css/bookForm.css" rel="stylesheet">
</head>
<body>
<h2>当前用户:${sessionScope.msg}</h2>
<div class="school">

    <fm:form modelAttribute="user" action="${pageContext.request.contextPath}/user/updateUser" method="get">
        昵称: <fm:input path="userName"/><br>
        真实姓名: <fm:input path="name"/><br>
        电话: <fm:input path="telephone"/><br>
        爱好:<td><fm:checkbox path="hobby" value="吃饭" label="吃饭"/>
                <fm:checkbox path="hobby" value="睡觉" label="睡觉"/>
                <fm:checkbox path="hobby" value="打豆豆" label="打豆豆"/><br>
        性别:<fm:radiobutton path="gender" value="男" label="男"/>
            <fm:radiobutton path="gender" value="女" label="女"/><br>
        学历:<fm:select path="degree">
            <fm:options items="${degreeTypeList}" itemLabel="degreeName" itemValue="degreeId"/>
        </fm:select><br>
        备注: <fm:textarea path="comments"/><br>
        状态: <fm:input path="state"/><br>
        <input type="submit" value="保存">
    </fm:form>
</div>
</body>
</html>
