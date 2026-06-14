public class ConcreteExcelDocument implements ExcelDocument{
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
