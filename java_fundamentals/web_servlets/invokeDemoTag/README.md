Invoke Demo Tag
===============

The invoke Demo Tag example can be studied in detail at location 4325 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* The web/WEB-INF/tags/invokeDemo.tag uses the fragment attribute which allows 
  the tag handler to run a new version of the code each time the tag is invoked.
  This is helpful when a tag needs to update information within its variables it
  defines within its code. Checkout an example at [Oracle Docs](https://docs.oracle.com/cd/E19575-01/819-3669/bnalq/index.html)

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/invokeDemoTag/invokeTest.jsp.


