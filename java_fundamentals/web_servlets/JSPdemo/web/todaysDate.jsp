<%-- 
    Document   : welcome
 * Example found on location 1915 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 7, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Today's date</title>
    </head>
    <body>
        <%  DateFormat dateFormat =
                DateFormat.getDateInstance(DateFormat.LONG);
        String s = dateFormat.format(new Date());
        out.println("Today is " + s);
        %>
    </body>
</html>
