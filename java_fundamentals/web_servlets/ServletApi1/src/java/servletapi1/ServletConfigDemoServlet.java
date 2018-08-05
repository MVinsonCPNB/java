/*
 * Example found on location 683 of 7943
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
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

// The servlet container passes a ServletConfig to the servlet's init method
// ServletConfig encapsulates config info found in @WebServelt calls
// All info in a ServletConfig is considered an initial parameter
//  SERVLET CONFIGURATION INFORMATION registered with the servlet container
@WebServlet(name = "ServletConfigDemoServlet", 
            urlPatterns = {"/ServletConfigDemo"},
            initParams = {
                @WebInitParam(name="admin", value="Harry Taciak"),
                @WebInitParam(name="email", value="admin@example.com")
            }
)

public class ServletConfigDemoServlet implements Servlet {
    private transient ServletConfig servletConfig;
    
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }
    
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }
    
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String admin = servletConfig.getInitParameter("admin");
        String email = servletConfig.getInitParameter("email");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<DOCTYPE html>"
                + "<html>"
                +   "<body>"
                +       "Admin:" + admin
                +       "<br>Email:" + email
                + "</body></html>");
    }
    
    @Override 
    public String getServletInfo(){
        return "ServletConfig demo";
    }
    
    @Override
    public void destroy(){
    }
}




