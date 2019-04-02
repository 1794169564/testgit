$(function(){
	$("#dg").datagrid({
		fit:true,
		url:'../BaseController?m=findWithPage',
		fitColumns:true,
		singleSelect:true,
		pagination:true,
		nowrap:false,
		pagePosition:'both',
			toolbar:[{
				text:'添加',
				iconCls:'icon-add',
				handler:function(){
					$("#adddept").dialog({
						closed:false,
						buttons:[{
							text:'提交',
							handler:function(){
								if($("#addDeptForm").form('validate')){
									//ajax提交
									$.post("../controllerName?m=saveDeptInfo",$("#addDeptForm").serialize());
									$("#adddept").dialog({
										closed:true
									});
									$("#dg").datagrid('reload');
									$("#addDeptForm").form('clear');
								}	
							}	
						},{
							text:'重置',
							handler:function(){
								$("#addDeptForm").form('clear');
								return;
							}
						}]
					
					});
				}
			},{
				text:'修改',
				iconCls:'icon-edit',
				handler:function(){
					if ($("#dg").datagrid('getSelected')==null) {
						$.messager.alert("提示信息","请选择要修改的数据","info");
					}else {
						$("#updatedept").form('load','../controller?m=findbyidDeptByIdInfo&f_id='+$("#dg").datagrid('getSelected').deptid);
						$("#updatedept").dialog({
							closed:false,
							buttons:[{
								text:'保存',
								handler:function(){
									if ($("#updateDeptForm").form('validate')) {
										$.post("../controller?m=updateDeptinfo&",$("#updateDeptForm").serialize());
										$("#updatedept").dialog({
											closed:true
										});
										$("#updateDeptForm").form('clear');
										$("#dg").datagrid('reload');
									}
								}
							},{
								text:'重置',
								handler:function(){
									$("#updateDeptForm").form('clear');
									return;
								}
							}]
						});
					}					
				}
			},{
				text:'删除',
				iconCls:'icon-remove',
				handler:function(){
					if ($("#dg").datagrid('getSelected') == null) {
						$.messager.alert('删除','请选择你要删除的数据','error');
						return;
					}else {
						$.messager.confirm('删除','你确定要删除吗',function(r){
							if (r) {
								$.post("../BaseDeptServlet?m=deleteDeptByidinfo%id="+$("#dg").datagrid('getSelected').deptid);
								$("#dg").datagrid('reload');
								$.messager.show({
									title:'我的消息',
									msg:'删除成功',
									timeout:1000,
									showType:'slide'
								});
							}
						});
					}
				}
			
			}]
	});


});