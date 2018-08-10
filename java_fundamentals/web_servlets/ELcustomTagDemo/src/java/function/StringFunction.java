/*
* Example found on location 3909 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 10, 2018
 */

package function;

public class StringFunction {
    public static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
