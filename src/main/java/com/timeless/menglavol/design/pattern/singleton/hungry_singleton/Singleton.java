package com.timeless.menglavol.design.pattern.singleton.hungry_singleton;

/**
 * @ClassName: Singleton
 * @Description: 单例对象类-饿汉式
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Singleton {

    // 使用私有静态变量保存该类的唯一实例
    // 类加载时创建实例
    private static final Singleton instance = new Singleton();

    // 将构造方法私有化
    private Singleton() {}

    // 使用静态公共方法获取或创建该类的唯一实例
    public static Singleton getInstance() {
        return instance;
    }
}
