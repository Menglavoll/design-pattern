package com.timeless.menglavol.design.pattern.state.client;

import com.timeless.menglavol.design.pattern.state.work.Work;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour("8");
        work.programming();
        work.programming();
        work.programming();
    }
}
