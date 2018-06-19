package com.haibin;

/**
 * 装饰器模式：扩展现有类已有功能
 *  打印hello，分别装饰名称和结尾字符
 * @author haibin.tang
 * @create 2018-06-18 下午9:19
 **/
public class Main {

    public static void main(String[] args) {
        PrintHello printHello = new AddLastCharDecorator(new AddNameDecorator(new PrintHelloImpl(), "唐海斌"), '!');
        printHello.print();
    }
}
