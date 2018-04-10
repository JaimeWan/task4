package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"one\">\r\n");
      out.write("        <div class=\"one1\">技能树-改变你我</div>\r\n");
      out.write("        <div class=\"one2\">旗下网站</div>\r\n");
      out.write("        <div class=\"one3\">微信公众平台</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"two\">\r\n");
      out.write("        <div class=\"two1\">\r\n");
      out.write("            <a href=\"#\">关于我们|</a>\r\n");
      out.write("            <a href=\"#\">联系我们|</a>\r\n");
      out.write("            <a href=\"#\">合作企业|</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"two2\">\r\n");
      out.write("            <a href=\"#\">草船云孵化器|</a>\r\n");
      out.write("            <a href=\"#\">最强IT特训营|</a><br>\r\n");
      out.write("            <a href=\"#\">葡萄藤轻游戏|</a>\r\n");
      out.write("            <a href=\"#\">桌游精灵|</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"two3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"three\">Copyright © 2015技能树 www.jnshu.com All Rights Reserved | <京ICP备13005800号></京ICP备13005800号></div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
