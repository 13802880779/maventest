/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _cdrquery__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    out.write(_jsp_string1, 0, _jsp_string1.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -8002497470487589159L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery.jsp"), 812310340114666647L, false);
    _caucho_depends.add(depend);
    loader.addDependency(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\"post\",\r\n            dataType: \"json\",\r\n          // url: \"/cube/cdrquery\",\r\n			url:'cdrdata.json',\r\n			data:params,\r\n			beforeSend:ajaxLoading,\r\n            success: function (data) {\r\n			//	alert(data.length);\r\n                var str = \"\";\r\n				var rows = [];\r\n                for (i in data) {\r\n				var row=new Object();\r\n					for(var x=0;x<theaders.length;x++)\r\n					{\r\n						row[\"r\"+x]=data[i][\"r\"+x];\r\n					//	alert(\r\n						//str+=row[\"f\"+x];\r\n					}\r\n				rows.push(row);\r\n                }\r\n				ajaxLoadEnd();\r\n				$('#divDatagrid1').html(tablestr);\r\n				\r\n				$('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', rows);\r\n		\r\n			},\r\n			failure:function (data) {  \r\n            alert('Failed');  \r\n			ajaxLoadEnd();\r\n			 }\r\n        });\r\n		\r\n		}\r\n	function ajaxLoading(){ \r\n    $(\"<div class=\\\"datagrid-mask\\\"></div>\").css({display:\"block\",width:\"100%\",height:$(window).height()}).appendTo(\"body\"); \r\n    $(\"<div class=\\\"datagrid-mask-msg\\\"></div>\").html(\"\u6b63\u5728\u5904\u7406\uff0c\u8bf7\u7a0d\u5019...\").appendTo(\"body\").css({display:\"block\",left:($(document.body).outerWidth(true) - 100) / 2,top:($(window).height() - 45) / 2}); \r\n } \r\n function ajaxLoadEnd(){ \r\n     $(\".datagrid-mask\").remove(); \r\n     $(\".datagrid-mask-msg\").remove();             \r\n} \r\n		\r\n		$(function(){\r\n			$('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());\r\n		\r\n		});	\r\n</script>\r\n</html>".toCharArray();
    _jsp_string0 = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>CDR\u5feb\u67e5</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n\r\n</head>\r\n<body style=\"padding:2px; margin:0px;\">\r\n	<table width=\"100%\" height=\"680\" border=\"0\" align=\"left\">\r\n        <tr>\r\n          <td valign=\"buttom\"><div style=\"text-align:left;margin:2px 0 2px 0;\">\r\n            \u9009\u62e9CDR\u7c7b\u578b\uff1a<input class=\"easyui-combobox\" id=\"cdrtype\" name=\"cdrtype\" style=\"width:200px;height:28px\"\r\n			data-options=\"url:'cdr_list.json',method:'get',valueField:'value',textField:'text',onSelect:onSelCdrType\">\r\n			&nbsp;&nbsp;\r\n		    \u5f00\u59cb\u65f6\u95f4\uff1a<input id=\"st\" class=\"easyui-datetimebox\" required style=\"width:146px;height:28px\">\r\n			&nbsp;&nbsp;\r\n			\u7ed3\u675f\u65f6\u95f4\uff1a<input id=\"et\" class=\"easyui-datetimebox\" required style=\"width:146px;height:28px\">\r\n			&nbsp;&nbsp;\r\n			\u7d22\u5f15\uff1a<input class=\"easyui-combobox\" id=\"idx\" name=\"idx\" style=\"width:120px;height:28px\"\r\n			data-options=\"url:'',method:'get',valueField:'value',textField:'text'\">\r\n			&nbsp;&nbsp;\r\n            \u503c\uff1a<input id=\"tt\" style=\"width:260px;height:28px\" data-options=\"\r\n			prompt: '\u8bf7\u8f93\u5165\u9700\u8981\u67e5\u8be2\u7684\u5185\u5bb9,\u9017\u53f7\u5206\u9694!',\r\n			icons:[{\r\n				iconCls:'icon-search',\r\n				handler: function(e){\r\n					var val = $(e.data.target).textbox('getValue');\r\n					var st=$('#st').datetimebox('getValue');\r\n					var et=$('#et').datetimebox('getValue');\r\n					var idx=$('#idx').combobox('getValue');\r\n					var target_table=$('#cdrtype').combobox('getValue');	\r\n					if(!target_table||!val||!st||!et)\r\n					{\r\n						alert('\u8f93\u5165\u9519\u8bef\uff0cCDR\u7c7b\u578b\u3001\u5f00\u59cb\u7ed3\u675f\u65f6\u95f4\u3001\u67e5\u8be2\u53f7\u7801\u4e0d\u80fd\u4e3a\u7a7a\uff0c\u6216\u53f7\u7801\u5fc5\u987b\u4e3a\u6570\u5b57\uff01');\r\n						return;\r\n					}\r\n\r\n					var ts1 = Date.parse(new Date(st.replace(/-/g,'/')));\r\n					var ts2 = Date.parse(new Date(et.replace(/-/g,'/')));\r\n					if(ts1>ts2)\r\n					{\r\n						alert('\u8f93\u5165\u9519\u8bef\uff0c\u5f00\u59cb\u65f6\u95f4\u4e0d\u80fd\u5927\u4e8e\u7ed3\u675f\u65f6\u95f4\uff01');\r\n						return;\r\n					}\r\n						\r\n					\r\n					//alert('target_table:'+target_table+'\\rstarttime:'+ts1+'\\rendtime:'+ts2+'\\ridx:'+idx+'\\rval:'+val);\r\n					onQuery(target_table,idx,val,ts1,ts2);		\r\n\r\n				}\r\n			}]\r\n			\">\r\n	<script>\r\n		$.extend($.fn.textbox.methods, {\r\n			addClearBtn: function(jq, iconCls){\r\n				return jq.each(function(){\r\n					var t = $(this);\r\n					var opts = t.textbox('options');\r\n					opts.icons = opts.icons || [];\r\n					opts.icons.unshift({\r\n						iconCls: iconCls,\r\n						handler: function(e){\r\n							$(e.data.target).textbox('clear').textbox('textbox').focus();\r\n							$(this).css('visibility','hidden');\r\n						}\r\n					});\r\n					t.textbox();\r\n					if (!t.textbox('getText')){\r\n						t.textbox('getIcon',0).css('visibility','hidden');\r\n					}\r\n					t.textbox('textbox').bind('keyup', function(){\r\n						var icon = t.textbox('getIcon',0);\r\n						if ($(this).val()){\r\n							icon.css('visibility','visible');\r\n						} else {\r\n							icon.css('visibility','hidden');\r\n						}\r\n					});\r\n				});\r\n			}\r\n		});\r\n		\r\n		$(function(){\r\n			$('#tt').textbox().textbox('addClearBtn', 'icon-clear');\r\n		});\r\n	</script>\r\n                      &nbsp;&nbsp;&nbsp;</div></td>\r\n        </tr>\r\n        <tr>\r\n          <td valign=\"top\">\r\n		  \r\n		  <div id=\"divDatagrid1\" style=\"width:100%;height:100%\">\r\n			<table id=\"dg\" title=\"\" style=\"width:100%;height:652px;nowrap:false\" data-options=\"\r\n				rownumbers:true,\r\n				singleSelect:true,\r\n				autoRowHeight:false,\r\n				pagination:true,\r\n				remoteSort:false,\r\n				fitColumns :true, \r\n				pageSize:50,\r\n				pageList:[50,100,500,1000],\r\n				onRowContextMenu: function(e, rowIndex, rowData) { \r\n                e.preventDefault();\r\n				$(this).datagrid('clearSelections');\r\n				$(this).datagrid('selectRow', rowIndex); \r\n                  $('#table_menu').menu('show', {\r\n					//\u663e\u793a\u53f3\u952e\u83dc\u5355\r\n                    left: e.pageX,//\u5728\u9f20\u6807\u70b9\u51fb\u5904\u663e\u793a\u83dc\u5355\r\n                    top: e.pageY\r\n                });\r\n            }\r\n			\">\r\n<div id=\"table_menu\" class=\"easyui-menu\" style=\"width: 50px; display: none;\">\r\n    <!--\u653e\u7f6e\u4e00\u4e2a\u9690\u85cf\u7684\u83dc\u5355Div-->\r\n    <div data-options=\"iconCls:'icon-save'\" onClick=\"onExportData()\">\u5bfc\u51fa</div>\r\n    <!--\u5177\u4f53\u7684\u83dc\u5355\u4e8b\u4ef6\u8bf7\u81ea\u884c\u6dfb\u52a0\uff0c\u8ddftoolbar\u7684\u65b9\u6cd5\u662f\u57fa\u672c\u4e00\u6837\u7684-->\r\n</div>\r\n			<thead>\r\n				<tr>\r\n					<th field=\"r0\" width=\"80\" sortable=\"true\">test</th>\r\n					<th field=\"r1\" width=\"100\" sortable=\"true\">test</th>\r\n					<th field=\"r2\" width=\"80\" sortable=\"true\">test</th>\r\n					<th field=\"r3\" width=\"80\" align=\"right\" >test</th>\r\n					<th field=\"r4\" width=\"80\" align=\"right\" >test</th>\r\n					<th field=\"r5\" width=\"100\" align=\"right\" >test</th>\r\n					<th field=\"r6\" width=\"110\">test</th>\r\n				</tr>\r\n			</thead>\r\n	</table>\r\n	</div>	</td>\r\n        </tr>\r\n\r\n</table>\r\n	</div>\r\n</body>\r\n<script language=\"javascript\">\r\nvar theaders=new Array();\r\n\r\n\r\nfunction onSelCdrType()\r\n{\r\n	var cdr_table_meta_url=\"cdr_table_meta/\"+$('#cdrtype').combobox('getValue')+\".json\";\r\n	var table_index_url=\"cdr_table_meta/\"+$('#cdrtype').combobox('getValue')+\"_IDX.json\";\r\n	//alert(table_index_url);\r\n	$('#idx').combobox('options').url=table_index_url;  \r\n	$('#idx').combobox('reload');\r\n	\r\n	theaders=new Array();\r\n	 $.ajax({\r\n            type: \"post\",\r\n            dataType: \"json\",\r\n			url:cdr_table_meta_url,\r\n            success: function (data) {\r\n                for (i in data) {				\r\n				theaders.push(data[i]['col']);\r\n                }\r\n		\r\n			},\r\n			failure:function (data) {  \r\n            alert('Failed to get table metadata!');  \r\n			//ajaxLoadEnd();\r\n			 }\r\n        });\r\n}\r\n\r\n		function getData(){\r\n			var rows = [];\r\n			//alert('here');\r\n			for(var i=1; i<=2; i++){\r\n				var amount = Math.floor(Math.random()*1000);\r\n				var price = Math.floor(Math.random()*1000);\r\n	\r\n				var row=new Object();\r\n				for(var x=0;x<7;x++)\r\n					row[\"r\"+x]=i*x;\r\n				\r\n				rows.push(row);\r\n			\r\n			}\r\n			return rows;\r\n		}\r\n		\r\n		function pagerFilter(data){\r\n		\r\n			if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array\r\n				data = {\r\n					total: data.length,\r\n					rows: data\r\n				}\r\n			}\r\n			var dg = $(this);\r\n			var opts = dg.datagrid('options');\r\n			var pager = dg.datagrid('getPager');\r\n			pager.pagination({\r\n				onSelectPage:function(pageNum, pageSize){\r\n					opts.pageNumber = pageNum; \r\n					opts.pageSize = pageSize;\r\n					\r\n					pager.pagination('refresh',{\r\n						pageNumber:pageNum,\r\n						pageSize:pageSize\r\n					});\r\n					dg.datagrid('loadData',data);\r\n				}\r\n			});\r\n			if (!data.originalRows){\r\n				data.originalRows = (data.rows);\r\n			}\r\n			var start = (opts.pageNumber-1)*parseInt(opts.pageSize);\r\n			var end = start + parseInt(opts.pageSize);\r\n			data.rows = (data.originalRows.slice(start, end));\r\n\r\n			return data;\r\n		}\r\n		\r\n	\r\n		function onQuery(tn,idx,val,st,et)\r\n		{\r\n				\r\n				var colstr=\"<thead><tr>\";\r\n				var width=170;\r\n		for(var x=0;x<theaders.length;x++)\r\n		{\r\n			if(x!=0)\r\n				width=80;\r\n			var str=\"<th field='r\"+x+\"' width='\"+width+\"'>\"+theaders[x]+\"</th>\";\r\n			//alert(str);\r\n			colstr+=str;\r\n	//		if(x!=theaders.length-1)\r\n	//			colstr+=\"\\r\";\r\n		}\r\n		\r\n		colstr+=\"</tr></thead></table>\";\r\n		var menu_option=\",onRowContextMenu: function(e, rowIndex, rowData) { e.preventDefault();$(this).datagrid('clearSelections');$(this).datagrid('selectRow', rowIndex);$('#table_menu').menu('show', {left: e.pageX,top: e.pageY});},onDblClickCell:function(rowIndex, field, value){addFilterByDbClick(field.replace('f',''),value);}\";\r\n		var tablestr='<table id=\"dg\" title=\"\" style=\"width:100%;height:652px;nowrap:false\" data-options=\"rownumbers:true,singleSelect:true,autoRowHeight:false,pagination:true,pageSize:50,pageList:[50,100,500,1000]'+menu_option+'\">'+colstr;\r\n		\r\n		\r\n		\r\n	//	var testsql=\"select * from kylin_category_groupings;\";\r\n	//	var root = $('#tt').tree('getRoot');\r\n		var params={idx:idx,val:val,tn:tn,st:st,et:et,rtype:\"jsontable\",user:\"admin\",pwd:\"admin511314\",limit:\"100000\"};\r\n	//alert('===>target_table:'+tn+'\\rstarttime:'+st+'\\rendtime:'+et+'\\ridx:'+idx+'\\rval:'+val);\r\n	 $.ajax({\r\n            type: ".toCharArray();
  }
}
