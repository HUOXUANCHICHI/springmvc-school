<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/9/21
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>结果</title>
    <link href="../css/bookForm.css" rel="stylesheet">
</head>
<body>
<h2>当前用户信息:${sessionScope.msg}</h2>
<div class="school">
    <form>
        <table border="0" cellpadding="0" cellspacing="20">
            <tr>
                <td>图书编号:</td>
                <td>${book.bookId}<br></td>
            </tr>
            <tr>
                <td>图书名称:</td>
                <td>${book.bookName}<br></td>
            </tr>
            <tr>
                <td>图书价格:</td>
                <td>${book.price}<br></td>
            </tr>
            <tr>
                <td>库存:</td>
                <td>${book.total}<br></td>
            </tr>
            <tr>
                <td>出版社:</td>
                <td>${book.pubName}<br></td>
            </tr>
            <tr>
                <td>适用人群:</td>
                <td>${book.group}<br></td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
