# EffectiveJava
Coding with &lt;Effective Java> second edition.

Chapter 1: 创建和销毁对象

Law 1: 用静态工厂方法代替构造器  例:服务提供者框架,用接口定义服务和提供者, 让用户根据实际需要自实现,然后用静态工厂进行保存\取用.

Law 2: Builder构造器: 当有固定参数和 可选参数时.

Law 3: 用私有构造方法强化单例, AssertionError防止反射攻击

Law 4: 用私有构造方法强化 不可实例化的能力(工具类)

Law 5: 避免创建不必要的对象, 将复用的obj,成员化\静态化, 用静态代码块初始化.   //优先使用基本类型, 而非装箱对象.

Law 6: 及时清理过期引用, 防止积聚, 内存泄漏.

Law 7: 避免使用终结方法(finalizer), 因为不可预测/危险.

Chapter 2: Object 的 自有方法

Law 8: 覆盖Equals时要遵守: 自反\对称\传递\非空\一致性, 用单元测试来检查

Law 9: hashCode()和equals()一起覆盖, 用单元测试证明"逻辑相等的实例,都拥有相等的散列码"

             取equals()证相等时, 用到的几个关键成员变量 -> 构造散列码, (P41 有 关键域的转码方法)

Law 10: 建议所有的子类都覆盖toString()方法, 配上(格式)的文档说明

Law 11: 谨慎覆盖clone(), 可以形成super.clone()调用链, 到达object.clone()的native方法.  //最好不用clone方法,自己构造拷贝构造器/拷贝工厂

            所有实现了Cloneable接口的类都应该用一个公有(public)的方法覆盖clone, 该方法首先调用super.clone

Law 12: 值类 应该坚决考虑实现 Comparable 接口, 与Equals()关键域的一致性