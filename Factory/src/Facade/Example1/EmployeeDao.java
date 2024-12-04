package Facade.Example1;

public class EmployeeDao {

    public void insert(){
        System.out.println("Employee record inserted");
    }

    public void read(){
        System.out.println("Employee record read ot fetched");
    }

    public void update(){
        System.out.println("Employee details updated");
    }

    public void delete(){
        System.out.println("Delete the record");
    }
}
