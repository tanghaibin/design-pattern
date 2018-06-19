package com.haibin;

/**
 * 添加后缀装饰器
 *
 * @author haibin.tang
 * @create 2018-06-18 下午9:15
 **/
public class AddLastCharDecorator extends Decorator {

    private char lastChar;

    public AddLastCharDecorator(PrintHello printHello, char lastChar) {
        super(printHello);
        this.lastChar = lastChar;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(lastChar);
    }
}
