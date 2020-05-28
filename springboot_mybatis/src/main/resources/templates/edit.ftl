<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>

</head>
<body>
<h1>修改</h1>
<form action="../doEdit" method="post">
        <table width="500px" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td>编号：</td>
                <td>#{emp.empno}
                    <input type="hidden" value="#{emp.empno}" name="empno">
                </td>
            </tr>
            <tr> <td>姓名：</td>
                 <td><input type="text" value="${emp.ename}" name="ename"></td>
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