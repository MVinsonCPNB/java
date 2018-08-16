/*
 * Example found on location 4577 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 14, 2018
*/

package listenerdemo.model;
import java.math.BigDecimal;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Product implements HttpSessionBindingListener {
    private String id;
    private String name;
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    /* valueBound() Causes an object to be notified when it is bound to or 
       unbound from a session. The object is notified by an 
       HttpSessionBindingEvent object. This may be as a result of a servlet 
       programmer explicitly unbinding an attribute from a session, due to a 
       session being invalidated, or due to a session timing out.
    */
    
    @Override
    public void valueBound(HttpSessionBindingEvent event){
        String attributeName = event.getName();
        System.out.println(attributeName + " valueBound");
    }
    
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        System.out.println(attributeName + " valueUnbound");
    }
}
