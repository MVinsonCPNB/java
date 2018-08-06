SessionMgt Example
====================

The SessionMgt example can be studied in detail at location 1099 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2 with Java-EE bundle
    * Operating System: Fedora 27: JDK (verison 1.8.0)
    * Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
    * src/java/sessionmgt/urlrewriting/Top10Servlet.java shows how URL 
      rewriting is used to pass parameters with the URL. A couple of drawbacks
      URL parameters might max at around 2000 characters, and they are visible
      to everyone. 
    * src/java/sessionmgt/hiddenfields/CustomerServlet.java provides a means 
      to view and edit a customer. Customers are initialized within the init() 
      method, which are displayed by the doGet method. Initially displaying 
      and edit link, a hidden input tag is used to pass an id value, noting the 
      value still shows up in the URL upon redirect. The example also shows how
      to have one Servlet manage multiple URL requests, such as: "/customer", 
      "/editCustomer", "/updateCustomer". 


### Run the Project in NetBeans
    * To run a servlet, Access the Projects Tab -> SessionMgt -> src -> java ->
      SessionMgt -> CustomerServlet.java, then right click and select
      Run File.

