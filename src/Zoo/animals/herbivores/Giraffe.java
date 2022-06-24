package Zoo.animals.herbivores;


public class Giraffe extends Herbivores {


    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void selfDefend() {
        System.out.println(this.getName() + " hit with the hoof!");
    }

}
