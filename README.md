# EffectiveJava
Coding with &lt;Effective Java> second edition.

Chapter 2: 创建和销毁对象

Law 1: 用静态工厂方法代替构造器  例:服务提供者框架,用接口定义服务和提供者, 让用户根据实际需要自实现,然后用静态工厂进行保存\取用.

Law 2: Builder构造器: 当有固定参数和 可选参数时.

Law 3: 用私有构造方法强化单例, AssertionError防止反射攻击

Law 4: 用私有构造方法强化 不可实例化的能力(工具类)

Law 5: 避免创建不必要的对象, 将复用的obj,成员化\静态化, 用静态代码块初始化.   //优先使用基本类型, 而非装箱对象.

Law 6: 及时清理过期引用, 防止积聚, 内存泄漏.

Law 7: 避免使用终结方法(finalizer), 因为不可预测/危险.

Chapter 3: Object 的 自有方法

Law 8: 覆盖Equals时要遵守: 自反\对称\传递\非空\一致性, 用单元测试来检查

Law 9: hashCode()和equals()一起覆盖, 用单元测试证明"逻辑相等的实例,都拥有相等的散列码"

             取equals()证相等时, 用到的几个关键成员变量 -> 构造散列码, (P41 有 关键域的转码方法)

Law 10: 建议所有的子类都覆盖toString()方法, 配上(格式)的文档说明

Law 11: 谨慎覆盖clone(), 可以形成super.clone()调用链, 到达object.clone()的native方法.  //最好不用clone方法,自己构造拷贝构造器/拷贝工厂

            所有实现了Cloneable接口的类都应该用一个公有(public)的方法覆盖clone, 该方法首先调用super.clone

Law 12: 值类 应该坚决考虑实现 Comparable 接口, 与Equals()关键域的一致性

Chapter 4: 类和接口的规范

Law 13: 始终尽可能地降低 方法(API) 和 成员变量(域) 的可访问性, 减少被滥用和修改的风险.

Law 14: 公有类永远都不应该暴露可变的域(成员变量), 使用访问方法(Getter Setter)

Law 15: 使可变性最小化, 尽量限制 类的可变性(成员变量的final), 坚决不要为每个get方法编写一个相应的set, 变化带来复杂性.

Law 16: 复合优先于继承, 除非真的确定存在父子类型关系, 否则使用 复合和转发机制(包装) 来替代继承 //继承会传播缺陷和破坏封装

Law 17: 父类要专为继承而设计,并且提供文档说明, 充分消除 自用性 (自我调用可覆盖的方法)

Law 18: 接口优先于抽象类, 更加灵活和公正的API, 可以用抽象骨架来帮助一个接口的多种实现.

Law 19: 接口只用于定义类型, 表明客户端可以对此类 实施某些动作, 不应该作为常量接口模式,
            不可实例化常量工具类/枚举类型/静态成员变量, 来定义常量.

Law 20: 类层次, 反映类型本质上的层次关系, 有助于增强灵活性.

Law 21: 用策略接口 + 匿名实现类 来 达成 函数式编程力.

Law 22: 优先考虑静态成员类, 当 指向 外围实例时, 用非静态成员类, 酌情使用内部类,匿名类,局部类

//TODO: Chapter 5,6 泛型 和 枚举


Chapter 7:

Law 38: 检查参数的有效性, 开放性API抛异常, 私有方法 用断言(assert)

Law 39: 如果类具有可变组件, 就需要保护性拷贝这些组件, 获得/返回.
        如果双方信任(只为了同一个包调用), 可以说明而不保护.(提高性能)
        //开源组件, 则需要严格的保护, Struts就是一个教训

Law 40: 谨慎设计 方法的名称和参数: 1.(Tip56)命名习惯, 易于理解的名称. 2. 避免过长的参数列表,可以考虑用数据类

Law 41: 慎用重载 (Overload是静态[编译器决定],Override是动态,运行时决定), 构造方法用用就好了, 普通方法用命名区别.

Law 42: 慎用可变参数, 必要时使用(一\二\三\多参数重载), 不用滥用.

Law 43: 返回固定零长度的数组或者集合(Collections.emptyList()), 不要返回null.

Law 44: 为所有打出API编写注释文档,[前置条件,后置条件,副作用]

Law 45: 将局部变量的作用域最小化,防止误用出错(比如for循环的i优于while循环),

            可以使方法小而集中.

Law 46: for-each 循环优于传统for循环: 性能略优,不易出错(简洁/预防bug),只要让元素实现Iterable接口

Law 47: 了解和使用类库(JDK),更优化/主流,应该关注java.lang, java.util, 某种程度上的java.io

Law 48: 需要精确答案(货币计算),请不要用float/double, 可以用BigDecimal(完全控制舍入)/long/int.

Law 49: 基本类型优于装箱类 : 基本运算==,空指针,性能下降.

            用法: 作为集合的元素/键/值, 参数化类型

Law 50: 如果其他类型更合适, 尽量避免使用字符串.

            因为字符串是值类, 容易在JVM中共享, 造成错误/性能解析问题.

Law 51: 担心字符串连接的性能: 每次一起重新拷贝, 平方级别增加.
               StringBuider,线性级别

Law 52: 通过接口应用对象: 更加灵活,可以时刻调整实现类的性能
                List<Integer> demo = new ArrayList<Integer>();

Law 53: 反射机制很是一种功能强大的机制, 对于某些复杂任务,很有必要.

            尽量通过接口来映射实现, 避免与未知类一起工作.

Law 54: 谨慎地使用本地方法(JNI), 进入和退出 有固定的性能开销, VM不输本地, 而且可以控制.

Law 55: 谨慎地优化: 编写好的程序 , 而不是快的程序.

            良好的模块设计(API,协议,数据格式), 信息隐藏, 性能选择.

            编写好的程序(清晰,简明,结构良好), 性能随之而来, 好好设计, 保持良品.

Law 56: 遵守标准的命名惯例, 当做一种内在机制来看待.


Chapter 9:

Law 57: 只针对异常情况使用[异常机制], 设计良好的API不应该让客户端使用异常作为正常的控制流.

Law 58: 对[可恢复的情况] 使用 [受检异常], 对 [编程错误] 使用 [运行时异常].

            [受检异常] 应该指明可恢复的条件. [运行时异常] 和 [错误] 属于不可恢复. 
            
Law 59: 避免不必要地使用 [受检异常], 根据情况, 避免不必要的复杂 与 负担.
            
Law 60: 优先使用标准的异常: 专家级程序员追求的 高度代码重用 和 可读性.//开销也小
            
            常用异常: IllgalArgumentException, IllegalStateException, NullPointerException,
                      IndexOutOfBoundsException, ConcurrentModificationException(禁止并发修改)
                      UnsupportedOperationException
                      
                      
Law 61: 抛出与抽象相对应的异常: 不要让细节污染高层的API,捕获低层异常,同时抛出高层抽象进行解释的异常(异常转译)
                      
Law 62: 每个方法抛出的异常都要有文档.
                
                '要为每个受检异常提供单独的throws子句,不要为未受检的异常提供throws语句'
                '如果没有为可以抛出的异常建立文档,其他人就很难或者根本不可能有效地使用你的类和接口'
                
Law 63: 在细节消息中包含能捕获失败的信息, 便于以后分析.
                
Law 64: 努力保持失败的原子性.
                
                失败的调用, 应该让对象保持被调用前的状态.
                
Law 65: 不要忽略异常.  //至少,解释为什么可以忽略这个异常.                