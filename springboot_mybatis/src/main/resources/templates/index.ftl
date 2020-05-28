<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>

</head>
<body>
姓名： <input type="text"id="uname"value="${username!''} ">

<table width="500px"border="1"cellpadding="0"cellspacing="0">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>操作</td>
    </tr>
    <#--freemarker的循环结构语法 -->
    <#list empList as emp>
        <tr>
        <td>${emp.empno}</td>
        <td>${emp.ename}</td>
        <td>
    <a href="/find/${emp.empno}">查看</a>&nbsp;&nbsp;
    <a href="/edit/${emp.empno}">修改</a>&nbsp;&nbsp;
    <a href="/del/${emp.empno}">删除</a>&nbsp;&nbsp;
        </td>
        </tr>
    </#list>
</table>
</body>
</html>
