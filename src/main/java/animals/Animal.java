package animals;

public abstract class Animal {
    private final String name;
    private final AnimalType animalType;
    private final int age;
    private final int weight;

    Animal(String name, AnimalType animalType, int age, int weight) {
        this.name = name;
        this.animalType = animalType;
        this.age = age;
        this.weight = weight;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return name +
                ", вес составляет " + weight + " кг" +
                ", возраст " + age;
    }
}
