package Zoo.animals;

/** Create your animals class from this abstract class.
 * Patron - this is the name of the class creator. Please insert your name in this field.
 * Please specify feedRate and waterRate  in grams.
 *
 * Int Power - this is your animal power. Please enter number from 1 to 10.
 * For example: 1 - for weak animal (hare, hamster, hedgehog), 10 - for strong animal (bear, wolf, lion).
 * **/

public abstract class Animals implements Feed,Reproduce {

    private String name;
    private int age;
    private String type;
    private String gender;
    private int feedRate;
    private int waterRate;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Animals(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return "Animal= "+ getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
