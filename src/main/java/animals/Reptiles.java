package animals;

public class Reptiles extends Animal {
    public Reptiles(AnimalType animalType, String name, int age, int weight) {
        super(name, animalType, age, weight);
    }

    public Reptiles(String name, int age, int weight) {
        this(AnimalType.RETILES, name, age, weight);
    }
}
