<%-- 
 * Example found on location 2140 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 8, 2018
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    public String getTodaysDate() {
        return new java.util.Date().toString();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Today is <%=getTodaysDate()%>
    </body>
</html>
