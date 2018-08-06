/*
 * Example found on location 742 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 5, 2018
 */

package servletapi1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "GenericServletDemoServlet",
    urlPatterns = { "/generic" },
    initParams = { 
        @WebInitParam(name="admin", value="Bobby Sue"),
        @WebInitParam(name="email", value="country@example.com")
        }
)

// Unlike the ServletConfigDemoServlet.java example using the 
// GenericServlet class keep you have haveing to override all methods
// of the Servlet class.  Using getServletConfig you can get the 
// ServletConfig from the GenericServlet method. Using the abstract 
// GenericServlet class helps in reducing the amount of code needed.

public class GenericServletDemoServlet extends GenericServlet {
    
    private static final long serialVersionUID = 62500890L;
    
    // The only method needed to Override unlike extends Servlet.
    @Override
    public void service(ServletRequest request,
            ServletResponse response)
            throws ServletException, IOException {
    
        ServletConfig servletConfig = getServletConfig();
        String admin = servletConfig.getInitParameter("admin");
        String email = servletConfig.getInitParameter("email");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>"
            + "<html><head></head><body>" 
            + "Admin:" + admin
            + "<br/>Email:" + email
            + "</body></html>");
    }
}

