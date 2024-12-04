package Observer;

public class Subscriber implements Observer{
    private Subject channel;
    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hi "+name+" New video uploaded");
    }

    @Override
    public void subScribeChannel(Subject ch) {
        channel = ch;
    }
}
