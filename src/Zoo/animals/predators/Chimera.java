package Zoo.animals.predators;

import Zoo.animals.Animals;
import Zoo.animals.herbivores.Herbivores;

import java.util.List;
import java.util.Scanner;

public class Chimera extends Predators {

    public Chimera(String name, int age, String gender, int feedPortion, int power) {
        super(name, age, gender, feedPortion, power);
    }

    public void projectChimeraLaunch(Bear bear, List<Animals> animals) {
        System.out.println("Do you ready to start Project? Press Y or N");
        String yes = "Y";
        Scanner scanner = new Scanner(System.in);
        String confirmation = scanner.next();
        scanner.close();
        if (confirmation.equalsIgnoreCase(yes)) {
            System.out.println("Ambrella corp start Project Chimera");
            bear.conductExperiments(bear, animals);
        } else {
            System.out.println("Project canceled");
        }
    }

    public void attackingAnimals(List<Animals> animals) {
        for (Animals animal : animals) {
            System.out.println(this.getName() + " want to attack");
            if (animal instanceof Herbivores) {
                ((Herbivores) animal).selfDefend();
                if (this.getPower() < ((Herbivores) animal).getSpeedOfRun()) {
                    System.out.printf("%s couldn't catch up %s\n", this.getName(), animal.getName());
                    System.out.println("");
                } else {
                    System.out.printf("%s caught up %s\n", this.getName(), animal.getName());
                    this.feed(((Herbivores) animal).getWeight());
                    System.out.println("");
                }
            } else if (animal instanceof Predators) {
                System.out.printf("%s vs %s\n", this.getName(), animal.getName());
                if (this.getPower() > ((Predators) animal).getPower()) {
                    System.out.printf("%s win! %s was eaten!\n", this.getName(), animal.getName());
                    System.out.println("");
                } else if (this.getPower() < ((Predators) animal).getPower()) {
                    System.out.printf("%s win! %s was eaten!\n", animal.getName(), this.getName());
                    System.out.println("");
                } else {
                    System.out.println("Draw!");
                }
            } else {
                System.out.println("Unknown animals!!");
            }
        }
    }
}
