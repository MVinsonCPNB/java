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
<%@page errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Include action</title>
    </head>
    <body>
        This jsp will not load as there is no menu.jsp.  However it will throw
        an error which will display the errorPage.jsp.
        <jsp:include page="jspf/menu.jsp">
            <jsp:param name="text" value="How are you?"/>
        </jsp:include>
    </body>
</html>
