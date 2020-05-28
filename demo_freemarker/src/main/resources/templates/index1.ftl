<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <script src="js/jquery-1.12.4.js"></script>
    <script>
        /*使用ajax 异步传输，获取json对象*/
        $(function(){
            $("#uname").blur(function(){
                $.getJSON("/checkName",function (data) {
                    alert(data.userName);
                })
            });
        });
    </script>
</head>
<body>
<h2>首页<h2>

        <img src="images/btn-bg.png">
        姓名： <input type="text"id="uname">
</body>
</html>
