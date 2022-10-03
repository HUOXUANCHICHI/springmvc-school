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
    <title>表单</title>
    <link href="../css/bookForm.css" rel="stylesheet">
</head>
<body>
<h2>当前用户:${sessionScope.msg}</h2>
<div class="school">
    <form method="post" action="${pageContext.request.contextPath}/book/addBook">
        <table border="0" cellpadding="0" cellspacing="20">
            <tr>
                <td><label for="bookId">图书编号:</label></td>
                <td><input id="bookId" type="text" name="bookId" placeholder="请输入图书编号" /><br></td>
            </tr>
            <tr>
                <td><label for="bookName">图书名称:</label></td>
                <td><input id="bookName" type="text" name="bookName" placeholder="请输入图书名称" /><br></td>
            </tr>
            <tr>
                <td><label for="bookType">图书类别：</label></td>
                <td><input id="bookType" type="text" name="bookType" placeholder="请输入图书类型名称" />
            </tr>
            <tr>
                <td><label for="author">作者:</label></td>
                <td><input id="author" type="text" name="author" placeholder="请输入作者"/><br></td>
            </tr>
            <tr>
                <td><label for="price">价格:</label></td>
                <td><input id="price" type="text" name="price" placeholder="请输入价格"/><br></td>
            </tr>
            <tr>
                <td><label for="isbn">isbn:</label></td>
                <td><input id="isbn" type="text" name="isbn" placeholder="请输入isbn" /><br></td>
            </tr>
            <tr>
                <td><label for="nowNumber">现存量:</label></td>
                <td><input id="nowNumber" type="text" name="nowNumber" placeholder="请输入现存量" /><br></td>
            </tr>
            <tr>
                <td><label for="total">总库存:</label></td>
                <td><input id="total" type="text" name="total" placeholder="请输入总库存" /><br></td>
            </tr>
            <tr>
                <td><label for="pubName">出版社：</label></td>
                <td>
                    <select name="pubName" id="pubName">
                        <option disabled="disabled" value="">-请选择-</option>
                        <option value="北京理工大学出版社">北京理工大学出版社</option>
                        <option value="清华大学出版社">清华大学出版社</option>
                        <option value="人民邮电出版社">人民邮电出版社</option>
                    </select></td>
            </tr>
            <tr>
                <td><label for="caseName">书架：</label></td>
                <td>
                    <select name="caseName" id="caseName">
                        <option disabled="disabled" value="">-请选择-</option>
                        <option value="TP">TP</option>
                        <option value="CM">CM</option>
                        <option value="OC">OC</option>
                    </select></td>
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
