package Zoo.animals;

import java.util.List;

/**
 * Create your animals class from this abstract class.
 * Patron - this is the name of the class creator. Please insert your name in this field.
 * Please specify feedRate and waterRate  in grams.
 * <p>
 * Int Power - this is your animal power. Please enter number from 1 to 10.
 * For example: 1 - for weak animal (hare, hamster, hedgehog), 10 - for strong animal (bear, wolf, lion).
 **/

public abstract class Animals implements Feed, Reproduce {

    private String name;
    private int age;
    private String gender;
    private int feedPortion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getFeedPortion() {
        return feedPortion;
    }

    public void setFeedPortion(int feedPortion) {
        this.feedPortion = feedPortion;
    }

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public void feed(int feedPortion) {
        int diff = this.getFeedPortion() - feedPortion;
        if (diff > 0) {
            System.out.printf("%s need another %s of food\n", this.getName(), diff);
        } else {
            System.out.printf("%s is full and happy! Some food left...\n", this.getName(), diff);
        }
    }

    @Override
    public void findPartnerForOffspring(List<Animals> animals) {
        for (Animals animal : animals) {
            if (!this.getGender().equals(animal.getGender()) && this.getClass().equals(animal.getClass())) {
                System.out.printf("%s and %s could give offspring.\n", this.getName(), animal.getName());
            } else if (this.getGender().equals(animal.getGender()) && this.getClass().equals(animal.getClass())) {
                System.out.printf("%s and %s could be friends.\n", this.getName(), animal.getName());
            } else {
                System.out.printf("%s and %s belong to different animal species, they can't have offspring.\n", this.getName(), animal.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Animal= " + getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
