package me.qunwei.Chapter7.Law38_CheckParameter;

/**
 * Created by QunWei on 2016/8/11.
 */

/**
 * Law 38: 检查参数的有效性, 开放性API抛异常, 私有方法 用断言(assert)
 */
public class Demo {
    private final String name;
    private final int age;

    public Demo(String name, int age) {

        if (null == name || name.length() == 0) {
            throw new IllegalArgumentException("String is null or empty");
        }

        if (age < 0) {
            throw new IllegalArgumentException("age is illegal: " + age);
        }

        this.name = name;
        this.age = age;
    }

    public int call(int age) {
        return doAssert(age);
    }

    private int doAssert(int age) {
        assert age >= 0;
        return this.age + age;
    }

}
