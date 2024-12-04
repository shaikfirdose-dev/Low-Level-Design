package ChainOfResponsibility;

public class DebugLogger extends LogProcessor{

    public DebugLogger(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == DEBUG){
            System.out.println("DEBUG "+ msg);
        }
        else{
            super.log(logLevel, msg);
        }
    }
}
