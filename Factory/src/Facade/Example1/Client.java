package Facade.Example1;

public class Client {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();
        facade.insert();
    }
}
