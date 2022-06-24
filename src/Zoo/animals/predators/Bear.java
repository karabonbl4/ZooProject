package Zoo.animals.predators;


public class Bear extends Predators {

    private String color;

    public Bear(String name, int age, String gender, int feedPortion, int power, String color) {
        super(name, age, gender, feedPortion, power);
        this.color = color;
    }
}
