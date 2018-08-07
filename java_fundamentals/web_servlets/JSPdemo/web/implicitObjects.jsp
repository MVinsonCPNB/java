<%-- 
    Document   : welcome
 * Example found on location 1994 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 7, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Implicit Objects</title>
    </head>
    <body>
        <b>Http headers:</><br/>
        <% 
            for (Enumeration<String> e = request.getHeaderNames();
                    e.hasMoreElements(); ) {
                String header = e.nextElement();
                out.println(header + ": " + request.getHeader(header) + 
                        "<br/>");
            }
        %>
        <hr/>
        <%
            out.println("Buffer size: " + response.getBufferSize() +
                    "<br/>");
            out.println("Session id: " + session.getId() + "<br/>");
            out.println("Servlet name: " + config.getServletName() + 
                    "<br/>");
            out.println("Server info: " + application.getServerInfo());
        %>
    </body>
</html>
