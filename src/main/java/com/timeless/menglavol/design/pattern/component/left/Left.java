package com.timeless.menglavol.design.pattern.component.left;

import com.timeless.menglavol.design.pattern.component.component.Component;

/**
 * @ClassName: Left
 * @Description: 叶子节点 没有子部件
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class Left extends Component {

    public Left(String name) {
        super.setName(name);
    }

    @Override
    public void add(Component component) {}

    @Override
    public void remove(Component component) {}

    @Override
    public void display(int deep) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            builder.append("-");
        }
        System.out.println(builder + super.getName());
    }
}
