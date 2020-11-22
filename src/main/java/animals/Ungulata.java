package animals;

public class Ungulata extends Animal {
    public Ungulata(AnimalType animalType, String name, int age, int weight) {
        super(name, animalType, age, weight);
    }

    public Ungulata(String name, int age, int weight) {
        this(AnimalType.UNGULATA, name, age, weight);
    }
}
