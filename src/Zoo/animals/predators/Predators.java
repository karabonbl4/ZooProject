package Zoo.animals.predators;

import Zoo.animals.Animals;
import Zoo.animals.herbivores.Herbivores;


public abstract class Predators extends Animals implements Attack {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Predators(String name) {
        super(name);
    }


    @Override
    public void attackEnemy(Animals animal) {
        if (animal instanceof Herbivores) {
            ((Herbivores) animal).selfDefend();
            if (this.getPower() < ((Herbivores) animal).getSpeedOfRun()) {
                System.out.printf("%s couldn't catch up %s\n", this.getName(), animal.getName());
            } else {
                System.out.printf("%s caught up %s\n", this.getName(), animal.getName());
                this.feed(((Herbivores) animal).getWeight());
            }
        } else if (animal instanceof Predators) {
            System.out.printf("%s vs %s\n", this.getName(), animal.getName());
            if (this.getPower() > ((Predators) animal).getPower()) {
                System.out.printf("%s win! %s lost!\n", this.getName(), animal.getName());
            } else if (this.getPower() < ((Predators) animal).getPower()) {
                System.out.printf("%s win! %s lost!\n", animal.getName(), this.getName());
            } else {
                System.out.println("Draw!");
            }
        } else {
            System.out.println("Unknown animals!!");
        }
    }
}
