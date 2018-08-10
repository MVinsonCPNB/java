<%-- 
 * Example found on location 3246 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 9, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://example.com/taglib/function" prefix="f" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Big Cities</title>
        <style>
            table, tr, td {
                border: 1px solid #aaee77;
                padding: 3px;
            }
        </style>
    </head>
    <body>
        Capitals
        <table>
            <tr style="background:#448755;color:white;font-weight:bold">
                <td>Country</td>
                <td>Capital</td>
            </tr>
            <%-- iterate throught a Map --%>
            <c:forEach items="${requestScope.capitals}" var="mapItem">
                <td>${mapItem.key}</td>
                <td>${mapItem.value}</td>
            </tr>
            </c:forEach>
        </table>
        <br/>
        Big Cities
        <table>
            <tr style="background:#448755;color:white;font-weight:bold">
                <td>Country</td>
                <td>Cities</td>
            </tr>
            <c:forEach items="${requestScope.bigCities}" var="mapItem">
                <tr>
                    <td>${mapItem.key}</td>
                    <td>
                        <c:forEach items="${mapItem.value}" var="city"
                                   varStatus="status">
                            ${city}<c:if test="${!status.last}">,</c:if>
                        </c:forEach>
                    </td>
                </tr>
            </c:forEach>
        </table>
        
        <br/>
        <c:set var="myDate" value="8/9/2018"/>
        <fmt:parseDate var="formattedDate" type="date"
                       dateStyle="short" value="${myDate}"/>
        <c:out value="${formattedDate}" />
        
        <h3>This is the added .jar file from a custom compiled EL tag</h3>
        ${f:reverseString("Finally after 2 hours it works!!!  This jar file was imported and comiled from a custom tag built in the Elcustom TagDemo project")}
    </body>
</html>
