/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-09-24 16:04:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.6.RELEASE.jar", Long.valueOf(1535384741347L));
    _jspx_dependants.put("jar:file:/D:/InsuranceProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/InsuranceProject/WEB-INF/lib/spring-webmvc-5.0.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1525781272000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Registration</title>\r\n");
      out.write("    \r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"main.css\">\r\n");
      out.write("    \r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- to be erased once css connection is fixed -->  \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover\r\n");
      out.write("}\r\n");
      out.write(".frosted {\r\n");
      out.write("     background:rgba(255,255,255, 0.75);\r\n");
      out.write("    padding: 20;\r\n");
      out.write("}\r\n");
      out.write("</style>  \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body style = \"background-image: url(https://static1.squarespace.com/static/5a31d4d129f187383aad4a32/t/5a4418f553450ac1b236617d/1514412462277/helpinghands.jpg);\">\r\n");
      out.write("<div class = \" frosted text-left\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0\" class=\"logo img-circle col-md-4 \" alt=\"hands holding a family\">\r\n");
      out.write("        <div class=\"col-sm-12 col-md-4  col-lg-6\">\r\n");
      out.write("   <h1 >Assure Insurance </h1>\r\n");
      out.write("  <p  class = \"hidden-lg-down\">You're In Good Hands with Assure Insurance</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write(" <div class=\"container frosted mainCenter\" >\r\n");
      out.write("        <div class=\"row \">\r\n");
      out.write("     \r\n");
      out.write("\t\t\t<!--   String email, String username, String password, \t -->\r\n");
      out.write("   \t\t\t");
      if (_jspx_meth_sf_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t</div><!-- row 1 -->\r\n");
      out.write("    </div><!-- container -->\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sf_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_sf_005fform_005f0_reused = false;
    try {
      _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f0.setParent(null);
      // /WEB-INF/views/customer/register.jsp(47,6) null
      _jspx_th_sf_005fform_005f0.setDynamicAttribute(null, "class", "form-group col-sm-12 col-md-4  col-lg-6 col-md-offset-2");
      // /WEB-INF/views/customer/register.jsp(47,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setAction("regSuccess");
      // /WEB-INF/views/customer/register.jsp(47,6) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setModelAttribute("customer");
      int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
        if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("   \t\t\t\t<label>Policy Number:</label> ");
            if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("   \t\t\t\t<label>User Name:</label> ");
            if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("   \t\t\t\t<label>First Name:</label> ");
            if (_jspx_meth_sf_005finput_005f2(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("       \t\t\t<label>Last Name:</label> ");
            if (_jspx_meth_sf_005finput_005f3(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("   \t\t\t\t<label>Email:</label>");
            if (_jspx_meth_sf_005finput_005f4(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("   \t\t\t\t<label>Enter Password:</label>");
            if (_jspx_meth_sf_005finput_005f5(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return true;
            out.write("<br>\r\n");
            out.write("       \t\t\t<label>Re-enter Password:</label><input type=\"password\" placeholder=\"P@55w0rd123!\"/><br>\r\n");
            out.write("   \t    \t\r\n");
            out.write("   \t    \t\t<Button type=Submit class= \"btn btn-success btn-lg\" >Submit</Button>\r\n");
            out.write("        \t\t<Button type=\"reset\" class= \"btn btn-info btn-lg\" >Clear</Button>\r\n");
            out.write("    \t\t");
            int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fclass_005faction.reuse(_jspx_th_sf_005fform_005f0);
      _jspx_th_sf_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_sf_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f0_reused = false;
    try {
      _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(48,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setPath("policyNum");
      // /WEB-INF/views/customer/register.jsp(48,37) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "placeholder", "12345678");
      int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
        if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
      _jspx_th_sf_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f1_reused = false;
    try {
      _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(49,33) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setPath("username");
      // /WEB-INF/views/customer/register.jsp(49,33) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "placeholder", "JohnDoe");
      int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
        if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
      _jspx_th_sf_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f2_reused = false;
    try {
      _jspx_th_sf_005finput_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(50,34) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f2.setPath("firstName");
      // /WEB-INF/views/customer/register.jsp(50,34) null
      _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "placeholder", "John");
      int[] _jspx_push_body_count_sf_005finput_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f2 = _jspx_th_sf_005finput_005f2.doStartTag();
        if (_jspx_th_sf_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f2);
      _jspx_th_sf_005finput_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f2, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f3_reused = false;
    try {
      _jspx_th_sf_005finput_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(51,36) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f3.setPath("lastName");
      // /WEB-INF/views/customer/register.jsp(51,36) null
      _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "placeholder", "Doe");
      int[] _jspx_push_body_count_sf_005finput_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f3 = _jspx_th_sf_005finput_005f3.doStartTag();
        if (_jspx_th_sf_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f3);
      _jspx_th_sf_005finput_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f3, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f4_reused = false;
    try {
      _jspx_th_sf_005finput_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(52,28) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f4.setPath("email");
      // /WEB-INF/views/customer/register.jsp(52,28) null
      _jspx_th_sf_005finput_005f4.setDynamicAttribute(null, "placeholder", "Email@email.com");
      int[] _jspx_push_body_count_sf_005finput_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f4 = _jspx_th_sf_005finput_005f4.doStartTag();
        if (_jspx_th_sf_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f4);
      _jspx_th_sf_005finput_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f4, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f5_reused = false;
    try {
      _jspx_th_sf_005finput_005f5.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/customer/register.jsp(53,37) null
      _jspx_th_sf_005finput_005f5.setDynamicAttribute(null, "type", "password");
      // /WEB-INF/views/customer/register.jsp(53,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f5.setPath("password");
      // /WEB-INF/views/customer/register.jsp(53,37) null
      _jspx_th_sf_005finput_005f5.setDynamicAttribute(null, "placeholder", "P@55w0rd123!");
      int[] _jspx_push_body_count_sf_005finput_005f5 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f5 = _jspx_th_sf_005finput_005f5.doStartTag();
        if (_jspx_th_sf_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f5.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_sf_005finput_005f5);
      _jspx_th_sf_005finput_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sf_005finput_005f5, _jsp_getInstanceManager(), _jspx_th_sf_005finput_005f5_reused);
    }
    return false;
  }
}
