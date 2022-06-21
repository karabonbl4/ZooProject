package Zoo;

import java.util.ArrayList;
import java.util.List;

/** Create 3 objects from your class.
 * Add yours objects in ArrayList.
 * Create any method to works with objects.
 * Update others methods for work with yours objects.
 * **/

public class ZooDemo {

    public static void main(String[] args) {

        Bears Panda = new Bears("Panda", 3, "AndreyS", 3000, 2000);
        Bears Nick = new Bears("Nick", 6, "AndreyS", 6000, 5000);
        Bears Misha = new Bears("Misha", 10, "AndreyS", 8000, 7000);


        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(Panda);
        animalsList.add(Nick);
        animalsList.add(Misha);

        Panda.calculateDailyWaterVolume();
    }
}
