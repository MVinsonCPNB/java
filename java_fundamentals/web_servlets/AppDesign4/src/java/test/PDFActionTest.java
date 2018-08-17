/*
 * Example found at location 5667 of 7943 
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 17, 2018
*/
package test;
import action.PDFAction;
import util.DependencyInjector;

public class PDFActionTest {
    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjector();
        dependencyInjector.start();
        PDFAction pdfAction = (PDFAction) dependencyInjector
                .getObject(PDFAction.class);
        pdfAction.createPDF("./test/1.pdf", "Testing PDFAction...");
        dependencyInjector.shutDown();
    }
}
