<%-- 
 * Example found on location 4325 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
--%>

<%@ attribute name="productDetails" fragment="true" %>
<%@ variable name-given="productName" %>
<%@ variable name-given="description" %>
<%@ variable name-given="price" %>
<%
    jspContext.setAttribute("productName", "Pelesonic DVD Player");
    jspContext.setAttribute("description", 
            "Dobly Digital output through coaxial digital-audio jack,"
            + "500 lines horizontal resolution-image digest viewing");
    jspContext.setAttribute("price", "65");
%>
<jsp:invoke fragment="productDetails"/>
