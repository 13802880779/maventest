/*
 * JSP generated by Resin Professional 4.0.48 (built Wed, 17 Feb 2016 11:03:24 PST)
 */

package _jsp._cdrquery;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _tsframe__jsp extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("cdrquery/tsFrame.jsp"), -7049774077696149452L, false);
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
    _jsp_string0 = "\r\n<html>\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>Fluid Layout - jQuery EasyUI Demo</title>\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/default/easyui.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/themes/icon.css\">\r\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-easyui/demo/demo.css\">\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.min.js\"></script>\r\n	<script type=\"text/javascript\" src=\"jquery-easyui/jquery.easyui.min.js\"></script>\r\n</head>\r\n<body class=\"easyui-layout\">\r\n	<div data-options=\"region:'west',split:true,title:'\u6b22\u8fce\u4f7f\u7528'\" style=\"width:200px;padding:0px;\">\r\n			<div class=\"easyui-accordion\" style=\"width:193px; border:none\">\r\n		<div title=\"\u7cfb\u7edf\u529f\u80fd\" data-options=\"iconCls:'icon-ok',selected:true\" style=\"overflow:auto;padding:0px;\">\r\n			<ul>\r\n			<li>\u611f\u77e5\u6eaf\u6e90\uff08\u5ba2\u670d\u7248\uff09</li>\r\n			<li>\u6279\u91cf\u611f\u77e5\u6eaf\u6e90</li>\r\n			<li>\u4e0a\u7f51\u65e5\u5fd7\u67e5\u8be2</li>\r\n			<li>\u611f\u77e5\u6eaf\u6e90\uff08\u7f51\u7edc\u7248\uff09</li>\r\n			</ul>\r\n		</div>\r\n		<div title=\"\u7cfb\u7edf\u8bbe\u7f6e\" data-options=\"iconCls:'icon-help'\" style=\"padding:0px;\">\r\n			<ul>\r\n			<li>\u6eaf\u6e90\u89c4\u5219\u8bbe\u7f6e</li>\r\n			</ul>\r\n		</div>\r\n</div>\r\n	</div>\r\n	<div data-options=\"region:'center'\" style=\"border:none;\">\r\n	<iframe src=\"ts2.jsp\" frameborder=\"0\" height=\"100%\" id=\"mainFrame\" width=\"100%\" scrolling=\"auto\"></iframe>\r\n	</div>\r\n</body>\r\n</html>\r\n\r\n".toCharArray();
  }
}