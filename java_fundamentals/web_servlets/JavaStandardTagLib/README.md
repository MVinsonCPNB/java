JSTL-Java Standard Tag Library Example
====================

The JSTL-Java Standard Tag Library example can be studied in detail at location 3112 of 7943 within
the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27

### Purpose:
* Using the Java Standard Tag Library (JSTL) a servlet is requested by the 
  browser, the servlet then creates objects, attaches them to an 
  httpServlet.request, which is accessed on within the .jsp, which is loaded 
  by the servlet.
* src/BooksServlet.java creates a list of books, then passes the list using the 
  RequestDispatcher to the /books.jsp. Once redirected to /books.jsp, JSTL is
  syntax is used to access, iterate, and display the contents of the list.
* src/BigCitiesServlet.java creates a Map of capitals and a HashMap of a listing
  of coutries big cities. It then passes these objects to the bigCities.jsp
  where the objects are printed to screen using EL and JSTL syntax.  Note: 
  using a custom tag created in the ELcustomTagDemo project, a .jar was compiled
  and referenced using <%@ taglib uri="http://example.com/taglib/function" 
  prefix="f" %>.  Instruction on how to compile a tag.jar file is found [here](https://github.com/MVinsonCPNB/java/tree/master/java_fundamentals/web_servlets/ELcustomTagDemo)

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, "http://l<span></span>ocalhost:8084/JavaStandardTagLib/books".

### Setup NetBeans 8 project with JSTL 1.2.2
* In order to use JSTL in Netbeans 8 right click the library directory under
    the Projects tag, and add JSTL 1.2.2 to the project.
* Add <%@ taglib uri="http://j<span></span>ava.sun.com/jsp/jstl/core" prefix="c" %> to 
  all .jsp to access <c:forEach ... ect.
* See [Install JSTL Library Instructions](https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm)


