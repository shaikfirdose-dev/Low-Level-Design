package Models;

public class Pair {
    int row;
    int col;

    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
