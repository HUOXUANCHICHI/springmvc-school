<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/9/21
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="../css/bookForm.css" rel="stylesheet">
</head>
<body>
<div class="school">
    <form method="post" action="${pageContext.request.contextPath}/book/addBook">
        <table border="0" cellpadding="0" cellspacing="20">
            <tr>
                <td>图书名称:</td>
                <td>${bname}<br></td>
            </tr>
            <tr>
                <td>isbn:</td>
                <td>${isbn}<br></td>
            </tr>
            <tr>
                <td>作者:</td>
                <td>${author}<br></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="提交" />
                    <input type="reset" value="重置" /> <br>
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
