package com.timeless.menglavol.design.pattern.adapter.client;

import com.timeless.menglavol.design.pattern.adapter.adaptee.Adaptee;
import com.timeless.menglavol.design.pattern.adapter.adapter.Adapter;
import com.timeless.menglavol.design.pattern.adapter.target.Target;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.request();
    }
}
