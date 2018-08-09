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
    </body>
</html>
