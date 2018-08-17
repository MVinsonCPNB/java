AppDesign2 Example
==================

The AppDesign2 example can be studied in detail at location 5318 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose
* The AppDesign2 example uses a Model 2 framework. The src/java/appdesign2/
  filter/DispatcherFilter.java intercepts URI requests from a browser using
  the @WebServlet annotation. From there, the URI is broken apart and an action
  string is extracted. The correct action is then handled accordingly within the
  doFilter.  

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/AppDesign2/input-product


