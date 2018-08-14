JSP Tag File Demo
=======================================

The JSP Tag File Demo example can be studied in detail at location 
3991 of 7943 within the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27
* JSTL Version: 1.2.2

### Purpose:
* Write custom Tag function to be called within a .jsp.
* A function is defined within the web/WEB-INF/tags/firstTag.tag.
* web/firstTagTest.jsp uses the tag and Expression language.

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as,
  http://<span></span>localhost:8084/JSP_Tag_File_demo/firstTagTest.jsp

### Notes
* In order for tag files to work they need to be placed in WEB-INF/tags.
* Using this method of tags does not require the .tag file to be compiled into 
  a .jar file. They are compiled at run time by Tomcat, however, they can be.
