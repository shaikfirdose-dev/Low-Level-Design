import Composite.Designer;
import Composite.Developer;
import Composite.Employee;
import Composite.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Dev1",50000);
        Employee dev2 = new Developer("Dev2",60000);

        Employee desiner = new Designer("Desiner1",10000);

        Manager manager = new Manager("Manager",200000);
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);

        System.out.println("Manager:");
        manager.showDetails();

        System.out.println("-----------");
        System.out.println("Senior Manager");

        Manager superManager = new Manager("Senior Manager", 400000);
        superManager.addEmployee(manager);
        superManager.addEmployee(desiner);

        superManager.showDetails();
    }
}