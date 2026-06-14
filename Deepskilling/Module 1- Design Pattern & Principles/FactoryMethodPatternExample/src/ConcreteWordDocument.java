public class ConcreteWordDocument implements WordDocument{
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}
