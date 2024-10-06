package Controller;

import Model.Column;
import Model.Row;
import Model.Table;
import Service.Database;
import Service.QueryService;

import java.util.List;

public class MemeoryController {
    public static void main(String[] args) {
        Database db = new Database();
        db.createTable("Users");

        Table table = db.getTable("Users");

        table.addColumn(new Column("id","Integer"));
        table.addColumn(new Column("name","String"));
        table.addColumn(new Column("email","String"));

        Row row = new Row();
        row.setValues("id", 1);
        row.setValues("name", "John");
        row.setValues("email", "abc@gmail.com");

        table.addRow(row);

        QueryService queryService = new QueryService(db);

        List<Row> rows = queryService.selectAllQuery("Users");
        System.out.println(rows);
    }

}
