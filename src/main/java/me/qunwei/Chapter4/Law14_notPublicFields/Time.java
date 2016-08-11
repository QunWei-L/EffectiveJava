package me.qunwei.Chapter4.Law14_notPublicFields;

/**
 * Created by QunWei on 2016/8/7.
 */

/**
 * 公有类永远都不应该暴露 可变 的域(成员变量), 使用访问方法(Getter Setter)
 */
public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    private String Country;
    private int areaCode;

    public Time(int hour, int minute) {
        if (hour < 0 || hour > HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour:" + hour);

        if (minute < 0 || minute > MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Minute:" + minute);
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
}
