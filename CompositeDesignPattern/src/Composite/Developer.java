package Composite;

public class Developer implements Employee{
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee :"+name+" Salary "+ getSalary());
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
