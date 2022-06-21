package Zoo;

/** Create your animals class from this abstract class.
 * Patron - this is the name of the class creator. Please insert your name in this field.
 * Please specify feedRate and waterRate  in grams.
 *
 * Int Power - this is your animal power. Please enter number from 1 to 10.
 * For example: 1 - for weak animal (hare, hamster, hedgehog), 10 - for strong animal (bear, wolf, lion).
 * **/

public abstract class Animals {

    private String name;
    private int age;
    private String patron;
    private int power;

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

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Animals(String name, int age, String patron, int power) {
        this.name = name;
        this.age = age;
        this.patron = patron;
        this.power = power;
    }

}
