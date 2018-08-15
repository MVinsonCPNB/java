WebListener Example
===================

The WebListener example can be studied in detail at location 4380 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* The WebListener example implements the ServletContextListener and when the
  servlet's container loads a JSP it initiates the code within the listener's
  class, which in this case creates a variable to be used within countries.jsp.


### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/WebListener/countries.jsp.


