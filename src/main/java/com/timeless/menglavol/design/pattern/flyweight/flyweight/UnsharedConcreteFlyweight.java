package com.timeless.menglavol.design.pattern.flyweight.flyweight;

/**
 * @ClassName: UnsharedConcreteFlyweight
 * @Description: 不需要共享内部状态的享元类
 * @Author: timeless
 * @Date: 2024/9/17
 */
public class UnsharedConcreteFlyweight extends AbstractFlyweight{

    // 内部状态属性
    // 用于区分共享与不共享
    private String name;

    public UnsharedConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享内部状态的享元: " + name + " ，执行外部状态：" + extrinsicState);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
