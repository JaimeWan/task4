package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"picture\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("    <ol class=\"carousel-indicator\">\r\n");
      out.write("        <li data-target=\"#picture\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#picture\" data-slide-to=\"1\" class></li>\r\n");
      out.write("        <li data-target=\"#picture\" data-slide-to=\"3\" class></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("        <div class=\"item active\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"left carousel-control\" href=\"#picture\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left spanModefy\" aria-hidden=\"true \"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"right carousel-control\" href=\"#picture\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right spanModefy\" aria-hidden=\"true\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("            <div class=\"battle\"></div>\r\n");
      out.write("            <p>战役模式</p>\r\n");
      out.write("            <span class=\"spanModefy\">感受波澜壮阔、惊险刺激的冒险之旅，和想要摧毁我们所有人的猩红军团战斗，夺回我们的家园，人类最后的避难所。</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("            <div class=\"teamwork\"></div>\r\n");
      out.write("            <p>合作模式</p>\r\n");
      out.write("            <span class=\"spanModefy\">与朋友一起，或与其他守护者匹配，组成最多为3人的小组渗透入对方堡垒，击败所有潜在威胁。</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("            <div class=\"multiplayer\"></div>\r\n");
      out.write("            <p>多人竞技</p>\r\n");
      out.write("            <span class=\"spanModefy\">对抗最危险的敌人——其他玩家，在4v4比赛中证明自己的竞技实力。</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("            <div class=\"person\">\r\n");
      out.write("                <div class=\"people\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberofstudent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <span class=\"spanModefy\">累计在线玩家</span>\r\n");
      out.write("                <div class=\"people\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberofgraduate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                <span class=\"spanModefy\">VIP玩家</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container study\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-12 col-md-12 text-title\">如何购买</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3 study-page\">\r\n");
      out.write("            <div class=\"number\">1</div>\r\n");
      out.write("            <div class=\"path-text\">选择版本</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3 study-page\">\r\n");
      out.write("            <div class=\"number\">2</div>\r\n");
      out.write("            <div class=\"path-text\">选择平台</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3 study-page\">\r\n");
      out.write("            <div class=\"number\">3</div>\r\n");
      out.write("            <div class=\"path-text\"> 选择地区</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-12 col-md-3 study-page\">\r\n");
      out.write("            <div class=\"number\">4</div>\r\n");
      out.write("            <div class=\"path-text\">选择零售商</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container list\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-12 col-md-12 list-show\">职业展示</div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container hidden-xs company\">\r\n");
      out.write("    <div class=\"hezuo\">\r\n");
      out.write("        <a href=\"task8-2.html \">战略合作企业</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <a href class=\"alibaba\"></a>\r\n");
      out.write("        <a href class=\"jinshanyun\"></a>\r\n");
      out.write("        <a href class=\"huanxin\"></a>\r\n");
      out.write("        <a href class=\"ronglian\"></a>\r\n");
      out.write("        <a href class=\"qiniu\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"link hidden-sm\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"frind\">友情链接</div>\r\n");
      out.write("        <div class=\"frind-text row\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">手机软件</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">手机软件</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">手机软件</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">手机软件</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("                <li><a href=\"#\">教师招聘</a></li>\r\n");
      out.write("                <li><a href=\"#\">找工作</a></li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${images1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("q");
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(0);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <img src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${images1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("q");
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"item\">\r\n");
          out.write("                <img src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goodstudent}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("s");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"col-xs-12 col-md-4 faker\">\r\n");
          out.write("                <div class=\"student\">\r\n");
          out.write("                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                    <span class=\"spanModefy\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.job}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                    </span>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
