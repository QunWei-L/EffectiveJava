package me.qunwei.Chapter7.Law38_CheckParameter;

import junit.framework.AssertionFailedError;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QunWei on 2016/8/11.
 */
public class DemoTest {
    final Demo demo = new Demo("Test", 10);


    @Test
    public void testConstructor() throws Exception {
        Demo test = new Demo("name",1);

    }

    @Test
    public void testCall() throws Exception {
        assertEquals(20,demo.call(10));
    }

}