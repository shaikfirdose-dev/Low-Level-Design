package Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    private String name;
    private double salary;

    private List<Employee> subordinates;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        System.out.println("Employee name "+ name + "Salary " + salary);
        System.out.println("Subordinates:");
        for(Employee emp: subordinates){
            emp.showDetails();
        }
    }

    public void addEmployee(Employee employee){
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee){
        subordinates.remove(employee);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for(Employee emp : subordinates){
            totalSalary+=emp.getSalary();
        }
        return totalSalary;
    }
}
