/*
 * Example found on location 565 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 4, 2018
 */
package servletapi1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(name = "MyServlet", urlPatterns = {"/my"})

public class MyServlet implements Servlet {
    private transient ServletConfig servletConfig;
    
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "My Servlet";
    }
    
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        // get the servlet's name
        String servletName = servletConfig.getServletName();
        // set the serveltResponse type
        response.setContentType("text/html");
        // get a writer to compose a response
        PrintWriter writer = response.getWriter();
        // write an html page
        writer.print("<!DOCTYPE html>" 
                + "<html>" 
                + "<body>Hello from " + servletName
                + "</body>" 
                + "</html>");
    }
    
    @Override
    public void destroy(){
    }
    
}
