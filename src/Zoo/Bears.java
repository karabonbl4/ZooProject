package Zoo;

import java.util.ArrayList;

public class Bears extends Animals {

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

    public Bears(String name, int age, String patron, int feedRate, int waterRate) {
        super(name, age, patron);
        this.feedRate = feedRate;
        this.waterRate = waterRate;
    }

    public int calculateDailyWaterVolume() {
        int dailyWaterVolume = 0;
        dailyWaterVolume += this.getWaterRate();
        System.out.println(getName() + " need " + getWaterRate() + " water");
        return dailyWaterVolume;
    }
}
