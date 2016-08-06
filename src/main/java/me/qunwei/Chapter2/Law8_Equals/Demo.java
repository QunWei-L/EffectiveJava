package me.qunwei.Chapter2.Law8_Equals;

/**
 * Created by QunWei on 2016/8/6.
 */


/**
 * 覆盖Equals时要遵守: 自反\对称\传递\非空\一致性, 用单元测试来检查
 */
public class Demo {

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Demo)) {  //有了类型检查, 可以略掉单独的null检查, 默认抛false
            return false;
        }

        Demo demo = (Demo) obj;

        return super.equals(obj) && demo == this;
    }
}
