package com.haibin;

/**
 * 静态类包装实现单例
 *
 * @author haibin.tang
 * @create 2018-06-20 下午4:25
 **/
public class HolderSingle {

    private HolderSingle() {
        System.out.println("初始化 HolderSingle..");
    }

    /**
     * 利用类加载机制保证单例
     */
    private static class Holder {
        static HolderSingle holderSingle = new HolderSingle();
    }

    public static HolderSingle getInstance() {
        return Holder.holderSingle;
    }
}
