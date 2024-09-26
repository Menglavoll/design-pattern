package com.timeless.menglavol.design.pattern.responsibility.manager;

import com.timeless.menglavol.design.pattern.responsibility.request.Request;

/**
 * @ClassName: CommonManager
 * @Description: 经理
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class CommonManager extends AbstractManager {

    public CommonManager(String name, AbstractManager superior) {
        super(name, superior);
    }

    @Override
    public void dealRequest(Request request) {
        if (request != null){
            if (request.getPriority() <= 5){
                System.out.println(getName() + "处理了：{ 名称：" + request.getName() +
                        " 优先级：" + request.getPriority() +
                        " 描述：" + request.getDescription() + " }的请求");
            } else {
                pushRequest(request);
            }
        }
    }
}
