/*
 * Example found on location 4409 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
*/

package listenerdemo.listener;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener{
    
    
    public void contextDestroyed(ServletContextEvent sce){
    }
    
    public void contextInitialized(ServletContextEvent sce){
        ServletContext servletContext = sce.getServletContext();
        
        Map<String, String> countries = 
                new HashMap<String, String>();
        countries.put("ca", "Canada");
        countries.put("us", "United States");
        servletContext.setAttribute("countries", countries);
    }
}
