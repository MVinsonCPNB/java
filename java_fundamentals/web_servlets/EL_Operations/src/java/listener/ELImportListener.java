/*
 * Example found on location 2252 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 8, 2018
*/
package listener;
import javax.el.ELContextEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.jsp.JspFactory;

@WebListener

public class ELImportListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent event){
        JspFactory.getDefaultFactory().getJspApplicationContext(
                event.getServletContext()).addELContextListener(
                        (ELContextEvent e) -> {
                            e.getELContext().getImportHandler().
                            importPackage("java.time");
                            e.getELContext().getImportHandler().
                            importPackage("java.util");
                        });
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent event){
    }
}
