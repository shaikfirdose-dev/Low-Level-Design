package Proxy;

public class Client {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.create("ADMIN", new Employee());
//        employeeDao.create("USER", new Employee());
//        employeeDao.delete("User", 12);
        employeeDao.delete("ADMIN",12);

        employeeDao.get("USER",12);
        employeeDao.get("ADMIN", 12);
    }
}
