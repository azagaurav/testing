/*
 * Created on Oct 7, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.FileOutputStream;
import java.io.IOException;
 
import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
 
/**
 * A possible way to create a document in the landscape format.
 */
public class HelloWorldLandscape1 {
 
    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "d:\\hello_landscape1.pdf";
 
    /**
     * Creates a PDF file: hello_landscape1.pdf
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
        throws com.lowagie.text.DocumentException, IOException {
        // step 1
    	// landscape format using the rotate() method
        Document document = new Document(PageSize.LETTER.rotate());
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph("Hello World"));
        // step 5
        document.close();
    }
}
