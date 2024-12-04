package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor = new INFOLogger(new DebugLogger(new ErrorLog(new FatalLogger(null))));
        logProcessor.log(4, "Something went wrong");
    }
}
