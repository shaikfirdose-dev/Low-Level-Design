package Service;

import Model.Row;
import Model.Table;

import javax.management.Query;
import java.util.List;

public class QueryService {
    Database database;

    public QueryService(Database database){
        this.database = database;
    }

    public List<Row> selectAllQuery(String tableName){
        Table table = database.getTable(tableName);
        return table.getRows();
    }

    public Row selectQueryWhereValue(String tableName, String columnName, String value){
        Table table = database.getTable(tableName);
        for(Row row : table.getRows()){
            if(columnName.equals(row.getRows().containsKey(columnName)) && row.getRows().get(columnName).equals(value)){
                return row;
            }
        }
        return null;
    }
}
