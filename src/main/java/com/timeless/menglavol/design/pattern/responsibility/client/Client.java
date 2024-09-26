package com.timeless.menglavol.design.pattern.responsibility.client;

import com.timeless.menglavol.design.pattern.responsibility.manager.AbstractManager;
import com.timeless.menglavol.design.pattern.responsibility.manager.CommonManager;
import com.timeless.menglavol.design.pattern.responsibility.manager.GeneralManager;
import com.timeless.menglavol.design.pattern.responsibility.manager.MajorManager;
import com.timeless.menglavol.design.pattern.responsibility.request.Request;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Client {

    public static void main(String[] args) {

        // 构建责任链
        AbstractManager common = new CommonManager(
                "经理",
                new MajorManager("总监", new GeneralManager("总经理", null))
        );
        // 创建请求
        Request leave = new Request("请假", 5, "小朋友请假一天");
        Request increase = new Request("加薪", 10, "小朋友加薪1000");
        Request promotion = new Request("升职", 20, "小朋友升职");

        // 执行请求
        common.dealRequest(leave);
        System.out.println("===============");
        common.dealRequest(increase);
        System.out.println("===============");
        common.dealRequest(promotion);
        System.out.println("===============");
    }
}
