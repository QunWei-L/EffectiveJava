package me.qunwei.chapter1.Page14_Singleton;

/**
 * Created by QunWei on 2016/8/5.
 */

import java.io.Serializable;

/**
 * 强化模式
 *
 * 防止反射攻击的私有化构造方法
 *
 * transient : 瞬时,不可被保存到IO里, 防止被反序列化
 */
public class Elvis implements Serializable{

    private static transient Elvis INSTANCE = null;

    static {
        try {
            INSTANCE = new Elvis();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Elvis() throws Exception {
        if (INSTANCE != null){
            throw new Exception("The instance already existed");
        }
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }
}

enum Elvis1{
    INSTANCE;
    public void leaveTheBuilding(){};
}