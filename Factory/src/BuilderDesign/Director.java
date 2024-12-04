package BuilderDesign;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Car constructCar(){
        builder.name("Creta");
        builder.color("White");
        builder.acOrNonAC("AC");
        builder.seats(4);
        builder.stearingType("Power Stearing");
        return builder.build();
    }

    public Car constructAutomaticCar(){
        builder.name("Tesla");
        builder.color("Red");
        builder.acOrNonAC("AC");
        builder.seats(6);
        builder.stearingType("Power Stearing");
        builder.automatic(true);
        return builder.build();
    }

}
