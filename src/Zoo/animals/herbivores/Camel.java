package Zoo.animals.herbivores;

public class Camel extends Herbivores{

    public Camel(String name, int age, String gender, int feedPortion, int speedOfRun, int weight) {
        super(name, age, gender, feedPortion, speedOfRun, weight);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " spat and run.");
    }
}
