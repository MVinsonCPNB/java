JSTL-Java Standard Tag Library Example
====================

The JSTL-Java Standard Tag Library example can be studied in detail at location 
3112 of 7943 within the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27
* JSTL Version: 1.2.2

### Purpose:
* Write custom Java Standard Tag Library (JSTL) tags
* src/java/customtagsdemo/MyFirstTag.java is a class that implements the
  SimpleTag interface and defines actions to be done when invoked.
* web/WEB-INF/tlds/mytags.tld is an XML file used to define the name and locaiton
  of the MyFirstTag class.
* web/firstTagTest.jsp declares <%@ taglib uri="/WEB-INF/tlds/mytags.tld" 
  prefix="easy"%> and uses the new tag within the jsp.
* src/java/customtagsdemo/DataFormatterTag.java is a tag which accepts two 
  parameters, a header and a list, then prints out a table named with the header
  and the lists contents.
* src/java.customtagsdemo/SelectElementTag will manipulate the tag body via the 
  JspFragment passed by the JSP container. 

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, http://<span></span>localhost:8084/JSTLcustomTagDemo/firstTagTest.jsp.