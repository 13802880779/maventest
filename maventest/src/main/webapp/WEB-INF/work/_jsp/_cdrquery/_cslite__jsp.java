/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._cdrquery;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _cslite__jsp extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery/cslite.jsp"), 6535822258417540870L, false);
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
    _jsp_string0 = "\r\n\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>\u7528\u6237\u8096\u50cf</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jqcloud.css\" />\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n<!--	<script type=\"text/javascript\" src=\"js/datagrid-scrollview.js\"></script>-->\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/json2.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/cslite.js\"></script>\r\n		<link rel=\"stylesheet\" href=\"leafletjs/leaflet.css\"/>\r\n	<script type=\"text/javascript\" src=\"leafletjs/leaflet.js\"></script>\r\n	 <script type=\"text/javascript\" src=\"js/jqcloud-1.0.4.min.js\"></script>\r\n	<style type=\"text/css\">\r\n	.thumbItem{\r\n	border-radius: 2px; border-top-color: rgb(228, 228, 228); border-top-width: 1px; border-top-style: solid; box-shadow: -1px 0px 1px rgba(0,0,0,0.04), 0px 1px 1px rgba(0,0,0,0.13), 1px 0px 2px rgba(0,0,0,0.05);\r\n}\r\n</style>\r\n</head>\r\n\r\n<body style=\"padding:3px; margin:0px; background-color:#e5ebf2\" >\r\n<script language=\"javascript\">\r\nvar mode='cs';//\u5ba2\u670d\u7248\u672c\r\n// \u5b9a\u4e49\u4e00\u4e2a\u65b0\u7684\u590d\u5236\u5bf9\u8c61\r\n\r\n$(function(){\r\n	\r\n		init();\r\n		//setTimeout(\"init()\", 1000);\r\n});\r\n\r\n</script>\r\n\r\n<div id=\"tb\" style=\"padding:2px 5px;background-color:#f4f4f4;\">\r\n		\u65e5\u5fd7\u7c7b\u578b\uff1a<input class=\"easyui-combobox\" id=\"cdrtype\" name=\"cdrtype\" style=\"width:160px;height:28px\" value=\"CS_MLTE_S1U_HTTP\" data-options=\"url:'meta/cs_cdr_list.json',method:'get',valueField:'value',textField:'text',onSelect:onSelCdrType\">\r\n		\u5f00\u59cb\u65f6\u95f4\uff1a<input id=\"st\" class=\"easyui-datetimebox\" required style=\"width:146px;height:28px\">\r\n		\u7ed3\u675f\u65f6\u95f4(<font color=red>\u53ef\u4e0d\u9009</font>)\uff1a<input id=\"et\" class=\"easyui-datetimebox\"  required style=\"width:146px;height:28px\">\r\n        \u53f7\u7801\uff1a<input id=\"msisdn\" class=\"easyui-textbox\"  style=\"width:140px;height:28px\" data-options=\"prompt: '\u8bf7\u8f93\u5165\u9700\u8981\u67e5\u8be2\u7684\u53f7\u7801'\">\r\n		<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onClick=\"onSearch()\">\u67e5\u8be2</a>&nbsp;&nbsp;&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(0,0)\">\u4eca\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-1,-1)\">\u6628\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-2,-2)\">\u524d\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-6,0)\">\u8fd1\u4e00\u5468</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-30,0)\">\u8fd1\u4e00\u6708</a>&nbsp;&nbsp;\r\n</div>	\r\n<div style=\" height:3px\"></div>\r\n\r\n<div class=\"easyui-panel\" title=\"\u7528\u6237\u6d41\u91cf\u4f7f\u7528\u6982\u51b5\" style=\"width:100%;padding:2px; overflow:hidden\">\r\n <!--\u663e\u793a\u67e5\u8be2\u6d88\u8017\u7684\u65f6\u95f4-->\r\n<div id='searchCostInfo' style=\" padding:5px\"></div>\r\n<div>\r\n<table width=\"100%\">\r\n<tr>\r\n<td width=35%>\r\n<div id=\"chart_container1\" style=\"height:280px\"  onDblClick=\"onChangeLeftChart()\"  class=\"thumbItem\"></div>\r\n</td>\r\n<td></td>\r\n<td width=65%>\r\n<div id=\"chart_container2\" style=\"height:280px\"  class=\"thumbItem\"></div>\r\n</td>\r\n</tr>\r\n</table>\r\n</div>\r\n</div>\r\n\r\n<div style=\" height:3px\"></div>\r\n\r\n<table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"1px\" cellspacing=\"1px\" style=\"table-layout:fixed;\">\r\n<tr>\r\n<td>\r\n<div id=\"p2\" class=\"easyui-panel\" title=\"\u8d28\u5dee\u5c0f\u533a\u5206\u5e03\" style=\"width:100%;height:260px;padding:0px; overflow:hidden\">\r\n<div id=\"l-map\" style=\"width:100%; height:280px; max-width:440px\"></div>\r\n<script type=\"text/javascript\">\r\n	// \u767e\u5ea6\u5730\u56feAPI\u529f\u80fd\r\n	var point = [23.144541,113.386591];	\r\n	var mymap = L.map('l-map').setView(point, 16);\r\n	L.tileLayer('map/maptile2/{z}/{x}/{y}.jpg', {\r\n			maxZoom: 16,\r\n			attribution: 'CMCC'\r\n		}).addTo(mymap);	\r\n	//marker=L.marker(point).addTo(mymap);	\r\n	\r\n	</script>\r\n</div>\r\n\r\n</td>\r\n\r\n<td width=\"40%\">\r\n<div id=\"p3\" class=\"easyui-panel\" title=\"\u7528\u6237\u7f51\u7edc\u611f\u77e5(\u6700\u8fd1\u4e09\u5c0f\u65f6)\" style=\"width:100%; height:260px;padding:0px; overflow:hidden; background-color:#e5ebf2\" align=\"center\">\r\n\r\n<table border=\"0\" width=\"100%\" cellpadding=\"2px\">\r\n<tr><td width=\"50%\" height=\"50%\">\r\n<div class=\"thumbItem\" style=\"width:100%; padding:0px; margin:0px; background-color:#ffffff\" align=\"center\"><table width=\"100%\" border=\"0\" cellpadding=\"0px\" cellspacing=\"0px\"><tr height=\"80px\">\r\n<td align=\"center\" style=\"word-break:break-all; word-wrap:break-word;\" >\r\n<div id=\"userLabel1\" style=\"margin:2px;\" align=\"center\"></div>\r\n</td></tr><tr height=\"28px\" bgcolor=\"#f0433d\"><td  align=\"center\"><label style=\"font-family:\u5fae\u8f6f\u96c5\u9ed1,\u5b8b\u4f53; font-size:18px; color:#FFFFFF\">\u79fb\u52a8\u7f51\u7edc\u5dee</label></td></tr></table></div>\r\n</td><td>\r\n<div class=\"thumbItem\" style=\"width:100%; padding:0px; margin:0px; background-color:#ffffff\" align=\"center\"><table width=\"100%\" border=\"0\" cellpadding=\"0px\" cellspacing=\"0px\"><tr height=\"80px\"><td align=\"center\" style=\"word-break:break-all; word-wrap:break-word;\" >\r\n<div id=\"userLabel2\" style=\"margin:2px;\" align=\"center\"></div>\r\n</td></tr><tr height=\"28px\" bgcolor=\"#5CB85C\"><td  align=\"center\"><label style=\"font-family:\u5fae\u8f6f\u96c5\u9ed1,\u5b8b\u4f53; font-size:18px; color:#FFFFFF\">\u8d28\u5dee\u5c0f\u533a</label></td></tr></table></div>\r\n</td>\r\n</tr>\r\n<tr><td>\r\n<div class=\"thumbItem\" style=\"width:100%; padding:0px; margin:0px; background-color:#ffffff\"><table width=\"100%\" border=\"0\" cellpadding=\"0px\" cellspacing=\"0px\"><tr height=\"80px\">\r\n<td align=\"center\">\r\n<div id=\"userLabel3\" style=\"margin:2px;\" align=\"center\"></div>\r\n</td></tr><tr height=\"28px\" bgcolor=\"#F0AD4E\"><td  align=\"center\"><label style=\"font-family:\u5fae\u8f6f\u96c5\u9ed1,\u5b8b\u4f53; font-size:16px; color:#FFFFFF\">\u7528\u6237\u6216\u7ec8\u7aef\u8bbe\u7f6e\u9519\u8bef</label></td></tr></table></div>\r\n</td><td>\r\n<div class=\"thumbItem\" style=\"width:100%; padding:0px; margin:0px; background-color:#ffffff\"><table width=\"100%\" border=\"0\" cellpadding=\"0px\" cellspacing=\"0px\"><tr height=\"80px\"><td align=\"center\">\r\n<div id=\"userLabel4\" style=\"margin:2px;\" align=\"center\"></div>\r\n</td></tr><tr height=\"28px\" bgcolor=\"#4CB1CF\"><td  align=\"center\" ><label style=\"font-family:\u5fae\u8f6f\u96c5\u9ed1,\u5b8b\u4f53; font-size:16px; color:#FFFFFF\">\u7b2c\u4e09\u65b9\u7f51\u7edc\u6216APP\u95ee\u9898</label></td></tr></table></div>\r\n</td>\r\n</tr>\r\n</table>\r\n\r\n</div>\r\n</td>\r\n<td width=\"27%\">\r\n<div id=\"p4\" class=\"easyui-panel\" title=\"\u641c\u7d22\u884c\u4e3a\u5339\u914d\" style=\"width:100%; height:260px;padding:4px; margin:4px overflow:hidden; background-color:#ffffff\">\r\n<table border=\"0\" width=\"100%\" cellpadding=\"2px\"><tr><td>\r\n<div id=\"keywordCloud\" style=\"width:330px; height:160px\"></div>\r\n</td></tr><tr><td>\r\n<div id=\"scenematch\" class=\"thumbItem\" style=\" height:48px; background-color:#F2DEDE\">\r\n</div>\r\n</td></tr>\r\n</table>\r\n</div>\r\n</td>\r\n</tr></table>\r\n\r\n\r\n<!--\u5f53\u524d\u4f4d\u7f6e\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"user_track_dlg\" class=\"easyui-dialog\" title=\"\u7528\u6237\u5f53\u524d\u4f4d\u7f6e\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:698px;height:378px;padding:0px;\">\r\n<iframe id=\"user_track_iframe\" src=\"\" width=\"682px\" height=\"337px\" scrolling=\"no\"></iframe>\r\n</div>\r\n<!--\u8be6\u5355\u4fe1\u606f\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"xdr_detail_dlg\" class=\"easyui-dialog\" title=\"XDR\u8be6\u5355\u4fe1\u606f\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:744px;height:360px;padding:0px;\">\r\n</div>\r\n<!--\u767b\u5f55\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"login_dlg\" class=\"easyui-dialog\" title=\"\u7528\u6237\u767b\u5f55\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:260px;height:180px;padding:0px;\">\r\n<div align=\"center\"><p>\u4f60\u5c1a\u672a\u767b\u5f55,\u8bf7\u5148\u767b\u9646\u540e\u4f7f\u7528</p></div>\r\n<table align=\"center\" width=\"100%\" cellpadding=\"2px\">\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u7528\u6237\u540d:</td><td><input id=\"userName\" class=\"easyui-textbox\"  style=\"width:150px;height:28px\"></td></tr>\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u5bc6&nbsp;&nbsp;&nbsp;\u7801:</td><td><input id=\"psw\" class=\"easyui-textbox\"  type=\"password\" style=\"width:150px;height:28px\"></td></tr>\r\n<tr ><td colspan=\"2\" align=\"center\"><a href=\"#\" style=\"width:80px\" class=\"easyui-linkbutton\" onClick=\"login()\">\u767b\u5f55</a></td></tr>\r\n</table>\r\n</div>\r\n\r\n\r\n</body>\r\n</html>\r\n".toCharArray();
  }
}
