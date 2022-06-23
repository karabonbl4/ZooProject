package Zoo.animals.herbivores;

import Zoo.animals.Animals;

public class Giraffe extends Herbivores{


    public Giraffe(String name, int speedOfRun) {
        super(name, speedOfRun);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " hit with the hoof!");
    }

    @Override
    public int getDailyPortionFeed() {
        return 0;
    }

    @Override
    public void findPartnerForOffspring(Animals[] animals) {

    }
}
