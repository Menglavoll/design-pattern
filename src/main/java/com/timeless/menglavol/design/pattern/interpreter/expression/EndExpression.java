package com.timeless.menglavol.design.pattern.interpreter.expression;

import com.timeless.menglavol.design.pattern.interpreter.context.Context;

/**
 * @ClassName: EndExpression
 * @Description: end 表达式解释器
 * @Author: timeless
 * @Date: 2024/9/17
 */
public class EndExpression extends AbstractExpression{


    private String name;

    public EndExpression(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void interpret(Context context) {
        if (context.getContent().endsWith("end")){
            System.out.println(name + "解析到" + context.getContent() + "中以end结尾， 将进行下一项解析");
        } else {
            System.out.println(name + "解析到" + context.getContent() + "中不以end结尾，将进行下一项解析");
        }
    }
}
