package Proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee emp) {
        System.out.println("Employee object stored in the database");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Employee record deleted in the database");
    }

    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("Employee reecord fetched from the database");
        return new Employee();
    }
}
