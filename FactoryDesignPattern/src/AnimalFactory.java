public class AnimalFactory {
    public Animal createAnimal(String animalType){
        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        else if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        else if(animalType.equalsIgnoreCase("Cow")){
            return new Cow();
        }
        else{
            throw new IllegalArgumentException("No object is present");
        }
    }
}
