<%-- 
 * Example found on location 2239 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 8, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>useBean</title>
    </head>
    <body>
        <jsp:useBean id="today" class="java.util.Date"/>
        <%=today%>
    </body>
</html>
