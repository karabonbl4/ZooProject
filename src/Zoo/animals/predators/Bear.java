package Zoo.animals.predators;


import Zoo.animals.Animals;

import java.util.List;
import java.util.Random;

public class Bear extends Predators {

    private String color;

    public Bear(String name, int age, String gender, int feedPortion, int power, String color) {
        super(name, age, gender, feedPortion, power);
        this.color = color;
    }

    public void conductExperiments(Bear bear, List<Animals> animals) {
        for (Animals animal : animals) {
            if (!bear.getGender().equals(animal.getGender()) && !bear.getClass().equals(animal.getClass())) {
                System.out.printf("%s %s and %s %s could take part in Project.\n", this.getClass().getSimpleName(),
                        this.getName(), animal.getClass().getSimpleName(), animal.getName());
                Random r = new Random();
                int resultA = r.nextInt(7);
                int resultB = r.nextInt(7);
                if (resultA == resultB) {
                    System.out.println("DANGEROUS!!! Chimera created!");
                    System.out.println("");
                    return;
                } else {
                    System.out.println("This project was failure");
                    System.out.println("");
                }
            } else if (!bear.getGender().equals(animal.getGender()) && bear.getClass().equals(animal.getClass())) {
                System.out.printf("%s %s and %s %s belong to equals animal species, they can't take a part in Project." +
                        "\n", this.getClass().getSimpleName(), this.getName(), animal.getClass().getSimpleName(), animal.getName());
                System.out.println("");
            }
        }
    }
}
