package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=en>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=UTF-8>\n");
      out.write("\t<title>ИТ-Блокнот | Все лучшее для вас</title>\n");
      out.write("\t<!--[if lt IE 9]><script src=http://html5shiv.googlecode.com/svn/trunk/html5.js></script><![endif]-->\n");
      out.write("\t<link href=styles.css rel=stylesheet />\n");
      out.write("\t<!--[if lt IE 9]><link href=ie.css rel=stylesheet /><![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("\t<hgroup>\n");
      out.write("\t\t<h1><a href=#>ИТ-Блокнот | Все лучшее для вас</a></h1>\n");
      out.write("\t\t<h2>Блокнот с лучшими инструкциями</h2>\n");
      out.write("\t</hgroup>\n");
      out.write("\t<nav id=global>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"index.html\">Главная</a></li>\n");
      out.write("\t\t\t<li><a href=\"about-us.html\">О нас</a></li>\n");
      out.write("\t\t\t<li id=services>\n");
      out.write("\t\t\t\t<a href=\"service.html\">Services</a>\n");
      out.write("\t\t\t\t<ul id=subMenu>\n");
      out.write("\t\t\t\t\t<li><a href=#>Whatever</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=#>Your Heart</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=#>Desires</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t</nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=clearfix>\n");
      out.write("\t<div id=content>\n");
      out.write("      <form action=\"\">\n");
      out.write("        <h1>Название статьи:</h1>\n");
      out.write("        <input name=\"title\">\n");
      out.write("        <h1>Текст статьи:</h1>\n");
      out.write("        <textarea name=\"article\"></textarea>\n");
      out.write("        <input class=add_button type=\"submit\" value=\"Опубликовать\">\n");
      out.write("      </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=clearfix>\n");
      out.write("\t\t\n");
      out.write("\t<p class=copyright>Copyright &copy; 2019 <strong>ЭВТ-16 бзу, Савельев А. Доброхотов В.</strong>. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
