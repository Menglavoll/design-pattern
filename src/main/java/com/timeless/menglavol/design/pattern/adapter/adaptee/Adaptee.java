package com.timeless.menglavol.design.pattern.adapter.adaptee;

/**
 * @ClassName: Adaptee
 * @Description: 需要适配的类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Adaptee {

    // 当前方法与Target的方法不一致
    public void requestInterface(){
        System.out.println("This is adaptee interface");
    }
}
