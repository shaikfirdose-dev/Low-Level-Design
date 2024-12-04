package Proxy;

public interface EmployeeDao {
    void create(String client, Employee emp);
    void delete(String client, int employeeId);
    Employee get(String client, int employeeId);
}
