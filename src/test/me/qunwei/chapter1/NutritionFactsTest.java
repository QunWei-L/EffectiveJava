package me.qunwei.chapter1;

import me.qunwei.chapter1.Page11_Builder.NutritionFacts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by QunWei on 2016/8/5.
 */
public class NutritionFactsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public  void testBuilder(){
        NutritionFacts demo = new NutritionFacts.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();


    }

}