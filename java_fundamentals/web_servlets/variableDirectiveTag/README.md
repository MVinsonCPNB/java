Variable Directive 
==================

The Variable Directive example can be studied in detail at location 4240 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* Expose values in a tag file to a JSP.
* web/WEB-INF/tags/varDemo.tag imports the date package and declares some
  variables, which are assigned to jspContext.setAttribute() making them 
  retrievable from the jsp. The <doBody/> tag is important when setting
  variables, see the book for details.
* web/varDemoTest.jsp use tablib directive to gain access to the varDemo.tag. 
  Within the jsp the variables ${longDate} and ${shortDate} are accessible.

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/variableDirectiveTag/varDemoTest.jsp".


