package com.haibin;

/**
 * @author haibin.tang
 * @create 2018-06-20 下午5:01
 **/
public class Main {

    public static void main(String[] args) {
        AbstractOrderCreateTemplate createTemplate = new OrderCreateImpl();
        System.out.println(createTemplate.create());
    }
}
