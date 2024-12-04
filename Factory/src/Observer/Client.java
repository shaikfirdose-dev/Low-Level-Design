package Observer;

public class Client {
    public static void main(String[] args) {
        Subject telusko = new Channel();

        Observer sub1 = new Subscriber("Shaik");
        Observer sub2 = new Subscriber("Firdose");
        Observer sub3 = new Subscriber("Saif");
        Observer sub4 = new Subscriber("Sarfaraz");
        Observer sub5 = new Subscriber("Suhail");

        sub1.subScribeChannel(telusko);
        sub2.subScribeChannel(telusko);
        sub3.subScribeChannel(telusko);
        sub4.subScribeChannel(telusko);
        sub5.subScribeChannel(telusko);


        telusko.subscribeChannel(sub1);
        telusko.subscribeChannel(sub2);
        telusko.subscribeChannel(sub3);
        telusko.subscribeChannel(sub4);
        telusko.subscribeChannel(sub5);

        telusko.update();

    }
}
