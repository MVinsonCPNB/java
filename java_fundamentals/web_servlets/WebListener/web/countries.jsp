<%-- 
 * Example found on location 4437 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>Country List</title>
    </head>
    <body>
        We operate in these countries:
        <ul>
            <!--${countries.values().stream().map(x ->"--><li>" += x += "</li><!--").toList()}-->
        </ul>  
    </body>
</html>