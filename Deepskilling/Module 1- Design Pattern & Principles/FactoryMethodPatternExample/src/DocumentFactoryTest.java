import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DocumentFactoryTest {

    @Test
    public void testWordDocumentFactory() {
        DocumentFactory<WordDocument> factory = new WordDocumentFactory();
        WordDocument doc = factory.createDocument();
        assertNotNull(doc);
    }

    @Test
    public void testPdfDocumentFactory() {
        DocumentFactory<PdfDocument> factory = new PdfDocumentFactory();
        PdfDocument doc = factory.createDocument();
        assertNotNull(doc);
    }

    @Test
    public void testExcelDocumentFactory() {cd
        DocumentFactory<ExcelDocument> factory = new ExcelDocumentFactory();
        ExcelDocument doc = factory.createDocument();
        assertNotNull(doc);
    }
}