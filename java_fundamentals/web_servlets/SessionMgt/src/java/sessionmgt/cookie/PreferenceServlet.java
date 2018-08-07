/*
 * Example found on location 1359 of 7943
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

@WebServlet(name = "PreferenceServlet", urlPatterns = {"/preference"})
public class PreferenceServlet extends HttpServlet {
    private static final long serialVersionUID = 888L;
    public static final String MENU =
            "<div style='background:#e8e8e8;"
            + "padding:15px'>"
            + "<a href ='cookieClass'>Cookie Class</a>&nbsp;&nbsp;"
            + "<a href ='cookieInfo'>Cookie Info</a>&nbsp;&nbsp;"
            + "<a href='preference'>Preference</a>"
            + "</div>";
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
        // store title fontsize, style or weight, and max records as 
        // post parameters.
        writer.print("<!DOCTYPE html>"
            + "<html><head>"
            + "<title>Preference</title>"
            + "<style>table { font-size:small;"
            + "background:NavajoWhite }</style>"
            + "</head><body>"
            + MENU
            + "Please select the values below:"
            + "<form method='post'>"
            + "<table>"
            + "<tr><td>Title Font Size: </td>"
            + "<td><select name='titleFontSize'>"
            + "<option>large</option>"
            + "<option>x-large</option>"
            + "<option>xx-large</option>"
            + "</select></td>"
            + "</tr>"
            + "<tr><td>Title Style & Weight: </td>"
            + "<td><select name='titleStyleAndWeight' multiple>"
            + "<option>italic</option>"
            + "<option>bold</option>"
            + "</select></td>"
            + "</tr>"
            + "<tr><td>Max. Records in Table: </td>"
            + "<td><select name='maxRecords'>"
            + "<option>5</option>"
            + "<option>10</option>"
            + "</select></td>"
            + "</tr>"
            + "<tr><td rowsapn='2'>"
            + "<input type='submit' value='Set' /></td>"
            + "</tr>"
            + "</table> </form> </body> </html>");
     }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // retrieve the three parameters if any posted within the form
        String maxRecords = request.getParameter("maxRecords");
        String[] titleStyleAndWeight = 
                request.getParameterValues("titleStyleAndWeight");
        String titleFontSize =
                request.getParameter("titleFontSize");
        
        
        // create two new cookies containing form parameters
        response.addCookie(new Cookie("maxRecords", maxRecords));
        response.addCookie(new Cookie("titleFontSize", titleFontSize));

        // Delete titleFontWeight and titleFontStyle cookies first
        // delete cookie by adding a cookie with the maxAge = 0;
        Cookie cookie = new Cookie("titleFontweight", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        
        // Delete the titleFontStyle cookie if present
        cookie = new Cookie("titleFontStyle", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        
        // Delete the titleFontWeight cookie if present
        cookie = new Cookie("titleFontWeight", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);


        if (titleStyleAndWeight != null){
            for (String style : titleStyleAndWeight) {
                if (style.equals("bold")) {
                    response.addCookie(new Cookie("titleFontWeight", "bold"));
                } else if (style.equals("italic")) {
                    response.addCookie(new Cookie("titleFontStyle", "italic"));
                }
            }
        }
        
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>"
            + "<html><head>" + "<title>Preference</title></head>"
            + "<body>" + MENU + "Your preference has been set."
            + "<br/><br/>Max. Records in Table: " + maxRecords
            + "<br/>Title Font Size: " + titleFontSize
            + "<br/>Title Font Style & Weight: ");
        
        // titleStyleAndWeight will be null if none of the options 
        // was selected
        if (titleStyleAndWeight != null) {
            writer.println("<ul>");
            for(String style : titleStyleAndWeight) {
                writer.print("<li>" + style + "</li>");
            }
            writer.println("</ul>");
        }
        writer.println("</body></html>");
    }
}
