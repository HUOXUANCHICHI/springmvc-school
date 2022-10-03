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
                <td><label for="isbn">图书名称:</label></td>
                <td><input id="bname" type="text" name="bname" placeholder="请输入学校名" /><br></td>
            </tr>
            <tr>
                <td><label for="isbn">isbn:</label></td>
                <td><input id="isbn" type="text" name="isbn" placeholder="请输入学校名" /><br></td>
            </tr>
            <tr>
                <td><label for="author">作者:</label></td>
                <td><input id="author" type="text" name="author" placeholder="请输入学校名" /><br></td>
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
