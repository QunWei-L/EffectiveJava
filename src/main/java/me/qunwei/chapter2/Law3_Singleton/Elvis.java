package me.qunwei.chapter2.Law3_Singleton;

/**
 * Created by QunWei on 2016/8/5.
 */

import java.io.Serializable;

/**
 * 强化模式
 * <p>
 * 防止反射攻击的私有化构造方法
 * <p>
 * transient : 瞬时,不可被保存到IO里, 防止被反序列化
 */
public class Elvis implements Serializable {

    private static final transient Elvis INSTANCE = new Elvis();


    private Elvis() {
        if (INSTANCE != null) {
            throw new AssertionError("The instance already existed");
        }
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }
}

enum Elvis1 {
    INSTANCE;
    public void leaveTheBuilding() {
    }
}