package Zoo;

/** Create your animals class from this abstract class.
 * Patron - this is the name of the class creator. Please insert your name in this field.
 * Please specify feedRate and waterRate  in grams.
 * **/

public abstract class Animals {

    private String name;
    private int age;
    private String patron;

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

    public Animals(String name, int age, String patron) {
        this.name = name;
        this.age = age;
        this.patron = patron;
    }
}
