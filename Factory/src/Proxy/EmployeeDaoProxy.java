package Proxy;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDaol;
    public EmployeeDaoProxy(){
        employeeDaol = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee emp) {
        if(client.equals("ADMIN")){
            System.out.println("Authorized user");
            employeeDaol.create(client, emp);
        }
        else{
            throw new IllegalArgumentException("Access Denied");
        }
    }

    @Override
    public void delete(String client, int employeeId) {
        if(client.equals("ADMIN")){
            System.out.println("Authorized user");
            employeeDaol.delete(client, employeeId);
        }
        else{
            throw new IllegalArgumentException("Access Denied");
        }
    }

    @Override
    public Employee get(String client, int employeeId) {
        return employeeDaol.get(client, employeeId);
    }
}
