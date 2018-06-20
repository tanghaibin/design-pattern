package com.haibin;

/**
 * 订单新建模板实现
 *
 * @author haibin.tang
 * @create 2018-06-20 下午4:59
 **/
public class OrderCreateImpl extends AbstractOrderCreateTemplate {

    @Override
    protected void check() {
        System.out.println("check params");
    }

    @Override
    protected void insert() {
        System.out.println("insert data");
    }

    @Override
    protected String buildResp() {
        System.out.println("build response");
        return "success";
    }
}
