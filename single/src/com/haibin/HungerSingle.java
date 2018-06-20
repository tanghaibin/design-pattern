package com.haibin;

/**
 * 饥饿单例
 *
 * @author haibin.tang
 * @create 2018-06-20 下午4:25
 **/
public class HungerSingle {

    private static HungerSingle hungerSingle = new HungerSingle();

    private HungerSingle() {}

    public static HungerSingle getInstance() {
        return hungerSingle;
    }
}
