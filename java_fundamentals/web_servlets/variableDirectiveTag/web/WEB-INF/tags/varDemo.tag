<%-- 
 * Example found on location 4202 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
--%>

<%@ tag import="java.util.Date" import="java.text.DateFormat" %>
<%@ variable name-given="longDate" %>
<%@ variable name-given="shortDate" %>

<% 
    Date now = new Date(System.currentTimeMillis());
    DateFormat longFormat =
            DateFormat.getDateInstance(DateFormat.LONG);
    DateFormat shortFormat =
            DateFormat.getDateInstance(DateFormat.SHORT);
    jspContext.setAttribute("longDate", longFormat.format(now));
    jspContext.setAttribute("shortDate", shortFormat.format(now));
%>
<jsp:doBody/>

