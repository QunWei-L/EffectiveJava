package me.qunwei.chapter2.Law5_notNewObj;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by QunWei on 2016/8/6.
 */

/**
 *
 * 避免创建不必要的对象
 * 尽量把实例方法中用到的对象, 静态化.
 *
 * 例: 静态的初始化器 构造 复用的静态成员变量.
 */
public class Person {
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();

        gmtCal.set(1964,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) < 0;
    }


    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }
}
