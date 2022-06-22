package Zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/** Create 3 objects from your class.
 * Add yours objects in ArrayList.
 * Create any method to works with objects.
 * Update others methods for work with yours objects.
 * **/

public class ZooDemo {

    public static void main(String[] args) {

        Bear bearMasha = new Bear("Masha", 3, "AndreyS", 8, 3000, 2000);
        Bear bearNick = new Bear("Nick", 6, "AndreyS", 7, 6000, 5000);
        Bear bearMisha = new Bear("Misha", 10, "AndreyS", 9, 8000, 6000);


        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(bearMasha);
        animalsList.add(bearNick);
        animalsList.add(earMisha);
        animalsList.add(foxOleg);
        animalsList.add(foxSergey);
        animalsList.add(foxNatasha);
        animalsList.add(foxLiza);

        Masha.printDailyWaterVolume();

        Fox foxOleg = new Fox("Oleg", 3, "Lesha", 3);
        Fox foxSergey = new Fox("Sergey", 6, "Lesha", 5);
        Fox foxNatasha = new Fox("Natasha", 2, "Lesha", 2);
        Fox foxLiza = new Fox("Liza", 4, "Lesha", 4);

        foxOleg.setGender("M");
        foxSergey.setGender("M");
        foxNatasha.setGender("W");
        foxLiza.setGender("W");

        List<Animals> foxes = new ArrayList<>();
        foxes.add(foxOleg);
        foxes.add(foxSergey);
        foxes.add(foxNatasha);
        foxes.add(foxLiza);

        foxOleg.findPartner(animalsList); //не понимаю, как это работает
        foxOleg.findPartner(foxes);

    }
}
