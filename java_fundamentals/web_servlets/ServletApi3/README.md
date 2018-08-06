ServletApi2 Example
====================

The ServletApi2 example can be studied in detail at location 1010 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2 with Java-EE bundle
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
    * Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
    * How to use a Deployment Descriptor. Instead of using the WebServlet
      annotation to map the paths to servlets, a web.xml config file
      will define URL routing.
    * Within the web.xml deployment descriptor, the <load-on-startup> pre-loads
      a servlet making its first use fast as possible. Web annotation does 
      not have an equivalent. 

### Run the Project in NetBeans
    * To run a servlet, Access the Projects Tab -> ServletApi2 -> src -> java ->
      ServletApi2 -> FormServlet.java, then right click and select
      Run File.

