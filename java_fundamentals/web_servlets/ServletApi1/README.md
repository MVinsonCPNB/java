ServletApi1 Example
====================

The ServletApi1 example can be studied in detail at location 565 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
    * NetBeans 8.2 with Java-EE bundle
    * Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
    * Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
    * servletapi1.MyServlet.java demonstrates how to implement the Servlet 
      interface.
    * servletapi1.ServletConfigDemo.java demonstrates how to pass initial
      parameters to the servlet container, which then passes these configuration
      parameters to the servlet's init method thereby making the variables admin
      and email available within the servlet.  For example, the variables are
      accessed as follows: servletConfig.getInitParameter("admin");   


### Run the Project in NetBeans
    * Click the Run -> Run Project, this loads the ServletApi1 index.hmtl page
    * To run a servlet, Access the Projects Tab -> ServletApi1 -> src -> java ->
      servletapi1 -> ServletConfigDemoServlet.java, then right click and select
      Run File.

    * Outputs:
        Admin:Harry Taciak
        Email:admin@example.com