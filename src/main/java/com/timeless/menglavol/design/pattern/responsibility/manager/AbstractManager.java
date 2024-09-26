package com.timeless.menglavol.design.pattern.responsibility.manager;

import com.timeless.menglavol.design.pattern.responsibility.request.Request;

/**
 * @ClassName: AbstractManager
 * @Description: 抽象的管理者类
 * @Author: timeless
 * @Date: 2024/9/14
 */
public abstract class AbstractManager {

    // 管理者名称
    private String name;

    // 上级管理者
    private AbstractManager superior;

    public AbstractManager(String name, AbstractManager superior) {
        this.name = name;
        this.superior = superior;
    }

    // 处理请求方法
    public abstract void dealRequest(Request request);

    // 向上级申请
    protected void pushRequest(Request request){
        superior.dealRequest(request);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperior(AbstractManager superior) {
        this.superior = superior;
    }
}
