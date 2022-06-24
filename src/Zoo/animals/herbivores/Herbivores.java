package Zoo.animals.herbivores;

import Zoo.animals.Animals;

import java.util.List;

public abstract class Herbivores extends Animals implements Defend {

    private int speedOfRun;           //when predator attack, herbivores have to run away (for example)
    private int weight;                     //count portionFeed for predators

    public Herbivores(String name, int age, String gender, int feedPortion, int speedOfRun, int weight) {
        super(name, age, gender, feedPortion);
        this.speedOfRun = speedOfRun;
        this.weight = weight;
    }

    public int getSpeedOfRun() {
        return speedOfRun;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpeedOfRun(int speedOfRun) {
        this.speedOfRun = speedOfRun;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " run...run...run");
    }

    @Override
    public void findPartnerForOffspring(List<Animals> animals) {
        super.findPartnerForOffspring(animals);
    }

    @Override
    public void feed(int feedPortion) {
        super.feed(feedPortion);
    }
}
