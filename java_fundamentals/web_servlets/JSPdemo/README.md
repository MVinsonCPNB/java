JSPdemo Example
====================

The JSPdemo example can be studied in detail at location 1819 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* web/welcome.jsp is basic hello world stuff!
* web/todaysDate.jsp shows how scriptlets are used.  Don't code Java directly
  in JSP whenever possible... note from author --makes alterations difficult.
* web/implicitObjects.jsp how to use implicit objects made available by the 
  javax.servlet.jsp.* library.  For example, printing all information from
  the Http Header, such as, host, user-agent, sessionID, BufferSize, etc.
* web/declarationTest.jsp shows how to define a method and use it.
* web/lifeCycle.jsp demonstrates how to override jspInit and jspDestory. The
  jspDestory is invoked upon the jsp container shutting down. See the
  container's log file for the System.out.println messages.
* web/useBean.jsp creates a scripting variable and uses it display the date.
* web/getSetpPropertyTest.jsp uses jsp:useBean to create an employee object and
  assign a value to ones of its variables.
* web/jspIncludeTest.jsp uses the include action, NOT the include directive, to
  import a Java Server Page Fragment's (jspf) content to its location. This
  error is handled by displaying an error message defined within the 
  errorHandler.jsp. 

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/JSPdemo/todaysDate.jsp".

