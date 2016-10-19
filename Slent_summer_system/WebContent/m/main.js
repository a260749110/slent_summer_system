
  function ItemClass(n){
	  this.namea=n,
	  this.fun=function()
	  {
		  alert(this.namea);}
	  };
	  function init()
	  {
		    var a=new ItemClass('banc');
//			alert('start');
		    var yt={"a1":1,
		    		"a2":2};
		    
		    
			var t='abcd';
			$("input[name='nBtnCp']").each(function(index, element) {
				var t=index;
             element.onclick=function() {
            	 var gid=$(element).data("gid");
            	 var lines=null;
				 var n_ring=$('#right');
				 
            	 for(var i=0;i<n_group.length;i++)
            		 {
            		 if(n_group[i].id==gid)
            			 {
            			 $("input").remove(".button2");
            		
            			
            			 lines=n_group[i].data;
            			 for(var j=0;j<lines.length;j++)
            				 {
            				 var n_newLine=document.createElement("input");
    						 n_newLine.className ="button2";
    						 n_newLine.id="g_"+i+"l_"+j;
    						 n_newLine.type="button";
    						 n_newLine.value=value=lines[j].nName;
    						 n_newLine.setAttribute("data-gid",i);
    						 n_newLine.setAttribute("data-lid",j);
    						 
    						 $('#rignt_top').append(n_newLine	);
    						n_newLine.onclick=function ()
							{
								var index_i=this.getAttribute("data-gid");
								var index_j=this.getAttribute("data-lid");
								var l_self=n_group[index_i].data[index_j];
								var choice=l_self.otherChoice;
//								var choice=  (new Function("return " + temp))();
								
								alert(choice);
							}
    						   
//    						  alert($('#right').append(n_newLine	));
            				 }
            		
            			 }
            		 }
//				alert($(element).data("gid"));
				
				};
            });
			
			
			}
