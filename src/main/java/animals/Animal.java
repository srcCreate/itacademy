package animals;

import enclosure.Enclosure;

public abstract class Animal {
    private final AnimalType animalType;
    private final int age;
    private final int weight;
    private Enclosure enclosure;

    Animal(AnimalType animalType, int age, int weight) {
        this.animalType = animalType;
        this.age = age;
        this.weight = weight;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    protected void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public abstract void checkIn();

    @Override
    public String toString() {
        return animalType +
                ", вес составляет " + weight + " кг" +
                ", возраст " + age;
    }


}
