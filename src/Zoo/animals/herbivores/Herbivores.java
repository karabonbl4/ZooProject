package Zoo.animals.herbivores;

import Zoo.animals.Animals;

public abstract class Herbivores extends Animals implements Defend {

//    private Herbivores[] herbivores; //for overriding method Reproduce

    private int speedOfRun;

    public Herbivores(String name, int speedOfRun) {
        super(name);
        this.speedOfRun = speedOfRun;

    }


    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " run...run...run");
    }
}
