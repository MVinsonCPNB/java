/*
 * Example found on location 5526 of 7943
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 17, 2018
*/
package action;
import service.PDFService;

public class PDFAction {
    private PDFService pdfService;
    
    public void setPDFService(PDFService pdfService){
        this.pdfService = pdfService;
    }
    
    public void createPDF(String path, String input){
        pdfService.createPDF(path, input);
    }
}
