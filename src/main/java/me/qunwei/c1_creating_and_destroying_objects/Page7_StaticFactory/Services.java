package me.qunwei.c1_creating_and_destroying_objects.Page7_StaticFactory;

/**
 * Created by QunWei on 2016/8/5.
 */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务提供者框架
 * <p>
 * 用接口定义服务和提供者, 让用户根据实际需要自实现
 * <p>
 * 然后用静态工厂进行保存\取用
 *
 * @author qunwei
 */

public class Services {

    private Services() {

    }

    private static final Map<String, Provider> providers =
            new ConcurrentHashMap<String, Provider>();

    public static final String DEFAUKT_PROVICER_NAME = "<def>";

    public static void registerDefaultProvicer(Provider p) {
        registerProvider(DEFAUKT_PROVICER_NAME, p);
    }

    private static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static Service newInstance() {
        return newInstance(DEFAUKT_PROVICER_NAME);
    }

    private static Service newInstance(String name) {
        Provider provider = providers.get(name);

        if (provider == null) {
            throw new IllegalArgumentException
                    ("No provider registered with name :  " + name);
        }

        return provider.newSercice();
    }

}
