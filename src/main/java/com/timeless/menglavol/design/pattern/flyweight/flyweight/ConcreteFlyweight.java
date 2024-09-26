package com.timeless.menglavol.design.pattern.flyweight.flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Description: 具体的享元类
 * @Author: timeless
 * @Date: 2024/9/17
 */
public class ConcreteFlyweight extends AbstractFlyweight {

    // 内部状态属性
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("共享内部状态的享元: " + name + " ，执行外部状态：" + extrinsicState);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
