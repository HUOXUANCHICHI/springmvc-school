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
                <td><label for="price">图书价格:</label></td>
                <td><input id="price" type="text" name="price" placeholder="请输入图书价格" /><br></td>
            </tr>

            <tr>
                <td><label for="total">总库存:</label></td>
                <td><input id="total" type="radio" name="total" value="有" checked />有
                <input type="radio" name="total" value="有">无
                </td>
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
                <td><label for="nature">适用人群:</label></td>
                <td><input id="nature" type="checkbox" name="nature" value="专科" checked />专科
                    <input type="checkbox" name="nature" value="本科">本科
                    <input type="checkbox" name="nature" value="硕士">硕士<br>
                </td>
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
