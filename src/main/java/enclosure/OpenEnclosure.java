package enclosure;

import animals.Animal;
import animals.AnimalType;

public class OpenEnclosure extends Enclosure {
    private double square;

    protected OpenEnclosure(String name) {
        super(name);
    }

    public OpenEnclosure(double square) {
        this("открытый вольер");
        this.square = square;
    }

    public void checkIn(Animal animal) {
        if (animal == null || !animal.getAnimalType().equals(AnimalType.UNGULATA)) {
            throw new IllegalArgumentException("Здесь не место этому животному:)");
        } else {
            this.animalList.add(animal);
        }
    }

    @Override
    public String toString() {
        return this.getName() + " площадью " + square + " квадратных метров " + super.toString();
    }
}
