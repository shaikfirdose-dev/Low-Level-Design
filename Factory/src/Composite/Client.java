package Composite;

public class Client {

    public static void main(String[] args) {
        Component mouse = new Leaf("Mouse", "500");
        Component monitor = new Leaf("Monitor", "10000");
        Component ram = new Leaf("RAM", "3000");
        Component hdd = new Leaf("HDD","2000");
        Component cpu = new Leaf("CPU", "5000");

        Composite computer = new Composite("Computer");
        Composite mb = new Composite("MB");
        Composite cabinet = new Composite("Cabinet");
        Composite peri = new Composite("Peri");

        mb.addComposite(cpu);
        mb.addComposite(ram);
        peri.addComposite(mouse);
        peri.addComposite(monitor);

        cabinet.addComposite(hdd);
        cabinet.addComposite(ram);

        computer.addComposite(mb);
        computer.addComposite(peri);
        computer.addComposite(cabinet);

        computer.showPrices();

    }
}
