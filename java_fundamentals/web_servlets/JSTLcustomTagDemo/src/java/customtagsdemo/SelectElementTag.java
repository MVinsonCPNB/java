/*
 * Example found on location 3851 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 10, 2018
 */
package customtagsdemo;
import java.io.IOException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SelectElementTag extends SimpleTagSupport {
    
    // tag added to WEB-INF/tlds/mytags.tld
    private String[] countries = {"Austraila", "Brazil", "China" };
    
    public void doTag() throws IOException, JspException {
        JspContext jspContext = getJspContext();
        JspWriter out = jspContext.getOut();
        out.print("<select>\n");
        for (int i=0; i<3; i++) {
            getJspContext().setAttribute("value", countries[i]);
            getJspContext().setAttribute("text", countries[i]);
            getJspBody().invoke(null);
        }
        out.print("</select>\n");
    } 
}


