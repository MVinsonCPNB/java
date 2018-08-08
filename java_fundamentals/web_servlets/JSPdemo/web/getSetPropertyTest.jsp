<%-- 
 * Example found on location 2264 of 7943
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
        <title>getProperty and setProperty</title>
    </head>
    <body>
        <jsp:useBean id="employee" class="jspdemo.Employee"/>
        <jsp:setProperty name="employee" property="firstName" value="Abigail"/>
        First Name: <jsp:getProperty name="employee" property="firstName"/>
    </body>
</html>
