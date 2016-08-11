package me.qunwei.chapter2.Law5_notNewObj;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.*;

/**
 * Created by QunWei on 2016/8/6.
 */
public class PersonTest {
    Calendar timer;

    @Before
    public void setUp() throws Exception {
        timer = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @Test
    public void isBabyBoomerTrue() throws Exception {
        timer.set(1950,Calendar.MAY,1,0,0,0);
        Person person = new Person(timer.getTime());
        assertTrue(person.isBabyBoomer());
    }

    @Test
    public void isBabyBoomerFalse() throws Exception {
        timer.set(1920,Calendar.MAY,1,0,0,0);
        Person person = new Person(timer.getTime());
        assertFalse(person.isBabyBoomer());
    }
}