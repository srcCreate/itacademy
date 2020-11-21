package animals;

import enclosure.Aquarium;

public class Waterfowl extends Animal{
    protected Waterfowl(AnimalType animalType, int age, int weight) {
        super(animalType, age, weight);
    }

    public Waterfowl(int age, int weight) {
        this(AnimalType.WATERFOWL, age, weight);
    }

    public void checkIn() {
        this.setEnclosure(new Aquarium());
        System.out.println(this.getAnimalType() + " размещено в " + this.getEnclosure());
    }
}
