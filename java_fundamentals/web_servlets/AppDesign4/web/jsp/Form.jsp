<%-- 
 * Example found at https://bitbucket.org/budi-kurniawan/servletjsp2-apps/src/a05c4473efcb70eb5463919c6e9de18c39f7084c/chapter11/appdesign4/web/jsp/Form.jsp?at=master&fileviewer=file-view-default
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 17, 2018
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <style type="text/css">@import url(css/main.css);</style>
    </head>
    <body>
        <form method="post" action="pdf">
            <h1>Create PDF
                <span>Please use this form to enter the text</span>
            </h1>
            <label>
                <span>Text :</span>
                <input type="text" name="text"
                       placeholder="Text for PDF"/>
            </label>
            <label>
                <span>&nbsp;</span>
                <input type="submit"/>
            </label>
        </form>
    </body>
</html>
