/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__jsp extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.jsp"), -7172790343799852852L, false);
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
    _jsp_string1 = "osed:true,iconCls:'icon-chart-pie'\" style=\"width:800px;height:480px;padding:10px;\">\r\n	  <table width=\"100%\" border=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td> \r\n              <div style=\" text-align:center\">&nbsp;&nbsp;\u7ef4\u5ea6:\r\n	<input class=\"easyui-combobox\" id=\"piechart_x\" name=\"piechart_x\" style=\"width:160px\"\r\n			data-options=\"valueField:'id',textField:'text',onSelect:onPieChartXChange,onUnselect:onPieChartXChange\">&nbsp;&nbsp;&nbsp;&nbsp;\u6307\u6807:\r\n	<input class=\"easyui-combobox\" id=\"piechart_y\" name=\"piechart_y\" style=\"width:160px\"\r\n			data-options=\"valueField:'id',textField:'text',onSelect:onPieChartYChange,onUnselect:onPieChartYChange\">\r\n              </div></td>\r\n        </tr>\r\n        <tr>\r\n          <td height=\"95%\"><div id=\"pie_chart_container\" style=\"min-width:760px;height:380px\"></div>\r\n		</td>\r\n        </tr>\r\n      </table>\r\n</div>\r\n	<div id=\"sql_windows\" class=\"easyui-window\" title=\"\u67e5\u770b SQL\" data-options=\"modal:true,closed:true,iconCls:'icon-chart-bar'\" style=\"width:600px;height:400px;padding:10px;\">\r\n	  	 <div id=\"sql\" style=\"width:100%; height:100%; overflow:auto;\"></div>\r\n	</div>	\r\n</body>\r\n\r\n</html>".toCharArray();
    _jsp_string0 = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>\u591a\u7ef4\u6570\u636e\u5206\u6790</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/cube-core.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/queryfilter.js\"></script>\r\n</head>\r\n<body style=\"padding:2px; margin:0px;\">\r\n<div style=\"margin-top:0px;\"><img src=\"pic/logo.jpg\"></div>\r\n\r\n	  <table width=\"100%\" height=\"608\" border=\"0\" >\r\n\r\n        <tr>\r\n          <td width=\"300px\" rowspan=\"2\" valign=\"top\"><div class=\"easyui-accordion\" style=\"width:300px;height:100%;\">\r\n            <div title=\"\u9009\u62e9 Cube\" data-options=\"iconCls:'icon-ok',collapsed:false,collapsible:false\" style=\"padding:5px;\">\r\n              <div>&nbsp;&nbsp;Cube:\r\n	<input class=\"easyui-combobox\" id=\"cubes\" name=\"cubes\" style=\"width:220px\"\r\n			data-options=\"url:'cube_list.json',method:'get',valueField:'value',textField:'text',onSelect:onReloadCube\">\r\n              </div>\r\n            </div>\r\n            <div title=\"\u9009\u62e9\u67e5\u8be2\u9879&nbsp;&nbsp;(\u66f4\u591a\u529f\u80fd\u8bf7\u70b9\u51fb\u53f3\u952e)\" data-options=\"iconCls:'icon-ok',collapsed:false\" style=\"overflow:auto;padding:10px;\">\r\n              <ul id=\"tt\" class=\"easyui-tree\" data-options=\"\r\n				url: 'dl_speed_cube.json',\r\n				method: 'get',\r\n				animate: true,\r\n				checkbox:true,\r\n				\r\n				onContextMenu: function(e,node){\r\n					e.preventDefault();\r\n					$(this).tree('select',node.target);\r\n					$('#mm').menu('show',{\r\n						left: e.pageX,\r\n						top: e.pageY\r\n					});\r\n				}\r\n			\">\r\n              </ul>\r\n              <div id=\"mm\" class=\"easyui-menu\" style=\"width:120px;\">\r\n\r\n				<div onClick=\"onAddFilter()\" data-options=\"iconCls:'icon-add'\">\u6dfb\u52a0\u8fc7\u6ee4</div>\r\n      				<div class=\"menu-sep\"></div>\r\n				<div onClick=\"onAddNewCal()\" data-options=\"iconCls:'icon-add'\">\u521b\u5efa\u6307\u6807</div>\r\n				<div onClick=\"OnRemove()\" data-options=\"iconCls:'icon-remove'\">\u5220\u9664\u6307\u6807</div>\r\n				<div class=\"menu-sep\"></div>\r\n				<div onClick=\"onOrderBy('asc')\" data-options=\"iconCls:'icon-add'\">\u5347\u5e8f</div>\r\n				<div onClick=\"onOrderBy('desc')\" data-options=\"iconCls:'icon-add'\">\u964d\u5e8f</div>\r\n              </div>\r\n\r\n            </div>\r\n			<div title=\"\u8fc7\u6ee4\u6761\u4ef6\" data-options=\"iconCls:'icon-filter',collapsed:false,collapsible:false,\r\n							tools:[{\r\n					iconCls:'icon-clear',\r\n					handler:function(){\r\n						//alert('click');\r\n						clear_all_filters();\r\n					}\r\n				}]\" style=\"padding:5px;\">\r\n              <div id=\"filter_show\" style=\"width:100%; height:60px; overflow:auto;\"><p>\u8fc7\u6ee4\u6761\u4ef6:</p>\r\n              </div>\r\n			 \r\n            </div>	\r\n			<div title=\"\u6392\u5e8f\" data-options=\"iconCls:'icon-redo',collapsed:false,collapsible:false,\r\n							tools:[{\r\n					iconCls:'icon-clear',\r\n					handler:function(){\r\n						//alert('click');\r\n						clear_all_sorters();\r\n					}\r\n				}]\" style=\"padding:5px;\">\r\n         	<div id=\"orderby_show\" style=\"width:100%; height:60px; overflow:auto;\"><p>\u6392\u5e8f\u6761\u4ef6:</p>\r\n              </div>\r\n            </div>		\r\n			\r\n          </div></td>\r\n          <td valign=\"top\" height=\"95%\">\r\n		  \r\n		  <div id=\"divDatagrid1\" style=\"width:100%;height:100%\">\r\n			<table id=\"dg\" title=\"\u67e5\u8be2\u7ed3\u679c \u3010\u9650\u5236\u8fd4\u56de10w\u6761\u4ee5\u5185\u3011\" style=\"width:100%;height:572px\" data-options=\"\r\n				rownumbers:true,\r\n				singleSelect:true,\r\n				autoRowHeight:false,\r\n				pagination:true,\r\n				remoteSort:false,\r\n				pageSize:50,\r\n				pageList:[50,100,500,1000],\r\n				onRowContextMenu: function(e, rowIndex, rowData) { \r\n                e.preventDefault();\r\n				$(this).datagrid('clearSelections');\r\n				$(this).datagrid('selectRow', rowIndex); \r\n                  $('#table_menu').menu('show', {\r\n					//\u663e\u793a\u53f3\u952e\u83dc\u5355\r\n                    left: e.pageX,//\u5728\u9f20\u6807\u70b9\u51fb\u5904\u663e\u793a\u83dc\u5355\r\n                    top: e.pageY\r\n                });\r\n            },\r\n			onDblClickCell:function(rowIndex, field, value){\r\n				addFilterByDbClick(field.replace('f',''),value);\r\n  			\r\n 			 }\r\n				\">\r\n<div id=\"table_menu\" class=\"easyui-menu\" style=\"width: 50px; display: none;\">\r\n    <!--\u653e\u7f6e\u4e00\u4e2a\u9690\u85cf\u7684\u83dc\u5355Div-->\r\n    <div data-options=\"iconCls:'icon-save'\" onClick=\"onExportData()\">\u5bfc\u51fa</div>\r\n    <!--\u5177\u4f53\u7684\u83dc\u5355\u4e8b\u4ef6\u8bf7\u81ea\u884c\u6dfb\u52a0\uff0c\u8ddftoolbar\u7684\u65b9\u6cd5\u662f\u57fa\u672c\u4e00\u6837\u7684-->\r\n</div>\r\n			<thead>\r\n				<tr>\r\n					<th field=\"f0\" width=\"80\" sortable=\"true\">test</th>\r\n					<th field=\"f1\" width=\"100\" sortable=\"true\">test</th>\r\n					<th field=\"f2\" width=\"80\" sortable=\"true\">test</th>\r\n					<th field=\"f3\" width=\"80\" align=\"right\" >test</th>\r\n					<th field=\"f4\" width=\"80\" align=\"right\" >test</th>\r\n					<th field=\"f5\" width=\"100\" align=\"right\" >test</th>\r\n					<th field=\"f6\" width=\"110\">test</th>\r\n				</tr>\r\n			</thead>\r\n	</table>\r\n	</div> \r\n\r\n\r\n\r\n	\r\n	</td>\r\n        </tr>\r\n        <tr>\r\n          <td valign=\"buttom\"><div style=\"text-align:center;margin:2px 0 2px 0;\">\r\n		    <input type=\"submit\"  name=\"btn_checksql\" value=\"\u67e5\u770bSQL\" onClick=\"onShowSQLWindows()\">\r\n                      &nbsp;&nbsp;&nbsp;&nbsp;\r\n            <input type=\"submit\"  name=\"Submit\" value=\"\u67e5\u8be2\" onClick=\"onQuery()\">\r\n                      &nbsp;&nbsp;&nbsp;&nbsp;\r\n			<input type=\"submit\" id=\"btn_export\" value=\"\u5bfc\u51fa\u7ed3\u679c\" onClick=\"onExportData()\">\r\n&nbsp;&nbsp;&nbsp;&nbsp;<a href='userguide.zip'>\u4f7f\u7528\u8bf4\u660e</a>\r\n          </div></td>\r\n        </tr>\r\n</table>\r\n	</div>\r\n	\r\n<div id=\"dlg\" class=\"easyui-dialog\" title=\"\u65b0\u589e\u8ba1\u7b97\u6307\u6807\" closed=\"true\" style=\"width:410px;height:220px;padding:5px\"\r\n			data-options=\"\r\n				iconCls: 'icon-save',\r\n				toolbar: '#dlg-toolbar',\r\n				buttons: '#dlg-buttons'\r\n			\">\r\n<table width=\"100%\" border=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"41%\">\u6307\u6807\u540d\u79f0:</td>\r\n    <td width=\"59%\"><input id=\"newKpiName\" type=\"text\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td>\u6307\u6807\u7b97\u6cd5:</td>\r\n    <td></td>\r\n  </tr>\r\n  <tr>\r\n    <td colspan=\"2\">\r\n        <textarea id=\"kpi_alg\" cols=\"50\" rows=\"6\"></textarea>\r\n    </td>\r\n    </tr>\r\n</table>\r\n	<div id=\"dlg-buttons\">\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onClick=\"javascript:addcalculation()\">\u4fdd\u5b58</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onClick=\"javascript:$('#dlg').dialog('close')\">\u5173\u95ed</a>\r\n	</div>\r\n</div>\r\n\r\n\r\n\r\n	<div id=\"filter_dlg\" class=\"easyui-dialog\" title=\"\u65b0\u589e\u8fc7\u6ee4\u6761\u4ef6\" closed=\"true\" style=\"width:410px;height:200px;padding:5px\"\r\n			data-options=\"\r\n				iconCls: 'icon-save',\r\n				toolbar: '#filter-dlg-toolbar',\r\n				buttons: '#filter-dlg-buttons'\r\n			\">\r\n<table width=\"100%\" border=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"41%\">\u8fc7\u6ee4\u6761\u4ef6:</td>\r\n    <td width=\"59%\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td colspan=\"2\">\r\n      <textarea id=\"filter_ta\" cols=\"50\" rows=\"4\"></textarea></td>\r\n    </tr>\r\n	<tr><td colspan=\"2\">\u5982:<br>lookup1.DAY_ID=20120101 and lookup2.city='\u5e7f\u5dde\u5e02'</td></tr>\r\n</table>\r\n	<div id=\"filter-dlg-buttons\">\r\n		<a id=\"filter_save_btn\" href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onClick=\"javascript:onSaveFilters()\">\u4fdd\u5b58</a>\r\n		<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onClick=\"javascript:$('#filter_dlg').dialog('close')\">\u5173\u95ed</a>\r\n	</div>\r\n	</div>	\r\n	\r\n	<div id=\"chart_windows\" class=\"easyui-window\" title=\"BarChart Window\" data-options=\"modal:true,closed:true,iconCls:'icon-chart-bar'\" style=\"width:800px;height:480px;padding:10px;\">\r\n	  <table width=\"100%\" border=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td> \r\n              <div style=\" text-align:center\">&nbsp;&nbsp;x\u5750\u6807:\r\n	<input class=\"easyui-combobox\" id=\"chart_x\" name=\"chart_x\" style=\"width:160px\"\r\n			data-options=\"valueField:'id',textField:'text',onSelect:onChartXChange,onUnselect:onChartXChange\">&nbsp;&nbsp;&nbsp;&nbsp;y\u5750\u6807:\r\n	<input class=\"easyui-combobox\" id=\"chart_y\" name=\"chart_y\" style=\"width:160px\"\r\n			data-options=\"valueField:'id',textField:'text',multiple:true,onSelect:onChartYChange,onUnselect:onChartYChange\">\r\n              </div></td>\r\n        </tr>\r\n        <tr>\r\n          <td height=\"95%\"><div id=\"chart_container\" style=\"min-width:760px;height:380px\"></div>\r\n		</td>\r\n        </tr>\r\n      </table>\r\n	</div>\r\n\r\n\r\n<div id=\"pie_chart_windows\" class=\"easyui-window\" title=\"PieChart Window\" data-options=\"modal:true,cl".toCharArray();
  }
}