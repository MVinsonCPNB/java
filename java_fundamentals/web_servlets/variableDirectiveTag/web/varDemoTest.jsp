<%-- 
 * Example found on location 4240 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing variable</title>
    </head>
    <body>
        Today's date:
        <br/>
        <tags:varDemo>
            In long format: ${longDate}
            <br/>
            In short format: ${shortDate}
        </tags:varDemo>
    </body>
</html>
