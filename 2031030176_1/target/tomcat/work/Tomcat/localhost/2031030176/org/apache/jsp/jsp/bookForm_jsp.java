/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-04 10:33:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>表单</title>\r\n");
      out.write("    <link href=\"../css/bookForm.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>当前用户:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\r\n");
      out.write("<div class=\"school\">\r\n");
      out.write("    <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/book/addBook\">\r\n");
      out.write("        <table border=\"0\" cellpadding=\"0\" cellspacing=\"20\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"bookId\">图书编号:</label></td>\r\n");
      out.write("                <td><input id=\"bookId\" type=\"text\" name=\"bookId\" placeholder=\"请输入图书编号\" /><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"bookName\">图书名称:</label></td>\r\n");
      out.write("                <td><input id=\"bookName\" type=\"text\" name=\"bookName\" placeholder=\"请输入图书名称\" /><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"bookType\">图书类别：</label></td>\r\n");
      out.write("                <td><input id=\"bookType\" type=\"text\" name=\"bookType\" placeholder=\"请输入图书类型名称\" />\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"author\">作者:</label></td>\r\n");
      out.write("                <td><input id=\"author\" type=\"text\" name=\"author\" placeholder=\"请输入作者\"/><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"price\">价格:</label></td>\r\n");
      out.write("                <td><input id=\"price\" type=\"text\" name=\"price\" placeholder=\"请输入价格\"/><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"isbn\">isbn:</label></td>\r\n");
      out.write("                <td><input id=\"isbn\" type=\"text\" name=\"isbn\" placeholder=\"请输入isbn\" /><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"nowNumber\">现存量:</label></td>\r\n");
      out.write("                <td><input id=\"nowNumber\" type=\"text\" name=\"nowNumber\" placeholder=\"请输入现存量\" /><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"total\">总库存:</label></td>\r\n");
      out.write("                <td><input id=\"total\" type=\"text\" name=\"total\" placeholder=\"请输入总库存\" /><br></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"pubName\">出版社：</label></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <select name=\"pubName\" id=\"pubName\">\r\n");
      out.write("                        <option disabled=\"disabled\" value=\"\">-请选择-</option>\r\n");
      out.write("                        <option value=\"北京理工大学出版社\">北京理工大学出版社</option>\r\n");
      out.write("                        <option value=\"清华大学出版社\">清华大学出版社</option>\r\n");
      out.write("                        <option value=\"人民邮电出版社\">人民邮电出版社</option>\r\n");
      out.write("                    </select></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><label for=\"caseName\">书架：</label></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <select name=\"caseName\" id=\"caseName\">\r\n");
      out.write("                        <option disabled=\"disabled\" value=\"\">-请选择-</option>\r\n");
      out.write("                        <option value=\"TP\">TP</option>\r\n");
      out.write("                        <option value=\"CM\">CM</option>\r\n");
      out.write("                        <option value=\"OC\">OC</option>\r\n");
      out.write("                    </select></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td><input type=\"submit\" value=\"提交\" />\r\n");
      out.write("                    <input type=\"reset\" value=\"重置\" /> <br>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
