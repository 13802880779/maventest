/*
 * JSP generated by Resin Professional 4.0.32 (built Mon, 01 Oct 2012 03:06:15 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _rectangle__jsp extends com.caucho.jsp.JavaPage
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

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -4499359969287496615L)
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("rectangle.jsp"), -7683634452531289029L, false);
    _caucho_depends.add(depend);
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
    _jsp_string0 = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n	<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n	<style type=\"text/css\">\r\n	body, html{width: 100%;height: 100%;margin:0;font-family:\"\u00e5\u00be\u00ae\u00e8\u00bd\u00af\u00e9\u009b\u0085\u00e9\u00bb\u0091\";}\r\n	#allmap {width: 100%; height:500px; overflow: hidden;}\r\n	#result {width:100%;font-size:12px;}\r\n	dl,dt,dd,ul,li{\r\n		margin:0;\r\n		padding:0;\r\n		list-style:none;\r\n	}\r\n	p{font-size:12px;}\r\n	dt{\r\n		font-size:14px;\r\n		font-family:\"\u00e5\u00be\u00ae\u00e8\u00bd\u00af\u00e9\u009b\u0085\u00e9\u00bb\u0091\";\r\n		font-weight:bold;\r\n		border-bottom:1px dotted #000;\r\n		padding:5px 0 5px 5px;\r\n		margin:5px 0;\r\n	}\r\n	dd{\r\n		padding:5px 0 0 5px;\r\n	}\r\n	li{\r\n		line-height:28px;\r\n	}\r\n	</style>\r\n	<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=\u00e6\u0082\u00a8\u00e7\u009a\u0084\u00e5\u00af\u0086\u00e9\u0092\u00a5\"></script>\r\n	<!--\u00e5\u008a\u00a0\u00e8\u00bd\u00bd\u00e9\u00bc\u00a0\u00e6\u00a0\u0087\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e5\u00b7\u00a5\u00e5\u0085\u00b7-->\r\n	<script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.js\"></script>\r\n	<link rel=\"stylesheet\" href=\"http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css\" />\r\n	<!--\u00e5\u008a\u00a0\u00e8\u00bd\u00bd\u00e6\u00a3\u0080\u00e7\u00b4\u00a2\u00e4\u00bf\u00a1\u00e6\u0081\u00af\u00e7\u00aa\u0097\u00e5\u008f\u00a3-->\r\n	<script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/SearchInfoWindow/1.4/src/SearchInfoWindow_min.js\"></script>\r\n	<link rel=\"stylesheet\" href=\"http://api.map.baidu.com/library/SearchInfoWindow/1.4/src/SearchInfoWindow_min.css\" />\r\n	<title>\u00e9\u00bc\u00a0\u00e6\u00a0\u0087\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e5\u00b7\u00a5\u00e5\u0085\u00b7</title>\r\n</head>\r\n<body>\r\n	<div id=\"allmap\" style=\"overflow:hidden;zoom:1;position:relative;\">	\r\n		<div id=\"map\" style=\"height:100%;-webkit-transition: all 0.5s ease-in-out;transition: all 0.5s ease-in-out;\"></div>\r\n	</div>\r\n	<div id=\"result\">\r\n		<input type=\"button\" value=\"\u00e8\u008e\u00b7\u00e5\u008f\u0096\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e7\u009a\u0084\u00e8\u00a6\u0086\u00e7\u009b\u0096\u00e7\u0089\u00a9\u00e4\u00b8\u00aa\u00e6\u0095\u00b0\" onClick=\"alert(overlays.length)\"/>\r\n		<input type=\"button\" value=\"\u00e6\u00b8\u0085\u00e9\u0099\u00a4\u00e6\u0089\u0080\u00e6\u009c\u0089\u00e8\u00a6\u0086\u00e7\u009b\u0096\u00e7\u0089\u00a9\" onClick=\"clearAll()\"/>\r\n	</div>\r\n	<script type=\"text/javascript\">\r\n	// \u00e7\u0099\u00be\u00e5\u00ba\u00a6\u00e5\u009c\u00b0\u00e5\u009b\u00beAPI\u00e5\u008a\u009f\u00e8\u0083\u00bd\r\n    var map = new BMap.Map('map');\r\n    var poi = new BMap.Point(116.307852,40.057031);\r\n    map.centerAndZoom(poi, 16);\r\n    map.enableScrollWheelZoom();  \r\n    var overlays = [];\r\n	var overlaycomplete = function(e){\r\n        overlays.push(e.overlay);\r\n    };\r\n    var styleOptions = {\r\n        strokeColor:\"red\",    //\u00e8\u00be\u00b9\u00e7\u00ba\u00bf\u00e9\u00a2\u009c\u00e8\u0089\u00b2\u00e3\u0080\u0082\r\n        fillColor:\"red\",      //\u00e5\u00a1\u00ab\u00e5\u0085\u0085\u00e9\u00a2\u009c\u00e8\u0089\u00b2\u00e3\u0080\u0082\u00e5\u00bd\u0093\u00e5\u008f\u0082\u00e6\u0095\u00b0\u00e4\u00b8\u00ba\u00e7\u00a9\u00ba\u00e6\u0097\u00b6\u00ef\u00bc\u008c\u00e5\u009c\u0086\u00e5\u00bd\u00a2\u00e5\u00b0\u0086\u00e6\u00b2\u00a1\u00e6\u009c\u0089\u00e5\u00a1\u00ab\u00e5\u0085\u0085\u00e6\u0095\u0088\u00e6\u009e\u009c\u00e3\u0080\u0082\r\n        strokeWeight: 3,       //\u00e8\u00be\u00b9\u00e7\u00ba\u00bf\u00e7\u009a\u0084\u00e5\u00ae\u00bd\u00e5\u00ba\u00a6\u00ef\u00bc\u008c\u00e4\u00bb\u00a5\u00e5\u0083\u008f\u00e7\u00b4\u00a0\u00e4\u00b8\u00ba\u00e5\u008d\u0095\u00e4\u00bd\u008d\u00e3\u0080\u0082\r\n        strokeOpacity: 0.8,	   //\u00e8\u00be\u00b9\u00e7\u00ba\u00bf\u00e9\u0080\u008f\u00e6\u0098\u008e\u00e5\u00ba\u00a6\u00ef\u00bc\u008c\u00e5\u008f\u0096\u00e5\u0080\u00bc\u00e8\u008c\u0083\u00e5\u009b\u00b40 - 1\u00e3\u0080\u0082\r\n        fillOpacity: 0.6,      //\u00e5\u00a1\u00ab\u00e5\u0085\u0085\u00e7\u009a\u0084\u00e9\u0080\u008f\u00e6\u0098\u008e\u00e5\u00ba\u00a6\u00ef\u00bc\u008c\u00e5\u008f\u0096\u00e5\u0080\u00bc\u00e8\u008c\u0083\u00e5\u009b\u00b40 - 1\u00e3\u0080\u0082\r\n        strokeStyle: 'solid' //\u00e8\u00be\u00b9\u00e7\u00ba\u00bf\u00e7\u009a\u0084\u00e6\u00a0\u00b7\u00e5\u00bc\u008f\u00ef\u00bc\u008csolid\u00e6\u0088\u0096dashed\u00e3\u0080\u0082\r\n    }\r\n    //\u00e5\u00ae\u009e\u00e4\u00be\u008b\u00e5\u008c\u0096\u00e9\u00bc\u00a0\u00e6\u00a0\u0087\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e5\u00b7\u00a5\u00e5\u0085\u00b7\r\n    var drawingManager = new BMapLib.DrawingManager(map, {\r\n        isOpen: false, //\u00e6\u0098\u00af\u00e5\u0090\u00a6\u00e5\u00bc\u0080\u00e5\u0090\u00af\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e6\u00a8\u00a1\u00e5\u00bc\u008f\r\n        enableDrawingTool: true, //\u00e6\u0098\u00af\u00e5\u0090\u00a6\u00e6\u0098\u00be\u00e7\u00a4\u00ba\u00e5\u00b7\u00a5\u00e5\u0085\u00b7\u00e6\u00a0\u008f\r\n        drawingToolOptions: {\r\n            anchor: BMAP_ANCHOR_TOP_RIGHT, //\u00e4\u00bd\u008d\u00e7\u00bd\u00ae\r\n            offset: new BMap.Size(5, 5), //\u00e5\u0081\u008f\u00e7\u00a6\u00bb\u00e5\u0080\u00bc\r\n        },\r\n        circleOptions: styleOptions, //\u00e5\u009c\u0086\u00e7\u009a\u0084\u00e6\u00a0\u00b7\u00e5\u00bc\u008f\r\n        polylineOptions: styleOptions, //\u00e7\u00ba\u00bf\u00e7\u009a\u0084\u00e6\u00a0\u00b7\u00e5\u00bc\u008f\r\n        polygonOptions: styleOptions, //\u00e5\u00a4\u009a\u00e8\u00be\u00b9\u00e5\u00bd\u00a2\u00e7\u009a\u0084\u00e6\u00a0\u00b7\u00e5\u00bc\u008f\r\n        rectangleOptions: styleOptions //\u00e7\u009f\u00a9\u00e5\u00bd\u00a2\u00e7\u009a\u0084\u00e6\u00a0\u00b7\u00e5\u00bc\u008f\r\n    });  \r\n	 //\u00e6\u00b7\u00bb\u00e5\u008a\u00a0\u00e9\u00bc\u00a0\u00e6\u00a0\u0087\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e5\u00b7\u00a5\u00e5\u0085\u00b7\u00e7\u009b\u0091\u00e5\u0090\u00ac\u00e4\u00ba\u008b\u00e4\u00bb\u00b6\u00ef\u00bc\u008c\u00e7\u0094\u00a8\u00e4\u00ba\u008e\u00e8\u008e\u00b7\u00e5\u008f\u0096\u00e7\u00bb\u0098\u00e5\u0088\u00b6\u00e7\u00bb\u0093\u00e6\u009e\u009c\r\n    drawingManager.addEventListener('overlaycomplete', overlaycomplete);\r\n    function clearAll() {\r\n		for(var i = 0; i < overlays.length; i++){\r\n            map.removeOverlay(overlays[i]);\r\n        }\r\n        overlays.length = 0   \r\n    }\r\n</script>\r\n</body>\r\n</html>\r\n".toCharArray();
  }
}
