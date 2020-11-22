package enclosure;

import animals.Animal;
import animals.AnimalType;

public class Terrarium extends Enclosure{
    private double volume;

    protected Terrarium(String name) {
        super(name);
    }

    public Terrarium(double volume) {
        this("террариум");
        this.volume = volume;
    }

    public void checkIn(Animal animal) {
        if (animal == null || !animal.getAnimalType().equals(AnimalType.RETILES)) {
            throw new IllegalArgumentException("Здесь не место этому животному:)");
        } else {
            this.animalList.add(animal);
        }
    }

    @Override
    public String toString() {
        return this.getName() + " объемом " + volume + " литров " + super.toString();
    }
}
