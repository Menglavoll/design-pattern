package com.timeless.menglavol.design.pattern.visitor.structure;

import com.timeless.menglavol.design.pattern.visitor.element.AbstractElement;
import com.timeless.menglavol.design.pattern.visitor.element.ConcreteElementA;
import com.timeless.menglavol.design.pattern.visitor.element.ConcreteElementB;
import com.timeless.menglavol.design.pattern.visitor.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Structure
 * @Description: 元素结构类
 * @Author: timeless
 * @Date: 2024/9/18
 */
public class Structure {

    private static final List<AbstractElement> elements = new ArrayList<>();

    static {
        // 枸酱抽象元素的所有子类的对象
        elements.add(new ConcreteElementA("element: A"));
        elements.add(new ConcreteElementB("element: B"));
    }

    // 接受访问者访问所有的抽象元素的子类对象
    public void accept(AbstractVisitor visitor) {
        for (AbstractElement element : elements) {
            element.accept(visitor);
        }
    }
}
