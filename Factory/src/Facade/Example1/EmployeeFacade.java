package Facade.Example1;


public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeFacade(){
        employeeDao = new EmployeeDao();
    }

    public void insert(){
        employeeDao.insert();
    }

    public void read(){
        employeeDao.read();
    }
}
