package me.qunwei.chapter2.Law7_NotFinalizer;

/**
 * Created by QunWei on 2016/8/6.
 */


/**
 *  避免使用终结方法(finalizer), 因为不可预测/危险.
 *  不得不使用时, 记住调用super.finalize(), 记录非法用法.
 */
public class Demo {
    public Demo() {
    }

    //Do not use this method!!!
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void deal(){

    }

    public void terminate(){
        //Destroy itself.
    }

    public static void main(String[] args) {

        Demo demo = new Demo();

        try {
            demo.deal();
        }finally {
            demo.terminate();//手动调用总结方法
        }

    }

}
