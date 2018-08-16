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
* src/java/listenerdemo/listener/AppListener.java implements the 
  ServletContextListener and when the servlet's container loads a JSP it 
  initiates the code within the listener's class, which in this case creates a
  variable to be used within countries.jsp.
* src/java/listenerdemo.listener/SessionListener.java is a session listener
  which gets notified anytime an HttpSession is created or destroyed. When the
  web/countries.jsp is accessed by different browsers, the user count is
  displayed in console, showing how many user sessions are active.
* src/java/listenerdemo.model listens for an HttpSession gets unbound or 
  serilized, for example some session attributes get pushed to secondary
  when a servlet container runs out of room. 
* src/java/listenerdemo.listener/PrefStatListener starts a timer when a JSP 
  is loaded by the container and prints out the time it took to load and 
  send out (destroy) the page to the requesting browser to console.
 
### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/WebListener/countries.jsp.


