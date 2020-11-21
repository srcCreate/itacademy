import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Практическая работа №9. Создание и расселение животных
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Reptiles(3,4));
        animalList.add(new Feathery(2,5));
        animalList.add(new Ungulata(5,57));
        animalList.add(new Waterfowl(4,3));
        for(Animal animal : animalList) {
            System.out.println(animal);
            animal.checkIn();
        }

        //Практическая работа №10. Работа с коллекциями. Класс Box.
        /*List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(4,3,2,14));
        boxes.add(new Box(2,1,2,9));
        boxes.add(new Box(6,5,4,23));
        boxes.add(new Box(8,4,5,18));
        boxes.add(new Box(7,6,3,31));*/
    }
}
