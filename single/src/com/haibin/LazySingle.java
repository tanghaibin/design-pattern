package com.haibin;

/**
 * 懒汉单例
 *
 * @author haibin.tang
 * @create 2018-06-20 下午4:24
 **/
public class LazySingle {

    private static LazySingle lazySingle;

    private LazySingle() {}

    /**
     * 使用字节码锁保证多线程环境下单例
     * @return
     */
    public static LazySingle getInstance() {
        synchronized (LazySingle.class) {
            if (lazySingle == null) {
                lazySingle = new LazySingle();
            }
        }
        return lazySingle;
    }
}
