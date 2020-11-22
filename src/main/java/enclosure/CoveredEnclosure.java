package enclosure;

import animals.Animal;
import animals.AnimalType;

public class CoveredEnclosure extends Enclosure {
    private double heightFence;

    protected CoveredEnclosure(String name) {
        super(name);
    }

    public CoveredEnclosure(double heightFence) {
        this("покрытый сеткой вольер");
        this.heightFence = heightFence;
    }

    public void checkIn(Animal animal) {
        if (animal == null || !animal.getAnimalType().equals(AnimalType.FEATHERY)) {
            throw new IllegalArgumentException("Здесь не место этому животному:)");
        } else {
            this.animalList.add(animal);
        }
    }

    @Override
    public String toString() {
        return this.getName() + " высота которой " + heightFence + " метров " + super.toString();
    }
}
