public class ExcelDocumentFactory extends DocumentFactory<ExcelDocument>{
    @Override
    public ExcelDocument createDocument(){
        return new ConcreteExcelDocument();
    }
}
