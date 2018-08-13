Express Language Example
====================

The Express Language example can be studied in detail at location 1819 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* src/ELImportListener.java is a way of importing a package into a JSP page
  for use within an EL syntax.  In-line method <%@page import="java.time.*"> is 
  a straight foward way to reference static fields and methods with any Java 
  class. Making ${LocalDate.now()} possible within a JSP using Expression 
  Language.


### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/Express Language/todaysDate.jsp".

