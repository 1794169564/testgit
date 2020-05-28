<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>

</head>
<body>
<h1>增加</h1>
<form action="doAdd" method="post">
        <table width="500px" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td>编号：</td>
                <td><input type="text" name="empno"></td>
            </tr>
            <tr> <td>姓名：</td>
                 <td><input type="text" value="" name="ename"></td>
            </tr>
            <tr> <td>收入：</td>
                <td><input type="text" value="" name="sal"></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="保存">
                </td>
            </tr>
        </table>
</form>
</body>
</html>