package com.timeless.menglavol.design.pattern.adapter.adapter;

import com.timeless.menglavol.design.pattern.adapter.adaptee.Adaptee;
import com.timeless.menglavol.design.pattern.adapter.target.Target;

/**
 * @ClassName: Adapter
 * @Description: 适配器类 用于将Adaptee与Target类适配
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.requestInterface();
    }
}
