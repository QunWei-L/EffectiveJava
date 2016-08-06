package me.qunwei.Chapter2.Law9_HashCode;

/**
 * Created by QunWei on 2016/8/6.
 */

/**
 * hashCode()和equals()一起覆盖, 用单元测试证明"逻辑相等的实例,都拥有相等的散列码"
 *
 * 取equals()证相等时, 用到的几个关键成员变量 -> 构造散列码, (P41 有 关键域的转码方法)
 */
public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line number");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ":" + arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof PhoneNumber)) return false;

        PhoneNumber temp = (PhoneNumber) obj;

        return temp.areaCode == this.areaCode
                && temp.prefix == this.prefix
                && temp.lineNumber == this.lineNumber;
    }

    @Override
    public int hashCode() {
//        return (this.areaCode * 1000 + this.prefix) * 1000 + this.lineNumber;

        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }
}
