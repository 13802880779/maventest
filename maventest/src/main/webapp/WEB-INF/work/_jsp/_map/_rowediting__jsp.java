/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._map;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _rowediting__jsp extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("map/rowediting.jsp"), -3569406152368574191L, false);
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
    _jsp_string0 = "<!DOCTYPE html>\r\n\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>Row Editing in DataGrid - jQuery EasyUI Demo</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../jquery-easyui/demo/demo.css\">\r\n	<script type=\"text/javascript\" src=\"../jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"../jquery-easyui/jquery.easyui.min.js\"></script>\r\n</head>\r\n<body>\r\n	<h2>Row Editing in DataGrid</h2>\r\n	<p>Click the row to start editing.</p>\r\n	<div style=\"margin:20px 0;\"></div>\r\n	\r\n	<table id=\"dg\" class=\"easyui-datagrid\" title=\"Row Editing in DataGrid\" style=\"width:700px;height:320px;padding:0px;\"\r\n			data-options=\"\r\n				iconCls: 'icon-edit',\r\n				singleSelect: true,\r\n				toolbar: '#tb',\r\n				url: 'http://127.0.0.1:8080/getCellsInPolygon?points=[(113.27043,22.997208),(113.279017,22.999403),(113.276071,22.997873),(113.27449,22.999536),(113.269963,22.996942),(113.2714,22.994679),(113.268741,22.993149),(113.269459,22.98929),(113.273628,22.990621),(113.275137,22.989024),(113.28067,22.991619),(113.278946,22.994014),(113.280239,22.995012),(113.279305,22.996077),(113.280814,22.997474)]',\r\n				method: 'get',\r\n				onClickRow: onClickRow\r\n			\">\r\n		<thead>\r\n			<tr>\r\n				<th data-options=\"field:'id',width:100\">\u5c0f\u533aID</th>\r\n				<th data-options=\"field:'name',width:200\">\u5c0f\u533a\u540d\u79f0</th>\r\n				<th data-options=\"field:'nettype',width:60,sortable:true\">\u7f51\u7edc\u7c7b\u578b</th>\r\n				<th data-options=\"field:'GPS_LNG',width:80\">\u7ecf\u5ea6</th>\r\n				<th data-options=\"field:'GPS_LAT',width:80\">\u7eac\u5ea6</th>\r\n				<th data-options=\"field:'type',width:80,sortable:true\">\u5c0f\u533a\u7c7b\u578b</th>\r\n				<th data-options=\"field:'angle',width:80,sortable:true\">\u65b9\u5411\u89d2</th>\r\n			</tr>\r\n		</thead>\r\n	</table>\r\n\r\n	<div id=\"tb\" style=\"height:auto\">\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove',plain:true\" onClick=\"removeit()\">\u5220\u9664</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" onClick=\"accept()\">\u786e\u5b9a</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-undo',plain:true\" onClick=\"reject()\">\u53d6\u6d88</a>\r\n	</div>\r\n	\r\n	<script type=\"text/javascript\">\r\n		var editIndex = undefined;\r\n		function endEditing(){\r\n			return true;\r\n		/*	if (editIndex == undefined){return true}\r\n			if ($('#dg').datagrid('validateRow', editIndex)){\r\n				//$('#dg').datagrid('endEdit', editIndex);\r\n				editIndex = undefined;\r\n				return true;\r\n			} else {\r\n				return false;\r\n			}*/\r\n		}\r\n		function onClickRow(index){\r\n			if (editIndex != index){\r\n				if (endEditing()){\r\n					$('#dg').datagrid('selectRow', index)\r\n							.datagrid('beginEdit', index);\r\n					editIndex = index;\r\n				} else {\r\n					$('#dg').datagrid('selectRow', editIndex);\r\n				}\r\n			}\r\n		}\r\n		function append(){\r\n			if (endEditing()){\r\n				$('#dg').datagrid('appendRow',{status:'P'});\r\n				editIndex = $('#dg').datagrid('getRows').length-1;\r\n				$('#dg').datagrid('selectRow', editIndex)\r\n						.datagrid('beginEdit', editIndex);\r\n			}\r\n		}\r\n		function removeit(){\r\n			if (editIndex == undefined){return}\r\n			$('#dg').datagrid('cancelEdit', editIndex)\r\n					.datagrid('deleteRow', editIndex);\r\n			editIndex = undefined;\r\n		}\r\n		function accept(){\r\n			if (endEditing()){\r\n				$('#dg').datagrid('acceptChanges');\r\n			}\r\n		}\r\n		function reject(){\r\n			$('#dg').datagrid('rejectChanges');\r\n			editIndex = undefined;\r\n		}\r\n		function getChanges(){\r\n			var rows = $('#dg').datagrid('getChanges');\r\n			alert(rows.length+' rows are changed!');\r\n		}\r\n	</script>\r\n</body>\r\n</html>".toCharArray();
  }
}
