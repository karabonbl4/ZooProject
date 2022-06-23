package Zoo.animals.herbivores;

public class Giraffe extends Herbivores{

    private final int portionFeed;

    public Giraffe(String name, int portionFeed) {
        super(name);
        this.portionFeed = portionFeed;
    }

    public int getPortionFeed() {
        return portionFeed;
    }




    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " hit with the hoof!");
    }

    @Override
    public int getDailyPortionFeed() {
        return 0;
    }
}
