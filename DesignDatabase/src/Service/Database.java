package Service;

import Model.Table;

import java.util.HashMap;

public class Database {

    HashMap<String, Table> tables;

    public Database(){
         tables = new HashMap<>();
    }

    public void createTable(String tableName){
        tables.put(tableName, new Table(tableName));
    }

    public void dropTable(String tableName){
        if(tables.containsKey(tableName)){
            tables.remove(tableName);
        }
        //throw exception
    }

    public Table getTable(String tableName){
       return tables.get(tableName);
    }
}
