package Zoo;

import Zoo.animals.Animals;
import Zoo.animals.herbivores.*;
import Zoo.animals.predators.Bear;
import Zoo.animals.predators.Fox;

import java.util.ArrayList;
import java.util.List;

/**
 * Create 2 objects from your class.
 * Add yours objects in ArrayList.
 * Create any method to works with objects.
 * Update others methods for work with yours objects.
 **/

public class ZooDemo {

    public static void main(String[] args) {

        Giraffe Misha = new Giraffe("Misha", 10, "M",2, 5, 250);
        Giraffe Masha = new Giraffe("Masha", 7, "F",2, 5, 210);
        Camel Anton = new Camel("Anton", 15, "M",3, 6, 310);
        Camel Anya = new Camel("Anya", 17, "F",3, 6, 350);
        Rabit Roger = new Rabit("Roger", 1, "M", 1, 4, 4);
        Rabit Rinata = new Rabit("Rinata", 1, "F", 1, 4, 5);
        Elephant Tom = new Elephant("Tom", 20, "M", 5, 3, 900);
        Elephant Tanya = new Elephant("Tanya", 22, "F", 5, 3, 800);

        List<Animals> animals = new ArrayList<>();
        animals.add(Misha);
        animals.add(Masha);
        animals.add(Anton);
        animals.add(Anya);
        animals.add(Roger);
        animals.add(Rinata);
        animals.add(Tom);
        animals.add(Tanya);

        Misha.findPartnerForOffspring(animals);
        Misha.selfDefend();
        Anya.selfDefend();
        Misha.feed(3);
    }
}
