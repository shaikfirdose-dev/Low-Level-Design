package ChainOfResponsibility;

public class FatalLogger extends LogProcessor{
    public FatalLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel==FATAL){
            System.out.println("FATAL "+msg);
        }
        else{
            super.log(logLevel, msg);
        }
    }
}
