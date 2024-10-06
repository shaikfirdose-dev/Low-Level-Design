import CarDecorator.CarDecorator;
import IService.ICarService;
import Models.Scorpio;
import CarDecorator.BulletProofDecorater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ICarService scorpio = new Scorpio();
        CarDecorator bulletProof = new BulletProofDecorater(scorpio);
        System.out.print(bulletProof.getWeight());
    }
}