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
