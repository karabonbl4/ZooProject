package Zoo.animals.herbivores;


public class Giraffe extends Herbivores {

    public Giraffe(String name, int age, String gender, int feedPortion, int speedOfRun, int weight) {
        super(name, age, gender, feedPortion, speedOfRun, weight);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " hit with the hoof!");
    }

}
