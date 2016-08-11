package me.qunwei.chapter2.Law6_CancelOldRef;

/**
 * Created by QunWei on 2016/8/6.
 */

import java.util.EmptyStackException;

/**
 * 及时清理过期引用, 防止积聚, 内存泄漏.
 */
public class Stack {
    private Object[] nodes;
    private int key = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16; //默认初始容量

    public Stack() {
        nodes = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object node) {
        ensureCapacity();
        nodes[key++] = node;
    }

    public Object pop(){
        if (key == 0){
            throw new EmptyStackException();
        }
        return nodes[--key];
    }

    private void ensureCapacity() {
        if (nodes.length == key) {
            //TODO: what's wrong with Arrays.copyOf().
//            nodes = Arrays.copyOf(nodes, 2 * key + 1);
        }
    }

}
