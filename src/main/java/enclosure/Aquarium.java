package enclosure;

import animals.Animal;
import animals.AnimalType;

public class Aquarium extends Enclosure {
    private double volume;

    protected Aquarium(String name) {
        super(name);
    }

    public Aquarium(double volume) {
        this("аквариум");
        this.volume = volume;
    }

    @Override
    public void checkIn(Animal animal) {
        if (animal == null || !animal.getAnimalType().equals(AnimalType.WATERFOWL)) {
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
