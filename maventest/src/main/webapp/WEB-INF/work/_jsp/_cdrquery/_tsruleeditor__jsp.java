/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._cdrquery;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _tsruleeditor__jsp extends com.caucho.jsp.JavaPage
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
    response.setContentType("text/html;charset=utf-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery/tsRuleEditor.jsp"), 8395244005578252773L, false);
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

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>\u6295\u8bc9\u6eaf\u6e90\u89c4\u5219\u7f16\u8f91\u5668</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">	\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/json2.js\"></script>\r\n</head>\r\n<body style=\"padding:2px\">\r\n	<h2>\u6295\u8bc9\u6eaf\u6e90\u89c4\u5219</h2>\r\n	\r\n	<table id=\"dg\" class=\"easyui-datagrid\" title=\"\" style=\"width:100%;height:560px; padding:0px\"\r\n			data-options=\"\r\n				iconCls: 'icon-edit',\r\n				rownumbers:true,\r\n				singleSelect: true,\r\n				toolbar: '#tb',\r\n				onClickRow: onClickRow\r\n			\">\r\n	</table>\r\n\r\n	<div id=\"tb\" style=\"height:auto\">\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add',plain:true\" onClick=\"append()\">\u6dfb\u52a0\u8bb0\u5f55</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove',plain:true\" onClick=\"removeit()\">\u5220\u9664\u8bb0\u5f55</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" onClick=\"accept()\">\u4fdd\u5b58</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-undo',plain:true\" onClick=\"reject()\">\u53d6\u6d88\u4fee\u6539</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\" onClick=\"getChanges()\">\u53d8\u66f4\u7edf\u8ba1</a>\r\n	</div>\r\n	<!--\u767b\u5f55\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"login_dlg\" class=\"easyui-dialog\" title=\"\u8bf7\u5148\u767b\u5f55\u540e\u4f7f\u7528\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:320px;height:300px;padding:0px;\">\r\n<div align=\"center\"><img src=\"images/login_man.jpg\" border=\"0\"></div>\r\n<table align=\"center\" width=\"100%\" cellpadding=\"2px\">\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u7528\u6237\u540d:</td><td><input id=\"userName\" class=\"easyui-textbox\"  style=\"width:180px;height:28px\"></td></tr>\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u5bc6&nbsp;&nbsp;&nbsp;\u7801:</td><td><input id=\"psw\" class=\"easyui-textbox\"  type=\"password\" style=\"width:180px;height:28px\"></td></tr>\r\n<tr ><TD></TD><td align=\"left\"><a href=\"#\" style=\"width:180px\" class=\"easyui-linkbutton\" onClick=\"login()\">\u767b\u5f55</a></td></tr>\r\n</table>\r\n</div>\r\n	<script type=\"text/javascript\">\r\n\r\n		var editIndex = undefined;\r\n		function endEditing(){\r\n			if (editIndex == undefined){return true}\r\n			if ($('#dg').datagrid('validateRow', editIndex)){\r\n				//var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});\r\n				//var productname = $(ed.target).combobox('getText');\r\n				//$('#dg').datagrid('getRows')[editIndex]['productname'] = productname;\r\n				$('#dg').datagrid('endEdit', editIndex);\r\n				editIndex = undefined;\r\n				return true;\r\n			} else {\r\n				return false;\r\n			}\r\n		}\r\n		function onClickRow(index){\r\n			if (editIndex != index){\r\n				if (endEditing()){\r\n					$('#dg').datagrid('selectRow', index)\r\n							.datagrid('beginEdit', index);\r\n					editIndex = index;\r\n				} else {\r\n					$('#dg').datagrid('selectRow', editIndex);\r\n				}\r\n			}\r\n		}\r\n		function append(){\r\n			if (endEditing()){\r\n				$('#dg').datagrid('appendRow',{status:'P'});\r\n				editIndex = $('#dg').datagrid('getRows').length-1;\r\n				$('#dg').datagrid('selectRow', editIndex)\r\n						.datagrid('beginEdit', editIndex);\r\n			}\r\n		}\r\n		function removeit(){\r\n			if (editIndex == undefined){return}\r\n			$('#dg').datagrid('cancelEdit', editIndex)\r\n					.datagrid('deleteRow', editIndex);\r\n			editIndex = undefined;\r\n		}\r\n		function accept(){\r\n			if (endEditing()){\r\n				$('#dg').datagrid('acceptChanges');				\r\n				var tRows=$('#dg').datagrid(\"getData\").rows;\r\n				var cols=$('#dg').datagrid(\"getColumnFields\");\r\n				var ruleData=new Array();\r\n				ruleData.push(cols.join(\"^\"));\r\n				\r\n				for(i in tRows)\r\n				{\r\n					var row=tRows[i];\r\n					var tmp=new Array();\r\n					for(j in cols)\r\n						tmp.push(row[cols[j]]);\r\n					ruleData.push(tmp.join(\"^\"));						\r\n				}\r\n				\r\n				saveSocRules(ruleData.join(\"\\n\"));\r\n				\r\n						\r\n			}\r\n		}\r\n		function reject(){\r\n			$('#dg').datagrid('rejectChanges');\r\n			editIndex = undefined;\r\n		}\r\n		function getChanges(){\r\n			var rows = $('#dg').datagrid('getChanges');\r\n			alert(\"\u5171\u4fee\u6539\u4e86 \"+rows.length+' \u884c\uff01');\r\n		}\r\n\r\nfunction saveSocRules(rules)\r\n{\r\n	var apiUrl=\"SocRuleEditor\";\r\n	var fromsys=getParam(\"fromSystem\");\r\n	var userName=getParam(\"userName\");	\r\n	var params={userName:userName,fromSystem:fromsys,method:'put',SocRules:rules};\r\n\r\n	//\u901a\u8fc7ajax\u5f02\u6b65\u8bfb\u53d6cdr\u67e5\u8be2\u63a5\u53e3\u6570\u636e\r\n	 $.ajax({\r\n			type: \"post\",\r\n			dataType: \"json\",\r\n			url:apiUrl,\r\n			data:params,			\r\n			success: function (data) {\r\n				if(data.errorCode!=undefined)\r\n				{\r\n					if(data.errorCode==1)\r\n					{\r\n						onLogin();\r\n						return;\r\n					}\r\n					alert(\"\u6570\u636e\u67e5\u8be2\u53d1\u751f\u9519\u8bef\uff0c\u670d\u52a1\u5668\u8fd4\u56de\uff1a\"+data.errorCode+\",\"+data.errorInfo);\r\n					return;\r\n				}\r\n				alert(data.result);\r\n			},\r\n			failure:function (data) {  \r\n			alert('Failed');  \r\n			\r\n			}\r\n		});\r\n		\r\n}\r\n\r\n		\r\nfunction getSocRules()\r\n{\r\n	var apiUrl=\"SocRuleEditor\";\r\n	var fromsys=getParam(\"fromSystem\");\r\n	var userName=getParam(\"userName\");\r\n\r\n	var params={userName:userName,fromSystem:fromsys,method:\"get\"};\r\n	 $.ajax({\r\n			type: \"post\",\r\n			dataType: \"json\",\r\n			url:apiUrl,\r\n			data:params,\r\n		//	beforeSend:ajaxLoading,\r\n			success: function (data)\r\n			{\r\n				if(data.errorCode!=undefined)\r\n				{\r\n					if(data.errorCode==1)\r\n					{\r\n						onLogin();\r\n						return;\r\n					}\r\n					alert(\"\u6570\u636e\u67e5\u8be2\u53d1\u751f\u9519\u8bef\uff0c\u670d\u52a1\u5668\u8fd4\u56de\uff1a\"+data.errorCode+\",\"+data.errorInfo);\r\n					return;\r\n				}\r\n			$('#dg').datagrid({\r\n				columns:[data.headers]\r\n			});	\r\n			$('#dg').datagrid('loadData', data.rows);\r\n			},\r\n			failure:function (data) {  \r\n			alert('Failed');  \r\n		//	ajaxLoadEnd();\r\n			}\r\n		});\r\n		\r\n}\r\nfunction onLogin()\r\n{\r\n	$('#login_dlg').dialog('open');\r\n}\r\nfunction login()\r\n{\r\n	var userName=document.getElementById(\"userName\").value;\r\n	var psw=document.getElementById(\"psw\").value;\r\n	var fromSystem=getParam(\"fromSystem\");\r\n	//alert(userName+\",\"+psw);\r\n	\r\n	var user_auth_url=\"getAuth?userName=\"+userName+\"&psw=\"+psw+\"&fromSystem=\"+fromSystem;\r\n	$.ajax({\r\n		type: \"post\",\r\n		dataType: \"json\",\r\n		url:user_auth_url,\r\n		success: function (data) {\r\n			//alert(data.xdrName);\r\n			if(data.errorCode!=6)\r\n			{\r\n				alert(\"\u8ba4\u8bc1\u9519\u8bef\uff0c\u670d\u52a1\u5668\u8fd4\u56de:\"+data.errorInfo);\r\n			}\r\n			else\r\n			{\r\n				$('#login_dlg').dialog('close');\r\n				alert(\"\u767b\u5f55\u6210\u529f\uff01\");\r\n				location.reload();\r\n			}\r\n		},\r\n		failure:function (data) {  \r\n		alert('Failed to get auth result!');  \r\n		//ajaxLoadEnd();\r\n		 }\r\n	});\r\n}\r\nfunction getParam(par){\r\n    //\u83b7\u53d6\u5f53\u524dURL\r\n    var local_url = document.location.href; \r\n    //\u83b7\u53d6\u8981\u53d6\u5f97\u7684get\u53c2\u6570\u4f4d\u7f6e\r\n    var get = local_url.indexOf(par +\"=\");\r\n    if(get == -1){\r\n        return 'unknown';   \r\n    }   \r\n    //\u622a\u53d6\u5b57\u7b26\u4e32\r\n    var get_par = local_url.slice(par.length + get + 1);    \r\n    //\u5224\u65ad\u622a\u53d6\u540e\u7684\u5b57\u7b26\u4e32\u662f\u5426\u8fd8\u6709\u5176\u4ed6get\u53c2\u6570\r\n    var nextPar = get_par.indexOf(\"&\");\r\n    if(nextPar != -1){\r\n        get_par = get_par.slice(0, nextPar);\r\n    }\r\n	\r\n    return get_par.replace(/#/,\"\");\r\n}\r\n$(function(){\r\ngetSocRules();\r\n});		</script>\r\n</body>\r\n</html>".toCharArray();
  }
}
