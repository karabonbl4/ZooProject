package Zoo;

public class Bear extends Animals {

    private int feedRate;
    private int waterRate;

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

    public Bear(String name, int age, String patron, int power, int feedRate, int waterRate) {
        super(name, age, patron, power);
        this.feedRate = feedRate;
        this.waterRate = waterRate;
    }

    public int printDailyWaterVolume() {
        int dailyWaterVolume = this.getWaterRate();
        System.out.println(getName() + " need " + getWaterRate() + " water");
        return dailyWaterVolume;
    }

}
