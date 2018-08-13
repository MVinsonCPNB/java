<%-- 
 * Example found on location 4112 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 13, 2018
--%>

This tag file shows the use of the include directive.
The first include directive demonstrates how you can include
a static resource called included.html.
<br/>
Here is the content of included.html:
<%@ include file="included.html" %>
<br/>
<br/>
The second include directive includes another dynamic resource:
included.tagf.
<br/>
<%@ include file ="includeDemoTag.tagf" %>