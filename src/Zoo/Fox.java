package Zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Fox extends Animals{
    private int feedRate;
    private int waterRate;
    private int agility;
    private int intelligence;


    public Fox(String name, int age, String patron, int power) {
        super(name, age, patron, power);
    }

    public int getFeedRate() {
        return feedRate;
    }

    public void setFeedRate(int feedRate) {
        this.feedRate = feedRate;
    }

    public int getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(int waterRate) {
        this.waterRate = waterRate;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    public void findPartner(List<Animals> animals){
        for (Animals animal:animals) {
            if(!this.getGender().equals(animal.getGender()) && this.getClass().equals(animal.getClass())){
                System.out.printf("%s and %s could give offspring.\n", this.getName(), animal.getName());
            } else if (this.getGender().equals(animal.getGender()) && this.getClass().equals(animal.getClass())) {
                System.out.printf("%s and %s could be friends.\n", this.getName(), animal.getName());
            } else {
                System.out.printf("%s and %s belong to different animal species, they can't have offspring.\n", this.getName(), animal.getName());
            }
        }
    }


}
