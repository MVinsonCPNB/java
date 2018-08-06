/*
 * Example found on location 1201 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 6, 2018
 */
package sessionmgt.hiddenfields;

public class Customer {

    private int id;
    private String name;
    private String city;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id ) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
}