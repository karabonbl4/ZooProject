package Zoo;

import Zoo.animals.Animals;
import Zoo.animals.herbivores.Camel;
import Zoo.animals.herbivores.Elephant;
import Zoo.animals.herbivores.Giraffe;
import Zoo.animals.herbivores.Rabit;
import Zoo.animals.predators.Bear;
import Zoo.animals.predators.Fox;

import java.util.ArrayList;
import java.util.List;

/**
 * Create 3 objects from your class.
 * Add yours objects in ArrayList.
 * Create any method to works with objects.
 * Update others methods for work with yours objects.
 **/

public class ZooDemo {

    public static void main(String[] args) {

        Bear bearMasha = new Bear("Masha", 5,"F", 3, 60, "Brown");
        Bear bearNick = new Bear("Nick", 4,"M", 4, 60, "White");
        Fox foxSergey = new Fox("Sergey", 3, "M", 2, 40);
        Fox foxLiza = new Fox("Liza", 6, "F", 1, 35);
        Camel camelIgor = new Camel("Igor", 8, "M", 5, 75, 1100);
        Camel camelAnn = new Camel("Ann", 6, "F", 4, 65, 950);
        Elephant elephantJohn = new Elephant("John", 15, "M", 10, 40, 2500);
        Elephant elephantKatty = new Elephant("Katty", 11, "F", 8, 35, 2100);
        Giraffe giraffeAnton = new Giraffe("Anton", 12, "M", 8, 50, 1800);
        Giraffe giraffeMilena = new Giraffe("Milena", 7, "F", 6, 45, 1400);
        Rabit rabitPiter = new Rabit("Piter", 3, "M", 1, 60, 5);
        Rabit rabitSonya = new Rabit("Sonya", 2, "F", 1, 60, 4);


        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(bearMasha);
        animalsList.add(bearNick);
        animalsList.add(foxSergey);
        animalsList.add(foxLiza);
        animalsList.add(camelIgor);
        animalsList.add(camelAnn);
        animalsList.add(elephantJohn);
        animalsList.add(elephantKatty);
        animalsList.add(giraffeAnton);
        animalsList.add(giraffeMilena);
        animalsList.add(rabitPiter);
        animalsList.add(rabitSonya);


        bearNick.attackEnemy(foxLiza);
        giraffeAnton.feed(20);
        foxSergey.attackEnemy(rabitPiter);
        rabitPiter.findPartnerForOffspring(animalsList);


    }
}
