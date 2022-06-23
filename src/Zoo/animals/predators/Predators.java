package Zoo.animals.predators;

import Zoo.animals.Animals;

public abstract class Predators extends Animals implements Attack {
    private int power;


    public Predators(String name) {
        super(name);
    }
}
