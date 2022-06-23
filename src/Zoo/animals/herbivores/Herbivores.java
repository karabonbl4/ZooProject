package Zoo.animals.herbivores;

import Zoo.animals.Animals;

public abstract class Herbivores extends Animals implements Defend {

    private Herbivores[] herbivores;

    private int speedOfRun;

    public Herbivores(String name) {
        super(name);
    }


    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " run...run...run");
    }
}
