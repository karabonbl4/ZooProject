package Zoo.animals.herbivores;

public class Rabbit extends Herbivores{

    public Rabbit(String name, int age, String gender, int feedPortion, int speedOfRun, int weight) {
        super(name, age, gender, feedPortion, speedOfRun, weight);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " is running away.");
    }
}
