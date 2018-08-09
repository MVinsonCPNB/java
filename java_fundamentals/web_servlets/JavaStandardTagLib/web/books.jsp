<%-- 
 * Example found on location 3170 of 7943
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
        <title>Book List</title>
        <style>
            table, tr, td {
                border: 1px solid brown;
            }
        </style>
    </head>
    
    <body>
        Books in Simple Table
        <table>
            <tr>
                <td>ISBN</td>
                <td>Title</td>
            </tr>
            <%-- get the books object created in BooksServlet and 
            attached to the request sent here --%>
            <c:forEach items="${requestScope.books}" var="book">
                <tr>
                    <td>${book.isbn}</td>
                    <td>${book.title}</td>
                </tr>
            </c:forEach>
        </table>
            <br/>
            Books in Styled Table
            <table>
                <tr style="background:#ababff">
                    <td>ISBN</td>
                    <td>Title</td>
                </tr>
                <c:forEach items="${requestScope.books}" var="book"
                           varStatus="status">
                    <c:if test="${status.count%2 == 0}">
                        <tr style="background:#eeeeff">
                    </c:if>
                    <c:if test="${status.count%2 != 0}">
                        <tr style="background:#dedeff"> 
                    </c:if>
                            <td>${book.isbn}</td>
                            <td>${book.title}</td>
                        </tr>
                </c:forEach>
            </table>
                <br/>
                ISBNs only:
                <c:forEach items="${requestScope.books}" var="book"
                               varStatus="status">
                        ${book.isbn}<c:if test="${!status.last}">,</c:if>
                </c:forEach>
    </body>
</html>
