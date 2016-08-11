package me.qunwei.Chapter4.Law15_NotChange;

import java.util.TimerTask;

/**
 * Created by QunWei on 2016/8/7.
 */


/**
 * 使可变性最小化, 尽量限制 类的可变性(成员变量的final), 坚决不要为每个get方法编写一个相应的set, 变化带来复杂性.
 */
public class TimeTest {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.print("time:" + Thread.currentThread());
            }
        };

        timerTask.run();
    }
}
