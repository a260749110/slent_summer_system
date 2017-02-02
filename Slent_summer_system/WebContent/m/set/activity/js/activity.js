


function addGroup(id) {
	var group=$("#groupSelect_"+id).val();
	var befor=$("input[id='groups_"+id+"']").textbox("getValue");
	if(befor.length!=0)
		{
		befor+=",";
		}
	befor+=group;
	$("input[id='groups_"+id+"']").textbox("setValue",befor);
};
function deleteGroup(id) {

	var group=$("#groupSelect_"+id).val();
	var befor=$("input[id='groups_"+id+"']").textbox("getValue");
	var strs=befor.split(",");
	befor="";
	for(var i=0; i< strs.length;i++)
		{
		var str=strs[i];
		if(str.length!=0&&str!=group)
			{
			if(befor.length!=0)
				{
				befor+=",";
				}
			befor+=str;
			}
		
		}
	$("input[id='groups_"+id+"']").textbox("setValue",befor);
};


function addLine(id) {
	var group=$("#lineSelect_"+id).val();
	
	var befor=$("input[id='lines_"+id+"']").textbox("getValue");
	if(befor.length!=0)
		{
		befor+=",";
		}
	befor+=group;
	$("input[id='lines_"+id+"']").textbox("setValue",befor);
};
function deleteLine(id) {

	var group=$("#lineSelect_"+id).val();
	var befor=$("input[id='lines_"+id+"']").textbox("getValue");
	var strs=befor.split(",");
	befor="";
	for(var i=0; i< strs.length;i++)
		{
		var str=strs[i];
		if(str.length!=0&&str!=group)
			{
			if(befor.length!=0)
				{
				befor+=",";
				}
			befor+=str;
			}
		
		}
	$("input[id='lines_"+id+"']").textbox("setValue",befor);
};

function addWeek(id) {
	var group=$("#weekSelect_"+id).val();
	
	var befor=$("input[id='weeks_"+id+"']").textbox("getValue");
	if(befor.length!=0)
		{
		befor+=",";
		}
	befor+=group;
	$("input[id='weeks_"+id+"']").textbox("setValue",befor);
};
function deleteWeek(id) {

	var group=$("#weekSelect_"+id).val();
	var befor=$("input[id='weeks_"+id+"']").textbox("getValue");
	var strs=befor.split(",");
	befor="";
	for(var i=0; i< strs.length;i++)
		{
		var str=strs[i];
		if(str.length!=0&&str!=group)
			{
			if(befor.length!=0)
				{
				befor+=",";
				}
			befor+=str;
			}
		
		}
	$("input[id='weeks_"+id+"']").textbox("setValue",befor);
};