Filter Demo Example
====================

The Filter Demo example can be studied in detail at location 4380 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* src/java/filterdemo/LoggingFilter.java first creates two initial parameters
  using @WebFilter which are then referenced within the class using
  FilterConfig. A logging file is created upon the init method which is used
  to record a date and time a JSP was requested. The log file can be found at
  the /build/web/log.txt path. The filter is automatically run when a url is 
  requested which matches the urlPatterns defined within the @WebFilter
  annotation, in this case it run for any url requested: urlPatterns = { "/*"}.
* web/test.jsp is used to invoke the LogginFilter.java

* src/java/filterdemo/ImageProtectorFilter.java filters all request made from 
  a browser trying to view a image using a direct path. For example when you
  vist http://<span></span>localhost:8084/FilterDemo/image/screenshot.png
  and error is displayed in the browser stating "Image not available". To make 
  sure the picture can still be loaded by a webpage follow the Run Project \
  directions below.

* src/java/filterdemo/DownloadCounterFilter.java creates file at path build/web/
  downloadLog.txt. This file holds the date and time it was last updated. The 
  file also holds url information and a counter which records the amount of
  times a url was requested, to include all linked resources. 

 
### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, http://<span></span>localhost:8084/FilterDemo/test.jsp

### Notes: 
* If multiple filters use the same resources and the order they are invoked is 
  important, you can define the order within the deployment descriptor file (see
  location 5013 of 7943) for detailed information.

