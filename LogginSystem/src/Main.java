//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                ()-> {
                    Logger logger = Logger.getInstance();
                    logger.log("Logger1");
                }
        );

        Thread t2 = new Thread(
                ()->{
                    Logger logger2 = Logger.getInstance();
                    logger2.log("Logger2");
                }
        );
        Thread t3 = new Thread(
                ()-> {
                    Logger logger = Logger.getInstance();
                    logger.log("Logger3");
                }
        );

        Thread t4 = new Thread(
                ()->{
                    Logger logger2 = Logger.getInstance();
                    logger2.log("Logger4");
                }
        );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}