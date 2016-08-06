package me.qunwei.chapter1.Law2_Builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QunWei on 2016/8/6.
 */
public class NutritionFactsTest {
    @Test
    public  void testBuilder(){
        NutritionFacts demo = new NutritionFacts.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}