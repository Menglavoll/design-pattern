package com.timeless.menglavol.design.pattern.bridge.abstraction;

import com.timeless.menglavol.design.pattern.bridge.implementor.AbstractImplementor;

/**
 * @ClassName: RefineAbstraction
 * @Description: 桥接模式中提炼之后的抽象
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class RefineAbstraction extends Abstraction {

    public RefineAbstraction(AbstractImplementor implementor) {
        super(implementor);
    }

    // 调用该抽象的具体实现方法
    @Override
    public void operation() {
        super.implementor.operation();
    }
}
