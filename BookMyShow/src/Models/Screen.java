package Models;

import java.util.List;

public class Screen {
    private int id;
    private int sizeInMeter;
    private List<Seats> noOfSeats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeInMeter() {
        return sizeInMeter;
    }

    public void setSizeInMeter(int sizeInMeter) {
        this.sizeInMeter = sizeInMeter;
    }

    public List<Seats> getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(List<Seats> noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
