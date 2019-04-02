
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>手风琴菜单</title>
	<!-- start -->
	<link rel="stylesheet" href="statics/css/page.css" />
		<script type="text/javascript" src="statics/js/jquery.min.js" ></script>
		<script type="text/javascript" src="statics/js/index.js" ></script>
	<!-- end -->
    <script src="statics/js/adapter.js"></script> <!--rem适配js-->
	
    <link rel="stylesheet" href="statics/css/base.css"> <!--初始化文件-->
    <link rel="stylesheet" href="statics/css/menu.css"> <!--主样式-->
<!-- EasyUi需引入 -->
<link rel="stylesheet" type="text/css"
	href="statics/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="statics/easyui/themes/icon.css">
	<!-- 下面两个顺序固定 -->
<script type="text/javascript" src="statics/easyui/jquery.min.js"></script>
<script type="text/javascript" src="statics/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="statics/easyui/locale/easyui-lang-zh_CN.js"></script>
<!-- EasyUi引入完毕 -->
<script type="text/javascript" src="statics/js/easyuitest.js"></script>
<script src="statics/js/jquery-1.12.4.js"  type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	$(function(){
		$("h3").click(function(){
			
			var name = $(this).html();
			var isExists = $("#tabs").tabs("exists",name);
				if(isExists){
					// 存在,选中该选项卡
					$("#tabs").tabs("select",name);
				}else{
					// 不存在,打开一个选项卡
						$("#tabs").tabs('add',{    
							title:name,    
							content:"<iframe src='' style='width:100%;height:100%'></iframe>",    
							closable:true  
						});
					};
		});
	
	});

</script>

</head>
<body>

<div id="menu">
    <!--隐藏菜单-->
    <div id="ensconce">
        <h2>
            <img src="statics/images/show.png" alt="">
            实用后台管理系统
        </h2>
    </div>

    <!--显示菜单-->
    <div id="open">
        <div class="navH">
            实用后台管理系统
            <span><img class="obscure" src="statics/images/obscure.png" alt=""></span>
        </div>
        <div class="navBox">
            <ul>
                <li>
                    <h2 class="obtain">北京景点<i></i></h2>
                    <div class="secondary">
                        <h3 id="biaoti">故宫</h3>
                        <h3 id="biaoti">十三陵</h3>
                        <h3 id="biaoti">圆明园</h3>
                        <h3 id="biaoti">长城</h3>
                        <h3 id="biaoti">雍和宫</h3>
                        <h3 id="biaoti">天坛公园</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">南京景点<i></i></h2>
                    <div class="secondary">
                        <h3 id="biaoti">栖霞寺</h3>
                        <h3 id="biaoti">夫子庙</h3>
                        <h3 id="biaoti">海底世界</h3>
                        <h3 id="biaoti">中山陵</h3>
                        <h3 id="biaoti">乌衣巷</h3>
                        <h3 id="biaoti">音乐台</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">上海景点<i></i></h2>
                    <div class="secondary">
                        <h3 id="biaoti">东方明珠</h3>
                        <h3 id="biaoti">外滩</h3>
                        <h3 id="biaoti">豫园</h3>
                        <h3 id="biaoti">文庙</h3>
                        <h3 id="biaoti">世博园</h3>
                        <h3 id="biaoti">田子坊</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">深圳景点<i></i></h2>
                    <div class="secondary">
                        <h3 id="biaoti">华侨城</h3>
                        <h3 id="biaoti">观澜湖</h3>
                        <h3 id="biaoti">世界之窗</h3>
                        <h3 id="biaoti">东门老街</h3>
                        <h3 id="biaoti">七娘山</h3>
                        <h3 id="biaoti">光明农场</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">广州景点<i></i></h2>
                    <div class="secondary">
                        <h3 id="biaoti">白云山</h3>
                        <h3 id="biaoti">长隆</h3>
                        <h3 id="biaoti">黄花岗公园</h3>
                        <h3 id="biaoti">中山纪念堂</h3>
                        <h3 id="biaoti">华南植物园</h3>
                        <h3 id="biaoti">南沙湿地公园</h3>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
		<div class="top">
			<div class="leftTiyle" id="flTitle">业务人员管理</div>
			<div class="thisUser">当前用户：小UU</div>
		</div>
		<div class="content" >
			<!-- <table id="dg" class="easyui-datagrid" style="width:400px;height:250px" >
				<thead>
					<tr>
						<th data-options="field:'deptid',width:100">编码</th>
						<th data-options="field:'deptname',width:100">名称</th>
						<th data-options="field:'creattime',width:100,align:'right'">创建时间</th>
						<th data-options="field:'modifytime',width:100,align:'right'">修改时间</th>
						<th data-options="field:'deptdesc',width:100,align:'right'">部门描述</th>
						<th data-options="field:'remark',width:100,align:'right'">备注</th>
					</tr>
				</thead>
			</table> -->
			<!-- 选项卡 -->
			<div  id="tabs" class="easyui-tabs">
			 	<div title="Tab1" >ab1</div> 
			</div>	
		</div>
		<!-- <div  id="tabs1" style="width: 88%" class="easyui-tabs">
			 	<div title="Tab1" >ab1</div> 
			</div>	 -->
<script src="statics/js/menu.js"></script> <!--控制js-->
</body>
</html>
