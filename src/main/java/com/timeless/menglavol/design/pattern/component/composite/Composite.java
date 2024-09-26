package com.timeless.menglavol.design.pattern.component.composite;

import com.timeless.menglavol.design.pattern.component.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Composite
 * @Description: 子部件类
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super.setName(name);
    }

    @Override
    public void add(Component component) {
        if (component != null) {
            this.components.add(component);
        }
    }

    @Override
    public void remove(Component component) {
        if (component != null) {
            this.components.remove(component);
        }
    }

    @Override
    public void display(int deep) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            builder.append("-");
        }
        System.out.println(builder + super.getName());
        for (Component component : components) {
            component.display(deep + 2);
        }
    }
}
