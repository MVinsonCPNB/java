<%-- 
 * Example found on location 4189 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 13, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="easy" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing encode</title>
    </head>
    <body>
        <easy:encode input="<br/> means changing line"/>
    </body>
</html>
