
public class Logger {
    private int Logger(){
        return 6;
    }
    private static Logger logger=new Logger();

    //getter
    public static Logger returnsomething(){
        return logger;
    }
}