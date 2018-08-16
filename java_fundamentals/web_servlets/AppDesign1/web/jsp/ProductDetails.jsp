<%-- 
 * Example found on location 5281 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 16, 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Save Product</title>
        <style type="text/css">@import url(css/main.css);</style>
    </head>
    <body>
        <div id="global">
            <h4>The product has been saved.</h4>
            <p>
                <h5>Details:</h5>
                Product Name: ${product.name}<br/>
                Description: ${product.description}<br/>
                Price: $${product.price}<br/>
            </p>
        </div>
    </body>
</html>
