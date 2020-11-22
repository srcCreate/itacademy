package animals;

public class Waterfowl extends Animal{
    public Waterfowl(AnimalType animalType, String name, int age, int weight) {
        super(name, animalType, age, weight);
    }

    public Waterfowl(String name, int age, int weight) {
        this(AnimalType.WATERFOWL, name, age, weight);
    }
}
