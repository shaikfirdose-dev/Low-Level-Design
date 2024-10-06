package Model;

import java.util.HashMap;

public class Row {
    private HashMap<String, Object> rows;

    public Row() {
        rows = new HashMap<>();
    }

    public void setValues(String name, Object value){
        rows.put(name, value);
    }

    public HashMap<String, Object> getRows() {
        return rows;
    }

    public void setRows(HashMap<String, Object> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Row{" +
                "rows=" + rows +
                '}';
    }
}
