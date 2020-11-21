package animals;

import enclosure.Aquarium;
import enclosure.OpenEnclosure;

public class Ungulata extends Animal {
    public Ungulata(AnimalType animalType, int age, int weight) {
        super(animalType, age, weight);
    }

    public Ungulata(int age, int weight) {
        this(AnimalType.UNGULATA, age, weight);
    }

    public void checkIn() {
        this.setEnclosure(new OpenEnclosure());
        System.out.println(this.getAnimalType() + " размещено в " + this.getEnclosure());
    }

}
