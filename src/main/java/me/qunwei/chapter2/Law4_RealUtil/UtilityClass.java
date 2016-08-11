package me.qunwei.chapter2.Law4_RealUtil;

/**
 * Created by QunWei on 2016/8/6.
 */


/**
 *
 * 防止无意识的实例化
 *
 * 不可实例化的能力
 *
 */
public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError("Error occ");
    }

    public static void main(String[] args) {
        UtilityClass demo = new UtilityClass();
    }
}
