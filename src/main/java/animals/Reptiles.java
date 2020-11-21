package animals;

import enclosure.Terrarium;

public class Reptiles extends Animal {
    protected Reptiles(AnimalType animalType, int age, int weight) {
        super(animalType, age, weight);
    }

    public Reptiles(int age, int weight) {
        this(AnimalType.RETILES, age, weight);
    }

    public void checkIn() {
        this.setEnclosure(new Terrarium());
        System.out.println(this.getAnimalType() + " размещена в " + this.getEnclosure());
    }
}
