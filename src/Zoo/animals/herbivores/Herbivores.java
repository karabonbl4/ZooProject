package Zoo.animals.herbivores;

import Zoo.animals.Animals;

public abstract class Herbivores extends Animals implements Defend {

    private int speedOfRun;           //when predator attack, herbivores have to run away (for example)
    private int weight;                     //count portionFeed for predators

    public Herbivores(String name) {
        super(name);
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


}
