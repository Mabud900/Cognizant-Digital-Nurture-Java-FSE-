public class ConcretePdfDocument implements PdfDocument{
    @Override
    public void open() {
        System.out.println("Opening Pdf Document");
    }
}
