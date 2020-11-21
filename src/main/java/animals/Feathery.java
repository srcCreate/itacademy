package animals;

import enclosure.Aquarium;
import enclosure.CoveredEnclosure;

public class Feathery extends Animal {
    public Feathery(AnimalType animalType, int age, int weight) {
        super(animalType, age, weight);
    }

    public Feathery(int age, int weight) {
        this(AnimalType.FEATHERY, age, weight);
    }

    public void checkIn() {
        this.setEnclosure(new CoveredEnclosure());
        System.out.println(this.getAnimalType() + " размещено в " + this.getEnclosure());
    }
}
