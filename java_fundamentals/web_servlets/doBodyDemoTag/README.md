doBody Demo Tag
===============

The doBody Demo Tag example can be studied in detail at location 4287 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* The doBody Demo example shows how to run a tag in the background to record 
  the referer's url of a get method. The searchEngine.html links to the main.jsp
  which runs the doBodyDemo.tag. The doBodyDemo.tag records in a session variable the 
  contents of the header.referer value, which is then accessible on others pages
  like the viewReferer.jsp. 

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/doBodyDemoTag/searchEngine.html.


