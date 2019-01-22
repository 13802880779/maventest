/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._cdrquery;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import net.gmcc.cdr.mapping.DateMapping;
import net.gmcc.util.MD5Utils;

public class _ts__jsp extends com.caucho.jsp.JavaPage
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

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
	
	String fromSystem=request.getParameter("fromSystem");

	if("noas".equalsIgnoreCase(fromSystem)){
		String userName=request.getParameter("userName");
		//resquest.getSession.setAttribute("userName",userName);
		String tokenFrom=request.getParameter("token");
		String role_ids=request.getParameter("role_ids");
		String tokenStr="userName="
							+userName+"&role_ids="+role_ids
							+"&noas_cdrquery"+DateMapping.formatToday();
		String token=MD5Utils.getMD5(tokenStr);
	//	System.out.println("==========>"+token);
		if(!token.equalsIgnoreCase(tokenFrom))
				response.sendRedirect("forbiddenaccess.jsp");
	}
	else
	 	response.sendRedirect("forbiddenaccess.jsp");
		

    out.write(_jsp_string1, 0, _jsp_string1.length);
    
//String fromSystem=request.getParameter("fromSystem");
String userName=request.getParameter("userName");
String token=request.getParameter("token");
String role_ids=request.getParameter("role_ids");

    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((fromSystem));
    out.write(_jsp_string3, 0, _jsp_string3.length);
    out.print((userName));
    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print((role_ids));
    out.write(_jsp_string5, 0, _jsp_string5.length);
    out.print((token));
    out.write(_jsp_string6, 0, _jsp_string6.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery/ts.jsp"), -6611241887589302949L, false);
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

  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  private final static char []_jsp_string6;
  private final static char []_jsp_string5;
  private final static char []_jsp_string2;
  private final static char []_jsp_string4;
  private final static char []_jsp_string1;
  static {
    _jsp_string3 = "&userName=".toCharArray();
    _jsp_string0 = "\r\n\r\n<!--".toCharArray();
    _jsp_string6 = "\">\u6279\u91cf\u6eaf\u6e90</a>\r\n</div>\r\n\r\n<div style=\"padding:1px;width:100%\"></div>\r\n<div id=\"tab\" class=\"easyui-tabs\" style=\"width:100%;height:auto;\" align=\"left\">\r\n		<div title=\"\u7ed3\u8bba\u53ca\u9519\u8bef\u7801\u7edf\u8ba1\" style=\"padding:10px\">\r\n<table width=\"98%\" align=\"center\">\r\n<tr><td colspan=\"2\">\r\n<div id='Advise' align=\"left\"></div>\r\n</td></tr>\r\n<tr>\r\n<td width=40%>\r\n<div id=\"chart_container1\" style=\"height:240px;\" class='thumbItem'></div>\r\n</td>\r\n<td width=60%>\r\n<div id=\"chart_container2\" style=\"height:240px;\" class='thumbItem'></div>\r\n</td>\r\n</tr>\r\n</table>\r\n<div id='dg_div' align=\"center\" style=\"visibility:hidden\">\r\n<table id='dg' class=\"easyui-datagrid\" title=\"\u9519\u8bef\u7801\" style=\"width:98%;height:240px\"\r\n		data-options=\"singleSelect:true,\r\n					  collapsible:true,\r\n					  rownumbers:true,\r\n					  remoteSort:false,\r\n					  pagination:true,\r\n					  pageSize:5,\r\n			          pageList:[5,10,50,100,200],\r\n					  onDblClickCell:function(rowIndex, field, value){\r\n						showSelectedRowDetail();\r\n		 			}\">\r\n	<thead>\r\n		<tr>\r\n			<th data-options=\"field:'PROCEDURE_ENDTIME',width:150,align:'center',sortable:true\">\u4e1a\u52a1\u7ed3\u675f\u65f6\u95f4</th>\r\n			<th data-options=\"field:'subServieProcedure',width:210\">\u4e1a\u52a1\u8fc7\u7a0b</th>\r\n			<th data-options=\"field:'patternStr',width:180\">\u9519\u8bef\u7801\u7ec4\u5408</th>\r\n			<th data-options=\"field:'cause',width:80\">\u95ee\u9898\u5b9a\u4f4d</th>\r\n			<th data-options=\"field:'description',width:100\">\u534f\u8bae\u63cf\u8ff0</th>\r\n			<th data-options=\"field:'specification',width:100\">\u89c4\u5219\u8bf4\u660e</th>\r\n			<th data-options=\"field:'APN',width:100,align:'center'\">APN</th>\r\n			<!--<th data-options=\"field:'CELL_ID',width:120,align:'center'\">\u4e1a\u52a1\u53d1\u751f\u5c0f\u533a</th>\r\n			<th data-options=\"field:'HOST',width:120,align:'center'\">\u7f51\u7ad9</th>\r\n			<th data-options=\"field:'URI',width:220,align:'center'\">\u8bbf\u95ee\u8def\u5f84</th>	-->		\r\n		</tr>\r\n	</thead></table>\r\n</div>\r\n</div>\r\n<div title=\"\u5206\u6790\u8fc7\u7a0b\u53ca\u6d41\u7a0b\u56fe\" style=\"padding:10px\">\r\n<table width=\"100%\" align=\"center\">\r\n<tr><td width=40% valign=\"top\">\r\n<div id='analyzeResults'></div>\r\n</td>\r\n<td width=60%>\r\n<div id='analyzeImage'></div>\r\n</td>\r\n</tr>\r\n</table>\r\n</div>\r\n\r\n</div>\r\n\r\n\r\n\r\n<!--\u8be6\u5355\u4fe1\u606f\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"detail_dlg\" class=\"easyui-dialog\" title=\"\u9519\u8bef\u7801\u8be6\u7ec6\u4fe1\u606f\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:720px;height:360px;padding:0px;\">\r\n</div>\r\n\r\n	<!--\u767b\u5f55\u5f39\u51fa\u7a97\u53e3-->\r\n<div id=\"login_dlg\" class=\"easyui-dialog\" title=\"\u8bf7\u5148\u767b\u5f55\u540e\u4f7f\u7528\"  closed=\"true\" data-options=\"iconCls:'icon-man'\" style=\"top:60px;width:320px;height:300px;padding:0px;\">\r\n<div align=\"center\"><img src=\"images/login_man.jpg\" border=\"0\"></div>\r\n<table align=\"center\" width=\"100%\" cellpadding=\"2px\">\r\n<tr><td colspan=2 align=center>\u60a8\u53ef\u901a\u8fc7\"\u7efc\u5206\u7cfb\u7edf\"->\"\u5ba2\u6237\u5feb\u901f\u6295\u8bc9\u6eaf\u6e90\"\u5355\u70b9\u767b\u9646</td><tr>	\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u7528\u6237\u540d:</td><td><input id=\"userName\" class=\"easyui-textbox\"  style=\"width:180px;height:28px\"></td></tr>\r\n<tr><td>&nbsp;&nbsp;&nbsp;\u5bc6&nbsp;&nbsp;&nbsp;\u7801:</td><td><input id=\"psw\" class=\"easyui-textbox\"  type=\"password\" style=\"width:180px;height:28px\"></td></tr>\r\n<tr ><TD></TD><td align=\"left\"><a href=\"#\" style=\"width:180px\" class=\"easyui-linkbutton\" onClick=\"login()\">\u767b\u5f55</a></td></tr>\r\n</table>\r\n</div>\r\n\r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string5 = "&token=".toCharArray();
    _jsp_string2 = "\r\n<div id=\"tb\" style=\"padding:2px 5px; background-color:#f8f8f8;\">\r\n		\u9009\u62e9\u6295\u8bc9\u7c7b\u578b\uff1a<input class=\"easyui-combobox\" id=\"tsType\" name=\"tsType\" style=\"width:200px;height:28px\" value=\"\" data-options=\"url:'meta/ts_analyzetype_list.json',method:'get',valueField:'value',textField:'text'\">\r\n		\u5f00\u59cb\u65f6\u95f4\uff1a<input id=\"st\" class=\"easyui-datetimebox\" required style=\"width:146px;height:28px\">\r\n		\u7ed3\u675f\u65f6\u95f4\uff1a<input id=\"et\" class=\"easyui-datetimebox\"  required style=\"width:146px;height:28px\">\r\n        \u67e5\u8be2\u53f7\u7801\uff1a<input id=\"msisdn\" class=\"easyui-textbox\"  style=\"width:160px;height:28px\">\r\n		<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onClick=\"onSearch()\">\u67e5\u8be2</a>&nbsp;&nbsp;&nbsp;\r\n				<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(0)\">\u4eca\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-1)\">\u6628\u5929</a>&nbsp;\r\n		<a href=\"#\" class=\"easyui-linkbutton\"  onClick=\"onSearchRecent(-2)\">\u524d\u5929</a>&nbsp;\r\n		&nbsp;&nbsp;\r\n		<a href=\"tsBatchAnalyze.jsp?fromSystem=".toCharArray();
    _jsp_string4 = "&role_ids=".toCharArray();
    _jsp_string1 = "\r\n-->\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>SOC\u5b9e\u65f6\u6eaf\u6e90\u5206\u6790</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">	\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/highcharts.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/analysis.js\"></script>\r\n	<script type=\"text/javascript\" src=\"js/json2.js\"></script>\r\n	<style type=\"text/css\">\r\n	.thumbItem{\r\n	border-radius: 2px; border-top-color: rgb(228, 228, 228); border-top-width: 1px; border-top-style: solid; box-shadow: -1px 0px 1px rgba(0,0,0,0.04), 0px 1px 1px rgba(0,0,0,0.13), 1px 0px 2px rgba(0,0,0,0.05);\r\n}\r\n</style>\r\n</head>\r\n\r\n<body style=\"padding:2px; margin:0px;\">\r\n<script language=\"javascript\">\r\n$(function(){\r\n$('#msisdn').textbox('textbox').focus(function() { \r\n	$('#msisdn').textbox('setValue','');\r\n	}); 	\r\n});\r\n</script>\r\n".toCharArray();
  }
}
