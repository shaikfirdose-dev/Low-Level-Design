package Model;

public class Scorpio implements ICar{
    private static Scorpio scorpio;

    private Scorpio(){

    }
    @Override
    public void turnLeft() {
        System.out.println("Scorpio turn left!");
    }

    @Override
    public void turnRight() {
        System.out.println("Scorpio turn right!");
    }

    @Override
    public void moveFront() {
        System.out.println("Scorpio move front!");
    }

    @Override
    public void moveBack() {
        System.out.println("Scorpio move back!");
    }

    public static Scorpio getInstance(){
        if(scorpio==null){
            scorpio = new Scorpio();
        }
        return scorpio;
    }
}
