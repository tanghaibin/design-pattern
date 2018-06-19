package com.haibin;

/**
 * 添加名称装饰器
 *
 * @author haibin.tang
 * @create 2018-06-18 下午9:04
 **/
public class AddNameDecorator extends Decorator {

    private String name;

    public AddNameDecorator(PrintHello printHello, String name) {
        super(printHello);
        this.name = name;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("," + name);
    }
}
