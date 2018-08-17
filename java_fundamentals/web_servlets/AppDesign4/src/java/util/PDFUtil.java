/*
 * Example found at https://bitbucket.org/budi-kurniawan/servletjsp2-apps/src/a05c4473efcb70eb5463919c6e9de18c39f7084c/chapter11/appdesign4/src/java/util/PDFUtil.java?at=master&fileviewer=file-view-default
 * Servlet & JSP: A Beginner's Tutorial 
 * e-book written by: 
 * Budi Kurniawan
 * 
 * Recoded by: Michael Vinson
 * Date: Augest 17, 2018
*/
package util;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PDFUtil {
    public static void createDocument(String path, String input){
        PDDocument doc = null;
        try {
            doc = new PDDocument();
            PDFont font = PDType1Font.HELVETICA;
            PDPage page = new PDPage();
            doc.addPage(page);
            float fontSize = 12.0f;
            
            PDRectangle pageSize = page.getMediaBox();
            float centeredXPosition = (pageSize.getWidth() - fontSize
                    / 1000f) / 2f;
            float stringWidth = font.getStringWidth(input);
            
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);
            contentStream.setFont(font, fontSize);
            contentStream.beginText();
            contentStream.moveTextPositionByAmount(centeredXPosition, 600);
            contentStream.drawString(input);
            contentStream.endText();
            contentStream.close();
            doc.save(path);
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
