/*
* Example found on location 3782 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 9, 2018
 */
package customtagsdemo;
import java.io.IOException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DataFormatterTag extends SimpleTagSupport {
    private String header;
    private String items;
    
    public void setHeader(String header){
        this.header = header;
    }
    
    public void setItems(String items) {
        this.items = items;
    }
    
    public void doTag() throws IOException, JspException {
        JspContext jspContext = getJspContext();
        JspWriter out = jspContext.getOut();
        
        out.print("<table style='border:1px solid green'>\n"
                + "<tr><td><span style='font-weight:bold'>"
                + header + "</span></td></tr>\n");
        String[] tokens = items.split(",");
        for (String token : tokens) {
            out.print("<tr><td>" + token + "</td></tr>\n");
        }
        out.print("</table>");
    }
}