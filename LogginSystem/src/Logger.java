import java.util.Date;

public class Logger {


    private Logger(){
        System.out.println("Logger created");
    }

    private static final class LoggerHolder{
        private static final Logger logger = new Logger();
    }

    public static Logger getInstance(){
        return LoggerHolder.logger;
    }

    public void log(String message){
        System.out.println(new Date() + message);
    }
}
