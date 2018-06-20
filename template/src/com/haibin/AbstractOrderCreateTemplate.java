package com.haibin;

/**
 * 订单创建模板类
 *
 * @author haibin.tang
 * @create 2018-06-20 下午4:54
 **/
public abstract class AbstractOrderCreateTemplate {

    public String create() {
        check();
        insert();
        return buildResp();
    }

    protected abstract void check();

    protected abstract void insert();

    protected abstract String buildResp();
}
