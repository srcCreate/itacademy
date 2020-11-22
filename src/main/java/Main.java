import animals.*;
import enclosure.*;

public class Main {
    public static void main(String[] args) {
        //Практическая работа №9. Создание и расселение животных
        Aquarium aquarium = new Aquarium(305.5);
        CoveredEnclosure coveredEnclosure = new CoveredEnclosure(15.2);
        OpenEnclosure openEnclosure = new OpenEnclosure(298.4);
        Terrarium terrarium = new Terrarium(274.95);

        aquarium.checkIn(new Waterfowl("Карась", 4, 3));
        aquarium.checkIn(new Waterfowl("Карп", 2, 1));
        aquarium.checkIn(new Waterfowl("Окунь", 3, 5));
        coveredEnclosure.checkIn(new Feathery("Попугай", 2, 5));
        coveredEnclosure.checkIn(new Feathery("Голубь", 1, 1));
        openEnclosure.checkIn(new Ungulata("Зебра", 5, 57));
        openEnclosure.checkIn(new Ungulata("Овца", 5, 22));
        openEnclosure.checkIn(new Ungulata("Корова", 2, 86));
        terrarium.checkIn(new Reptiles("Игуана", 3, 4));
        terrarium.checkIn(new Reptiles("Хамелион", 4, 3));
//        terrarium.checkIn(new Feathery("dgdgdg", 4, 3));

        Enclosure[] enclosures = new Enclosure[4];
        enclosures[0] = aquarium;
        enclosures[1] = coveredEnclosure;
        enclosures[2] = openEnclosure;
        enclosures[3] = terrarium;

        for (Enclosure enclosure : enclosures) {
            System.out.println(enclosure.toString());
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
