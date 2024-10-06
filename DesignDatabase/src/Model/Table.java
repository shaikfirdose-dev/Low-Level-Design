package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table {
    private String name;
    private List<Row> rows;
    private List<Column> columns;

    public Table(String name){
        this.name = name;
        rows = new ArrayList<>();
        columns = new ArrayList<>();
    }

    public Row getRow(int rowIndex){
        if(rowIndex>=0 && rowIndex<rows.size()) {
            return rows.get(rowIndex);
        }
        return null;
    }

    public void deleteRow(int rowIndex){
        if(rowIndex>=0 && rowIndex<rows.size()) {
            rows.remove(rowIndex);
        }
    }

    public void updateRow(int rowIndex, String name, Object value){
        if(rowIndex>=0 && rowIndex<rows.size()) {
            Row row = getRow(rowIndex);
            row.setValues(name, value);
        }
        System.out.println("Row updated successfully!");
    }

    public void addRow(Row row){
        rows.add(row);
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Row> getRows() {
        return rows;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void addColumn(Column column) {
        columns.add(column);
    }
}
