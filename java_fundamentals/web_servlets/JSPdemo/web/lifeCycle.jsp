<%-- 
 * Example found on location 2156 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 8, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    public void jspInit() {
        System.out.println("jspInit ...");
    }
    public void jspDestroy() {
        System.out.println("jspDestroy ...");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP LifeCycle</title>
    </head>
    <body>
        Overriding jspInit and jspDestroy
    </body>
</html>
