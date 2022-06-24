package Zoo.animals.herbivores;

public class Elephant extends Herbivores{

    public Elephant(String name, int age, String gender, int feedPortion, int speedOfRun, int weight) {
        super(name, age, gender, feedPortion, speedOfRun, weight);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " tried to trample the enemy.");
    }
}
