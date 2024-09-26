package com.timeless.menglavol.design.pattern.singleton.lazy_singleton;

/**
 * @ClassName: Singleton
 * @Description: 单例对象类-懒汉式
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Singleton {

    // 使用私有静态变量保存该类的唯一实例
    private static Singleton instance;

    // 将构造方法私有化
    private Singleton() {}

    // 使用静态公共方法获取或创建该类的唯一实例
    // 第一次调用时创建实例
    public static Singleton getInstance() {
        // 第一次判断该实例是否为空
        if (instance == null) {
            // 对创建过程加锁
            synchronized (Singleton.class) {
                // 第二次判断该实例是否为空
                // 防止在一个线程在第一次判断时
                // 另一个线程已经获得锁但是还没有完成对实例的初始化
                // 导致出现该类再次被创建实例的问题
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
