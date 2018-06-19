package com.haibin;

/**
 * 顶层装饰器
 *
 * @author haibin.tang
 * @create 2018-06-18 下午9:01
 **/
public class Decorator implements PrintHello {

    private PrintHello printHello;

    public Decorator(PrintHello printHello) {
        this.printHello = printHello;
    }

    @Override
    public void print() {
        printHello.print();
    }
}
