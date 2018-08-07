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
import javax.servlet.http.HttpSession;


@WebServlet(name = "CookieInfoServlet", urlPatterns = {"/cookieInfo"})
public class CookieInfoServlet extends HttpServlet {

    private static final long serialVersionUID = 3829L;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        StringBuilder styles = new StringBuilder();
        // create CSS <title> fromatting
        styles.append(".title {");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                if (name.equals("titleFontSize")){
                    styles.append("font-size:" + value + ";");
                } else if (name.equals("titleFontWeight")) {
                    styles.append("font-weight:" + value + ";");
                } else if (name.equals("titleFontStyle")) {
                    styles.append("font-style:" + value + ";");
                }
            }
        }
        
        styles.append("}");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>"
            + "<html><head>" + "<title>Cookie Info</title>"
            + "<style>" + styles.toString() + "</style>"
            + "</head><body>" + PreferenceServlet.MENU
            + "<div class='title'>"
            + "Sessions Management with Cookies:</div>");
        writer.print("<div>");
        
        // Return the sessionID, a browers can only have zero 
        // or one sessions active at a time.
        String sessionID = request.getSession().getId();
        
        
        
        // Cookies will be null it there's no cookie
        // Print out all cookies and sessionID
        if (cookies == null){
            writer.print("No cookie in this HTTP response.");
        } else {
            writer.println("<br/>Cookies in this HTTP response:");
            for (Cookie cookie : cookies) {
                writer.println("<br/>" + cookie.getName() + ":" 
                        + cookie.getValue());
            }
            writer.println(sessionID);
            writer.print("</div>");
            writer.print("</body></html>");
        }
    }   
}