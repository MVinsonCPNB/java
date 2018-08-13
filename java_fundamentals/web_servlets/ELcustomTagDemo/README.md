JSTL-Java Standard Tag Library Example
====================

The JSTL-Java Standard Tag Library example can be studied in detail at location 
3892 of 7943 within the [Servlet & JSP: A Beginner's Tutorial](https://brainysoftware.com/9781771970327),
written by Budi Kurniawan. The code seen with the java_fundamentals/web_servlets
directory was recoded by Michael Vinson for practice and referencing purposes.

### Development Environment
* NetBeans 8.2 with Java-EE bundle
* Operating System: Fedora 27: JDK (verison 1.8.0_172-b11)
* Servlet/JSP Container: Apache-Tomcat-8.0.27
* JSTL Version: 1.2.2

### Purpose:
* Write custom Expression Language function to call within a JSP
* src/java/function/StringFunction.java declares a class which accepts one 
  string parameter and returns it printed backwards.
* web/WEB-INF/tlds/functiontags.tld defines a the class in XML format so it can
  be referenced within a JSP.
* web/reverse.jsp links the taglibrary for use in the HTML code.

### Run the Project in NetBeans
* To run a JSP, start the JSP container and access the pages directly using the 
  URL, such as, http://<span></span>localhost:8084/ELcustomTagDemo/reverse.jsp.

### How to compile a .jar file for use in another project
* Copy function/StringFunciton.java into a staging area. Compile the file
  using terminal, such as, javac funciton/StringFunction.java
* Copy web/WEB-INF/tlds/functiontags.tld into a file within the staging area
  called META-INF.
* Create a manifest.txt file with the contents: Main-class: StringFunction
   --------- Note must end the manifest file with a newline
* The staging file hierarchy should look like: 
```
staging directory ---|
                     --function -----|
                     |               StringFunction.class  
                     --META-INF -----|
                     |               functiontags.tld
                     --manifest.txt
```
* Note: Within the functiontags.tld there should be a unique \<uri\>, for example,
  <uri>http://example.com/taglib/function</uri>
* Compile the staging area with the terminal command:
  jar cvfm mytags.jar manifest.txt function/StringFunction.class META-INF/functiontags.tld
* Now place the mytags.jar file in a projects web/WEB-INF/lib folder and you can 
  reference it by using: 
    <%@ taglib uri="http://<span></span>example.com/taglib/function" prefix="f" %>
  At the top of the page like any JSTL tag library descriptor.
* For more about custom tags see location 3951.


