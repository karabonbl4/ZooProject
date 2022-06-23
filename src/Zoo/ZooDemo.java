package Zoo;

import Zoo.animals.Animals;
import Zoo.animals.predators.Bear;
import Zoo.animals.predators.Fox;

import java.util.ArrayList;
import java.util.List;

/** Create 3 objects from your class.
 * Add yours objects in ArrayList.
 * Create any method to works with objects.
 * Update others methods for work with yours objects.
 * **/

public class ZooDemo {

    public static void main(String[] args) {

        Bear bearMasha = new Bear("Masha");
        Bear bearNick = new Bear("Nick");
        Bear bearMisha = new Bear("Misha");
        Fox foxOleg = new Fox("Oleg");
        Fox foxSergey = new Fox("Sergey");
        Fox foxNatasha = new Fox("Natasha");
        Fox foxLiza = new Fox("Liza");
        foxOleg.setGender("M");
        foxSergey.setGender("M");
        foxNatasha.setGender("F");
        foxLiza.setGender("F");



        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(bearMasha);
        animalsList.add(bearNick);
        animalsList.add(bearMisha);
        animalsList.add(foxOleg);
        animalsList.add(foxSergey);
        animalsList.add(foxNatasha);
        animalsList.add(foxLiza);

        bearMasha.printDailyWaterVolume();
        foxOleg.findPartner(animalsList);



    }
}
