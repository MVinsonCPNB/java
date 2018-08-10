<%-- 
 * Example found on location 3760 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 9, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/mytags.tld" prefix="easy"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing my first tag</title>
    </head>
    <body>
        Hello!!!
        <br/>
    
        <easy:firstTag></easy:firstTag>
        <h3>Testing DataFormatterTag</h3>
        
        <%-- compate version of tag call --%>
        <easy:dataFormatter header="states"
                            items="Alabama,Alaska,Georgia,Florida"/>
        <br/>
        
        <easy:dataFormatter header="Countries">
            <jsp:attribute name="items">
                US,UK,Canada,France
            </jsp:attribute>
        </easy:dataFormatter>

        <br>
        
        <h3>Testing SelectElementFormatterTag</h3>
        <easy:select>
            <option value="${value}">${text}</option>
        </easy:select>
    </body>
</html>
