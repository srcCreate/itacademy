package animals;

public class Feathery extends Animal {
    protected Feathery(AnimalType animalType, String name, int age, int weight) {
        super(name, animalType, age, weight);
    }

    public Feathery(String name, int age, int weight) {
        this(AnimalType.FEATHERY, name, age, weight);
    }
}
