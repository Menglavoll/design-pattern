package com.timeless.menglavol.design.pattern.responsibility.manager;

import com.timeless.menglavol.design.pattern.responsibility.request.Request;

/**
 * @ClassName: MajorManager
 * @Description: 总监
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class MajorManager extends AbstractManager {

    public MajorManager(String name, AbstractManager superior) {
        super(name, superior);
    }

    @Override
    public void dealRequest(Request request) {
        if (request != null){
            if (request.getPriority() <= 10){
                System.out.println(getName() + "处理了：{ 名称：" + request.getName() +
                        " 优先级：" + request.getPriority() +
                        " 描述：" + request.getDescription() + " }的请求");
            } else {
                pushRequest(request);
            }
        }
    }
}
