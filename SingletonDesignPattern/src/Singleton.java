public class Singleton {

    private Singleton(){
        System.out.println("Instance created...");
    }

    private static final class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }
}
