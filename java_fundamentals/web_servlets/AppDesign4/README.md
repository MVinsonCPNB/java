AppDesign4 Example
==================

The AppDesign4 example can be studied in detail at location 5539 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose
* AppDesign4 shows how to properly use dependency injection. The app takes user
  input and forwards a string be printed in a PDF file. The ControllerServlet
  handles the action "pdf".  The pdf action calls the dependencyInjector
  class to construct a pdf object. Everything is handled by the 
  dependencyInjector, such as the creation of a PDFAction class, the attaching 
  of a PDFservice object to the class. The PDFservice object makes available all 
  the methods from org.apache.pdfbox.* jar file. This is not a standard library 
  class and was downloaded from https://pdfbox.apache.org/download.cgi and 
  imported into the projects libraries. Once the PDFAction object is constructed
  only one call to the pdfAction object is made, thereby hiding the complex 
  object creation process involved with the dependencyInjection object.
  Additionally, by using the dependencyInjection process tests can be used 
  on each component of the process.
* src/java/test/PDFActionTest.java tests the dependencyInjection process before 
  its implementation into an applicaion.

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://<span></span>localhost:8084/AppDesign4/form


