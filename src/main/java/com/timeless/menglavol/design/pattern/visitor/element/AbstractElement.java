package com.timeless.menglavol.design.pattern.visitor.element;

import com.timeless.menglavol.design.pattern.visitor.visitor.AbstractVisitor;

/**
 * @ClassName: AbstractElement
 * @Description: 抽象的元素类
 * @Author: timeless
 * @Date: 2024/9/18
 */
public abstract class AbstractElement {

    private String name;

    public AbstractElement(String name) {
        this.name = name;
    }

    // 确定当前类接受哪一个访问者对象访问
    public abstract void accept(AbstractVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
