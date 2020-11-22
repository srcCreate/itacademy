package enclosure;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Enclosure {
    private final String name;
    protected List<Animal> animalList;

    public Enclosure(String name) {
        this.name = name;
        animalList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public abstract void checkIn(Animal animal);

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Animal animal: animalList) {
            stringBuilder.append("\t").append(animal.toString()).append("\n");
        }
        return "содержит следующих животных: \n" + stringBuilder;
    }
}
