package BuilderDesign;

public class Car {
    private String name;
    private int seats;
    private String color;
    private String acOrNonAc;
    private boolean automatic;
    private String stearingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAcOrNonAc() {
        return acOrNonAc;
    }

    public void setAcOrNonAc(String acOrNonAc) {
        this.acOrNonAc = acOrNonAc;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public String getStearingType() {
        return stearingType;
    }

    public void setStearingType(String stearingType) {
        this.stearingType = stearingType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", acOrNonAc='" + acOrNonAc + '\'' +
                ", automatic=" + automatic +
                ", stearingType='" + stearingType + '\'' +
                '}';
    }
}
