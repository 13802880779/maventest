/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._cdrquery;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _cdrquery2_02__jsp extends com.caucho.jsp.JavaPage
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
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
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
              javax.servlet.http.HttpSession session,
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

    
String fromSys=request.getParameter("fromSystem");
if(fromSys==null||fromSys.equals(""))
	response.sendRedirect("forbiddenaccess.jsp");

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
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery/cdrquery2_2.jsp"), 1518474496551983595L, false);
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
    _jsp_string0 = "\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>\u5ba2\u670d\u4e0a\u7f51\u65e5\u5fd7\u67e5\u8be2</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n<!--	<script type=\"text/javascript\" src=\"js/datagrid-scrollview.js\"></script>-->\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/json2.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/cdrquery2.js\"></script>\r\n</head>\r\n\r\n<body style=\"padding:2px; margin:0px;\">\r\n<div id=\"divDatagrid1\" style=\"width:100%;height:100%\">\r\n		<table id=\"dg\" title=\"\" style=\"width:100%;height:300px;nowrap:false\" data-options=\"\r\n			toolbar:'#tb',\r\n			rownumbers:true,\r\n			singleSelect:true,\r\n			autoRowHeight:false,\r\n			remoteSort:false,\r\n			fitColumns :false, \r\n			pagination:true,\r\n			pageSize:50,\r\n			pageList:[50,100,500,1000],\r\n			onDblClickCell:function(rowIndex, field, value){\r\n			showSelectedRowDetail();\r\n		 }\r\n		\">\r\n<script language=\"javascript\">\r\nvar mode='cs';//\u5ba2\u670d\u7248\u672c\r\n// \u5b9a\u4e49\u4e00\u4e2a\u65b0\u7684\u590d\u5236\u5bf9\u8c61\r\n$(function(){\r\n	var pager = $('#dg').datagrid().datagrid('getPager');	// get the pager of datagrid\r\n	pager.pagination({\r\n		buttons:[{\r\n			iconCls:'icon-chart-bar',\r\n			handler:onShowStatTable\r\n		}]\r\n		});	\r\n		init();\r\n		//setTimeout(\"init()\", 1000);\r\n});\r\n</script>\r\n\r\n	</table>\r\n	</div>	\r\n    <!--table\u7684toolbar-->\r\n<div id=\"tb\" style=\"padding:2px 5px;\">\r\n		\u65e5\u5fd7\u7c7b\u578b\uff1a<input class=\"easyui-combobox\" id=\"cdrtype\" name=\"cdrtype\" style=\"width:130px;height:28px\" value=\"CS_MLTE_S1U_HTTP\" data-options=\"url:'meta/cs_cdr_list.json',method:'get',valueField:'value',textField:'text',onSelect:onSelCdrType\">\r\n		\u5f00\u59cb\u65f6\u95f4\uff1a<input id=\"st\" class=\"easyui-datetimebox\" required style=\"width:146px;height:28px\">\r\n		\u7ed3\u675f\u65f6\u95f4(<font color=red>\u53ef\u4e0d\u9009</font>)\uff1a<input id=\"et\" class=\"easyui-datetimebox\"  required style=\"width:146px;height:28px\">\r\n        \u53f7\u7801\uff1a<input id=\"msisdn\" class=\"easyui-textbox\"  style=\"width:140px;height:28px\" data-options=\"prompt: '\u8bf7\u8f93\u5165\u9700\u8981\u67e5\u8be2\u7684\u53f7\u7801'\">\r\n		<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onClick=\"onSearch()\">\u67e5\u8be2</a>&nbsp;&nbsp;&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(0,0)\">\u4eca\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-1,-1)\">\u6628\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-2,-2)\">\u524d\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-6,0)\">\u8fd1\u4e00\u5468</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-30,0)\">\u8fd1\u4e00\u6708</a>&nbsp;&nbsp;\r\n<!--		<a href=\"#\" class=\"easyui-tooltip\" data-options=\"\r\n			content: $('<div></div>'),\r\n			onShow: function(){\r\n				$(this).tooltip('arrow').css('right', 20);\r\n				$(this).tooltip('tip').css('right', $(this).offset().right);\r\n			},\r\n			onUpdate: function(cc){\r\n				cc.panel({\r\n					width: 300,\r\n					height: 216,\r\n					border: false,\r\n					href: 'howtouse.jsp'\r\n				});\r\n			}\">\u4f7f\u7528\u8bf4\u660e</a>-->\r\n</div>	\r\n\r\n <!--\u663e\u793a\u67e5\u8be2\u6d88\u8017\u7684\u65f6\u95f4-->\r\n<div id='searchCostInfo'></div>\r\n<div>\r\n<table width=\"100%\">\r\n<tr>\r\n<td width=34%>\r\n<div id=\"chart_container1\" style=\"min-width:400px;height:300px\"  onDblClick=\"onChangeLeftChart()\"></div>\r\n</td>\r\n<td></td>\r\n<td width=65%>\r\n<div id=\"chart_container2\" style=\"min-width:400px;height:300px\"></div>\r\n</td>\r\n</tr>\r\n</table>\r\n</div>\r\n<!--\u5f53\u524d\u4f4d\u7f6e\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"user_track_dlg\" class=\"easyui-dialog\" title=\"\u7528\u6237\u5f53\u524d\u4f4d\u7f6e\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:698px;height:378px;padding:0px;\">\r\n<iframe id=\"user_track_iframe\" src=\"\" width=\"682px\" height=\"337px\" scrolling=\"no\"></iframe>\r\n</div>\r\n<!--\u8be6\u5355\u4fe1\u606f\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"xdr_detail_dlg\" class=\"easyui-dialog\" title=\"XDR\u8be6\u5355\u4fe1\u606f\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:744px;height:360px;padding:0px;\">\r\n</div>\r\n<!--\u767b\u5f55\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"login_dlg\" class=\"easyui-dialog\" title=\"\u7528\u6237\u767b\u5f55\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:260px;height:180px;padding:0px;\">\r\n<div align=\"center\"><p>\u4f60\u5c1a\u672a\u767b\u5f55,\u8bf7\u5148\u767b\u9646\u540e\u4f7f\u7528</p></div>\r\n<table align=\"center\" width=\"100%\" cellpadding=\"2px\">\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u7528\u6237\u540d:</td><td><input id=\"userName\" class=\"easyui-textbox\"  style=\"width:150px;height:28px\"></td></tr>\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u5bc6&nbsp;&nbsp;&nbsp;\u7801:</td><td><input id=\"psw\" class=\"easyui-textbox\"  type=\"password\" style=\"width:150px;height:28px\"></td></tr>\r\n<tr ><td colspan=\"2\" align=\"center\"><a href=\"#\" style=\"width:80px\" class=\"easyui-linkbutton\" onClick=\"login()\">\u767b\u5f55</a></td></tr>\r\n</table>\r\n</div>\r\n</body>\r\n</html>\r\n".toCharArray();
  }
}
