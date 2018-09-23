package org.apache.jsp.Login_0020Form.Signup_0020Form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class completeprofile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write(" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("    <title>jQuery Dropdown Checkbox List</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ui.dropdownchecklist.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/ui.core.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/ui.dropdownchecklist.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("     $(document).ready(function(){\n");
      out.write("    \t$(\"#s5\").dropdownchecklist({ firstItemChecksAll: true, maxDropHeight: 100 });\n");
      out.write("     });\n");
      out.write("    </script>\n");
      out.write(" </head>\n");
      out.write("<body>\n");
      out.write(" <h1 align=\"center\" >jQuery Dropdown Checkbox List</h1>\n");
      out.write(" <form action=\"save_completeprofile1.jsp\" method=\"get\" name=\"dropdown_selection\">\n");
      out.write("  <table align=\"center\">\n");
      out.write("   <tr>\n");
      out.write("    <td>Select Product :</td>\n");
      out.write("    <td>\n");
      out.write("     <select id=\"s5\" multiple=\"multiple\" name=\"dropdown_selection\" >\n");
      out.write("       <option>All</option>\n");
      out.write("       <option>Technology</option>\n");
      out.write("       <option>Science</option>\n");
      out.write("       <option>Movies</option>\n");
      out.write("       <option>Music</option>\n");
      out.write("       <option>Health</option>\n");
      out.write("       <option>Food</option>\n");
      out.write("       <option>Books</option>\n");
      out.write("       <option>Visiting and travel</option>\n");
      out.write("       <option>Business</option>\n");
      out.write("       <option>Psychology</option>\n");
      out.write("       <option>History</option>       \n");
      out.write("       <option>Cooking</option>\n");
      out.write("       <option>Photography</option>\n");
      out.write("       <option>Sports</option>\n");
      out.write("       <option>Design</option>\n");
      out.write("       <option>Fashion and style</option>\n");
      out.write("       <option>Writing</option>\n");
      out.write("       <option>Economics</option>\n");
      out.write("       <option>Hacking</option>\n");
      out.write("       <option>Cyber Security</option>          \n");
      out.write("     </select>\n");
      out.write("    </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("   </tr>\n");
      out.write("  </table>\n");
      out.write(" </form>\n");
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
