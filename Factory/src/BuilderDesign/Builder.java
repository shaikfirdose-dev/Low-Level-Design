package BuilderDesign;

public interface Builder {

    void name(String name);
    void seats(int seats);
    void stearingType(String stearing);
    void color(String color);
    void acOrNonAC(String acType);
    void automatic(boolean automatic);

    Car build();
}
