package com.timeless.menglavol.design.pattern.component.component;

/**
 * @ClassName: Component
 * @Description: 抽象的组合类
 * @Author: timeless
 * @Date: 2024/9/13
 */
public abstract class Component {

    // 标记当前节点名名称
    private String name;

    // 添加子部件
    public abstract void add(Component component);

    // 移除子部件
    public abstract void remove(Component component);

    // 显示所有子部件
    public abstract void display(int deep) ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
