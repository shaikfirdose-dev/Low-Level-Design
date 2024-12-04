package Factory;

public class AnimalFactory {

    public static Animal getInstance(String animalType){
        if(animalType.equalsIgnoreCase("cow")){
            return new Cow();
        }
        else if(animalType.equalsIgnoreCase("cat")){
            return new Cat();
        }
        else if(animalType.equalsIgnoreCase("dog")){
            return new Dog();
        }
        throw new IllegalArgumentException("Invalid Animal Type, please enter correct input!");
    }
}
