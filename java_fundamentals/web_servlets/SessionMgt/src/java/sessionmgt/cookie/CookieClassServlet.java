/*
 * Example found on location 1441 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 7, 2018
 */

package sessionmgt.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CookieClassServlet", urlPatterns = {"/cookieClass"})
public class CookieClassServlet extends HttpServlet {

    private static final long serialVersionUID = 837369L;
    private String[] methods = {
        "clone", "getComment", "getDomain",
        "getMaxAge", "getName", "getPath",
        "getSecure", "getValue", "getVersion",
        "isHttpOnly", "setComment", "setDomain",
        "setHttpOnly", "setMaxAge", "setPath",
        "setSecure", "setValue", "setVersion"
    };
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        Cookie maxRecordsCookie = null;
        // Search for the maxRecords cookie
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("maxRecords")) {
                    maxRecordsCookie = cookie;
                    break;
                }
            }
        }
        
        int maxRecords = 5; // default
        if (maxRecordsCookie != null){
            try {
                maxRecords = Integer.parseInt(
                        maxRecordsCookie.getValue());
            }catch (NumberFormatException e) {
                // do nothing, user maxRecords default value
            }
        }
        
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>"
                + "<html><head>" + "<title>Cookie Class</title></head>"
                + "<body>" + PreferenceServlet.MENU
                + "<div>Hear are some of the methods in " + 
                "javax.servlet.http.Cookie");
        writer.print("<ul>");
        
        for (int i = 0; i < maxRecords; i++){
            writer.print("<li>" + methods[i] + "</li>");
        }
        writer.print("</ul>");
        writer.print("</div></body></html>");
    }
}

