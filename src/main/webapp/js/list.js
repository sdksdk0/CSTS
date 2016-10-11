$('#filmList').datagrid({
    url:'film/list',
    method:'get',
	fitColumns:true,
	singleSelect:true,
	pagination:true,
	pageList:[5,10,20,50],
	columns:[[
        {field:'filmId',title:'编号',width:100,align:'center'},
        {field:'filmName',title:'姓名',width:100,align:'center'},
        {field:'filmType',title:'类型',width:100,align:'center',
        	formatter: function(value,row,index){
        		return value.typeName;
        	}
        
        },
        {field:'actor',title:'演员',width:100,align:'center'},
        {field:'director',title:'导演',width:100,align:'center'},
        {field:'ticketPrice',title:'票价',width:100,align:'center'},
        {field:'ticketCount',title:'票数',width:100,align:'center'},
        {field:'operator',title:'操作',width:100,align:'center', 
        	formatter: function(value,row,index){
			var returnStr = '<a class="downBtn" href="javascript:void(0);" onClick="down('
				+ index +')">下架</a>&nbsp;&nbsp;'
				+ '<a class="modifyBtn" href="javascript:void(0);" onClick="modifyUser('
				+ index +')">编辑</a>'
				+ '<script>$(".downBtn").linkbutton({iconCls: "icon-remove"});'
				+ '$(".modifyBtn").linkbutton({iconCls: "icon-edit"});</script>';
			return returnStr;
		}}]],
		toolbar:"#searchFilm"
});


function detailUser(index){
	var currRow = $('#listUser').datagrid("getRows")[index];
	$("#detailUser").dialog("open");
	$("#did").val(currRow.id);
	$("#dname").val(currRow.name);
	$("#dbirthday").val(currRow.birthday);
	$("#dgender").val(currRow.gender);
	$("#dcareer").val(currRow.career);
	$("#daddress").val(currRow.address);
	$("#dmobile").val(currRow.mobile);
}

$("#detailUser").dialog({
	width:300,
	closable :false,
	title:"用户详情"
});
$("#detailUser").dialog("close");

$("#closeDBtn").linkbutton({
	iconCls: "icon-cancel",
	onClick: function(){
		$("#detailUser").dialog("close");
	}});

function modifyUser(index){
	var currRow = $('#listUser').datagrid("getRows")[index];
	$("#modifyUser").dialog("open");
	$("#uid").val(currRow.id);
	$("#uname").val(currRow.name);
	$("#ubirthday").val(currRow.birthday);
	$("#ugender").val(currRow.gender);
	$("#ucareer").val(currRow.career);
	$("#uaddress").val(currRow.address);
	$("#umobile").val(currRow.mobile);
}

$("#modifyUser").dialog({
	width:300,
	closable :false,
	title:"修改用户"
});
$("#modifyUser").dialog("close");

$("#closeBtn").linkbutton({
	iconCls: "icon-cancel",
	onClick: function(){
		$("#modifyUser").dialog("close");
	}});

$("#modifyBtn").linkbutton({
	iconCls: "icon-ok",
	onClick: function(){
		//$("#modifyUser").dialog("close");
		$("#modifyForm").submit();
	}});

$("#modifyForm").form({
	url:"user/modify",
	success:function(data){
		$("#modifyUser").dialog("close");
		var data = data.trim();
		if(data == "true"){
			$('#listUser').datagrid("reload");
		}
		$.messager.show({
			title:'修改用户',
			msg: data == "true" ? "修改用户成功..." : "修改用户失败！！！",
			showType:'show',
			style:{
				top:document.body.scrollTop+document.documentElement.scrollTop + 20,
			}
		});

	}
});