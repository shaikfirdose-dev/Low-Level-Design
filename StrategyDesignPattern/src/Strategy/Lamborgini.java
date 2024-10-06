package Strategy;

public class Lamborgini extends Vehicle{

    public Lamborgini(){
        super(new SportsStrategy());
    }
}
