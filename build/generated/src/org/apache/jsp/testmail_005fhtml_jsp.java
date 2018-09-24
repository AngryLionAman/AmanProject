package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testmail_005fhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>MESSAGING IN JSP</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<body class=\"container\">\n");
      out.write("<form action=\"mail.jsp\" method=\"get\"> \n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  <div class=\"container\" class=\"form-row align-items-center\">\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("      <label class=\"sr-only\" for=\"inlineFormInputName\">Name</label>\n");
      out.write("            <input type=\"text\" name=\"mail\" class=\"form-control mb-2 mb-sm-0\" id=\"inlineFormInputName\" placeholder=\"exam@gmail.com\">\n");
      out.write("    </div><br>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("      <label class=\"sr-only\" for=\"inlineFormInputGroupUsername\">Subject</label>\n");
      out.write("      <div class=\"input-group mb-2 mb-sm-0\">\n");
      out.write("        <div class=\"input-group-addon\">SUBJECT</div>\n");
      out.write("        <input type=\"text\" name=\"subj\" class=\"form-control\" id=\"inlineFormInputGroupUsername\" placeholder=\"Subject\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <br>\n");
      out.write("    <label for=\"exampleFormControlTextarea1\"></label><br>\n");
      out.write("    <textarea class=\"form-control\" name=\"feed\" id=\"exampleFormControlTextarea1\" rows=\"3\" placeholder=\"comments goes here\"></textarea>\n");
      out.write("  \t</div>\n");
      out.write("    <div class=\"col-auto\">\n");
      out.write("      <div class=\"form-check mb-2 mb-sm-0\">\n");
      out.write("        <label class=\"form-check-label\">\n");
      out.write("          <input class=\"form-check-input\" type=\"checkbox\"> Remember me\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("    </div><br>\n");
      out.write("    <div class=\"col-auto\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
