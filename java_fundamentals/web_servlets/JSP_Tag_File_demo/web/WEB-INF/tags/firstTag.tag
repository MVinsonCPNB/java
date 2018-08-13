<%-- 
 * Example found on location 3991 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 13, 2018
--%>

<%-- This looks like a JSP but it is not its the tag file --%>

<%@ tag import="java.util.Date" import="java.text.DateFormat"%>
<%
    DateFormat dateFormat = 
            DateFormat.getDateInstance(DateFormat.LONG);
    Date now = new Date(System.currentTimeMillis());
    out.println(dateFormat.format(now));
%>