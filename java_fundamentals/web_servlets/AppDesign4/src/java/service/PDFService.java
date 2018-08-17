/*
 * Example found on location 5549 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 17, 2018
*/

package service;
import util.PDFUtil;

public class PDFService {
    public void createPDF(String path, String input) {
        PDFUtil.createDocument(path, input);
    }
}
