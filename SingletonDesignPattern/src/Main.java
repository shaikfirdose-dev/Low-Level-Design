//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            Singleton singleton = Singleton.getInstance();
        });
        Thread t2 = new Thread(()->{
            Singleton singleton = Singleton.getInstance();
        });
        t1.start();
        t2.start();

    }
}